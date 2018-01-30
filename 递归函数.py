def fact(n):
    return(jie(n,1))
def jie(num,p):
    if num==1:
        return(p)
    return(jie(num-1,p*num))
