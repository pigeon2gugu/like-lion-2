package class_221012.BabyLion;
import java.util.Scanner;

public class GugudanPlus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 1; i<10; i++) {
            System.out.println(input+"+"+i+"="+(int)(input+i));
        }
    }
}
