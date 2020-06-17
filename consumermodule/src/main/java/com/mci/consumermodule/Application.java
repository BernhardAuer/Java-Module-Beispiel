package com.mci.consumermodule;


import com.mci.servicemodule.external.TextService;
import com.mci.servicemodule.external.TextServiceFactory;

public class Application {
    public static void main(String args[]) {
        TextService textService = TextServiceFactory.getTextService("lowercase");
        System.out.println(textService.processText("Hello World!"));
    }
}