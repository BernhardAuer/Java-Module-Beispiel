package com.mci.consumermodule;

import com.mci.servicemodule.LowercaseTextService;
import com.mci.servicemodule.TextService;

public class Application {
    public static void main(String args[]) {
        TextService textService = new LowercaseTextService();
        System.out.println(textService.processText("Hello World!"));
    }
}