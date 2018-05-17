package covariant;

public class CovariantJava {

    class A<T> {
        public A(T t) {}
    }

    void m(){
//        compile(new A<Integer>(1));
        compile(new A<Object>(1));
    }

    public void compile(A<Object> a) {}


}
