-- begin REQUEST
alter table request add constraint FK_REQUEST_ON_CUSTOMER foreign key (CUSTOMER) references customer(ID)^
alter table request add constraint FK_REQUEST_ON_SUPPLIER foreign key (SUPPLIER) references supplier(ID)^
create index IDX_REQUEST_ON_CUSTOMER on request (CUSTOMER)^
create index IDX_REQUEST_ON_SUPPLIER on request (SUPPLIER)^
-- end REQUEST
-- begin REQUEST_ITEM
alter table request_item add constraint FK_REQUEST_ITEM_ON_PRODUCT foreign key (PRODUCT_ID) references product(ID)^
alter table request_item add constraint FK_REQUEST_ITEM_ON_REQUEST foreign key (REQUEST_ID) references request(ID)^
create index IDX_REQUEST_ITEM_ON_PRODUCT on request_item (PRODUCT_ID)^
create index IDX_REQUEST_ITEM_ON_REQUEST on request_item (REQUEST_ID)^
-- end REQUEST_ITEM
