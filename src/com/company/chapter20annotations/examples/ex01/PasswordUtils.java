package com.company.chapter20annotations.examples.ex01;

import java.util.List;

public class PasswordUtils {
    @UseCase(id = 47, description = "Passwords must contain at least one numeric ")
    public boolean validaetPassword(String password) {
        return (password.matches(" \\w*\\d\\w*"));
    }

    @UseCase(id = 47)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();

    }

    @UseCase(id = 49, description = "New p assw ords can't equal previously used ones ")
    public boolean checkForNewPassword(
            List<String> prevPasswords, String password
    ) {
        return !prevPasswords.contains(password);
    }
}
