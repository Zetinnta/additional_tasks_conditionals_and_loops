package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задача 6

        int age = 18;
        int salary = 90_000;
        double limit = 0;
        if (age < 23) {
            limit = 2 * salary;
        } else if (age >= 23) {
            limit = 3 * salary;
        }
        if (salary >= 50_000 && salary < 80_000) {
            limit = 1.2 * limit;
        } else if (salary >= 80_000) {
            limit = 1.5 * limit;
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + Math.round(limit) + " рублей.");

        System.out.println();
        // Задача 7

        //Что делать с теми, кто старше 30..?

        double baseRate = 0.1;
        int duration = 12;
        double max = 0.5;
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        if (age < 23 && salary < 80_000) {
            baseRate = baseRate + 0.01;
        } else if (age > 23 && age < 30 && salary < 80_000) {
            baseRate = baseRate + 0.005;
        } else if (salary >= 80_000) {
            baseRate = baseRate - 0.007;
        }
        double sumToBePaid = wantedSum * (1 + baseRate);
        System.out.println("Нужно выплатить сумму: " + Math.round(sumToBePaid));
        double toPayEveryMonth = sumToBePaid / duration;
        System.out.println("Ежемесячный платеж составляет: " + Math.round(toPayEveryMonth));
        if (salary * max >= toPayEveryMonth) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + Math.round(salary * max) + " рублей. Платеж по кредиту " + Math.round(toPayEveryMonth) + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + Math.round(salary * max) + " рублей. Платеж по кредиту " + Math.round(toPayEveryMonth) + " рублей. Отказано.");
        }

        System.out.println();
        //Задача 4

        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ": ");
            }
        }

        System.out.println();
        // Задача 5
        int previous = 0;
        int next = 1;
        System.out.print(previous + " " + next + " ");
        for (int i = 0; i < 8; i++) {
            int num = previous + next;
            previous = next;
            next = num;
            System.out.print(num + " ");
        }
    }
}
