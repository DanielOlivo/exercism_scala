class TriangleTest extends org.scalatest.funsuite.AnyFunSuite {
  test("equilateral - true if all sides are equal") {
    val result = Triangle(2, 2, 2).equilateral 
    assert(result)
  }
  test("equilateral - false if any side is unequal") {
    val result = Triangle(2, 3, 2).equilateral
    assert(!result)
  }
  test("equilateral - false if no sides are equal") {
    val result = Triangle(5, 4, 6).equilateral
    assert(!result)
  }
  test("equilateral - All zero sides are illegal, so the triangle is not equilateral") {
    val result = Triangle(0, 0, 0).equilateral
    assert(!result)
  }
  test("equilateral - sides may be floats") {
    val result = Triangle(0.5, 0.5, 0.5).equilateral
    assert(result)
  }
  test("isosceles - true if first two sides are equal") {
    val result = Triangle(4, 4, 3).isosceles
    assert(result)
  }
  test("isosceles - true if first and last sides are equal") {
    val result = Triangle(4, 3, 4).isosceles
    assert(result)
  }
  test("isosceles - equilateral triangles are also isosceles") {
    val result = Triangle(4, 4, 4).isosceles
    assert(result)
  }
  test("isosceles - false if no sides are equal") {
    val result = Triangle(2, 3, 4).isosceles
    assert(!result)
  }
  test("isosceles - Sides that violate triangle inequality are not isosceles, even if two are equal") {
    val result = Triangle(1, 1, 3).isosceles
    assert(result)
  }
  test("isosceles - sides may be floats") {
    val result = Triangle(0.5, 0.4, 0.5).isosceles
    assert(result)
  }
}
