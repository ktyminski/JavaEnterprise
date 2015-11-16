/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cendr
 */
public class Wlasciciel {
        private String idWlasciciel;
	private String imie;
	private String nazwisko;
	private String pesel;

    public Wlasciciel(String idWlasciciel, String imie, String nazwisko, String pesel) {
        this.idWlasciciel = idWlasciciel;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getIdWlasciciel() {
        return idWlasciciel;
    }

    public void setIdWlasciciel(String idWlasciciel) {
        this.idWlasciciel = idWlasciciel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    
}
