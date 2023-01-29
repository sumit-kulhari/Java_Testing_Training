package org.mokito;

public class AdditionServiceImp implements AdditionService{

//    This class is called a stub class
//    A stub is an object that looks like a genuine object but only has the methods
//    required for testing
//    Stub class has many disadvantages,  we cannot implement or test many scenarios
//    Dynamic conditions
//    Service condition ----->>> stubs are used in simple use cases
//    in complex cases or large ones we use Mock
    @Override
    public int add(int a,int b){
        System.out.println("In addition implementation");
        return 400;
    }
}
