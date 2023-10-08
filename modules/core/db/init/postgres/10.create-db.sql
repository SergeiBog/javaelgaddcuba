-- begin PRODUCT
create table product (
    ID bigserial,
    --
    cost double precision not null,
    name varchar(100) not null,
    --
    primary key (ID)
)^
-- end PRODUCT
-- begin REQUEST
create table request (
    ID bigserial,
    --
    customer bigint not null,
    supplier bigint not null,
    --
    primary key (ID)
)^
-- end REQUEST
-- begin CUSTOMER
create table customer (
    ID bigserial,
    --
    city varchar(100) not null,
    name varchar(100) not null,
    --
    primary key (ID)
)^
-- end CUSTOMER
-- begin SUPPLIER
create table supplier (
    ID bigserial,
    --
    name varchar(100) not null,
    --
    primary key (ID)
)^
-- end SUPPLIER
-- begin REQUEST_ITEM
create table request_item (
    ID bigserial,
    --
    product_id bigint not null,
    request_id bigint not null,
    volume double precision not null,
    --
    primary key (ID)
)^
-- end REQUEST_ITEM
