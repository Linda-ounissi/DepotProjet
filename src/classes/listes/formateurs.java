package classes.listes;

import java.util.ArrayList;

import classes.formateur;

public class formateurs {
	
		public static ArrayList<formateur> listformateurs =new ArrayList<formateur>();

		public static void addToList(formateur f)
		{
		listformateurs.add(f);	
		}
		public static void showList()
		{
		for(formateur f: listformateurs)
		{
		System.out.println(f.toString());	
		}

		}
	}


