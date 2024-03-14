show databases;

drop database mydb;

create database mydb;

use mydb;

create table emp (id int primary key,  name varchar(20), jdate date, salary int, gender varchar(1));

desc emp;

insert into emp values (101,"Srinivas","2016-09-23",70000,"M");
insert into emp values (102,"Roja","2017-09-23",80000,"F"), (103,"Hema","2018-09-23",100000,"F"),
(104,"raja","2018-09-23",90000,"M") ,(105,"rahul","2019-09-23",50000,"M"),
(106,"Rani","2019-09-23",85000,"F");

select * from emp;

alter table emp add dept varchar(20);
update emp set dept = "CSE" where id = 101;
update emp set dept = "MECH" where id =102;
update emp set dept = "ECE" where id =103;
update emp set dept = "EEE" where id =104;
update emp set dept = "CIVIL" where id =105;
update emp set dept = "CSE" where id =106;

SELECT * FROM emp where salary between 55000 and 80000;

insert into emp values (107,"Kavya","2019-09-02",100000,"F","CSE");
select * from emp where salary  = (select max(salary) from emp);

select * from emp where jdate = (select min(jdate) from emp);

select count(*) from emp;

select dept, count(dept) as "No." from emp group by dept; 
# counting the number of employees based on department.

select * from emp where salary in (select salary from emp group by salary having count(*) > 1) order by salary;

select dept, count(*) as female_count from emp where gender ="F" ;

select * from emp where name like "%a";
select * from emp where name like "h%" and gender = "F";

update emp set salary = salary + (salary *0.1); 
# updating the everyone salary by 10%

select * from emp;