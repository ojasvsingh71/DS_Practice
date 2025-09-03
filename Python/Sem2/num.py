import numpy as np

matrix1=np.random.randint(1,100,25).reshape(5,5)
matrix2=np.random.randint(1,100,25).reshape(5,5)

print(matrix1)
print()
print(matrix2)
print()

print(matrix1+[1,2,3,4,5])

print(np.poly1d([1,2,3,4]))
