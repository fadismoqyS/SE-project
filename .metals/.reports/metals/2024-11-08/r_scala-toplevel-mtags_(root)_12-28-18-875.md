error id: file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory/core/Board.scala:[315..316) in Input.VirtualFile("file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory/core/Board.scala", "package de.htwg.se.memory.core

import de.htwg.se.memory.item.Card
import scala.util.Random._

class Board(cards: Vector[Vector[Card]], width: Int, height: Int) {

  def checkCards(card1: (Int, Int), card2: (Int, Int)): Boolean = {
    cards(card1._1)(card1._2) == cards(card2._1)(card2._2)
  }

  def 
}

object Board {
    def setupBoard(width: Int, height: Int): Board = {
        val cardstyle = Array(" A ", " B ", " C ", " D ")
        val cards = Vector.fill(height, width)(Card(cardstyle(nextInt(cardstyle.length))))

        Board(cards, width, height)
    }
}
")
file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory/core/Board.scala
file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory/core/Board.scala:13: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace