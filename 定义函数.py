def pingfang(x):
    return(x**2)
for x in range(1):
    print(pingfang(x))

import math

def move(x,y,step,angle):
    hudu=2*math.pi*angle/360
    nx=x+step*math.cos(hudu)
    ny=y+step*math.sin(hudu)
    return(nx,ny)
