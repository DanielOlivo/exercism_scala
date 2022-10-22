class ArmstrongNumbersTest extends org.scalatest.funsuite.AnyFunSuite {
  test("Single digit numbers are Armstrong numbers") {
    val result = ArmstrongNumbers.isArmstrongNumber(5)
    assert(result)
  }
  test("Seven digit number that is an Armstrong number") {
    val result = ArmstrongNumbers.isArmstrongNumber(9926315)
    assert(result)
  }
  test("Seven digit number that is not an Armstrong number") {
    val result = ArmstrongNumbers.isArmstrongNumber(9926314)
    assert(!result)
  }
}
