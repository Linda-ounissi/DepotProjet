package tests;

public class verifcontrainte {
	// verifier que l'id candidat est :id>0
	public boolean validId(int id) {
		return id > 0;
	}

	/*
	 * verif pour la classe formation: 1 titre de longueur > 3, prix > 100 ,nb_heures > 10
	 */

	// 1:
	public boolean validTitre(String titre) {
		return titre.length() > 3;

	}

	// 2:
	public boolean validprix(int prix) {
		return prix > 100;
	}

	// 3:
	public boolean validNbHeures(int nb_heures) {
		return nb_heures > 10;
	}
	
	

	// verifier que tout les champs sont valides
	public boolean verifChamp(String champ) {
		return !champ.isEmpty();

	}

	/*
	 * public void validchamp(String champ) { if(champ.length()==0)
	 * 
	 * System.out.println("Field IS EMTY");
	 * 
	 * }
	 */
	// verifier que tout les champs sont valides et correctes

	// les sessions sont soit présentiels soit en ligne
	public boolean validSessions(String mode) {
		if (mode.contains("présentiels") || mode.contains("en ligne"))
			return true;
		else
			return false;

	}

	// les grades des formateurs sont(junior, senior et expert)

	public boolean validGradesFormateur(String grades) {
		if (grades.contains("junior") || grades.contains("senior") || grades.contains("expert"))
			return true;
		else
			return false;

	}
}
