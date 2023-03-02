package Game.PlayerStatus;

import java.util.Scanner;

public class AppPlayer {
    public Object nickname;

    public static void main() {

        Scanner scan = new Scanner(System.in);
        Player player = new Player();
        System.out.println("Insert your real name: ");
        player.originalName = scan.nextLine();
        System.out.println("Insert your Nickname: ");
        player.nickName = scan.nextLine();
        System.out.println("Insert your Age: ");
        player.age = scan.nextInt();
        System.out.println("Registration successfully completed.");

    }
}
