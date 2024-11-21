error id: file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory-game/Main.scala:[23..29) in Input.VirtualFile("file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory-game/Main.scala", "package de.htwg.se.

object Main extends App {
  val board = new Board(4) // Ein 4x4 Spielfeld
  var isGameOver = false

  println("Willkommen beim Memory-Spiel!")
  
  while (!isGameOver) {
    board.display() // Das aktuelle Spielfeld anzeigen
    println("Wähle zwei Karten zum Umdrehen (z.B. 1 2):")
    
    val input = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    if (input.length == 2) {
      board.flipCard(input(0))
      board.flipCard(input(1))

      if (board.isMatch(input(0), input(1))) {
        println("Treffer!")
      } else {
        println("Kein Treffer!")
        board.flipCardBack(input(0))
        board.flipCardBack(input(1))
      }

      if (board.isComplete()) {
        isGameOver = true
        println("Herzlichen Glückwunsch, du hast alle Paare gefunden!")
      }
    } else {
      println("Ungültige Eingabe. Bitte gib zwei Zahlen ein.")
    }
  }
}
")
file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory-game/Main.scala
file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory-game/Main.scala:3: error: expected identifier; obtained object
object Main extends App {
^
#### Short summary: 

expected identifier; obtained object