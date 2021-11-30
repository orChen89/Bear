package com.or.model;

public class Main {

    public static void main(String[] args) {

        PandaBear pa1 = new PandaBear(7, FurColor.BLACK, 85, Sex.FEMALE, false);
        PandaBear pa2 = new PandaBear(10, FurColor.BLACK, 75, Sex.MALE, false);
        PolarBear po1 = new PolarBear(17, FurColor.WHITE, 150, Sex.MALE, true);
        PolarBear po2 = new PolarBear(19, FurColor.WHITE, 200, Sex.MALE, true);
        GrizzlyBear g1 = new GrizzlyBear(15, FurColor.BROWN, 170, Sex.MALE, true);
        GrizzlyBear g2 = new GrizzlyBear(13, FurColor.BROWN, 125, Sex.FEMALE, false);

        pa1.eat();
        System.out.println();
        pa1.mate(pa2);

        po1.hunt();
        System.out.println();
        po2.eat();

        po1.mate(po2);
        System.out.println();
        po2.sleep();
        System.out.println();

        g1.eat();
        System.out.println();
        g2.mate(g1);
        System.out.println();

        BearFactory bf = BearFactory.getInstance();

        System.out.println(bf.createBear("Panda"));
        System.out.println();
        System.out.println(bf.createBear("Grizzly"));
        System.out.println();
        System.out.println(bf.createBear("Polar"));

    }
}
