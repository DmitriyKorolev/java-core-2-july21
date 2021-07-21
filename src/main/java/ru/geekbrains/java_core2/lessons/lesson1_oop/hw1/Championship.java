package ru.geekbrains.java_core2.lessons.lesson1_oop.hw1;

public class Championship {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Barsik", 1500, 300),
        new Cat("Murzik", 1700, 220),
        new Robot("R2D2", 99999, 0),
        new Robot("R3P00", 5000, 50),
        new Human("Petya", 2500, 150),
        new Human("Vasya", 3500, 120),
        };


        Trap[] traps = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall(250),
        };

        for (Participant p : participants) {
            for (Trap t : traps) {
                if(!t.overcome(p)) break;

            }
        }
    }
}
