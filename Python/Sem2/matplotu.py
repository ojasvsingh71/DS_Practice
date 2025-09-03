# import matplotlib.pyplot as plt
# import numpy as np

# data=np.array(np.random.normal(0,1,1000))
# freq=np.array(np.random.randint(1,10,1000))

# plt.plot(freq,data)

# plt.hist(data,bins=30,color='orange',edgecolor='black')

# plt.xlabel("bu")
# plt.ylabel("hu")
# plt.title("ji")
# plt.show()

# print(data)

import matplotlib.pyplot as plt
import pandas as pd

# Sample Data for Months and Temperature
data = {
    'Month': ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
    'Temperature': [5, 7, 10, 13, 17, 20, 22, 21, 18, 12, 8, 6]
}

# Write your code here...

# Adding a legend
# plt.legend(['Temperature'], loc='upper left')
plt.fill_between(data['Month'],data['Temperature'])
plt.plot(data['Month'],data['Temperature'])

# Write your code here..
plt.xlabel('Month')
plt.ylabel('Temperature')
plt.title('Temperature Variation')
plt.legend(['Temperature'],loc='upper left')
plt.xticks(rotation=45)  # Rotating the x-axis labels for better visibility

# Display the Plot...
plt.show()