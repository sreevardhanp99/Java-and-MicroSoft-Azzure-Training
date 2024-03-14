use mydb;

create table movie ( name varchar(20), movie varchar(20), NumberOfTickets int); 
-- drop table movie;
desc movie;  
select * from movie;
alter table movie add column amount int;