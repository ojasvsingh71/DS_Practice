import matplotlib.pyplot as plt
import numpy as np

# x=np.linspace(0,10,100)
# print(x)
# x1=np.sin(x)
# y1=np.cos(x)

# plt.stackplot(x,x1,y1,labels=['sinx','cosx'])
# plt.legend()
# plt.xlabel("X axis")
# plt.ylabel("Y axis")
# plt.show()

# x = np.random.randn(1000)
# plt.boxplot(x)
# plt.show()

def bu(x,y):
    return x**2+y**2

x=np.linspace(-100,100,10000)
y=np.linspace(-100,100,10000)
X,Y=np.meshgrid(x,y)
Z=np.sin(np.sqrt(bu(X,Y)))
plt.contour(X,Y,Z)
plt.show()