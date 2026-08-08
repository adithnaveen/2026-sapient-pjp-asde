package com.naveen.stringworks;

public class StringWorks {
    public static void main(String[] args) {
        // mutable in nature
        StringBuffer sb;

        // string is immutable
        String str1 = "India";

        System.out.println("Address of Str 1 " + str1.hashCode() +", value " + str1);
        String str2 = str1;
        System.out.println("Address of Str 2 " + str2.hashCode() +" value " + str2 );

        String str3 = str2.toUpperCase();
        System.out.println("Address of Str 3 " + str3.hashCode() +" value " + str3 );

        System.out.println("Address of Str 2 " + str2.hashCode() +" value " + str2 );

        String StringNew = new String("India");
        System.out.println("Address of StringNew  " + StringNew.hashCode() +" value " + StringNew );


        // working with StringBuilder- mutate

        StringBuilder sb1 = new StringBuilder("Technology");
        System.out.println("Address " + sb1.hashCode()  +", value " + sb1);

        sb1.append("India");
        System.out.println("Address " + sb1.hashCode()  +", value " + sb1);


        // optimizing the memory
        // when you have millions of records mutating the strings like this is not good
        String result = "";
        for(int i= 0; i<100; i++) {
            result += "Content " + i +", ";
            System.out.println(result.hashCode());
        }

        System.out.println(result);


        StringBuilder builder = new StringBuilder();
        for(int i= 0; i<100; i++) {
            builder.append("Content SB ").append(i).append(",");
            System.out.println(builder.hashCode());
        }
        System.out.println(builder);
    }
}
