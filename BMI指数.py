a=float(input('身高（米）：'))
b=float(input('体重（公斤）：'))
c=b/a**2
print('BMI:%.2f'%c)
if c<18.5:
    print('体重偏轻')
elif c<24:
    print('体重正常')
else:
    print('体重偏重')
