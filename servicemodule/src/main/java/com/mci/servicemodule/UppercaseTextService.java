package com.mci.servicemodule;

public class UppercaseTextService implements TextService {

    @Override
    public String processText(String text) {
        return text.toUpperCase();
    }

}