package classes.listes;
import java.util.ArrayList;

import classes.candidat;
//import classes.candidats;

public class candidats {
	public static ArrayList<candidat> listcandidats =new ArrayList<candidat>();

	public static void addToList(candidat cdt)
	{
	listcandidats.add(cdt);	
	}
	public static void showList()
	{
	for(candidat cdt: listcandidats)
	{
	System.out.println(cdt.toString());	
	}

	}
}
