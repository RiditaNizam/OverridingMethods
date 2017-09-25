package com.company;

/**
 * Created by ridita on 9/20/17.
 */
public class Queen extends Piece {
    public Queen(Position position) {
        super(position);
    }

    boolean isValidMove(Position newPosition) {

        //Bishop's movement
        if (super.isValidMove(newPosition) && Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)) {
            return true;
        }
        //Rock's movement
        else if (super.isValidMove(newPosition) && newPosition.column == this.position.column || newPosition.row == this.position.row) {
            return true;
        }
        return false;
    }
}