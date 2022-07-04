package models;

abstract class Personne {
	
    protected int id;
    protected String prenom;
    protected String nom;
    
	public Personne(int id, String prenom, String nom) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	} 
	
	

    
}