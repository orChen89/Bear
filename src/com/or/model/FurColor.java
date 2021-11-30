package com.or.model;

import java.util.Random;

public enum FurColor {

   BLACK, WHITE, BROWN, RED, ORANGE;

    public static FurColor getRandomColor(){
        Random random = new Random();
        return values() [random.nextInt(values().length)];
    }

}


