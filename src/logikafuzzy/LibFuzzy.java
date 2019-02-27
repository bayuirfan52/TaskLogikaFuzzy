/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logikafuzzy;

/**
 *
 * @author bayurf
 */
public class LibFuzzy {
    
    private static int output, a, b;
    private static double returnValue;
    
    private static double linearNaik(int umur){
        output = (umur - a) / (b - a);
        System.out.println("a : "+a+", b : "+b);
        System.out.println(output);
        return output;
    }
    
    private static double linearTurun(int umur){
        output = (b - umur) / (b - a);           
        System.out.println("a : "+a+", b : "+b);
        System.out.println(output);
        return output;
    }
    
    private static int segitiga(int umur){
        return output;
    }
    
    private static int trapesium(int umur){        
        return output;
    }
    
    public static double cekUmur(int umur){
        if (umur <= 5){
            returnValue = 1;
        }
        else if (umur <= 11){
            a = 5;
            b = 11;
            returnValue = linearTurun(umur);
        }
        else if (umur <= 25){
            a = 11;
            b = 25;
            returnValue = linearNaik(umur);
        }
        else if (umur <= 45){
            a = 25;
            b = 45;
            returnValue = linearTurun(umur);
        } 
        else if (umur <= 65){
            a = 45;
            b = 65;
            returnValue = linearNaik(umur);
        }
        else{
            returnValue = 1;
        }
        System.out.println(returnValue);
        return returnValue;
    }
}
