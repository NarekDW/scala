package a {

  class A {
    val bc = new b.B
  }

  package b {
    class B {
      val ac = new A
    }
  }


  package c {
    class C
  }

  package c.c2 {
    class C2 {
//      val cc = new C

      new A
      new A
    }
  }

}

package out {
  class A
}