package Connexion;

import java.sql.SQLException;
import java.sql.Statement;



public class ClearDB {

	public static void main(String[] args) {
		
		Connexion.getCon();

		try {
                        String createAdmin="create table admin("
					+"id int primary key auto_increment,"
					+"username varchar(100),"
					+"password varchar(100));";
			String createClient="create table client("
					+"id int primary key auto_increment,"
					+"nom varchar(100),"
					+"prenom varchar(100),"
					+"telephone varchar(100),"
					+"email varchar(100));";
			String createChambre="create table chambre("
					+"id int primary key auto_increment,"
					+"telephone varchar(100),"
					+"idcategorie int,"
					+"constraint fk3 foreign key(idcategorie) references categorie(id) on delete cascade on update cascade );";
			String createCategorie="create table categorie("
					+"id int primary key auto_increment,"
					+"code varchar(100),"
					+"libelle varchar(100));";
			String createReservation="create table reservation("
					+"id int auto_increment,"
					+"idClient int,"
					+"idChambre int,"
					+"dateDebut date,"
					+"dateFin date,"
					+"primary key(id,idClient,idChambre),"
					+"constraint fk_v foreign key(idClient) references client (id) on delete cascade on update cascade,"
					+"constraint fk_g foreign key(idChambre) references chambre(id) on delete cascade on update cascade );";
			
			
			Statement statement=Connexion.getCon().createStatement();
                        statement.execute("drop table if exists admin");
			statement.execute("drop table if exists reservation");
			statement.execute("drop table if exists chambre");
			statement.execute("drop table if exists categorie");
			statement.execute("drop table if exists client");
			
                        statement.executeUpdate(createAdmin);
			statement.executeUpdate(createClient);
			statement.executeUpdate(createCategorie);
			statement.executeUpdate(createChambre);
			statement.executeUpdate(createReservation);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}