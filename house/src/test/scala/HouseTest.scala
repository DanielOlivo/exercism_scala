class HouseTest extends org.scalatest.funsuite.AnyFunSuite {

  test("get first verse"){
    val result = House.getVerse(1)
    val expected = "This is the house that Jack built."
    assert(result == expected)
  }

  test("first two verses"){
    val result = House.getVerse(2)
    val expected = "This is the malt that lay in the house that Jack built."
    assert(result == expected)
  }

}
