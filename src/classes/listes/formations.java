package classes.listes;

import java.util.ArrayList;

import classes.formation;

public class formations {
	public static ArrayList<formation> listformations =new ArrayList<formation>();

	public static void addToList(formation fmt)
	{
	listformations.add(fmt);	
	}
	public static void showList()
	{
	for(formation fmt: listformations)
	{
	System.out.println(fmt.toString());	
	}

	}

}
