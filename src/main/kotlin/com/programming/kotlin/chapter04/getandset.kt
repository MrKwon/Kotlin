package com.programming.kotlin.chapter04

enum class Piece {
    Empty, Pawn, Bishop, Knight, Rook, Queen, King
}

class ChessBoard {
    private val board = Array<Piece>(64, {Piece.Empty})

    operator fun get(rank: Int, file: Int): Piece = board[file * 8 + rank]

    operator fun set(rank: Int, file: Int, value: Piece): Unit {
        board[file * 8 + rank] = value
    }
}

fun main(args: Array<String>) {
    val board = ChessBoard()
    println(board)

    board.set(0, 4, Piece.Queen)
    println(board.get(0, 4))

    val board2 = ChessBoard()
    board2[0, 4] = Piece.Queen
    println(board2[0, 4])
}