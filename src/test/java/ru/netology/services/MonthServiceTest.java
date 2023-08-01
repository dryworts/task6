package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.MonthService;

public class MonthServiceTest {
    @Test
    void example1() {
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        MonthService service = new MonthService();
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        //System.out.println(service.calculate(income, expenses, threshold));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void example2() {
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        MonthService service = new MonthService();
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        //System.out.println(service.calculate(income, expenses, threshold));
        Assertions.assertEquals(expected, actual);
    }
}

