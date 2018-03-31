package java;

public class Java {

    int a = 1;

    public void m(){
        int a = 2;
        System.out.println(a);
        System.out.println(this.a);
        {
//            int a = 12; error
        }
    }

}
