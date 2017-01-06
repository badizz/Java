package javaapplication2;
public class JavaApplication2 
{
    public static void main(String[] args) 
    {
       int a=5;
       int b=15;
       int c=3;
       float x = 5.5f;
       float y = 2f;
       //atama işlemlerini yaptık
       
       int toplam = a+b;
       System.out.println("Toplam = " + toplam);
       
       int cikarma = b-c;
       System.out.println("Çıkarma = " + cikarma);
      
       int carpma = a*c;
       System.out.println("Çarpma = " + carpma);
       
       int bolme = b/a;
       System.out.println("Bölme = " + bolme);
       
       float fbolme = a/c;
       System.out.println("Float Bölme = " + fbolme);
       
       float fbolme2 = x/y ;
       System.out.println("Float Bölme2 = " + fbolme2);
        
       int kalan = a % c;
       System.out.println("Kalan = " + kalan);
    }   
}

