package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(operators.numberToBinary(38));
        System.out.println(operators.getResultByDivision(3, 2));
        System.out.println(operators.isEven(2));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isNull(null));
    }
}