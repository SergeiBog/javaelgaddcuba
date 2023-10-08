package com.company.javaelgaddcuba.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.javaelgaddcuba.entity.Product;

@UiController("javaelgaddcuba_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProductBrowse extends MasterDetailScreen<Product> {
}