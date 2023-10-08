alter table request_item add constraint FK_REQUEST_ITEM_ON_PRODUCT foreign key (PRODUCT_ID) references product(ID);
