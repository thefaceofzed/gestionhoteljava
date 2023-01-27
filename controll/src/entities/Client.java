package entities;

public class Client {
	
	private int id;
	private String Nom, Prenom, Telephone, email;
	private static int c=0;
	public Client(String nom, String prenom, String telephone, String email) {
		id=++c;
		Nom = nom;
		Prenom = prenom;
		Telephone = telephone;
		this.email = email;
	}
	
	public Client(int id, String nom, String prenom, String telephone, String email) {
		this.id = id;
		Nom = nom;
		Prenom = prenom;
		Telephone = telephone;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Telephone=" + Telephone + ", email="
				+ email + "]";
	}


}
