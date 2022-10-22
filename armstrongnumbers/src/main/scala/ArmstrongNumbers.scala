object ArmstrongNumbers extends App {
  import scala.math.pow
  def isArmstrongNumber(number : Int) = {
    val digits = number.toString().to(List).map(_.asDigit)
    digits.map(pow(_,digits.length)).sum == number
  } 
}