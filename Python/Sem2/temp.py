# x=int(input())
# y=int(input())

# print("x << y",x<<y)
# print("x >> y",x>>y)
# print("x | y",x|y)
# print("x & y",x&y)
# print("~x ~ y",~x,~y)
# print("x ^ y",x^y)



# lst1=list(map(int,input().split()))
# lst2=list(map(int,input().split()))

# bu=False
# for i in lst1:
#     if i in lst2:
#         print(i,end=' ')
#         bu=True

# if not bu:
#     print("No common slots")


sen=input("Enter the sentence : ")
words=sen.split()

map={}

for i in words:
    if i in map:
        map[i]+=1
    else:
        map[i]=1

print(map)