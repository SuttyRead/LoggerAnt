package com.ua.sutty.Logger;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        LoggingArrayCollectionImpl<Integer> loggingArrayCollection = new LoggingArrayCollectionImpl<>();
        loggingArrayCollection.add(1);
//        System.out.println(loggingArrayCollection.add(1));
//        loggingArrayCollection.size();
//        loggingArrayCollection.size();
//        loggingArrayCollection.size();
//        loggingArrayCollection.size();
//        loggingArrayCollection.size();
        System.out.println(loggingArrayCollection.retainAll(Arrays.asList(1,2,3,4,5)));
//        System.out.println("Hello, World!");
    }

}
