package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Player {

    private Random random = new Random();
    private ArrayList<Integer> ownCards = new ArrayList<>();

    public Player() {

    }

    public void hit(int[] arr) {
        int num = random.nextInt(52);
        while (arr[num] == 0) {
            num = random.nextInt(52);
        }
        ownCards.add(arr[num]);
        arr[num] = 0;
    }

    public int sumOfCards(int is1OR1) {
        int sum = 0;
        for (int i : ownCards) {
            sum += i;
        }
        return sum;
    }
}
