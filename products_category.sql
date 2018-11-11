

CREATE DATABASE Test;
use test;
Drop table products;
Drop table category;
Drop table products_category;
CREATE TABLE products
(
	products_id int auto_increment NOT NULL,
    product_name VARCHAR(30),
    primary key (products_id)
);

CREATE TABLE category
(
	category_id int auto_increment NOT NULL,
    product_category VARCHAR(30),
    primary key(category_id)
    

);


CREATE TABLE products_category
(
	products_id int NOT NULL,
    category_id int NOT NULL

);
INSERT INTO products (product_name)
VALUES
('Домик в деревне'),
('Простоквашино'),
('Морковь'),
('TWIX'),
('C1'),
('Огурец');

INSERT INTO category
(product_category) VALUES
  ('Молоко'),
  ('Яйцо'),
  ('Овощи'),
  ('Сладости');


insert into products_category(products_id, category_id)
values 
(1, 1),
(2, 1),
(3,3),
(4,4),
(5,2);
select * from products;
select * from category;
select * from products_category;

SELECT *
FROM products 
LEFT JOIN products_category
ON products.products_id = products_category.products_id 
left join
 category on products_category.category_id=category.category_id;


