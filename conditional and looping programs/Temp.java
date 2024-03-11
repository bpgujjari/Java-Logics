import java.util.Scanner;


create table temp(
id number,
name varchar2(15),
sal number
);

insert into temp values(1,'bhavnai',25000);
insert into temp values(2,'prasad',15000);
insert into temp values(3,'gujjari',35000);

SELECT * FROM emp WHERE salary = (SELECT DISTINCT sal FROM emp ORDER BY sal DESC LIMIT 1 OFFSET 1 );

SELECT * FROM emp ORDER BY salary DESC LIMIT 1 OFFSET 1;