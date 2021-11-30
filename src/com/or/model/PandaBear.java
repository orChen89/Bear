package com.or.model;

public class PandaBear extends Bear implements Bears {

    public PandaBear(int age, FurColor furColor, int weight, Sex sex, boolean isHostile) {
        super(age, furColor, weight, sex, isHostile);
    }


    public PandaBear(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void eat() {

        System.out.println("This special Panda is eating right now");
    }


    @Override
    public void mate(Bear other) {

        if (other.isHostile != this.isHostile){
            System.out.println("These Pandas want to fight instead having sex!");
        }
        if (other instanceof PandaBear && other.getSex() != this.getSex()) {

            System.out.println("These Pandas are mating right now!");


        } else {
            System.out.println("These Pandas can't be mating with same sex!");
        }
    }


    @Override
    public String toString() {
        return "PandaBear{" +
                "age=" + age +
                ", furColor=" + furColor +
                ", weight=" + weight +
                ", sex=" + sex +
                ", isHostile=" + isHostile +
                '}';
    }
}
