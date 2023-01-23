create table userDetails(aadhar_no number(20) primary key,user_name varchar(20),mail_id varchar(21),password varchar(15),mobile_no number(10));
SELECT *FROM userDetails;
 
delete  from userDetails where user_name='Krishna';
commit;
drop table userDetails;

create table epassApply(application_no number(20),applicant_name varchar(15),aadhar_no number(12),gender varchar(10),reason varchar(31),father_name varchar(19),dob
date,from_district varchar(25),to_district varchar(21),state varchar(18),travel_date date,return_date date,no_of_passengers number(12),vehicle_no varchar(30), mobile_no number(10),vaccination_certificate varchar(33),
constraint userDetails_epassApply_fk foreign key (aadhar_no)references userDetails);
ALTER TABLE epassApply ADD return_date varchar(22);
SELECT *from epassApply;
commit;
drop table epassApply; 
create table reason(types_of_reasons varchar(50));
insert into reason (types_of_reasons) values('logistic_deliveries');
insert into reason (types_of_reasons) values('medical_supply');
insert into reason (types_of_reasons) values('Essential_services');
insert into reason (types_of_reasons) values('medical_emergency');
insert into reason (types_of_reasons) values('Ecommerce_delivery_boys');

select*from reason;
drop table reason;
commit;

create table travelHistory(application_no number(20),applicant_name varchar(15),ticket_no varchar(19), travel_date date,time varchar(20),aadhar_no number(12),gender varchar(10),reason varchar(31),father_name varchar(19),dob
date,source varchar(25),destination varchar(21),no_of_passengers number(25),mobile_no number(10),vaccination_certificate varchar(33),
   constraint userDetails_travel_history_fk foreign key (aadhar_no)references userDetails);
ALTER TABLE  travelHistory ADD return_date varchar(21);
SELECT *from travelHistory; 

drop table  travelHistory;

create table admin(mail_id varchar(20),password varchar(15));
insert into admin (mail_id,password) values('admin@gmail.com','admin712');
select *from admin;

drop table admin;

create table epassHistory(aadhar_no number(25),mobile_no number(15),
    constraint userDetails_epassHistory_fk foreign key(aadhar_no)references userDetails);
insert into epassHistory(aadhar_no,mobile_no)values(978719581900,9361624543);
insert into epassHistory(aadhar_no,mobile_no)values(750216849455,8765455671);
select*from epassHistory;
 
 create table epassApplyStatus(application_no number primary key,applicant_name varchar(15),aadhar_no number(12),vaccination_certificate varchar(33),status varchar(16),
constraint userDetails_epassApplyStatus_fk foreign key (aadhar_no)references userDetails);
SELECT *from epassApplyStatus;

drop table epassApplyStatus; 
 
 create table travelHistoryStatus(application_no number primary key,applicant_name varchar(15),ticket_no varchar(17),aadhar_no number(12),vaccination_certificate varchar(33),status varchar(19),
   constraint userDetails_travelHistoryStatus_fk foreign key (aadhar_no)references userDetails);
SELECT *from travelHistoryStatus;

drop table travelHistoryStatus;

select * from epassApplyStatus where aadhar_no=978719581900;
commit;