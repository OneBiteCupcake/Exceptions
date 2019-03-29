//https://beginnersbook.com/2013/04/exception-handling-examples/
public class NullPointer {
    public static void main(String args[]) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
            e.printStackTrace();
        }
    }
}
