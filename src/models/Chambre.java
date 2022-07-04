package models;

public class Chambre{
	
	private int id;
    private String numero;
    private String etage;
    
    public Chambre(int id, String numero, String etage) {
    	super();
    	this.id = id;
    	this.numero = numero;
    	this.etage = etage;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
}
