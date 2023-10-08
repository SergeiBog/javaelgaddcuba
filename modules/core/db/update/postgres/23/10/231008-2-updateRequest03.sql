alter table request add constraint FK_REQUEST_ON_SUPPLIER foreign key (SUPPLIER) references supplier(ID);
