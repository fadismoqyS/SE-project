package de.htwg.se.memory.core

import de.htwg.se.memory.core.Board

class TUI {

    def initializeBoard(width: Int, height: Int): Unit = {
        
        update(Board.setupBoard(width, height))
    }

    def update(board: Board): Unit = {
        
        val input1 = parseInput(scala.io.StdIn.readLine("Choose the first Card to flip: <x, y>"))
        val input2 = parseInput(scala.io.StdIn.readLine("Choose the second Card to flip: <x, y>"))

        if (input1 == (-1, -1) || input2 == (-1, -1)) {
            println("Invalid input. Please enter two numbers.")
            update(board)
        }

        val currentBoard = board.flipCards(input1, input2)

        println(render(currentBoard))

        update(currentBoard)
    }

    def render(board: Board): String = {
        board.getCards.map(row => row.map(card => card.toString()).mkString(" ")).mkString("\n")
    }

    def parseInput(input: String): (Int, Int) = {
        try {

            val coordinates = input.split(",").map(_.trim.toInt)
            (coordinates(0), coordinates(1))
        } catch {
            case e: Exception => (-1, -1)
        }
    }
}
