package com.company.javaelgaddcuba.web.screens.request;

import com.haulmont.cuba.gui.screen.*;
import com.company.javaelgaddcuba.entity.Request;

@UiController("javaelgaddcuba_Request.browse")
@UiDescriptor("request-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class RequestBrowse extends MasterDetailScreen<Request> {
}