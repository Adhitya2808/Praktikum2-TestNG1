package com.Tohsaka;

public class Prima {
    public static String prima(String hasil) {
        boolean flag = false;
        int num = 11;
        if (num == 0 || num == 1) {
            flag = true;
        }

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            hasil = "Bilangan Prima";
            return hasil;
        } else {
            hasil = "Bukan Bilangan Prima";
            return hasil;
        }
    }
}
