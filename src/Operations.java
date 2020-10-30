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



    public static int rollDice() {
        int min = 2;
        int max = 12;
        int range = max - min + 1;
        return (int)((Math.random() * range) + min);
    }


}

