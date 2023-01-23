create table customers(customer_id NUMBER PRIMARY KEY,c_name varchar2(20) NOT NULL,c_address varchar2(20),c_website varchar2(25),c_credit_limit NUMBER);
--insert datas into Customers table
INSERT INTO customers (customer_id,c_name,c_address,c_website,c_credit_limit) VALUES (11,'ramya','chennai','www.com',4657);
INSERT INTO customers(customer_id,c_name,c_address,c_website,c_credit_limit) VALUES (12,'jaya','madurai','ram.in',4745);
INSERT INTO customers(customer_id,c_name,c_address,c_website,c_credit_limit) VALUES (13,'surya','kerala','www.insta',4000);
INSERT INTO customers(customer_id,c_name,c_address,c_website,c_credit_limit) VALUES (14,'madhu','ariyalur','www.ytui',6000);
INSERT INTO customers(customer_id,c_name,c_address,c_website,c_credit_limit) VALUES (15,'sne','trichy','www.insta',5000);
--fetch data
SELECT *from customers;
drop table customers ;
--insert datas into products table
