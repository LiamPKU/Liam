package com.example.demo.repository.es;

import com.example.demo.domain.es.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.awt.print.Pageable;

public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {
    //分页查询博客去重
    Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(String title, String summary, String content,Pageable pageable);

}
