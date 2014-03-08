/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.Jetsetmag.dao;

import edu.Jetsetmag.entities.Client;
import edu.Jetsetmag.util.MaConnexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Me
 */
public class ClientDAO {
    
    public void insertClient(Client C){

        String requete = "insert into client (Login,Pwd,Nom,Prenom,Email,Num_telephone,Age,Sexe) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MaConnexion.getInstance().prepareStatement(requete);
              ps.setString(1, C.getLogin());
              ps.setString(2, C.getPassword());
              ps.setString(3, C.getNom());
              ps.setString(4, C.getPrénom());
              ps.setString(5, C.getEmail());
              ps.setInt(6, C.getNumTéléphone());
              ps.setInt(7, C.getAge());
              ps.setString(8, C.getSexe());
          
              ps.executeUpdate();
              System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    
}
    
    public Client findClientByLoginPassword(String Login,String Pwd)
           {
               Statement stmt = null;
               Client client = new Client();
             /* String requete = "select Login,Password from client" + " where Login ='oma' and Password='omar' ";*/
             
               String requete ="select Login,Pwd from client" + " where Login ='" +Login +"' and Pwd='" +Pwd +"'";
              /*String  sql = "SELECT id, first, last, age FROM Registration" +" WHERE id >= 1 ";*/
             
               try {
                    stmt = MaConnexion.getInstance().createStatement();
           
           
                    ResultSet result = stmt.executeQuery(requete);
                  
             while(result.next()){
                
                  String first = result.getString("Login");
                  String last = result.getString("Pwd");
                 
              client.setLogin(first);
              client.setPassword(last);
            
            }
            
               }catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
              
               return client;
              
//          }
    }
}