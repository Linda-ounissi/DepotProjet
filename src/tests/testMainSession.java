package tests;

import classes.session;
import classes.listes.sessions;

public class testMainSession {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//debut,fin,titre_formation,lieu,mode

		String debut = "le 4 Juillet";
		String fin = "le 27 Septembre";
		String titre_formation = "Testing";
		String lieu = "Avignon";
		String mode = "en ligne";
		verifcontrainte v1 = new verifcontrainte();

		if (v1.verifChamp(debut) && v1.verifChamp(fin) && v1.verifChamp(titre_formation) && v1.verifChamp(lieu)
				&& v1.validSessions(mode)) {

			session s = new session(debut, fin, titre_formation, lieu, mode);

			sessions.listsessions.add(s);

			sessions.showList();
			System.out.println("la session a été crée avec succes");
		} else {
			System.out.println("la saisie des champs est  incorrectes!");
		}
		
	}

}
