public interface A {
    //every method of in interface are public and abstract
    void m1();
    public void m2();
}

abstract class B implements A{
    //here you must be implement two methods of interface A otherwise you want to only declare one method then class make to abstract
    public void m1(){

    }
}

class C extends B{
    // m1 method is not implement then it is not given any error because it is not a abstract method but you must be mention m2() method because it was a abstract method in interface A
    public void m2(){

    }
}
