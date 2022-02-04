package com.artyomhack.domain.models;

public class SaveUserNameParam {

    private final String nameParam;

    public SaveUserNameParam(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getNameParam() {
        return nameParam;
    }
}
