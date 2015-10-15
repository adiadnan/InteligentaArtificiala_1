/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AIMLParser;

import bitoflife.chatterbean.Context;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADI
 */
public class DBContext extends Context {

    private Connection con;

    public DBContext() {

        con = DBContext.establishConnection();

    }

    public static Connection establishConnection() {

        try {

            return DriverManager.getConnection("jdbc:odbc:con", "user", "pass");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return null;

    }

    public Object property(String name) {

        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT VALUE FROM PROPERTIES WHERE NAME = ");
            return rs.getString("VALUE");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return null;
    }

    public void property(String name, Object value) {
        Statement stmt;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE PROPERTIES SET VALUE = '" + value + " WHERE NAME = ");
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
