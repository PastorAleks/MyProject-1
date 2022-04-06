public class Main {
    public static void main(String[] args) {

        StepTracker stepTracker = new StepTracker();

        while(true) {
            printMenu();
            stepTracker.inputData(upValue);
        }
        }
        public static void printMenu() {
            System.out.println("Введите число и выберите пункт меню:");
            System.out.println("1. Ввести количество шагов за определённый день.");
            System.out.println("2. Напечатать статистику за определённый месяц.");
            System.out.println("3. Изменить цель по количеству шагов в день.");
            System.out.println("0. Выйти из приложения.");
        }


    }

