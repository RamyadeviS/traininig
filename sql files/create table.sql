
-- create a table
CREATE TABLE customers(customer_id number(10),customer_name varchar(15),address varchar(20),website varchar(10),credit_limit number(13));
-- insert data
INSERT INTO customers VALUES (11,'ramya','chennai','www.com',4657);
INSERT INTO customers VALUES (14,'jaya','madurai','ram.in',4745);
INSERT INTO customers VALUES (13,'suryaya','kerala','www.insta',4000);
--fetch data
SELECT *from customers;
--drop table customers ;

CREATE TABLE contacts(contact_id number(20),first_name varchar(8),last_name varchar(18),email varchar(12),phone number(17),customer_id number(20));
INSERT INTO contacts VALUES (345,'raja','s','raja@45',934567867,45656);
INSERT INTO contacts VALUES (376,'jaya','j','ja@45',945677867,45676);
SELECT *FROM contacts;

CREATE TABLE regions(region_id number(20),region_name varchar(20));
INSERT INTO regions VALUES (876,'hindu');
SELECT region_id FROM regions; 
SELECT region_name FROM regions; 

CREATE TABLE orders(order_id number(30),Customer_id number(25),order_status varchar(7),salesman_id number(15),order_date varchar(18));
INSERT INTO orders VALUES(4567,7867,'better',9876,'13/10/2022');
INSERT INTO orders VALUES(9767,7767,'good',95687,'18/12/2022');
SELECT *FROM orders;
--drop table orders;

CREATE TABLE employees(employee_id number(20),first_name varchar(8),last_name varchar(18),email varchar(12),phone number(17),hire_date varchar(20),manager_id number(10),job_title varchar(14));
INSERT INTO employees VALUES (376,'jaya','j','ja@45',945677867,'11/2/2000',576898,'oracle');
INSERT INTO employees VALUES (656,'jay','s','jay@45',948765657,'30/7/2005',98678,'java');
SELECT *FROM employees;

CREATE TABLE countries(country_id number(20),country_name varchar(20),region_id varchar(9));
INSERT INTO countries VALUES (876,'India','in');
SELECT region_id FROM countries; 
SELECT country_name FROM countries; 
SELECT country_id FROM countries;
--drop table countries;

CREATE TABLE orderItems(order_id number(10),item_id number(12),product_id number(13),Quantity number(15),unit_price number(20));
INSERT INTO orderItems VALUES(4567,7645,87098,10,40000);
INSERT INTO orderItems VALUES(76587,7654,45667,5,20000);
SELECT *FROM orderItems;

CREATE TABLE inventories(product_id number(20),wareHouse_id number(20),quantity number(15));
INSERT INTO inventories VALUES (876576,5678,7);
SELECT *FROM inventories;

CREATE TABLE locations(location_id number(6),address varchar(19),postal_code number(10),city varchar(15),state varchar(13),country_id varchar(14));
INSERT INTO locations VALUES (4567,'vanagaram',8765,'chennai','Tamilnadu',45678);
SELECT *FROM locations;

CREATE TABLE products(product_id number(11),product_name varchar(10),description varchar(15),standard_cost number(16),list_price number(13),category number(19));
INSERT INTO products VALUES(3456,'mobile','oppo',40000,38000,4567);
INSERT INTO products VALUES(7659,'mobile','vivo',50000,48000,45677);
SELECT *FROM products;
--drop table products;

CREATE TABLE product_categories (product_id number(5),category_name varchar(7));
INSERT INTO product_categories  VALUES(4567,'mobile');
INSERT INTO product_categories  VALUES(7659,'laptop');
SELECT *FROM product_categories ;
--drop table product_categories;

CREATE TABLE wareHouses (wareHouse_id number(15),wareHouse_name varchar(7),location_id number(18));
INSERT INTO wareHouses VALUES(8999,'asgf',45678);
INSERT INTO wareHouses VALUES(8769,'kjsdf',98765);
SELECT *FROM wareHouses;

