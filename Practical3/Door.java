import java.util.Scanner;

public class Door {
    boolean isOpen = false;
    boolean test;

    public void openDoor() {
        if(isOpen == false) {
            isOpen = true;
            System.out.println("Door opened");
            return;
        }
        else if(isOpen == true) {
            System.out.println("Door already open!");
            return;
        }
    }

    public void closeDoor() {
        if(isOpen == false) {
          System.out.println("Door already closed!");
          return;
      }
      else if(isOpen == true) {
        isOpen = false;
        System.out.println("Door closed");
        return;
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
                return;
            }
            else if(isLocked == false) {
                isOpen = true; 
                System.out.println("Door opened");
                return;
            }
        }
        else if(isOpen == true) {
            System.out.println("Door already open!");
            return;
        }
    }

    public void lockDoor() {
        if(isOpen == true) {
            System.out.println("Open door cannot be locked!");
            return;
        }
        else if(isOpen == false) {
            if(isLocked == true) {
                System.out.println("Door already locked!");
                return;
            }
            else if(isLocked == false) {
                isLocked = true;
                System.out.println("Door locked");
                return;
            }
        }
    }   

    public void unlockDoor() {
        if(isLocked == false) {
            System.out.println("Door is not locked!");
            return;
        }
        else if(isLocked == true) {
            isLocked = false;
            System.out.println("Door unlocked");
            return;
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
                return;
            }
            else if(isLocked == false) {
                Scanner s1 = new Scanner(System.in);
                System.out.println("input lock code:");
                int lock = s1.nextInt();
                code = lock;
                isLocked = true;
                System.out.println("Door locked");
                return;
            }
        }
    } 

    @Override
    public void unlockDoor() {
        if(isLocked == false) {
            System.out.println("Door is not locked!");
            return;
        }
        else if(isLocked == true) {
            Scanner s2 = new Scanner(System.in);
            System.out.println("input unlock code:");
            int password = s2.nextInt();
            if(password == code) {
                isLocked = false;
                System.out.println("Door unlocked");
                return;
            }
            else {
                System.out.println("Invalid code!");
                return;
            }
        }
    }
}