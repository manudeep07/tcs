
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += (1 << power);   // same as 2^power
            }
            power++;
        }

        System.out.println(decimal);
    }
}
