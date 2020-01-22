create table products (
id bigint not null auto_increment,
Plans varchar(50) not null unique,
uid varchar(100),
primary key(id)
);

create table Benefit_Package (
id bigint auto_increment not null,
description varchar(70) not null unique,
unit varchar(20) not null, 
benefits varchar(100) not null,
product_id bigint not null,
primary key(id),
foreign key(product_id)references products(id)
);
alter TABLE Benefit_Package change column benefits Cost varchar (100) not null;
