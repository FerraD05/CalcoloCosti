package CalcoloCosti;

public class Avvio {


public static void main(String[] args) {


	if(args.length == 5) {

		int BAC = Integer.parseInt(args[0].toString());

		int performedActivities = Integer.parseInt(args[1].toString());

		int moneySpent = Integer.parseInt(args[2].toString());

		int expectedNumberOfPerformedActivities = Integer.parseInt(args[3].toString());

		int expectedMoneySpent = Integer.parseInt(args[4].toString());

	}
	else {
		System.out.println("Usage: Avvio.java [BAC] + [Number of performed activites] + [Money spent] "
				+ "+ [Expected number of performed activites] + [Expected money spent]");
	}

}
