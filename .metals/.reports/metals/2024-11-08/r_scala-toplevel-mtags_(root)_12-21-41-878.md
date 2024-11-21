error id: file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory/core/Board.scala:[177..182) in Input.VirtualFile("file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory/core/Board.scala", "package de.htwg.se.memory.core

import de.htwg.se.memory.item.Card
import scala.util.Random._

class Board(cards: Vector[Vector[Card]], width: Int, height: Int) {

  def match
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
file:///C:/Users/fadis/Desktop/AIN-3/SE/SE-project/game/src/main/scala/de/htwg/se/memory/core/Board.scala:8: error: expected identifier; obtained match
  def match
      ^
#### Short summary: 

expected identifier; obtained match