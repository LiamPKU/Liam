import random

total = 0  # 记录游戏轮数
times = 0  # 记录猜的总次数
# 程序主循环
while True:
    choice = input("1.开始游戏; 2.退出\n")  # 选择开始或退出
    if str(choice) == '1':
        total += 1  # 轮数累加
        num = random.randint(1, 2)  # 随机本轮答案
        print("猜一个 1～100 间的整数：")
        # 新一轮猜数字
        while True:
            times += 1  # 猜的次数累加
            answer = int(input())
            if answer < num:
                print("你猜的太小了")
            elif answer > num:
                print("你猜的太大了")
            else:
                print("你猜对了！")
                break  # 猜中后挑出循环
    elif str(choice) == '2':
        break  # 选择2则跳出循环
    if total > 0:  # 防止除0错误
        # 输出结果
        print("共猜了 %d 次，平均 %.1f 次猜中\n" % (total, float(times) / total))
print("游戏结束")
