import java.util.List;

public class Calculator {

    public Calculator() {
    }

    /**
     * Метод вычисляет сумму элементов списка
     * 
     * @param numbers - список
     * @return - сумму
     */
    public double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    /**
     * Метод вычисляет произведение элементов списка
     * 
     * @param numbers - список
     * @return - произведение
     */
    public double mult(List<? extends Number> numbers) {
        double mult = 1;
        for (Number num : numbers) {
            mult *= num.doubleValue();
        }
        return mult;
    }

    /**
     * Метод вычисляет частное элементов списка
     * 
     * @param numbers - список
     * @return - частное
     *         при деление на 0 - Infinity
     */
    public double div(List<? extends Number> numbers) {
        double div = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            div /= numbers.get(i).doubleValue();
        }
        return div;
    }
}
