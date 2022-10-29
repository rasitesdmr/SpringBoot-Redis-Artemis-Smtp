package com.example.api.enums;


import java.util.Random;

public enum EnumTweetMessage {
    Q,W,E,R,T,Y,U,I,O,P,A,S,D,F,G,H,J,K,L,Z,X,C,V,B,N,M;  // tweetler
    private static final Random PRNG = new Random();

    public static EnumTweetMessage randomEnum() {
        EnumTweetMessage[] enumTweetMessages = values();
        return enumTweetMessages[PRNG.nextInt(enumTweetMessages.length)];
    }
}
