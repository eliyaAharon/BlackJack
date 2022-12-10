package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class GameScense extends JPanel {

    private Player player;
    private Dealer dealer;
    private int[] cards = createCards();


    public GameScense(int x, int y, int width, int height, String dollarsBet) {
        // panel settings
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(new Color(7, 161, 44));
        //label
        JLabel betLab = new JLabel();
        betLab.setBounds(0, 0, 350, 80);
        Font f = new Font("Monospaced", Font.BOLD, 28);
        betLab.setFont(f);
        betLab.setText("Your bet:" + dollarsBet + "💵");
        betLab.setForeground(Color.white);
        this.add(betLab);
        // set objects
        player = new Player();
        dealer = new Dealer();
        firstTurn();
    }

    public int[] createCards() {
        int[] cards = new int[52];
        int startFor = 0;
        for (int i = 1; i < 14; i++) {
            for (int j = startFor; j < startFor + 4; j++) {
                if (i > 10)
                    cards[j] = 10;
                else
                    cards[j] = i;
            }
            startFor += 4;
        }
        return cards;
    }

    public void firstTurn() {
        player.hit(cards);
        player.hit(cards);
        dealer.hit(cards);
        dealer.hit(cards);
    }


}
