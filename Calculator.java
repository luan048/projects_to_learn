public class Calculator {
    public void calculation(String operation, double value1, double value2 ) {
        if(operation.equalsIgnoreCase("add")) {
            double result = value1 + value2;
            System.out.println("Result of " + value1 + " + " + value2 + " = " +  String.format("%.2f", result));
        }

        else if(operation.equalsIgnoreCase("subtract")) {
            double result = value1 - value2;
            System.out.println("Result of " + value1 + " - " + value2 + " = " + String.format("%.2f", result));
        }

        else if(operation.equalsIgnoreCase("multiply")) {
            double result = value1 * value2;
            System.out.println("Result of " + value1 + " * " + value2 + " = " + String.format("%.2f", result));
        }

        else if(operation.equalsIgnoreCase("division")) {
            double result = value1 / value2;
            System.out.println("Result of " + value1 + " / " + value2 + " = " + String.format("%.2f", result));
        }
    }
}
