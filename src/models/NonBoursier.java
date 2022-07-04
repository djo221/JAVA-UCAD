package models;

public class NonBoursier extends Etudiant{
	
	private String adresse;

	public NonBoursier() {
		super();
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
