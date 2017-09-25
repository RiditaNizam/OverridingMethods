package com.company;

/**
 * Created by ridita on 9/20/17.
 */

class Piece {

    Position position;  //field variable of type Position that stores the current position of that piece on the board

    public Piece(Position position) {
        this.position = position;
    }

    boolean isValidMove(Position newPosition) {  //Takes a potential new position
        
        return newPosition.row > 0 && newPosition.column > 0  //Decides if that position is within the bounds of the board
                && newPosition.row < 8 && newPosition.column < 8;

    }
}