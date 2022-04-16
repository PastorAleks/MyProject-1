import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories; // Замените на таблицу с именем expensesByCategories
    ArrayList<Double> expenses;

    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // !Создайте таблицу
        expenses = new ArrayList<>();
    }
    // !Добавьте в метод ещё один параметр — category
    void saveExpense(String category, double moneyBeforeSalary, double expense) {
        //moneyBeforeSalary = moneyBeforeSalary - expense;
        if (expensesByCategories.containsKey(category)) {// Проверьте наличие категории
            System.out.println(expensesByCategories.get(category)); // Получите список трат в этой категории
            expenses.add(expense); // Добавьте трату
        } else {
            expenses = new ArrayList<>();
            expenses.add(expense);// Создайте новый список трат и добавьте в него сумму
            expensesByCategories.put(category, expenses); // Сохраните категорию и новый список трат в хеш-таблицу
        }
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        //return moneyBeforeSalary;
    }
    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами
        for (String keyCategory : expensesByCategories.keySet()) {
            System.out.println(keyCategory);
            ArrayList<Double> expenses = new ArrayList<>(expensesByCategories.get(keyCategory));
            for (Double expense : expenses) {
                System.out.println(expense);
            }
        }
    }
    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    void findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            for (Double max : expensesByCategories.get(category)) {
                if (max > maxExpense) {
                    maxExpense = max;
                }
            }
            System.out.println("Самая большая трата в категории " + category + " составила "
                    + maxExpense + " руб.");
        } else {
            System.out.println("Такой категории пока нет.");
        }
        //return maxExpense;
    }
    void removeAllExpenses() {
        expensesByCategories.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}
