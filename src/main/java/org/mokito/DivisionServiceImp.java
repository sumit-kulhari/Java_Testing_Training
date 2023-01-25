package org.mokito;

public class DivisionServiceImp implements DivisionService{
    @Override
    public int div(int a,int b){
        System.out.println("In division implementation");
        return 100;
    }
}
