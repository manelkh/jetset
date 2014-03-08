/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.Jetsetmag.entities;

/**
 *
 * @author Me
 */

public class Client {
    private String Nom;
    private String Prénom;
    private String Sexe;
    private int Age;
     private String Login;
    private String Password;
    private String Email;
    private int NumTéléphone;

    public Client() {
    }
    

    public Client(String Nom, String Prénom, String Sexe, int Age, String Login, String Password, String Email, int NumTéléphone) {
        this.Nom = Nom;
        this.Prénom = Prénom;
        this.Sexe = Sexe;
        this.Age = Age;
        this.Login = Login;
        this.Password = Password;
        this.Email = Email;
        this.NumTéléphone = NumTéléphone;
    }
    

    public Client(String Nom) {
        this.Nom = Nom;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrénom() {
        return Prénom;
    }

    public String getSexe() {
        return Sexe;
    }

    public int getAge() {
        return Age;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public int getNumTéléphone() {
        return NumTéléphone;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrénom(String Prénom) {
        this.Prénom = Prénom;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setNumTéléphone(int NumTéléphone) {
        this.NumTéléphone = NumTéléphone;
    }
    
   
}
