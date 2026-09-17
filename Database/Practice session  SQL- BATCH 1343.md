&#x20;      

### &#x20;                                     **Practice session**

&#x20;

##### Q)Write each and every MySQL queries on notepad?



* CREATE DATABASE company\_db;//create new database
* SHOW databases; //To show the all databases
* USE company\_db;//To use database
* CREATE table employees(Id int AUTO\_INCREMENT PRIMARY KEY, employee\_name varchar(70), email varchar(100));// Create table in database
* DESC employees;
* SHOW tables;//To show the tables(eg.employees) in the current database
* INSERT into employees(employee\_name, email)VALUES('Ananta', 'abc@gmail.com');//Insert data into table
* SELECT \* from employees;// Select all records from employees table
* SELECT employee\_name from employees; // Select specific colm from table
* SELECT employee\_name, email from employees;//Select multiple column from table
* SELECT \* from employees where employee\_id = 4;// Select employee based on ID
* SELECT \* from employees where salary >450000 AND city = 'pune';//Select only those employees whose salary is greater than 450000 and city is pune
* SELECT \* from employees where salary >450000 OR city = 'pune';//Select employees whose salary is greater than 450000 or city is pune
* SELECT \* from employees where NOT city = 'pune';//Select all data except those who has city pune
* SELECT \* from employees order by salary ASC;//Select recordes from table based on salary ascending order
* SELECT \* from employees order by salary DSC;//Select recordes from table based on salary descending order
* ALTER table employees ADD column mob\_No decimal;// ADD column to an existing table 
* ALTER table employees RENAME column employee\_id TO id; // RENAME column from existing column
* ALTER table employees MODIFY column mob\_No bigint;// To change the datatype of existing column 
* ALTER table employees DROP column mob\_No;//DROP or Delete col from the table
* DROP table employees;//TO drop the entire table
* DROP database company\_db;//TO drop the database
* TRUNCATE table employees;//To delete all the records from the table without deleting the structure of the table









