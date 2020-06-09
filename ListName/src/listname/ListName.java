/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listname;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class ListName {
 private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd\n\n\nHH:mm:ss");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, ResultSetMetaData myMeta) throws SQLException {
        // TODO code application logic here
       
    Connection myConObj = null; 
    Statement myStatObj = null;
    ResultSet myResObj = null;
    String query = "Select * from zarifah.MYTABLE";
    
    try{
    myConObj = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDatabase", "zarifah", "123");
    myStatObj = myConObj.createStatement();
    myResObj = myStatObj.executeQuery(query);
    myMeta = myResObj.getMetaData();
    int columnNo = myMeta.getColumnCount();
    for(int i = 1;i<=columnNo;i++){
        System.out.print(myMeta.getColumnName(1)+"\t");
    }
    System.out.println();
    while (myResObj.next()){
     for(int i =1;1<=columnNo;i++){
         System.out.print(myResObj.getObject(i)+"\t");
     }   
     System.out.println();
    }}
    catch (SQLException e){
    e.printStackTrace();
            }
    }
} 

