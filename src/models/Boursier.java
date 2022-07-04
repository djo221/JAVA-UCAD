package models;

public class Boursier extends Etudiant {
	
	private String typeBourse;
	
	public Boursier() {
		super();
	}

	public String getTypeBourse() {
		return typeBourse;
	}

	public void setTypeBourse(String typeBourse) {
		this.typeBourse = typeBourse;
	}

}
