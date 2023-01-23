-- create a table
CREATE TABLE customers(customer_id varchar(10),customer_name varchar(15),address varchar(20),website varchar(10),credit_limit varchar(13));
-- insert data
INSERT INTO customers VALUES (11,'ramya','chennai','www.com',4657);
INSERT INTO customers VALUES (14,'jaya','madurai','ram.in',4745);
INSERT INTO customers VALUES (13,'surya','kerala','www.insta',4000);
--fetch data
SELECT *from customers;

truncate TABLE customers;
SELECT *from customers;
alter table customers RENAME COLUMN address TO location;
