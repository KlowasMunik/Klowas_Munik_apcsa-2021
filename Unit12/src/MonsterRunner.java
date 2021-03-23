//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		out.print("Monster 1's name: ");
		String name = scan.next();
		out.print("Monster 1's size: ");
		int size = scan.nextInt();
		Monster m1 = new Monster(name, size);
		out.print("Monster 2's name: ");
		String name2 = scan.next();
		out.print("Monster 2's size: ");
		int size2 = scan.nextInt();
		out.scan.close();
		Monster m2 = new Monster(name2, size2);
		out.	println();
		out.	println("Monster 1 - " + m1);
		out.println("Monster 2 - " + m2);
		out.println();
		out.println("Monster one is"
				+ ((m1.isBigger(m2)) ? " bigger " : " smaller ")
				+ "than Monster two.");
		out.println("Monster one"
				+ ((m1.hasSameName(m2, false)) ? " has " : " does not have ")
				+ "the same name as Monster two.");
		scan.close();
	}
}