package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Calculator get number of 1: " +
                calculator.getNumberOfChar("D:\\dataArtJavaSchoolTasks\\dataArtJavaSchoolTask5.2\\src\\test\\resources\\test.zip", '1'));

        System.out.println("Calculator get max length: " +
                calculator.getMaxWordLength("D:\\dataArtJavaSchoolTasks\\dataArtJavaSchoolTask5.2\\src\\test\\resources\\test1.zip"));
    }
}