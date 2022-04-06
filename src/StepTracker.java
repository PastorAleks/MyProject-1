import java.util.Scanner;
public class StepTracker {

    public static void inputDataStep(String[] args) {
        int[][] totalStep = new int[12][30];
        while (true) {
            System.out.println("Введите месяц от 0 до 11");
            int monthNumber = inputData(11);
            System.out.println("Введите день месяца от 0 до 29");
            int dayNumber = inputData(29);
            System.out.println("Введите количество пройденных шагов за день");
            int stepsTaken = inputData(999999);
            totalStep[monthNumber][dayNumber] = stepsTaken;
            System.out.println("Хотите добавить еще пройденные шаги? 1 - Да. 0 - Нет.");
            int userInput = inputData(1);
            if (userInput == 1) {
            } else if (userInput == 0) {
                break;
            }
        }

    }

    public static int inputData(int upValue) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int data = scanner.nextInt();
            if (data < 0) {
                System.out.println("Ошибка ввода!");
            } else if (data > upValue) {
                System.out.println("Ошибка ввода!");
            } else {
                return data;
            }
        }
    }

    public static void outStepPerDay(int[][] totalStep) {
        for (int i = 0; i < totalStep.length; i++) {
            for (int j = 0; j < totalStep[i].length; j++) {
                if (totalStep [i][j] > 0) {
                    System.out.print(j + "-й День: " + totalStep[i][j] + ", ");
                } else {

                }
            }
        }

    }
}
