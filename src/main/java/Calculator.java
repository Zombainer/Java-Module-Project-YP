public class Calculator {
    void calcul(double result, int people) {
        // Результат

        result = result / people;

        // Oкончание
        String rubles;
        if (result % 10 == 1) {
            rubles = "рубль";
        } else if (result % 10 >= 2 && result % 10 <= 4) {
            rubles = "рубля";
        } else {
            rubles = "рублей";
        }


        String format = "Каждый человек должен по: %.2f %s.";
        System.out.println(String.format(format, result, rubles));
    }
}
