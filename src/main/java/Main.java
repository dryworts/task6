import ru.netology.services.MonthService;

public class Main {
    public static void main(String[] args) {
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        MonthService service = new MonthService();
        System.out.println(service.calculate(income, expenses, threshold));
    }
}
