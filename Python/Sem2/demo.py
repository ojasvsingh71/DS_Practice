# import matplotlib.pyplot as plt

# x=[1,2,5,8]
# y=[2,5,7,4]

# plt.plot(x,y)

# plt.xlabel('X-label')
# plt.ylabel('y-label')
# plt.title('simple plot')

# plt.show()

# import os
# import shutil

# name="name.txt"
# if os.path.exists(name):
#     print("file exits")
# else:
#     print("not exits")

# os.mkdir("bubu")
# os.rmdir("bubu")

import num as np

from collections import defaultdict

dict=defaultdict(int)

dict[1]+=1

for i,j in dict.items():
    print(i,j)

# print(np.random.randint(13,15,100).reshape(10,10).ravel())

