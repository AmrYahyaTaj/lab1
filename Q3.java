/**
 * Created by learn on 03/10/22.
 */
public class Q3 {
    public static void main(String[] args) {
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);

        System.out.println("/////////////////////////////////////////////////////");
        int mul = 1;
        for (int i = 1; i <= 10; i++) {
            mul = mul * i;
        }
        System.out.println(mul);
    }
}
