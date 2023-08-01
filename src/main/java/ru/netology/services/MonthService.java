package ru.netology.services;

public class MonthService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            //System.out.println("Месяц" + month + " Денег" + money);
            if (money >= threshold) {
                count++;
                money = (money - expenses);
                money = money / 3;
                //System.out.println("Отдыхаю");
            } else {
                money = (money + income) - expenses;
            }

        }
        return count;
    }
}

