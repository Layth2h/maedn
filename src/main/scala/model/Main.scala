package model

object Main:

  val board: Vector[Vector[String]] = Vector(
    Vector("RR", "RR", "  ", "  ", "..", "..", "BB", "  ", "  ", "BB", "BB"),
    Vector("RR", "RR", "  ", "  ", "..", "BB", "..", "  ", "  ", "BB", "BB"),
    Vector("  ", "  ", "  ", "  ", "..", "BB", "..", "  ", "  ", "  ", "  "),
    Vector("  ", "  ", "  ", "  ", "..", "BB", "..", "  ", "  ", "  ", "  "),
    Vector("RR", "..", "..", "..", "..", "BB", "..", "..", "..", "..", ".."),
    Vector("..", "RR", "RR", "RR", "RR", "**", "GG", "GG", "GG", "GG", ".."),
    Vector("..", "..", "..", "..", "..", "YY", "..", "..", "..", "..", "GG"),
    Vector("  ", "  ", "  ", "  ", "..", "YY", "..", "  ", "  ", "  ", "  "),
    Vector("  ", "  ", "  ", "  ", "..", "YY", "..", "  ", "  ", "  ", "  "),
    Vector("YY", "YY", "  ", "  ", "..", "YY", "..", "  ", "  ", "GG", "GG"),
    Vector("YY", "YY", "  ", "  ", "YY", "..", "..", "  ", "  ", "GG", "GG")
  )

  def runGame(): String =
    "Spielbrett geladen."
