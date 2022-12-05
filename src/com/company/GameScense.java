package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class GameScense extends JPanel {

    public GameScense(int x, int y, int width, int height, String dollarsBet) {
        // panel settings
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(new Color(7, 161, 44));
        // cards
        int[] cards = createCards();
        System.out.println(cards.length);
        // THe player takes random two cards
        Random random = new Random();

        int ran1 = random.nextInt(52);
        int ran2 = random.nextInt(52);
        int num1 = cards[ran1];
        int num2 = cards[ran2];
        cards[num1] = 0;
        cards[num2] = 0 ;


    }

    public int[] createCards() {
        int[] cards = new int[52];
        int startFor = 0;
        for (int i = 1; i < 14; i++) {
            for (int j = startFor; j < startFor + 4; j++) {
                cards[j] = i;
            }
            startFor += 4;
        }
        return cards;
    }


}
