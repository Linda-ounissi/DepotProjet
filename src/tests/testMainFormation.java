package tests;

import java.util.ArrayList;


import classes.formation;
import classes.listes.candidats;
import classes.listes.formations;

public class testMainFormation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// id,prix,nb_heures  titre,formateur

		// vérification du titre

		int prix = 100;
		int nb_heures = 40;

		ArrayList<String> listTitre = new ArrayList<String>();
		listTitre.add("Jm");
		listTitre.add("Jme");
		listTitre.add("Jmeter");

		String formateur = "M. Khalil LAKDHAR";

		verifcontrainte v1 = new verifcontrainte();

		for (String titre : listTitre) {
			if ((v1.validprix(prix) && v1.validNbHeures(nb_heures)) && v1.verifChamp(formateur)
					&& v1.validTitre(titre)) {

				formation f = new formation(prix, nb_heures, titre, formateur);

				formations.listformations.add(f);

				candidats.showList();

				System.out.println("formation enregistrer avec succes");

			} else {
				System.out.println("la saisie du champ titre est  incorrecte!");
			}

		}
		System.out.println("********************************************");
		System.out.println("vérifier le prix pour un montant égale à 0 ");
		System.out.println("********************************************");
		prix = 0;
		for (String titre : listTitre)

			if (v1.validprix(prix)) {
				formation f = new formation(prix, nb_heures, titre, formateur);

				formations.listformations.add(f);

				candidats.showList();

			} else
				System.out.println("Le prix  est incorrect !!");
		System.out.println("********************************************");
		System.out.println("vérifier le prix pour un montant égale à 250 ");
		System.out.println("********************************************");

		prix = 250;
		for (String titre : listTitre)

			if (v1.validprix(prix)) {
				formation f = new formation(prix, nb_heures, titre, formateur);

				formations.listformations.add(f);

				candidats.showList();
				System.out.println("créer avec suces");

			} else
				System.out.println("Le prix  est incorrect !!");
		
		
		System.out.println("********************************************");
		System.out.println("****vérifier le nombre d'heures saisi");
		nb_heures = 10;
		for (String titre : listTitre)

			if (v1.validNbHeures(nb_heures)) {
				formation f = new formation(prix, nb_heures, titre, formateur);

				formations.listformations.add(f);

				candidats.showList();
				System.out.println("créer avec suces");

			} else
				System.out.println("Erreur dans le nombre d'heures saisi !!");
		System.out.println("********************************************");
		nb_heures = 11;
		for (String titre : listTitre)

			if (v1.validNbHeures(nb_heures)) {
				formation f = new formation(prix, nb_heures, titre, formateur);

				formations.listformations.add(f);

				candidats.showList();
				System.out.println("créer avec suces");

			} else
				System.out.println("Erreur dans le nombre d'heures saisi !!");

	}

}
