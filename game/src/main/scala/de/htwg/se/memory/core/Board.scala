package de.htwg.se.memory.core

import de.htwg.se.memory.item.Card
import scala.util.Random._

class Board(cards: Vector[Vector[Card]], width: Int, height: Int) {

  def checkCards(card1: (Int, Int), card2: (Int, Int)): Boolean = {
    cards(card1._1)(card1._2) == cards(card2._1)(card2._2)
  }

  def flipCards(card1: (Int, Int), card2: (Int, Int)): Board = {
    val flippedCard1 = cards(card1._1)(card1._2).copy(isFaceUp = true)
    val flippedCard2 = cards(card2._1)(card2._2).copy(isFaceUp = true)

    val newCards = cards.updated(card1._1, cards(card1._1).updated(card1._2, flippedCard1))
      .updated(card2._1, cards(card2._1).updated(card2._2, flippedCard2))

    Board(newCards, width, height)
  }

  def getCards: Vector[Vector[Card]] = cards
}

object Board {
    def setupBoard(width: Int, height: Int): Board = {
        val cardstyle = Array(" A ", " B ", " C ", " D ")
        val cards = Vector.fill(height, width)(Card(cardstyle(nextInt(cardstyle.length))))

        Board(cards, width, height)
    }
}
