package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //  в знаменателе ноль, поэтому ошибка

        calc.printToConsole.accept(c);
    }
}