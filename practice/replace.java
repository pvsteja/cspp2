

import java.util.*;
class hellokid
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String newstring = s.nextLine();
		String a = s.nextLine();
		String r = str.replace(newstring,a);
		System.out.print(r);

	}

}