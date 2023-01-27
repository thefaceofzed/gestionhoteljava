package services;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connexion.Connexion;
import dao.IDAO;
import entities.Categorie;


public class ServiceCategorie implements IDAO<Categorie> {
	List<Categorie> categorie=new ArrayList<Categorie>();
	
	@Override
	public boolean create(Categorie obj) {
		String req="insert into categorie values(null,?,?)";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			//ps.setLong(1,obj.getId());
			ps.setString(1,obj.getCode());		
			ps.setString(2,obj.getLibelle());
			
		
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
	public boolean delete(Categorie obj) {
		String req="delete from categorie where id =?";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setLong(1,obj.getId());
			//ps.setString(2,obj.getCode());		
			//ps.setString(3,obj.getLibell());
		

	           
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
	public boolean update(Categorie obj) {
            String req="update categorie set code=?,libelle=? where id=?  ";
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			 
	            
	            	
	            	        ps.setString(1,obj.getCode());		
	    			ps.setString(2,obj.getLibelle());
	    			ps.setLong(3,obj.getId());
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
	public List<Categorie> findAll() {
		String req="select * from categorie";
		List<Categorie> categories=new ArrayList<Categorie>();
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				categories.add(new Categorie(rs.getInt("id"),rs.getString("code"),rs.getString("libelle")));
			}
			return categories;
			
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return categories;
	}

    @Override
    public Categorie findById(int id) {
        String req="select * from categorie where id=? ";
		
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				Categorie categorie=new Categorie(rs.getInt("id"),rs.getString("code"),rs.getString("libelle"));
			return categorie;
                        }
			
			
		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return null;    }
    public Categorie FindBylibelle(String lib) {
		
		String req="select * from categorie where libelle = ?";
		PreparedStatement ps;

		try {
			ps = Connexion.getCon().prepareStatement(req);
			ps.setString(1, lib);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return new Categorie(rs.getInt("id"),rs.getString("code"),rs.getString("libelle"));
			}
			
			
		}catch (SQLException e) {
			System.out.println("Erreur");
			e.printStackTrace();
		}
		return null;
	}
	

}
