create schema crime_management;
use crime_management;

create table login(
username varchar(20),
password varchar(20)
);
describe login;
insert into login values('virti','virti');
insert into login values('aastha','aastha');

create table PERSON(
Pan_no varchar(20) primary key,
F_Name varchar(10),
M_Name varchar(10),
L_Name varchar(10),
Age integer,
Phone_no long,
Date_Of_Birth Date
);
describe person;
drop table person;

create table VICTIM(
Victim_Id varchar(20) primary key,
Pan_no varchar(20) references PERSON(Pan_no),
F_Name varchar(10) references PERSON(F_name),
M_Name varchar(10) references PERSON(M_name),
L_Name varchar(10) references PERSON(L_name),
Age integer references PERSON(age),
Phone_no long references PERSON(Phone_no),
Date_Of_Birth Date references PERSON(Date_Of_Birth),
Injury varchar(100),
Medical_Cost integer
);
select * from victim;
describe victim;
drop table VICTIM;


create table CULPRIT(
Culprit_no varchar(20)  primary key,
Pan_no varchar(20) references PERSON(Pan_no),
F_Name varchar(10) references PERSON(F_name),
M_Name varchar(10) references PERSON(M_name),
L_Name varchar(10) references PERSON(L_name),
Age integer references PERSON(age),
Phone_no long references PERSON(Phone_no),
Date_Of_Birth Date references PERSON(Date_Of_Birth),
Image longblob,
Gender varchar(10),
Grade integer,
Type_OF_Crime varchar(25)
);
select * from culprit;
drop table CULPRIT;

create table ADVOCATE(
License_no varchar(20) primary key,
Pan_no varchar(20) references PERSON(Pan_no),
F_Name varchar(10) references PERSON(F_name),
M_Name varchar(10) references PERSON(M_name),
L_Name varchar(10) references PERSON(L_name),
Age integer references PERSON(age),
Phone_no long references PERSON(Phone_no),
Date_Of_Birth Date references PERSON(Date_Of_Birth),
Degree varchar(15),
Years_Of_Experience integer,
Case_no varchar(20),
Hearing varchar(20)
);
select * from advocate;
drop table advocate;
INSERT INTO ADVOCATE('1','EBTPT799','AASTHA','SHAILESH','GADHVI',25,9856123654,'1998-11-11','LLB',2,'YU768','NOT GUILTY');
insert into advocate('1','EBTPT799','AASTHA','SHAILESH','GADHVI',25,9856123654,'1998-11-11','LLB',2,'YU768','NOT GUILTY');
create table JUDGE(
License_no varchar(20) primary key,
Pan_no varchar(20) references PERSON(Pan_no),
F_Name varchar(10) references PERSON(F_name),
M_Name varchar(10) references PERSON(M_name),
L_Name varchar(10) references PERSON(L_name),
Age integer references PERSON(age),
Phone_no long references PERSON(Phone_no),
Date_Of_Birth Date references PERSON(Date_Of_Birth),
Degree varchar(15), 
Years_Of_Experience integer,
Case_no varchar(20),
Hearing varchar(20)
);
select * from judge;
drop table judge;

create table POLICE(
Police_Id varchar(20) primary key,
Officer varchar(20),
Culprit_no varchar(20) references CULPRIT(Culprit_no) 
);
select * from police;
drop table police;

select * from PERSON;
select * from ADVOCATE;
select * from CULPRIT;
select * from JUDGE;
select * from police;
select * from VICTIM;
select * from login;




