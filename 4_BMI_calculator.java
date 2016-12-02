package javaapplication5;
import java.util.Scanner;
import java.io.IOException;

/* @author BD */


public class JavaApplication5 {

    public static void main(String[] args) throws IOException 
    {
        Scanner klavye = new Scanner(System.in);
        
        
        System.out.println("Boy");
        double boy=klavye.nextDouble();
        System.out.println("Kilo");
        double kilo=klavye.nextDouble();
        
        
        if ( kilo/ (boy*boy) > 0  && kilo/ (boy*boy) <18.4 )
        {
            System.out.println("zayıf");
        }
        
        else if  ( kilo/ (boy*boy) > 18.5  && kilo/ (boy*boy) <24.9 )
        {
            System.out.println("normal");
        }
        else if  ( kilo/ (boy*boy) > 25  && kilo/ (boy*boy) <29.9 )
        {
            System.out.println("fazla kilolu");
        }
        else if  ( kilo/ (boy*boy) > 30  && kilo/ (boy*boy) < 34.9 )
        {
            System.out.println("şişman 1.sınıf");
        }
        
        else if  ( kilo/ (boy*boy) > 35  && kilo/ (boy*boy) <44.9 )
        {
            System.out.println("şişman 2.sınıf");
        }
        else
        {
            System.out.println("Aşırı obez");
        }
            
    }

    private static double Scanner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
