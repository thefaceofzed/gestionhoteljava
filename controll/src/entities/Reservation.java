package entities;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
	
	private int id;
	private static int c = 0;
	private Date dateDebut;
	private Date dateFin;
	private Client clt;
	private Chambre room;
	private int cId;
	private int chId;
	public Reservation(Date date, Date date2, Client clt, Chambre room) {
		this.id = ++c;
		this.dateDebut = date;
		this.dateFin = date2;
		this.clt = clt;
		this.room = room;
	}
	
	public Reservation(int id, Date dateDebut, Date dateFin, int clt, int room) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.cId = clt;
		this.chId = room;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
        public int getCId() {
		return cId;
	}
	public void setCId(int id) {
		this.cId = cId;
	}
        public int getRId() {
		return chId;
	}
	public void setRId(int id) {
		this.chId = chId;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Client getClt() {
		return clt;
	}
	public void setClt(Client clt) {
		this.clt = clt;
	}
	public Chambre getRoom() {
		return room;
	}
	public void setRoom(Chambre room) {
		this.room = room;
	}
	@Override
	public String toString() {
		Format sd = new SimpleDateFormat("YYYY/MM/dd");
		String dateD = sd.format(dateDebut);
		String dateF = sd.format(dateFin);
		return "Reservation à pour id " + id + "\nDate d'arriver est " + dateD + "\nDate départ est " + dateF + "\nId client est " + cId
				+ "\nid de la chambre " + chId+"\n\n";
	}
	
	
	

}
