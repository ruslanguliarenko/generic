package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here



        SomeClass<A> someClass = new SomeClass<>(new A(4));
        SomeClass<B> someClass1 = new SomeClass<>(new B(4,4));
        SomeClass<C> someClass2 = new SomeClass<>(new C(4,4,6));
        SomeClass<String> someClass3 = new SomeClass<>("Vasya");

        func(someClass);
        func(someClass1);
        func(someClass2);
    }

    private static void func(SomeClass<? extends A> a){
        f(a.getObj());
    }



    private static void f(A a){
//        if(type.getClass()==A.class){
//            System.out.println(type.getClass()+ " f(A a)" );
//        }
//
//        if(type.getClass()==B.class){
//            System.out.println(type.getClass()+ " f(B b)" );
//        }
//
//        if(type.getClass()==C.class){
//            System.out.println(type.getClass()+ " f(C c)" );
//        }

        System.out.println(a.getClass()+ " f(A a)" );
    }

    private static void f(B b){

        System.out.println(b.getClass()+ " f(B b)" );

    }

    private static void f(C c){
        System.out.println(c.getClass()+ " f(C c)" );
    }

}
