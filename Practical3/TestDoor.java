import java.util.Scanner;

public class TestDoor {
    public static void main(String[] args) {
        DoorWithCodeLock d = new DoorWithCodeLock();
        d.test = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Open door");
        System.out.println("2:Close door");
        System.out.println("3:Lock door");
        System.out.println("4:Unlock door");
        System.out.println("5:Exit");
        while(d.test == true) {
            int order = sc.nextInt();
            switch(order) {
                case 1:
                    d.openDoor();
                    break;
                case 2:
                    d.closeDoor();
                    break;
                case 3:
                    d.lockDoor();
                    break;
                case 4:
                    d.unlockDoor();
                    break;
                case 5:
                    d.test = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
