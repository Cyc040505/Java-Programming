import java.util.Scanner;

public class Door {
    boolean isOpen = false;
    boolean test;

    public void openDoor() {
        if(isOpen == false) {
            isOpen = true;
            System.out.println("Door opened");
        }
        else if(isOpen == true) {
            System.out.println("Door already open!");
        }
    }

    public void closeDoor() {
        if(isOpen == false) {
          System.out.println("Door already closed!");
      }
      else if(isOpen == true) {
        isOpen = false;
        System.out.println("Door closed");
      }
  }
}

class DoorWithLock extends Door {
    boolean isLocked = false;

    @Override
    public void openDoor() {
        if(isOpen == false) {
            if(isLocked == true) {
                System.out.println("Door is locked and cannot be opened!");
            }
            else if(isLocked == false) {
                isOpen = true; 
                System.out.println("Door opened");
            }
        }
        else if(isOpen == true) {
            System.out.println("Door already open!");
        }
    }

    public void lockDoor() {
        if(isOpen == true) {
            System.out.println("Open door cannot be locked!");
        }
        else if(isOpen == false) {
            if(isLocked == true) {
                System.out.println("Door already locked!");
            }
            else if(isLocked == false) {
                isLocked = true;
                System.out.println("Door locked");
            }
        }
    }   

    public void unlockDoor() {
        if(isLocked == false) {
            System.out.println("Door is not locked!");
        }
        else if(isLocked == true) {
            isLocked = false;
            System.out.println("Door unlocked");
        }
    }
}

class DoorWithCodeLock extends DoorWithLock {
    int code = 0;

    @Override
    public void lockDoor() {
        if(isOpen == true) {
            System.out.println("Open door cannot be locked!");
        }
        else if(isOpen == false) {
            if(isLocked == true) {
                System.out.println("Door already locked!");
            }
            else if(isLocked == false) {
                Scanner s1 = new Scanner(System.in);
                System.out.println("input lock code:");
                int lock = s1.nextInt();
                code = lock;
                isLocked = true;
                System.out.println("Door locked");
            }
        }
    } 

    @Override
    public void unlockDoor() {
        if(isLocked == false) {
            System.out.println("Door is not locked!");
        }
        else if(isLocked == true) {
            Scanner s2 = new Scanner(System.in);
            System.out.println("input unlock code:");
            int password = s2.nextInt();
            if(password == code) {
                isLocked = false;
                System.out.println("Door unlocked");
            }
            else {
                System.out.println("Invalid code!");
            }
        }
    }
}