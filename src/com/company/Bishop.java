package com.company;

/**
 * Created by ridita on 9/20/17.
 */

class Bishop extends Piece{
    public Bishop(Position position) {
        super(position);
    }

    boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)){  //Is the number of vertical steps is equal to the number of horizontal steps?
            return true;
        }
        else{
            return false;
        }
    }
}