package classes.listes;

import java.util.ArrayList;

import classes.session;

public class sessions {
	public static ArrayList<session> listsessions =new ArrayList<session>();

	public static void addToList(session s)
	{
	listsessions.add(s);	
	}
	public static void showList()
	{
	for(session s: listsessions)
	{
	System.out.println(s.toString());	
	}

	}

}
