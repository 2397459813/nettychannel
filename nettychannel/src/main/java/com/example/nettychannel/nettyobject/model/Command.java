package com.example.nettychannel.nettyobject.model;

import java.io.Serializable;

public class Command implements Serializable {

    private static final long serialVersionUID = 1320123451767766661L;

    private String actionName;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}