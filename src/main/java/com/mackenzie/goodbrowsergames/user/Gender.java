package com.mackenzie.goodbrowsergames.user;

import com.mackenzie.goodbrowsergames.exception.ForumException;

public enum Gender {
    MALE(0),
    FEMALE(1);

    private static String[] maleSymbols = {"m", "masculino"};
    private static String[] femaleSymbols = {"f", "feminino"};

    Gender(int index) {
    }

    Gender(String value) {
        parse(value);
    }

    public static Gender parse(String value) {
        value = value.trim();
        for (String m : maleSymbols) {
            if (m.equalsIgnoreCase(value)) {
                return MALE;
            }
        }

        for (String f : femaleSymbols) {
            if (f.equalsIgnoreCase(value)) {
                return FEMALE;
            }
        }
        throw new ForumException(ForumException.ErrorCode.INVALID_GENDER);
    }

}