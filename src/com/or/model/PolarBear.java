package com.or.model;

public class PolarBear extends Bear implements Bears{

    public PolarBear(int age, FurColor furColor, int weight, Sex sex, boolean isHostile) {
        super(age, furColor, weight, sex, isHostile);
    }

    public PolarBear(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void eat() {

        System.out.println("This Polar is eating right now!");

    }

    @Override
    public void mate(Bear other) {

        if (other instanceof PolarBear && other.getSex() != this.getSex()){

            System.out.println("These Polars are mating right now!");

        } else{
            System.out.println("These Polars can't be mating with same sex!");
        }
    }

    public void hunt(){

        System.out.println("This Polar is hunting right now!");

    }

    @Override
    public String toString() {
        return "PolarBear{" +
                "age=" + age +
                ", furColor=" + furColor +
                ", weight=" + weight +
                ", sex=" + sex +
                ", isHostile=" + isHostile +
                '}';
    }
}
