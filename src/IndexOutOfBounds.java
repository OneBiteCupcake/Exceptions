import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBounds {
    public static void main ( String[] a )
    {
        try {
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);

            list.get(3);
        } catch (IndexOutOfBoundsException ioob) {
            System.out.println("Do something here");
            ioob.printStackTrace();
        }
    }
}
