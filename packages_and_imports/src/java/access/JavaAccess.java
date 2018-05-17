package access;

public class JavaAccess {
    class Inner {
        private void m() {
            System.out.println("Private");
        }

        class InnerMost {
            void some() {
                m();
            }
        }
    }

    void someOuter() {
        new Inner().m();
    }

}
