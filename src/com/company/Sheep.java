package com.company;

public class Sheep extends Animal{
    public Sheep(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Sheep() {
    }


    @Override
    public String toString() {
        return "Sheep weight:" + " " + getWeight() +
                ", Sheep age:" + " " + getAge() +
                ", Sheep gender:" + " " + getGender()+
                ", Sheep nickname:" + getNickName();

    }
}
