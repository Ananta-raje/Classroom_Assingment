### &#x20;                             MySQL Test





mysql> show databases;

+--------------------+

| Database           |

+--------------------+

| clone\_dbs          |

| college            |

| company\_db         |

| crud\_data          |

| delta\_app          |

| ecommerce\_db       |

| employeefinancedb  |

| hms                |

| hospital\_db        |

| info\_db            |

| information\_schema |

| microfinancedb     |

| my\_project         |

| mysql              |

| performance\_schema |

| registration\_app   |

| restaurantdb       |

| resume\_analyzer    |

| sakila             |

| societywebbappdb   |

| studentdatabase    |

| sys                |

| tb\_item            |

| thekiranacademy    |

| user               |

| world              |

| xyz\_company        |

+--------------------+

27 rows in set (0.01 sec)



mysql> create databases capagemini;

ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'databases capagemini' at line 1

mysql> create database capagemini;

Query OK, 1 row affected (0.01 sec)



mysql> drop database capagemini;

Query OK, 0 rows affected (0.02 sec)



mysql> show databases;

+--------------------+

| Database           |

+--------------------+

| clone\_dbs          |

| college            |

| company\_db         |

| crud\_data          |

| delta\_app          |

| ecommerce\_db       |

| employeefinancedb  |

| hms                |

| hospital\_db        |

| info\_db            |

| information\_schema |

| microfinancedb     |

| my\_project         |

| mysql              |

| performance\_schema |

| registration\_app   |

| restaurantdb       |

| resume\_analyzer    |

| sakila             |

| societywebbappdb   |

| studentdatabase    |

| sys                |

| tb\_item            |

| thekiranacademy    |

| user               |

| world              |

| xyz\_company        |

+--------------------+

27 rows in set (0.00 sec)



mysql> create database capgemini;

Query OK, 1 row affected (0.01 sec)



mysql> show databases;

+--------------------+

| Database           |

+--------------------+

| capgemini          |

| clone\_dbs          |

| college            |

| company\_db         |

| crud\_data          |

| delta\_app          |

| ecommerce\_db       |

| employeefinancedb  |

| hms                |

| hospital\_db        |

| info\_db            |

| information\_schema |

| microfinancedb     |

| my\_project         |

| mysql              |

| performance\_schema |

| registration\_app   |

| restaurantdb       |

| resume\_analyzer    |

| sakila             |

| societywebbappdb   |

| studentdatabase    |

| sys                |

| tb\_item            |

| thekiranacademy    |

| user               |

| world              |

| xyz\_company        |

+--------------------+

28 rows in set (0.00 sec)



mysql> use capgemini;

Database changed

mysql> create table employee(id INT AUTO\_INCREMENT PRIMARY KEY, name VARCHAR(70), profile VARCHAR(50), email VARCHAR(90) UNIQUE NOT NULL, salary int, age int, experience int);

Query OK, 0 rows affected (0.04 sec)



mysql> desc employee;

+------------+-------------+------+-----+---------+----------------+

| Field      | Type        | Null | Key | Default | Extra          |

+------------+-------------+------+-----+---------+----------------+

| id         | int         | NO   | PRI | NULL    | auto\_increment |

| name       | varchar(70) | YES  |     | NULL    |                |

| profile    | varchar(50) | YES  |     | NULL    |                |

| email      | varchar(90) | NO   | UNI | NULL    |                |

| salary     | int         | YES  |     | NULL    |                |

| age        | int         | YES  |     | NULL    |                |

| experience | int         | YES  |     | NULL    |                |

+------------+-------------+------+-----+---------+----------------+

7 rows in set (0.01 sec)



mysql> INSERT into table(name, profile, email, salary, age, experience)values(rani, dev, rani@gmail.com, 11000, 43, 27),(raj, test, raj@gmail.com, 21000, 33, 17);

ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table(name, profile, email, salary, age, experience)values(rani, dev, rani@gmail' at line 1

mysql> INSERT into table(name, profile, email, salary, age, experience)values('rani', 'dev', 'rani@gmail.com', 11000, 43, 27),('raj', 'test', 'raj@gmail.com', 21000, 33, 17);

ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table(name, profile, email, salary, age, experience)values('rani', 'dev', 'rani@' at line 1

mysql> INSERT into employee(name, profile, email, salary, age, experience)values('rani', 'dev', 'rani@gmail.com', 11000, 43, 27),('raj', 'test', 'raj@gmail.com', 21000, 33, 17);

Query OK, 2 rows affected (0.02 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> select \* from employee;

+----+------+---------+----------------+--------+------+------------+

| id | name | profile | email          | salary | age  | experience |

+----+------+---------+----------------+--------+------+------------+

|  1 | rani | dev     | rani@gmail.com |  11000 |   43 |         27 |

|  2 | raj  | test    | raj@gmail.com  |  21000 |   33 |         17 |

+----+------+---------+----------------+--------+------+------------+

2 rows in set (0.00 sec)



mysql> INSERT into employee(name, profile, email, salary, age, experience)values('radha', 'test', 'radha@gmail.com', 26000, 38, 21),('raj', 'dev', 'raj12@gmail.com', 51000, 32, 12),('john', 'dev', 'john@gmail.com', 51000, 39, 27);

Query OK, 3 rows affected (0.01 sec)

Records: 3  Duplicates: 0  Warnings: 0



mysql> select \* from employee;

+----+-------+---------+-----------------+--------+------+------------+

| id | name  | profile | email           | salary | age  | experience |

+----+-------+---------+-----------------+--------+------+------------+

|  1 | rani  | dev     | rani@gmail.com  |  11000 |   43 |         27 |

|  2 | raj   | test    | raj@gmail.com   |  21000 |   33 |         17 |

|  3 | radha | test    | radha@gmail.com |  26000 |   38 |         21 |

|  4 | raj   | dev     | raj12@gmail.com |  51000 |   32 |         12 |

|  5 | john  | dev     | john@gmail.com  |  51000 |   39 |         27 |

+----+-------+---------+-----------------+--------+------+------------+

5 rows in set (0.00 sec)



###### **Q1.As a user, I want to add an column branch\_location so I can efficiently search the branch wise record.**



mysql> ALTER table employee ADD column branch\_location VARCHAR(150);

Query OK, 0 rows affected (0.03 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> select \* from employee;

+----+-------+---------+-----------------+--------+------+------------+-----------------+

| id | name  | profile | email           | salary | age  | experience | branch\_location |

+----+-------+---------+-----------------+--------+------+------------+-----------------+

|  1 | rani  | dev     | rani@gmail.com  |  11000 |   43 |         27 | NULL            |

|  2 | raj   | test    | raj@gmail.com   |  21000 |   33 |         17 | NULL            |

|  3 | radha | test    | radha@gmail.com |  26000 |   38 |         21 | NULL            |

|  4 | raj   | dev     | raj12@gmail.com |  51000 |   32 |         12 | NULL            |

|  5 | john  | dev     | john@gmail.com  |  51000 |   39 |         27 | NULL            |

+----+-------+---------+-----------------+--------+------+------------+-----------------+

5 rows in set (0.00 sec)



###### **Q2.As a user, I want to check the total salary expenses on employees.**



mysql> select SUM(salary) from employees;

ERROR 1146 (42S02): Table 'capgemini.employees' doesn't exist

mysql> select SUM(salary) from employee;

+-------------+

| SUM(salary) |

+-------------+

|      160000 |

+-------------+

1 row in set (0.00 sec)



###### Q3.As a user, I want to see the max salary of employee from test profile.



mysql> select MAX(salary) from employee where profile = 'test';

+-------------+

| MAX(salary) |

+-------------+

|       26000 |

+-------------+

1 row in set (0.00 sec)



###### Q4.As a user I want to get the average experience level of employees.



mysql> select AVG(experience) from employee;

+-----------------+

| AVG(experience) |

+-----------------+

|         20.8000 |

+-----------------+

1 row in set (0.00 sec)



###### Q5.As a user I want to see the name of highest paid employee.



mysql> select name from employee where salary = (select MAX(salary) from employee);

+------+

| name |

+------+

| raj  |

| john |

+------+

2 rows in set (0.00 sec)



###### Q6.As a user, I want to see the name and experience of lowest paid employee.



mysql> select name, experience from employee where salary = (select MIN(salary) from employee);

+------+------------+

| name | experience |

+------+------------+

| rani |         27 |

+------+------------+

1 row in set (0.00 sec)



###### Q7.As a user I want check how many employees are working in company.



mysql> select COUNT(\*) from employee;

+----------+

| COUNT(\*) |

+----------+

|        5 |

+----------+

1 row in set (0.00 sec)



###### Q8.As a user I want to see those employee names who are from test profile and having salary more than 25K.



mysql> select name from employee where profile = 'test' AND sakary > 25000;

ERROR 1054 (42S22): Unknown column 'sakary' in 'where clause'



mysql> select name from employee where profile = 'test' AND salary > 25000;

+-------+

| name  |

+-------+

| radha |

+-------+

1 row in set (0.00 sec)



###### Q9.As a user, I want to shift Radha on support profile.



mysql> UPDATE employee SET profile = 'support' where name = 'radha';

Query OK, 1 row affected (0.01 sec)

Rows matched: 1  Changed: 1  Warnings: 0



mysql> select \* from employee;

+----+-------+---------+-----------------+--------+------+------------+-----------------+

| id | name  | profile | email           | salary | age  | experience | branch\_location |

+----+-------+---------+-----------------+--------+------+------------+-----------------+

|  1 | rani  | dev     | rani@gmail.com  |  11000 |   43 |         27 | NULL            |

|  2 | raj   | test    | raj@gmail.com   |  21000 |   33 |         17 | NULL            |

|  3 | radha | support | radha@gmail.com |  26000 |   38 |         21 | NULL            |

|  4 | raj   | dev     | raj12@gmail.com |  51000 |   32 |         12 | NULL            |

|  5 | john  | dev     | john@gmail.com  |  51000 |   39 |         27 | NULL            |

+----+-------+---------+-----------------+--------+------+------------+-----------------+

5 rows in set (0.00 sec)





###### Q10.As a user, I want to get the second highest salary of employee.



mysql> select MAX(salary) AS second\_highestsalary from employee where salary < (select MAX(salary) from employee);

+----------------------+

| second\_highestsalary |

+----------------------+

|                26000 |

+----------------------+

1 row in set (0.00 sec)



###### **11.As a user I want to get the second lowest salary of employee**



mysql> select MIN(salary) AS second\_lowestsalary from employee where salary > (select MIN(salary) from employee);

+----------------------+

| second\_lowestsalary |

+----------------------+

|                21000 |

+----------------------+

1 row in set (0.00 sec)



###### 12.As a user, I want to calculate the average salary of employees those are belongs to dev profile



mysql> select AVG(salary) from employee where profile = 'dev';

+-------------+

| AVG(salary) |

+-------------+

|  37666.6667 |

+-------------+

1 row in set (0.00 sec)



###### 13.As a user, I want to see the employee’s name and salary who is having lowest experience.

###### 

mysql> select name, salary from employee where experience = (select MIN(experience) from employee);

+------+--------+

| name | salary |

+------+--------+

| raj  |  51000 |

+------+--------+

1 row in set (0.00 sec)



###### 14.As a user, I want to see the employee name who is having lowest age with max salary.



mysql> select name from employee where age = (select MIN(age) from employee where (select MAX(salary) from employee));

+------+

| name |

+------+

| raj  |

+------+

1 row in set (0.00 sec)



###### 15.As a user, I want to remove all the employee from company.



mysql> TRUNCATE table employee;

Query OK, 0 rows affected (0.06 sec)



mysql> select \* from employee;

Empty set (0.00 sec)



mysql>

