object CollatzConjecture {
  def steps(x: Int) = {
    def loop(current : Int, steps : Int) : Option[Int] = current match {
      case n if(n <= 0) => None
      case 1 => Some(steps)
      case n if(n % 2 == 0) => loop(n/2, steps+1)
      case _ => loop(current * 3 + 1, steps + 1)
    }
    loop(x,0)
  }
}