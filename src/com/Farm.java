package com;

import com.company.Animal;
import com.company.Cow;
import com.company.Horse;
import com.company.Sheep;

public  class Farm extends Animal{
    private String address;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;
    private String ownerName;



    public Farm(Cow cow6, Horse horse3, Sheep sheep4) {

    }

    public Farm() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Farm(int weight, int age, String gender, String nickName, String address, Cow[] cows, Sheep[] sheeps, Horse[] horses, String ownerName) {
        super(weight, age, gender, nickName);
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.ownerName = ownerName;
    }


    @Override
    public String toString() {
        return "Farm address:" + " " + getAddress() +
                ", Cows:" + " " + getCows() +
                ", Sheeps:" + " " + getSheeps()+
                ", Horses:" + getHorses()+
                ", Owner name:"+getOwnerName();

    }
}

