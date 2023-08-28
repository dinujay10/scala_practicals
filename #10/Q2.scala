object Q2 extends App {
  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(word => word.length)
    val totalLetterCount = letterCounts.reduce((total, count) => total + count)

    totalLetterCount
  }

  val words = List("apple", "banana", "cherry", "date")
  val totalCount = countLetterOccurrences(words)
  println(s"Total count of letter occurrences: $totalCount")
}