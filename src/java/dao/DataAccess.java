/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Wlasciciel;

/**
 *
 * @author cendr
 */
public class DataAccess {
    public void addNew(Wlasciciel n) throws SQLException{
        try {
            PreparedStatement ps = Connector.getPreparedStatement("insert into Wlasciciel values (?,?,?,?)");
            ps.setString(1, n.getIdWlasciciel());
            ps.setString(2, n.getImie());
            ps.setString(3, n.getNazwisko());
            ps.setString(4, n.getPesel());
            ps.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static List<Wlasciciel> getAll() {
        List<Wlasciciel> ls = new LinkedList<>();
        
        try {
            ResultSet rs = Connector.getPreparedStatement("select * from Wlasciciel").executeQuery();
            while(rs.next()){
                Wlasciciel n = new Wlasciciel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
    
    public static List<Wlasciciel> getNewById(int idWlasciciel){
        List<Wlasciciel> ls = new LinkedList<>();
        String sql = "select * from Wlasciciel where idWlasciciel = " +idWlasciciel;
        try {
            ResultSet rs = Connector.getPreparedStatement(sql).executeQuery();
            while(rs.next()){
                Wlasciciel w = new Wlasciciel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                ls.add(w);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    public void edit(String idWlasciciel, String imie, String nazwisko, String pesel){
        try {
            String sql = "update Wlasciciel SET imie = ?, nazwisko = ?, pesel = ?" + " where idWlasciciel = ?";
            PreparedStatement ps= Connector.getPreparedStatement(sql);
            ps.setString(1, imie);
            ps.setString(2, nazwisko);
            ps.setString(3, pesel);
            ps.setString(4, idWlasciciel);
            
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void delete(int idWlasciciel){
        try {
            String sql = "delete from Wlasciciel where idWlasciciel=?";
            PreparedStatement ps = Connector.getPreparedStatement(sql);
            ps.setInt(1, idWlasciciel);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public void search(int idWlasciciel){
        try {
            String sql = "select * from Wlasciciel where idWlasciciel=?";
            PreparedStatement ps = Connector.getPreparedStatement(sql);
            ps.setInt(1, idWlasciciel);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
