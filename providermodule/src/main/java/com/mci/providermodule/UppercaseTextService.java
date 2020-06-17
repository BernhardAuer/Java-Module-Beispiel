package com.mci.providermodule;

import com.mci.servicemodule.TextService;

public class UppercaseTextService implements TextService {

    @Override
    public String processText(String text) {
        return text.toUpperCase();
    }

}