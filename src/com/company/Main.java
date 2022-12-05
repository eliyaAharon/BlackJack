package com.company;

import javax.swing.*;

public class Main extends JFrame {

    public Main(String dollarsBet) {
        this.setTitle("my game");
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(1000, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        GameScense gameScense = new GameScense(0, 0, 1000, 700, dollarsBet);
        this.add(gameScense);
    }

}
