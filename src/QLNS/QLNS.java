/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNS;

import Views.frmLogin1;

/**
 *
 * @author tu
 */
public class QLNS {

    /**
     * @param args the command line arguments
     */
    
    public static String dbUrl = "jdbc:sqlserver://LAPTOP-GUMFVEKB\\SQLEXPRESS02:1433;databaseName=QLNS;user=sa;password=123";
    
    public static void main(String[] args) {
        // TODO code application logic here
        new frmLogin1().setVisible(true);
    }
    
}
