trait T1 { def x: Int }
trait T2 extends T1 {val x = 10}
trait T3 extends T1 {var x = 10}
trait T4 extends T1 {def x = 10}

trait A1 { val x: Int }
trait A2 extends A1 {val x = 10}
//trait A3 extends A1 {var x = 10}  err
//trait A4 extends A1 {def x = 10} err

trait B1 {val x: AnyVal }
trait B2 extends B1 {val x: Int = 1}

trait C1 {val x: Int}
//trait C2 extends C1 {val x: AnyVal}

trait D1 {var x: Int}
trait D2 extends D1 {val x = 10}