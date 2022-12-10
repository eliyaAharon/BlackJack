package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Dealer {

    private Random random = new Random();
    private ArrayList<Integer> ownCards = new ArrayList<>();

    public Dealer() {

    }

    public void hit(int[] arr) {
        int num = random.nextInt(52);
        while (arr[num] == 0) {
            num = random.nextInt(52);
        }
        ownCards.add(arr[num]);
        arr[num] = 0;
    }

    public int sumOfCards() {
        int sum = 0;
        for (int i : ownCards) {
            sum += i;
        }
        return sum;
    }

}
