package com.company;

/**
 * Created by ridita on 9/20/17.
 */

class Rock extends Piece{

    public Rock(Position position) {
        super(position);
    }

    boolean isValidMove(Position newPosition){  //a custom version of a method inside the Rock class

        if(!super.isValidMove(position)){
            return false;
        }

        if(newPosition.column == this.position.column || newPosition.row == this.position.row){
            return true;
        }
        else{
            return false;
        }
    }

}