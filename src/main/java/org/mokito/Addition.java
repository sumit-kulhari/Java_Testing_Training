package org.mokito;

public class Addition {
    AdditionService service;
     public Addition(AdditionService service){
        this.service = service;
     }

    public int addition(int a,int b){
        System.out.println("In addition service");
        return service.add(a,b);
    }
}
