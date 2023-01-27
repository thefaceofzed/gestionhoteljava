/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import entities.Categorie;
import entities.Client;
import services.ServiceCategorie;
import services.ServiceClient;

/**
 *
 * @author ep
 */
public class Test {

    public static void main(String[] args) {
        ServiceClient cs=new ServiceClient();
        ServiceCategorie cats=new ServiceCategorie();
     //  cs.create(new Client("Kamali","Kamal","0444444444","alaoui@gmail.com"));
        
        for(Client c:cs.findAll()){
            System.out.println(c);
        }
        for(Categorie cat:cats.findAll()){
            System.out.println(cat);
        }
        
    }
}
