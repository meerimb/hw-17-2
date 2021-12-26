package com.company;

import com.Farm;

public class Main {

    public static void main(String[] args) {
	Cow cow=new Cow(30,8,"f","Murka");
    Sheep sheep=new Sheep(10,2,"f","Dolly");
    Horse horse=new Horse(20,8,"m","Pegas");
    System.out.println(cow);
    System.out.println(sheep);
    System.out.println(horse);

    Farm farm1=new Farm();
    Cow cow1=new Cow();
    Cow cow2=new Cow();
    Cow cow3=new Cow();
    Cow cow4=new Cow();
    Cow cow5=new Cow();
    Cow []cows={cow1,cow2,cow3,cow4,cow5};
    System.out.println("Owner: Nick"+","+"Address: Texas"+", " + cow);

    Sheep sheep1=new Sheep();
    Sheep sheep2=new Sheep();
    Sheep sheep3=new Sheep();
    Sheep[]sheeps={sheep1,sheep2,sheep3};
    System.out.println("Owner: Nick"+","+"Address: Texas"+", " + sheep);

    Horse horse1=new Horse();
    Horse horse2=new Horse();
    Horse[]horses={horse1,horse2};
    System.out.println("Owner: Nick"+","+"Address: Texas"+", " + horse);


    Cow cow6=new Cow();
    Horse horse3=new Horse();
    Sheep sheep4=new Sheep();
    Farm farm2=new Farm(cow6,horse3,sheep4);

    }
}
