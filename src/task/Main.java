package task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> stepTracker.addNewNumberStepsPerDay();
                case 2 -> stepTracker.changeStepGoal();
                case 3 -> stepTracker.printStatistic();
                case 4 -> {
                    System.out.println("");
                    return;
                }
            }
        }
    }

    static void printMenu() {
        System.out.println("""
                1. Ввести количество шагов за определенный день
                2. Изменить цель по количеству шагов в день
                3. Напечатать статистику за определённый месяц
                4. Выйти из приложения""");
    }
}

