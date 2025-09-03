import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
df = pd.read_csv('students_scores_2000.csv')
df['Total'] = df.iloc[:, 1:].sum(axis=1)
average_score = np.mean(df['Total'])
highest_score = np.max(df['Total'])
lowest_score = np.min(df['Total'])
print(f"Average Total Score: {average_score:.2f}")
print(f"Highest Total Score: {highest_score}")
print(f"Lowest Total Score: {lowest_score}")
top_students = df.sort_values(by='Total', ascending=False).head(20)
plt.figure(figsize=(12, 6))
plt.bar(top_students['Name'], top_students['Total'],
color='lightgreen')
plt.title('Top 20 Students by Total Score')
plt.xlabel('Student Name')
plt.ylabel('Total Score')
plt.xticks(rotation=75)
plt.tight_layout()
plt.grid(axis='y', linestyle='--', alpha=0.6)
plt.show()
