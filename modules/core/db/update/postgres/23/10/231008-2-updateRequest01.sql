alter table request add constraint FK_REQUEST_ON_CUSTOMER foreign key (CUSTOMER) references customer(ID);
