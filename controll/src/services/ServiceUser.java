/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import Connexion.Connexion;
import dao.IDAO;
/**
 *
 * @author HP
 */
public class ServiceUser {
    public boolean login(String  email,String password){
          String query = "SELECT * FROM User WHERE email = ?";

        try (Connection conn = DBUtils.getConnection();
                /* statement=conn.createStatement() /
                PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    /
                     * System.out.println("========================="); System.out.println("ID:\t\t"
                     * +rs.getInt("ID")); System.out.println("Nom:\t\t" +rs.getString("nom"));
                     * System.out.println("Prenom:\t\t" +rs.getString("prenom"));
                     * System.out.println("Email:\t\t" +rs.getString("telephone"));
                     * System.out.println("money:\t\t" +rs.getDouble("email"));
                     */

                                            if(password.equals(rs.getString(("password")))){
                                                Role r=new Role(rs.getBoolean("isAdmin"),rs.getString("nom"),rs.getString("prenom"),rs.getBoolean("status"));
                                                RoleService rr=new RoleService();
                                                rr.addRole(r);

                                                return true;
                                            }
                }

            }



        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        return false;
    }
}
