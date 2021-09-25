package classes;

public class formateur {
	
	private String nom,prenom,specialite,grade;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public formateur(String nom, String prenom, String specialite, String grade) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Formateur [ nom=" + nom + ", prenom=" + prenom + ", prenom=" + prenom +",specialite=" +specialite +",grade="+ grade+ "]";
	}

}
