object PascalsTriangle {
  def triangleRow(n: Int): Seq[BigInt] =
    if (n == 0) Seq(1) else {
      val previousRow = triangleRow(n - 1)
      (0 to n) map {
        case 0 | `n` => 1
        case col     => previousRow(col - 1) + previousRow(col) + 1
      }
    }
}