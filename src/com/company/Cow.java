package com.company;

public class Cow extends Animal {
    public Cow(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Cow() {
        super();
    }

    @Override
    public String toString() {
        return "Cow weight:" + " " + getWeight() +
                ", Cow age:" + " " + getAge() +
                ", Cow gender:" + " " + getGender()+
         ", Cow nickname:" + getNickName();

    }
}
