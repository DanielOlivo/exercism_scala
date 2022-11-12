class CollatzConjectureTests extends org.scalatest.funsuite.AnyFunSuite {
  test("divide if even") {
    assert(Some(4) == CollatzConjecture.steps(16))
  }

  test("Large number of even and odd steps"){
    assert(Some(152) == CollatzConjecture.steps(1000000))
  }
}
