import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

df=pd.read_csv("students_scores_2000.csv")

df['Total']=df.iloc[:,1:].sum(axis=1)


sort_df=df.sort_values("Total",ascending=False)

print("Average score : ",np.mean(df["Total"]))
print("Maximum score : ",np.max(df["Total"]))
print("Minimum score : ",np.min(df["Total"]))

plt.figure(figsize=(12, 10))
plt.bar(sort_df["Name"].head(50),sort_df["Total"].head(50))
plt.xlabel("Student")

plt.xticks(rotation=75)
plt.ylabel("Total Marks")
plt.title("Variation of marks of students")
plt.show()