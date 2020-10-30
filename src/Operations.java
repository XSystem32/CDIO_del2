import java.util.Scanner;

public class Operations {

    public static Player createPLayer() {
        Scanner scan = new Scanner(System.in);
        Player player = new Player(scan.nextLine(),createBalance());
        return player;
    }

    public static Balance createBalance() {
        Balance balance = new Balance(1000);
        return balance;
    }
}

