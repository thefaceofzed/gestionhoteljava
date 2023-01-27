package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connexion.Connexion;
import dao.IDAO;
import entities.Categorie;
import entities.Chambre;
import entities.Client;

public class ServiceChambre implements IDAO<Chambre> {
	ServiceCategorie categories= new ServiceCategorie();

	
        @Override
	public boolean create(Chambre obj) {
		String req="insert into chambre values(null,?,?)";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setString(1,obj.getTelephone());
			ps.setInt(2,obj.getCat().getId());		
					
			if(ps.executeUpdate()==1)
			{
				return true;
				
			}}catch (SQLException e) {
	           
				System.out.println("Probleme de requete"+e.getMessage());
	            e.printStackTrace();
	        }
		
		return false;
	}

	@Override
	public boolean delete(Chambre obj) {
		String req="delete from chambre where id =?";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			 
	            ps.setInt(1, obj.getId());
	           // ps.setString(2,obj.getTelephone());
	            //ps.setInt(3,obj.getCategorie().getId());

	            
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
	public boolean update(Chambre obj) {
String req="update chambre set telephone=?,id=? where id=?  ";
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			 
	            ps.setInt(1, obj.getId());
	            ps.setString(2, obj.getTelephone());
	            ps.setInt(3, obj.getId());	            
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
	public List<Chambre> findAll() {
		String req="select * from chambre ";
		List<Chambre> chambres=new ArrayList<Chambre>();
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				chambres.add(new Chambre(rs.getInt("id"),rs.getString("telephone"),categories.findById(rs.getInt("idcategorie"))));	
                        }
			return chambres;
		
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
	return null;	
	}

	
	
	public List<Chambre> findChambreByCategorie( Categorie Cat)
	{
		String req="select * from chambre where idcategorie=?";
		List<Chambre> chambres=new ArrayList<Chambre>();

		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setInt(1, Cat.getId());

			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				chambres.add(new Chambre(rs.getInt("id"),rs.getString("telephone"),categories.findById(rs.getInt("id"))));
								
			}
			
			
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return chambres;

		
	}

    @Override
    public Chambre findById(int id) {
String req="select * from chambre where id="+id;
		Chambre chambre = null;
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
			chambre=new Chambre(rs.getInt("id"),rs.getString("telephone"),categories.findById(rs.getInt("id")));
			return chambre;					
			}
			
			
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		   return null;
	
}
}

