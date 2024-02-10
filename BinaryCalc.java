import java.util.regex.Pattern;

public class BinaryCalc<T> {

    public BinaryCalc() {
    }

    /**
     * Метод переводит двоичное число в десятичное
     * 
     * @param nums - десятичное число
     * @return - двоичное число в формате Integer
     *         в случае ошибки возвращает null
     */
    public Integer toDecimal(T nums) {
        int base = 2;
        if (nums.toString().equals("0")) {
            return 0;
        }
        if (nums.toString().equals("1")) {
            return 1;
        }
        if (!isBinaryNumber(nums.toString())) {
            return null;
        }
        int decimalNum = 0;
        for (int i = nums.toString().length() - 1, j = 0; i >= 0; i--, j++) {
            decimalNum += Character.getNumericValue(nums.toString().charAt(i)) * (int) (Math.pow(base, j));
        }
        return decimalNum;
    }

    /**
     * Метод проверяет является строка числом в двоичном виде
     * 
     * @param numStr - строка
     * @return - true, если строка являтся числом
     *         false - в противном случае
     */
    public boolean isBinaryNumber(String numStr) {
        return Pattern.matches("^[01]+$", numStr);
    }

    /**
     * Метод переводит десятичное число в двоичное
     * 
     * @param nums - десятичное число
     * @return - двоичное число в формате String
     *         в случае ошибки возвращает null
     */
    public String toBinary(T nums) {
        if (nums.toString().equals("0")) {
            return "0";
        }
        if (nums.toString().equals("1")) {
            return "1";
        }
        StringBuilder result = new StringBuilder();
        int base = 2;
        if (!isNumber(nums.toString())) {
            return null;
        } else {
            int number = Integer.parseInt(nums.toString());
            while (number > 0) {
                result.append(number % base);
                number /= base;
            }
        }
        return result.reverse().toString();
    }

    /**
     * Метод проверяет является ввденая строка числом
     * 
     * @param numStr - строка
     * @return - true, если строка являтся числом
     *         false - в противном случае
     */
    public boolean isNumber(String numStr) {
        if (numStr == null || numStr.isEmpty())
            return false;
        for (int i = 0; i < numStr.length(); i++) {
            if (!Character.isDigit(numStr.charAt(i)))
                return false;
        }
        return true;
    }

    /**
     * Метод выводит в консоль двоичное число
     * 
     * @param num - десятичное число
     */
    public void printResultBinary(T num) {
        String result = toBinary(num);
        if (result == null) {
            System.out.println("Ошибка ввода \n");
        } else {
            System.out.println("Число " + num + " в двоичном виде = " + result);
        }
    }

    /**
     * Метод выводит в консоль десятичное число
     * 
     * @param num - двоичное число
     */
    public void printResultDecimal(T num) {
        Integer result = toDecimal(num);
        if (result == null) {
            System.out.println("Ошибка ввода \n");
        } else {
            System.out.println("Число " + num + " в десятичном виде = " + result);
        }
    }

}
