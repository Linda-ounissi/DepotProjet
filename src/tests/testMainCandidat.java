package tests;

import java.util.ArrayList;

import classes.candidat;
//import tests.verifcontrainte;
import classes.listes.*;

public class testMainCandidat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listID = new ArrayList<String>();
		listID.add("0");
		listID.add("10");
		listID.add("-3");

		String name = "Linda";
		String departement = "Vaucluse";

		verifcontrainte v1 = new verifcontrainte();
		for (String id : listID) {
			System.out.println("id n° =" + id + " :");

			if (v1.verifChamp(name) && v1.verifChamp(departement)) {

				int int_id = Integer.parseInt(id);

				if (v1.validId(int_id)) {
					candidat c = new candidat(int_id, name, departement);

					candidats.listcandidats.add(c);

					candidats.showList();

				} else {
					System.out.println("la saisie du champ ID n' est pas incorrectes!");
				}

			} else {
				System.out.println("nom ou departement vide!");
			}
// test v name vide
		}
		name = "";
		int id = 1;
		if (v1.verifChamp(name)) {
			candidat cand = new candidat(id, name, departement);

			candidats.listcandidats.add(cand);
			candidats.showList();
		} else
			System.out.println("Le champ est vide !!");

	}
}
