package com.mci.servicemodule.external;

import com.mci.servicemodule.internal.LowercaseTextService;
import com.mci.servicemodule.internal.UppercaseTextService;

public class TextServiceFactory {
    private TextServiceFactory() {}

    public static TextService getTextService(String name) {
        return name.equalsIgnoreCase("lowercase") ? new LowercaseTextService(): new UppercaseTextService();
    }
}
