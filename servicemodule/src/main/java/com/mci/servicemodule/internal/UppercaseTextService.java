package com.mci.servicemodule.internal;

import com.mci.servicemodule.external.TextService;

public class UppercaseTextService implements TextService {

    @Override
    public String processText(String text) {
        return text.toUpperCase();
    }

}