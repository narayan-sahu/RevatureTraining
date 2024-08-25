create database college;
use college;
create table student(
	stu_id int primary key,
    stu_name varchar(50),
    city varchar(50),
    marks int,
    grade char(1)
);

insert into student values (1,'Pratik','Sangli',98,'A'), (2,'Shradha','Sangli',60,'C'),(3,'Prasad','Sangli',50,'C'),
	(4,'Manas','Pune',75,'B'); 
    
insert into student values (5,'Pratiksha','Pune',76,'B');

select * from student;

SET SQL_SAFE_UPDATES = 0;

update student set marks=85 where student_name='Prasad';

alter table student add column mentor varchar(50) default 'Dr. Magdum';

alter table student change stu_name student_name varchar(50);

alter table student rename to student_info;

alter table student_info drop column mentor;

alter table student_info rename to student;

select * from student order by marks desc;

select * from student order by marks desc limit 1 offset 2;
select * from student order by marks desc limit 3;

truncate table student;

delete from student where student_name='manas';

CREATE TABLE contacts (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(25) NOT NULL,
  email varchar(30) NOT NULL,
  username varchar(50) GENERATED ALWAYS AS (concat(name,_utf8mb4' ')) VIRTUAL,
  PRIMARY KEY (id),
  UNIQUE KEY email (email)
);

select * from contacts;
