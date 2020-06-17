module providermodule {
    requires servicemodule;
    provides com.mci.servicemodule.TextService with com.mci.providermodule.LowercaseTextService;
}