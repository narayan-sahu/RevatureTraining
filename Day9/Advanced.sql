use classicmodels;
show tables;
select * from customers;
select contactLastName,contactFirstName from customers order by contactLastName;
select contactLastName,contactFirstName from customers order by contactLastName desc, contactFirstName asc;

select lastname,firstname,jobtitle from employees where jobtitle='Sales Rep';
select lastname,firstname,jobtitle,officeCode from employees where jobtitle='Sales Rep' AND officeCode=1;
select lastname,firstname,jobtitle,officeCode from employees where jobtitle='Sales Rep' OR officeCode=1;
select firstName,lastName,officeCode from employees where officeCode between 1 and 3;
select firstName,lastName,officeCode from employees where officeCode in (1,2,3);

select upper(firstName) as f_name from employees;
select right(firstName,3) from employees; 

create view view_customer as select contactLastName,contactFirstName from customers order by contactLastName;

select * from view_customer;

select * from offices;

create index idx_phone on customers(phone);

