/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author HP
 */
public class User {
    private int id;
    private String nom;
    private String prenom;
    private String password;
    private String email;
        public User(String email, String password) {
        this.email = email;
        this.password = password;
        }
        public User(int id,String email, String password) {
          this.id=id;
          this.email = email;
          this.password = password;
        }
}
