use classicmodels;

-- Example Trigger before update

create table employees_audit(
id int auto_increment primary key,
employeeNumber int not null,
lastname varchar(50) not null,
changedat datetime default null,
action varchar(50) default null
);

create trigger before_employee_update 
before update 
on employees 
for each row 
insert into employees_audit
set action='update',
employeeNumber=old.employeeNumber,
lastname=old.lastname,
changedat=now();

update employees set lastName='Jadhav' where employeeNumber=1056;

select * from employees_audit;
select * from employees where employeeNumber=1056;

drop trigger before_employee_update;


-- Example Trigger after insert

create trigger after_employee_insert
after insert 
on employees 
for each row 
insert into employees_audit
set action='insert',
employeeNumber=new.employeeNumber,
lastname=new.lastname,
changedat=now();

insert into employees values (10002,'Mali','Shradha','P5965','shradhamali155@gmail.com',5,1056,'Developer');
select * from employees_audit;

drop trigger before_employee_update;

select * from employees where employeeNumber=10001;

-- Example of the function

DELIMITER $$
CREATE FUNCTION CustomerLevel( credit DECIMAL(10,2) )
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
DECLARE customerLevel VARCHAR(20);
IF credit > 50000 THEN 
  SET customerLevel = 'PLATINUM'; 
  ELSEIF (credit >= 50000 AND credit <= 10000) THEN 
  SET customerLevel = 'GOLD'; 
  ELSEIF credit < 10000 THEN 
  SET customerLevel = 'SILVER'; 
END IF;
 RETURN (customerLevel);

END$$
DELIMITER ;

SELECT  customerName,
        CustomerLevel (creditLimit)
FROM customers
ORDER BY customerName;
