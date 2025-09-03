CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    hire_date DATE
);


SELECT first_name, last_name, hire_date
FROM employees
WHERE department = 'Sales'
ORDER BY hire_date DESC;


INSERT INTO employees (first_name, last_name, department) 
VALUES ('Jane', 'Smith', 'HR');


GRANT SELECT, UPDATE ON employees TO user_name;


BEGIN TRANSACTION;
UPDATE employees SET department = 'Marketing' WHERE department = 'Sales';
SAVEPOINT before_update;
UPDATE employees SET department = 'IT' WHERE department = 'HR';
ROLLBACK TO SAVEPOINT before_update;
COMMIT;


SELECT AVG(balance_due) AS average_balance_due
FROM Clients;


SELECT COUNT(*) AS product_count
FROM Products
WHERE price >= 1500;
