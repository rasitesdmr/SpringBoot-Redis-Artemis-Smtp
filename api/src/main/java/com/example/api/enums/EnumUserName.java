package com.example.api.enums;

import java.util.Random;

public enum EnumUserName {

    RAŞİT,AHMET,ÖMER,MEHMET,ALİ,ELİF,FATMA,MURAT,EREN,BURHAN,YUSUF,MERVE,HALİL,PEMBE,MERT;
    private static final Random PRNG = new Random();

    public static EnumUserName randomEnum() {
        EnumUserName[] enumUserNames = values();
        return enumUserNames[PRNG.nextInt(enumUserNames.length)];
    }
}
