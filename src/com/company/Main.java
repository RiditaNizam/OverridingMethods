package com.company;

public class Main {

    public static void main(String[] args) {

        Position position = new Position(3,7);

        Queen queen = new Queen(position);

        System.out.println(queen.isValidMove(new Position(4,7)));

    }
}