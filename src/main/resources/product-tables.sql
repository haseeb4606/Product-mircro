create database insurance;

create table products(
id bigint auto_increment not null,
plans varchar(45),
uid varchar(100),
primary key(id)
);

create table benefits(
id bigint auto_increment not null,
description varchar(75),
unit varchar (20),
cost varchar (50),
product_id bigint,
primary key(id),
foreign key(product_id) references products(id)
);
