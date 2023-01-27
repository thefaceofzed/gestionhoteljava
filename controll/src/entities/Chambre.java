package entities;

public class Chambre {
	
	private int id;
	private static int c = 0;
	private String Telephone;
	private Categorie cat;
	private int ca;
	

	
	public Chambre(String telephone, Categorie cat) {
		this.id = ++c;
		Telephone = telephone;
		this.cat = cat;
	}
        public Chambre(int id, String telephone, Categorie cat) {
		this.id = id;
		Telephone = telephone;
		this.cat = cat;
	}
	
	public Chambre(int id, String telephone, int ca) {
		this.id = id;
		Telephone = telephone;
		this.ca = ca;
	}
        public Chambre(String telephone, int ca) {
		this.id = ++c;
		Telephone = telephone;
		this.ca = ca;
	}
        
    /*    public String getCatLib(){
        
            return cat.getLibelle();
        }
*/  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
        public int getCatId() {
		return ca;
	}
	public void setCatId(int id) {
		this.ca = id;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	
	public Categorie getCat() {
		return cat;
	}
	public void setCat(Categorie cat) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Chambre [id=" + id + ", Telephone=" + Telephone + ", cat=" + ca + "]";
	}
	
	
	
	

}
