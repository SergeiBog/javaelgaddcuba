package com.company.javaelgaddcuba.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.javaelgaddcuba.entity.Customer;

@UiController("javaelgaddcuba_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CustomerBrowse extends MasterDetailScreen<Customer> {
}