package Game.RegisterPlayer;

import java.util.Scanner;

public class PlayerStatus {
    
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Player player = new Player();
        System.out.print("Insert your real name: ");
        player.originalName = scan.nextLine();
        System.out.print("Insert your Nickname: ");
        player.nickName = scan.nextLine();
        System.out.print("Insert your Age: ");
        player.age = scan.nextInt();
        System.out.println("Registration successfully completed.");
    }
}
