object House {
  val words : List[(String,String)] = List(
    ("lay in", "house that Jack built"),
    ("ate", "malt"),
    ("killed","rat"),
    ("worried","cat"),
    ("tossed","dog"),
    ("milked","cow with the crumpled horn"),
    ("kissed","maiden all forlorn"),
    ("married","man all tattered and torn"),
    ("woke","priest all shaven and shorn"),
    ("kept","rooster that crowed in the morn"),
    ("belonged to","farmer sowing his corn"),
    ("","horse and the hound and the horn")
  )

  def recite(from : Int, to : Int) = {
    (from to to).map(getVerse).mkString("\n") + "\n\n"
  }

  def getVerse (amount : Int) = {
    val lines = words.take(amount).reverse
    val (_,subject) = lines.head
    val firstLine = s"This is the $subject"

    val tail = lines.tail.map({case (obj,subj) => s"that $obj the $subj"})
    val result = (firstLine :: tail).mkString(" ") + "."
    result
  }
}