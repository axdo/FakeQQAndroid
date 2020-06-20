package com.cobra.fakeqq;

import java.io.Serializable;

public class ContactsInfo implements Serializable {
    private String displayName;
    private String number;

    public ContactsInfo() {
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
