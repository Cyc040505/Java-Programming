import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("start:");
        int start = sc.nextInt();
        System.out.println("end:");
        int end = sc.nextInt();
        if(start>end) {
            System.out.println("wrong datas input");
        }
        else {
            int count = 0;
            for(int i=start; i<=end; i++) {
                count += i;
            }
            System.out.println("addition:"+count);
        }
    }
}