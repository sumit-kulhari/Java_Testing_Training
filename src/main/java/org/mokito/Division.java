package org.mokito;

public class Division {
    DivisionService service;

    public DivisionService getService() {
        return service;
    }

    public void setService(DivisionService service) {
        this.service = service;
    }

    public Division(DivisionService service) {
        this.service = service;
    }

    public int division(int a,int b){
        System.out.println("In division service");

        return service.div(a,b);
    }
}
