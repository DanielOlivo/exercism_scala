class Triangle {
  private var a : Double = 0.0
  private var b : Double = 0.0
  private var c : Double = 0.0

  def nonzero : Boolean = (a > 0) && (b > 0) && (c > 0)
  def ab = a == b
  def ac = a == c
  def bc = b == c
  def allEqual = ab && ac
  def inequality = (a + b >= c) && (a + c >= b) && (b + c >= a)
  def equilateral : Boolean = nonzero && allEqual
  def isosceles = nonzero && inequality && (ab || ac || bc)
  def scalene = nonzero && inequality && !ab && !ac && !bc
}

object Triangle {
  def apply(a : Double, b : Double, c : Double) = {
    var triangle = new Triangle()
    triangle.a = a
    triangle.b = b
    triangle.c = c
    triangle
  }
}