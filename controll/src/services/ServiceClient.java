package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connexion.Connexion;
import dao.IDAO;
import entities.Client;

public class ServiceClient implements IDAO<Client> {

	@Override
	public boolean create(Client obj) {
		// TODO Auto-generated method stub
		String req="insert into client values(null,?,?,?,?)";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setString(1,obj.getNom());
			ps.setString(2,obj.getPrenom());
			ps.setString(3,obj.getTelephone());
			ps.setString(4,obj.getEmail());
			if(ps.executeUpdate()==1)
			{
				return true;
				
			}}catch (SQLException e) {
	            // TODO Auto-generated catch block
				System.out.println("Probleme de requete"+e.getMessage());
	            e.printStackTrace();
	        }
		
		return false;
		
	}
	

		
	

	@Override
	public boolean delete(Client obj) {
		//String req="delet from client where id_client ="+obj.getId()+"";
		String req="delete from client where id =?";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			 
	            ps.setInt(1, obj.getId());
	            if(ps.executeUpdate()==1) {
	                return true;
	            }
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		return false;
	}

	@Override
	public boolean update(Client obj) {
		String req="update client set nom=?,prenom=?,telephone=?,email=? where id=?  ";
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			  ps.setString(1, obj.getNom());
	            ps.setString(2, obj.getPrenom());
	            ps.setString(3, obj.getTelephone());
	            ps.setString(4, obj.getEmail());
	            ps.setInt(5, obj.getId());
	            if(ps.executeUpdate()==1) {
	                return true;
	            }
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		return false;
	}

	@Override
	public List<Client>  findAll() {
		String req="select * from client ";
		List<Client> clients=new ArrayList<Client>();
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				clients.add(new Client(rs.getInt("id"),rs.getString("nom"),rs.getString("prenom"),rs.getString("telephone"),rs.getString("email")));
				
			}
			
			
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		return clients;
		
	
	}

	@Override
	public Client findById(int id) {
		String req="select * from client where id=?";
		Client client = null;
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				client=new Client(rs.getInt("id"),rs.getString("nom"),rs.getString("prenom"),rs.getString("telephone"),rs.getString("email"));
								
			}
			
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		return client;
	}

}
