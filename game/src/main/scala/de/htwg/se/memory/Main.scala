package de.htwg.se.memory

import de.htwg.se.memory.core.TUI

@main def memory(): Unit = {
    val tui = new TUI()
    tui.initializeBoard(4, 4)
}