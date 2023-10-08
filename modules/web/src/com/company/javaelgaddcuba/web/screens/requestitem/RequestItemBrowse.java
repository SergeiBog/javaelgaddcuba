package com.company.javaelgaddcuba.web.screens.requestitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.javaelgaddcuba.entity.RequestItem;

@UiController("javaelgaddcuba_RequestItem.browse")
@UiDescriptor("request-item-browse.xml")
@LookupComponent("requestItemsTable")
@LoadDataBeforeShow
public class RequestItemBrowse extends StandardLookup<RequestItem> {
}