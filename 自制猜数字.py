from random import randint
a=randint(1,10)
while True:
    choice=int(input('1开始 2结束：'))
    if choice==1:
        b=int(input('请输入数字(1-10)：'))
        i=0
        while True:
            i+=1
            if a<b:
                print('猜大了')
                b=int(input('请猜一个小一点的数：'))
            elif a>b:
                print('猜小了')
                b=int(input('请猜一个大一点的数：'))
            else:
                print('你猜对了')
                print('你共猜了%d次'%i)
                if i>3:
                    print('你输了')
                else:
                    print('胜利！')
                break
    else:
        break
print('再见')
        
    
