/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listname;

import java.util.LinkedList;


public class PatientInfo {
    LinkedList Name = new LinkedList ();
    LinkedList Address = new LinkedList();
    LinkedList IC_no = new LinkedList();
    LinkedList Code = new LinkedList();
    LinkedList ID_no = new LinkedList ();
    LinkedList PhoneNo = new LinkedList();
    LinkedList asdf = new LinkedList();
    
    
    public void Info(String xName, String xAddress, String xIC_no, String xCode,String xPhoneNo,int xID_no,int xasdf){
    //declare
    Name.offer(xName);
    Address.offer(xAddress);
    IC_no.offer(xIC_no);
    Code.offer(xCode);
    ID_no.offer(xID_no);
    PhoneNo.offer(xPhoneNo);
    asdf.offer(xasdf);

    
    }
    public LinkedList ReturnName(){
        return Name;
    }

    public LinkedList ReturnAddress(){
        return Address;
    }
    public LinkedList ReturnIC_no(){
        return IC_no;
    }
    public LinkedList ReturnCode(){
        return Code;
    }
    public LinkedList ReturnID_no(){
        return ID_no;
    }
    
    public LinkedList ReturnPhoneNo(){
        return PhoneNo;
    }
     public LinkedList Returnasdf(){
        return asdf;
    }
     
  

    void Info(String text, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Info(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Info(String text, String text0, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Info(String text, String text0, String text1, String text2, int de, int panjang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Info(String text, String text0, String text1, String text2, String text3, int parseInt, int de, int panjang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Info(int parseInt, String text, String text0, String text1, String text2, String text3, int panjang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
