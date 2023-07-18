CREATE TABLE Employee (
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  job_start_date DATE,
  salary DECIMAL(10,2)
);

ALTER TABLE Employee
ADD department VARCHAR(50);

SELECT MAX(salary) AS highest_salary
FROM Employee;

SELECT *
FROM Employee
WHERE job_start_date >= DATE_SUB(CURDATE(), INTERVAL 6 MONTH);

SELECT department, COUNT(*) AS employee_count
FROM Employee
GROUP BY department;

INSERT INTO Employee (first_name, last_name, job_start_date, salary, department)
VALUES
  ('John', 'Doe', '2022-01-01', 50000.00, 'HR'),
  ('Jane', 'Smith', '2021-09-15', 60000.00, 'IT'),
  ('Michael', 'Johnson', '2023-02-10', 70000.00, 'Sales'),
  ('Emily', 'Brown', '2022-11-30', 55000.00, 'Marketing'),
  ('David', 'Wilson', '2023-04-20', 65000.00, 'Finance');
  
UPDATE consultant_detail
SET email_address = 'new_email@example.com'
WHERE id = 1;

SELECT first_name, last_name, COUNT(*) AS submission_count
FROM consultant_detail
GROUP BY first_name, last_name;

SELECT first_name, last_name, DATE(submission_date) AS submission_day, COUNT(*) AS submission_count
FROM consultant_detail
GROUP BY first_name, last_name, submission_day;

DELETE FROM consultant_detail
WHERE rate IS NULL;


SELECT *
FROM consultant_detail
WHERE lead_name = 'Your Lead Name' AND submission_date = 'YYYY-MM-DD';

SELECT lead_name, COUNT(*) AS submission_count
FROM consultant_detail
GROUP BY lead_name;
