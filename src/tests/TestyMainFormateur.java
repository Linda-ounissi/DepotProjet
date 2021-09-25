package tests;

import classes.formateur;

import classes.listes.formateurs;

public class TestyMainFormateur {
	public static void main(String[] args) {
		// id nom,prenom,specialite,grade
		
		String nom = "LAKDHAR";
		String prenom = "Khalil";
		String specialite = "Chef de projet, developpeur";
		String grade = "en ligne ";

		verifcontrainte v1 = new verifcontrainte();

		if ((v1.verifChamp(nom) && v1.verifChamp(prenom)) && (v1.verifChamp(specialite) && v1.verifChamp(grade))) {
			if (v1.validGradesFormateur(grade)) {
				formateur f = new formateur(nom, prenom, specialite, grade);

				formateurs.listformateurs.add(f);

				formateurs.showList();

			} else {
				System.out.println("la saisie du grade du formateur est  incorrecte!");
			}

		} else
			System.out.println("vérifier les champs sont vides!");

	}
}
