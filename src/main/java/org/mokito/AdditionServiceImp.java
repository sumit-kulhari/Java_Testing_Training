package org.mokito;

public class AdditionServiceImp implements AdditionService{

//    This class is called a stub class
//    A stub is an object that looks like a genuine object but only has the methods
//    required for testing
    @Override
    public int add(int a,int b){
        System.out.println("In addition implementation");
        return 400;
    }
}
