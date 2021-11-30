package com.or.model;

import java.util.Objects;
import java.util.Random;


public class BearFactory {

    private static final BearFactory instance = new BearFactory();

    private BearFactory(){}

    public static BearFactory getInstance(){

        return instance;
    }

    public Bear createBear(String bearType) {


        Random r = new Random();
        Bear type;

        if (Objects.equals(bearType, "Panda")) {
            type = new PandaBear(r.nextInt(50), FurColor.getRandomColor(), r.nextInt(700), Sex.MALE, r.nextBoolean());


        } else if (Objects.equals(bearType, "Grizzly")) {
            type = new GrizzlyBear(r.nextInt(100), FurColor.getRandomColor(), r.nextInt(1500), Sex.MALE, r.nextBoolean());

        } else if (Objects.equals(bearType, "Polar")){
            type = new PolarBear(r.nextInt(90), FurColor.getRandomColor(), r.nextInt(1500), Sex.MALE, r.nextBoolean());

        } else{

            return null;
        }
        return type;
    }

}
