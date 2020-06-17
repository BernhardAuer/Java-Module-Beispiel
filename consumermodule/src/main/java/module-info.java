module consumermodule { // immer modulnamen angeben, nicht packagenamen
    requires servicemodule; // es können nur Module importiert werden, keine packages!
    uses com.mci.servicemodule.TextService;
}