public class MainIT25102866 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int part1 = calc.multiply(3, 4);   // 12
        int part2 = calc.multiply(5, 7);   // 35
        int sum1 = calc.add(part1, part2); // 47
        int result1 = calc.square(sum1);   // 2209

        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);

        // Expression 2: (4 + 7)^2 + (8 + 3)
        int sum2 = calc.add(4, 7);          // 11
        int squareSum2 = calc.square(sum2); // 121
        int sum3 = calc.add(8, 3);          // 11
        int result2 = calc.add(squareSum2, sum3); // 132

        System.out.println("Result of (4 + 7)^2 + (8 + 3) = " + result2);
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int square(int a) {
        return a * a;
    }
}
