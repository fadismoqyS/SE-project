package de.htwg.se.memory.item

sealed trait CardImp {
    def value: String
    def isMatched: Boolean
    def isFaceUp: Boolean
}

case class Card(value: String, isMatched: Boolean = false, isFaceUp: Boolean = false) extends CardImp {
    override def toString: String = s" ${value} "

    override def equals(other: Any): Boolean = other match {
        case that: Card => this.value == that.value
        case _ => false
    }
}