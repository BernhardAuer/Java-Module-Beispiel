package com.mci.servicemodule;

public class LowercaseTextService implements TextService {

    @Override
    public String processText(String text) {
        return text.toLowerCase();
    }

}