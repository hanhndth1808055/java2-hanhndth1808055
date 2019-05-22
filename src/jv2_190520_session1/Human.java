package jv2_190520_session1;

import java.util.PriorityQueue;

public class Human implements Comparable<Human> {
    public int age;
    public String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Human o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
