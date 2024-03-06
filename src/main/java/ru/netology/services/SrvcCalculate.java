package ru.netology.services;

public class SrvcCalculate {
    public int calculate(int income, int expenses, int threshold) {
        int countVacation = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                money = money + income - expenses;
            } else {
                int vacMoneyBalance = money - expenses;
                int vacMoney = vacMoneyBalance - ((money - expenses) / 3);
                money = (money - expenses) / 3;
                countVacation++;
            }
        }
        return countVacation;
    }
}