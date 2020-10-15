
public class finalProject {
private String name;
private int balance;
private int position;
private boolean shovel = false;
private boolean play = true;
private boolean map = false;
public finalProject(String n)
{
	name = n;
	balance = 0;
	position = 0;
}
public int getBalance()
{
	return balance;
}

public int getPosition()
{
	return position;
}

public void movePlayer(String m)
{
	int x = Integer.parseInt(m);
	position += x;
	if (position % x == 0 && x > 0)
		{
		System.out.println("you found " + x + "coins!");
		balance += x;
		}	
	else
		System.out.println("you moved " + x + " spots!");
	if (position == 20)
		this.findTreasure();
	else if (position > 20)
		System.out.print("You went too far from the treasure!");
	else if (position == 15)
	{
		System.out.print("You encounter a group of robbers! All your coins are stolen.");
		balance = 0;
	}
}
public void findTreasure()
{
	System.out.print("You found the treasure! Dig it up?");
	if (shovel == true)
		{
		balance += 200;
		System.out.print("Congrats! You found 200 coins!");
		play = false;
		}
	else
		System.out.print("You do not have the tool to do this.");
		
}
public void buyShovel()
{
	if (balance >= 10)
	{
		balance -=10;
		shovel = true;
	System.out.println("you bought the shove!");
	}
	else
		System.out.print("You need " + (10-balance) + " more coins.");
}
public void buyMap()
{
	if (balance >= 5)
	{
		balance -=5;
		map = true;
		System.out.println("You bought the map!");
	}
	else
		System.out.print("You need " + (5-balance) + " more coins.");
}

public void useMap()
{
	if (map)
		System.out.println("you are " + (Math.abs(20-position)) + " places away from the treasure.");
	else
		System.out.println("you do not have a map to use.");
}

public void addBalance(int x)
{
	balance += x;
}

public boolean play(String x)
{
	if (x.indexOf("stop")>=0)
		play = false;
	return play;
}

}

