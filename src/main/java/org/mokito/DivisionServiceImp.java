package org.mokito;

public class DivisionServiceImp implements DivisionService{

//    This class is called a stub class
//    A stub is an object that looks like a genuine object but only has the methods
//    required for testing
    @Override
    public int div(int a,int b){
        System.out.println("In division implementation");
        return 100;
    }
}
