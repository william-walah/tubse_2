package com.example.tubes_2.interfaces;

public interface GameWrapper {
    void initializeGame();
    void startGame();
    void drawHPBar();
    void startLogicThread();
    void calculateScore();
    void gameOver();
}
