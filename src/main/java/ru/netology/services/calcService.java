package ru.netology.services;

public class calcService {
    public int calculate(int income, int expenses, int threshold) {
        int restCount = 0; //счетчик месяцев отдыха
        int money = 0; //количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                restCount++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return restCount;
    }
}