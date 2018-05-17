package access {
  class Outer {

    class Inner {
      private def m() = println("Access")

      class InnerMost {
        m()
      }
    }

//    new Inner.m()
  }




  class Base {
    protected def f() = println("Protected")
  }

  class Simple extends Base {
    f()
  }

  class Another {
//    new Base.f()
  }
}
