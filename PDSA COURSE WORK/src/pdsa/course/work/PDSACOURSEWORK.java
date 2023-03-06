/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsa.course.work;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pdsa.course.work.PDSACOURSEWORK.generateQRcode;

/**
 *
 * @author Shashika
 */
 class Node
    {
    Date di;
    int slote;
    Node nextaddress;
    boolean n;
    public void Node()
    {
    slote= 0;
    nextaddress=null;
    }  
    }
    class SinglyLinkedList
    {
        java.util.Date date = new java.util.Date();    
        int h=0;
        int i=0;
        Node head=null;
        public void create()
        {
            for(int k=0;k<10;k++)
            {  if(head == null)
            {
             Node n1=new Node();
             n1.nextaddress=head;
             n1.slote=i;
             n1.n=false;
             n1.di=date;
             head=n1;
             i++;
            }
            else
            {
             Node n2=new Node();
             n2.nextaddress=head;
             n2.slote=i;
             n2.n=false;
             n2.di=date;
             head=n2; 
             i++; 
            }
            }
            
        }
         public int in() throws WriterException, IOException
         {
     //---------------------------------------WAY IN-------------------------
         System.out.println("_______VEHICLE COME IN______");
        int tr=0;
        int fa=0;
             Node current_node1=head;
          while(current_node1.n==true)
          {
             current_node1=current_node1.nextaddress;
          }
            System.out.println(current_node1.slote+" Number");
            current_node1.n=true;             
          int g=0;
          Node current_node=head; 
           while(current_node!=null)
     {
        if(current_node.n==true)
        {
           tr++;
        }
        else if(current_node.n==false)
        {
           fa++;
        }
        current_node=current_node.nextaddress;
    
     }
        
          System.out.println(fa+" Parking spaces are Available ");  
          System.out.println(tr+" Parking spaces are Occupide ");  
         
          System.out.println(date);
 //________________________________okokokok______________________
     {
       
    String str= "Vehicle Slote number  = "+current_node1.slote+ '\n'
                +"Vehicle arrived Time ="+date;  
//path where we want to get QR Code  
String path = "D:\\Downloads\\c9\\Receipt2.png";  
//Encoding charset to be used  
String charset = "UTF-8";  
Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();  
//generates QR code with Low level(L) error correction capability  
hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);  
//invoking the user-defined method that creates the QR code  
generateQRcode(str, path, charset, hashMap, 200, 200);//increase or decrease height and width accodingly   
//prints if the QR code is generated   
System.out.println("QR Code created successfully.");      

// TODO code application logic here
    }
    

        
        
 //________________________________okokokok______________________
         return current_node1.slote;
         }
         
         public void calculate()
         {
 //_______________________________ON DEVELOPMENT____________________
             
             
             
         
         }
         public void out (int value)
         {
        int tr=0;
        int fa=0;
         Node current_node2=head;
         while(current_node2.slote!=value)
         {
           current_node2=current_node2.nextaddress;
         }
            System.out.println("++++++++VEHICLE GOING OUT+++++++++");
         System.out.println("freeing slot "+current_node2.slote);
         System.out.println("time vehicale arrived "+current_node2.di);
         current_node2.n=false;
         current_node2.di=null;
                 Node current_node=head; 
           while(current_node!=null)
     {
        if(current_node.n==true)
        {
           tr++;
        }
        else if(current_node.n==false)
        {
           fa++;
        }
        current_node=current_node.nextaddress;
       
     }
       //   System.out.println("++++++++VEHICLE GOING OUT+++++++++");
          System.out.println(fa+" Parking spaces are Available ");  
          System.out.println(tr+" Parking spaces are Occupide ");  
          java.util.Date date = new java.util.Date();    
          System.out.println(date);
 

         }
        
        
        
    }
    
public class PDSACOURSEWORK {

    /**
     * @param args the command line arguments
     */
        public static void generateQRcode(String data, String path, String charset, Map map, int h, int w) throws WriterException, IOException  
{  
        try {
            //the BitMatrix class represents the 2D matrix of bits
//MultiFormatWriter is a factory class that finds the appropriate Writer subclass for the BarcodeFormat requested and encodes the barcode with the supplied contents.
BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, w, h);  
MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));
        } catch (java.io.IOException ex) {
            Logger.getLogger(PDSACOURSEWORK.class.getName()).log(Level.SEVERE, null, ex);
        }
}
   
    
    public static void main(String[] args)throws WriterException, IOException, NotFoundException, InterruptedException 
    {
        // TODO code application logic here
        
        SinglyLinkedList List1 = new SinglyLinkedList();
        int i;
         List1.create();
        i= List1.in();
        i= List1.in();
        i= List1.in();
        sleep(10000);
         List1.out(9);
        
        

    }
    
}
