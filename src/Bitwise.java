public class Bitwise {
    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        var value2 = 8;
        var binary2 = Integer.toBinaryString(value2);

        var result = value1 ^ value2;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("Primeiro número de operação %s (representação binaria %s) \n", value1, binary1);
        System.out.printf("Segundo número de operação %s (representação binaria %s) \n", value2, binary2);
        System.out.printf("%s ^ %s = %s (representação binaria %s)", value1, value2, result, binaryResult);

    }
}
