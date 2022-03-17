package ru.netology.novser;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);
        //int c = calculator.devide.apply(a, b);

        /*
        Ошибка связана с тем, что в классе Calculator лямбда-функция (переменная devide) не предусматривает
        деление на ноль.
        */
        int c = calculator.correctDevide.apply(a, b);
        calculator.println.accept(c);
    }
}
