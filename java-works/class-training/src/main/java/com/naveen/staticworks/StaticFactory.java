package com.naveen.staticworks;


class User {
    private String name;
    private int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // static factory method
    public static User of(String name, int age) {
        // if you want to have condition you can have
        return new User(name, age);
    }

    public static User withName(String name) {
        return new User(name, 18);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StaticFactory {
    public static void main(String[] args) {
        User user1 = User.withName("Vineeth");
        System.out.println(user1);

        User user2 = User.of("Meet", 22);
        System.out.println(user2);
    }
}
