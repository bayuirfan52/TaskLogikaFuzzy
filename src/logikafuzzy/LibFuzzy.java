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
    
    private static float output, a, b;
    
    public static float linearNaik(float umur){
        output = (umur - a) / (b - a);        
        return output;
    }
    
    public static float linearTurun(float umur){
        output = (b - umur) / (b - a);           
        return output;
    }
    
    public static float segitiga(float umur){
        return output;
    }
    
    public static float trapesium(float umur){        
        return output;
    }
    
    private static void cekUmur(float umur){
        if (umur <= 5f){
            a = 0f;
            b = 5f;
        }
        else if (umur <= 11f){
            a = 5f;
            b = 11f;
        }
        else if (umur <= 25f){
            a = 11f;
            b = 25f;
        }
        else if (umur <= 45f){
            a = 25f;
            b = 45f;
        } 
        else{
            a = 45f;
            b = 65f;
        }
    }
}
