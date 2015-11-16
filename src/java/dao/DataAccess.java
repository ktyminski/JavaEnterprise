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
    
}
