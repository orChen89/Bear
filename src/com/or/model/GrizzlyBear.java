package com.or.model;

public class GrizzlyBear extends Bear implements Bears{

    public GrizzlyBear(int age, FurColor furColor, int weight, Sex sex, boolean isHostile) {
        super(age, furColor, weight, sex, isHostile);
    }

    public GrizzlyBear(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void eat() {

        System.out.println("This Grizzly is eating right now!");

    }

    @Override
    public void mate(Bear other) {

        if (other instanceof GrizzlyBear && other.getSex() != this.getSex()){

            System.out.println("These Grizzlys' are mating right now!");

        } else{
            System.out.println("These Grizzlys' can't be mating with same sex!");
        }
    }
    public void hunt(){

        System.out.println("This Grizzly is hunting right now!");


    }

    @Override
    public String toString() {
        return "GrizzlyBear{" +
                "age=" + age +
                ", furColor=" + furColor +
                ", weight=" + weight +
                ", sex=" + sex +
                ", isHostile=" + isHostile +
                '}';
    }
}


