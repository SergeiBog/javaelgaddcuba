alter table request_item add constraint FK_REQUEST_ITEM_ON_REQUEST foreign key (REQUEST_ID) references request(ID);
