package com.company.javaelgaddcuba.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.javaelgaddcuba.entity.Supplier;

@UiController("javaelgaddcuba_Supplier.browse")
@UiDescriptor("supplier-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class SupplierBrowse extends MasterDetailScreen<Supplier> {
}