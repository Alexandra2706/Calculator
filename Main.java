import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------DOUBLE----------");
        Calculator calc = new Calculator();
        List<Double> numsDouble = new ArrayList<>(Arrays.asList(4.0, 2.0, 2.0));
        printResult(calc, numsDouble);
        List<Double> numsDoubleZero = new ArrayList<>(Arrays.asList(4.0, 2.0, 0.0));
        printResult(calc, numsDoubleZero);

        System.out.println("----------INTEGER----------");
        List<Integer> numsInt = new ArrayList<>(Arrays.asList(4, 2, 2));
        printResult(calc, numsInt);
        List<Integer> numsIntZero = new ArrayList<>(Arrays.asList(4, 2, 0));
        printResult(calc, numsIntZero);

        System.out.println("----------TO BINARY----------");
        BinaryCalc<String> binaryCalcStr = new BinaryCalc<String>();
        binaryCalcStr.printResultBinary("12");
        binaryCalcStr.printResultBinary("12as");
        BinaryCalc<Integer> binaryCalcInt = new BinaryCalc<Integer>();
        binaryCalcInt.printResultBinary(10);
        System.out.println();

        System.out.println("----------TO DECIMAL----------");
        BinaryCalc<String> decimalCalcStr = new BinaryCalc<String>();
        decimalCalcStr.printResultDecimal("1100");
        decimalCalcStr.printResultDecimal("1a100");
        BinaryCalc<Integer> decimalCalcInt = new BinaryCalc<Integer>();
        decimalCalcInt.printResultDecimal(1010);
        decimalCalcInt.printResultDecimal(1210);
    }

    public static void printResult(Calculator calc, List<? extends Number> nums) {
        System.out.println("Сумма чисел " + nums + " = " + calc.sum(nums));
        System.out.println("Произведение чисел " + nums + " = " + calc.mult(nums));
        if (Double.valueOf(calc.div(nums)).isInfinite()) {
            System.out.println("Делить на 0 нельзя! \n");
        } else {
            System.out.println("Частное чисел " + nums + " = " + calc.div(nums) + "\n");
        }
    }
}