package com.example.demo.repository.es;

import com.example.demo.domain.es.EsBlog;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import java.awt.print.Pageable;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsBlogRepositoryTest {
    @Autowired
    private EsBlogRepository esBlogRepository;
    @Before
    public void initRepositoryData(){
        //清除所有数据
        esBlogRepository.deleteAll();
        esBlogRepository.save(new EsBlog("登鹳雀楼","王之涣的","白日，黄河，欲穷，更上"));
        esBlogRepository.save(new EsBlog("相思","王维的相思","红豆生南国，春来发几枝。愿君多采撷，此物最相思。"));
        esBlogRepository.save(new EsBlog("静夜思","李白的静夜思","床前明月光，疑是地上霜。举头望明月，低头思故乡。"));
    }
    @Test
    public void testFindDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(){
        Pageable pageable = (Pageable)PageRequest.of(1,20);
        String title = "思";
        String summary = "相思";
        String content = "相思";
        Page<EsBlog> page = esBlogRepository.findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(title,summary,content,pageable);
        assertThat(page.getTotalElements()).isEqualTo(2);
        System.out.println("--------start 1");
        for(EsBlog blog:page.getContent()){
            System.out.println(blog.toString());
        }
        System.out.println("------------end");
    }
}
