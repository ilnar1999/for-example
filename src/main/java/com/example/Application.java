package com.example;

import java.io.*;

public class Application {
    private static final String FILE_PATH = "src/main/resources/file.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account account;
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            account = new Account(1L, "Sam", 1050L);
            objectOutputStream.writeObject(account);
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            account = (Account) objectInputStream.readObject();
            System.out.println(account.getId() + " " + account.getCustomerName() + " " + account.getBalance());
        }
    }
}
