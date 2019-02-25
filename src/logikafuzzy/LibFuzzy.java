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
    
    private static float output, batasBawah, batasAtas;
    
    public static float linearTurun(float umur){
        output = (umur - batasBawah) / (batasAtas - batasBawah);
        
        return output;
    }
    
    public static float linearNaik(float umur){
        cekUmur(umur);
        output = (batasAtas - umur) / (batasAtas - batasBawah);
        
        return output;
    }
    
    public static float segitiga(float umur){
        cekUmur(umur);
        output = 0f;
        
        return output;
    }
    
    public static float trapesium(float umur){
        
        return output;
    }
    
    private static void cekUmur(float umur){
        if (umur <= 5f){
            batasBawah = 0f;
            batasAtas = 5f;
        }
        else if (umur <= 11f){
            batasBawah = 5f;
            batasAtas = 11f;
        }
        else if (umur <= 25f){
            batasBawah = 11f;
            batasAtas = 25f;
        }
        else if (umur <= 45f){
            batasBawah = 25f;
            batasAtas = 45f;
        } 
        else{
            batasBawah = 45f;
            batasAtas = 65f;
        }
    }
}
