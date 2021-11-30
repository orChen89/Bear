package com.or.model;


interface Bears{

    void mate(Bear other);

   }

public abstract class Bear {

    protected int age;
    protected FurColor furColor;
    protected int weight;
    protected Sex sex;
    protected boolean isHostile;

    public Bear(int age, FurColor furColor, int weight, Sex sex, boolean isHostile) {
        this.age = age;
        this.furColor = furColor;
        this.weight = weight;
        this.sex = sex;
        this.isHostile = isHostile;
    }
    public Bear(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();

    public void sleep(){

        System.out.println("This Bear is sleeping all winter!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public void setFurColor(FurColor furColor) {
        this.furColor = furColor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isHostile() {
        return isHostile;
    }

    public void setHostile(boolean hostile) {
        isHostile = hostile;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "age=" + age +
                ", furColor=" + furColor +
                ", weight=" + weight +
                ", sex=" + sex +
                ", isHostile=" + isHostile +
                '}';
    }
}

