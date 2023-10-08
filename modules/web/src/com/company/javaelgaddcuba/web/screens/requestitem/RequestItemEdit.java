package com.company.javaelgaddcuba.web.screens.requestitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.javaelgaddcuba.entity.RequestItem;

@UiController("javaelgaddcuba_RequestItem.edit")
@UiDescriptor("request-item-edit.xml")
@EditedEntityContainer("requestItemDc")
@LoadDataBeforeShow
public class RequestItemEdit extends StandardEditor<RequestItem> {
}