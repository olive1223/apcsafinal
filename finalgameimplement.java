import java.util.Scanner;
public class finalProjectGame {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Let's find some treasure! What is your name?");
		String n = kboard.nextLine();
		finalProject game = new finalProject(n);
		while (game.play("play"))
		{
			System.out.print("What do you want to do? You may move, stop, view balance or position or buy a shovel or map or use the map.");
			String k = kboard.nextLine();
			if (k.indexOf("view balance") >= 0)
				System.out.println(game.getBalance());
			else if (k.indexOf("view position") >= 0)
				System.out.println(game.getPosition());
			else if (k.indexOf("move") >= 0)
			{
				game.movePlayer(k.substring(5));
			}
			else if (k.indexOf("shovel") >= 0)
				game.buyShovel();
			else if (k.indexOf("buy map") >= 0)
				game.buyMap();
			else if (k.indexOf("use")>=0)
				game.useMap();
			else if (k.indexOf("stop") >=0)
				game.play("stop");
			}
			kboard.close();	
	}


}
