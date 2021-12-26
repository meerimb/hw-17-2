package com.company;

public class Horse extends Animal{

    public Horse(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Horse() {
    }


    @Override
    public String toString() {
        return "Horse weight:" + " " + getWeight() +
                ", Horse age:" + " " + getAge() +
                ", Horse gender:" + " " + getGender()+
                ", Horse nickname:" + getNickName();

    }
}
