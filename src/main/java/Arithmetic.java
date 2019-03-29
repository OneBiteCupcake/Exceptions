import java.math.BigDecimal;

//https://beginnersbook.com/2013/04/exception-handling-examples/
//http://voidexception.weebly.com/arithmeticexception---causes--fixes.html
public class Arithmetic {
   /* public static void main(String args[]) {
        try {
            int num1 = 30, num2 = 0;
            int output = num1 / num2;
            System.out.println("Result: " + output);
        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero");
        } catch (Exception e) {
            System.out.println("catching generic exceptions here");
        } finally {
            System.out.println("this is often used to close connections, such as buffers or database connections, etc...");
        }
    }*/

    public static void main(String[] args) {
        try {
            BigDecimal x = new BigDecimal(1);
            BigDecimal y = new BigDecimal(3);
            x = x.divide(y);

            System.out.println(x.toString());
        } catch (ArithmeticException ae) {
            System.out.println("Exception caught.");
        }
    }

  /*  public static void main(String args[]) {
            int num1 = 30, num2 = 0;
            int output = num1 / num2;
            System.out.println("Result: " + output);
    }*/
}
