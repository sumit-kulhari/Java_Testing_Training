package org.mokito;

public class AdditionServiceImp implements AdditionService{
    @Override
    public int add(int a,int b){
        System.out.println("In addition implementation");
        return 400;
    }
}
