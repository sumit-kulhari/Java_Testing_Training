package org.mokito;

public class Division {
    DivisionService service;

    public Division(DivisionService service) {
        this.service = service;
    }

    public int division(int a,int b){
        System.out.println("In division service");

        return service.div(a,b);
    }
}
