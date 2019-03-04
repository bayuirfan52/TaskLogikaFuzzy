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
    
    private static double output, a, b;
    private static double returnValue;
    private static String returnUmurString;
    
    private static double linearNaik(double umur){
        output = (umur - a) / (b - a);
        return output;
    }
    
    private static double linearTurun(double umur){
        output = (b - umur) / (b - a);
        return output;
    }
    
    public static double cekUmur(double umur){
        if (umur <= 5){
            returnValue = 1;
        }
        else if (umur <= 11){
            a = 5;
            b = 11;
            returnValue = linearTurun(umur);
        }
        else if (umur <= 16){
            a = 11;
            b = 16;
            returnValue = linearNaik(umur);
        }
        else if (umur <= 25){
            a = 16;
            b = 25;
            returnValue = linearTurun(umur);
        }
        else if (umur <= 35){
            a = 25;
            b = 35;
            returnValue = linearNaik(umur);
        }
        else if (umur <= 40) {
            returnValue = 1;
        }
        else if (umur <= 45) {
            a = 40;
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
        return returnValue;
    }
    
    public static String returnUmur(double umur, double nilaiKeanggotaan){
        if (umur <= 5) {
            returnUmurString = "Kamu pasti masih unyu-unyu alias Balita";
        } 
        else if (umur <= 11){
            if (nilaiKeanggotaan > 0.5) {
                returnUmurString = "Masih suka kejar-kejaran di masjid ya? Anak-anak";
            } else {
                returnUmurString = "Udah mulai anteng harusnya ini. Anak baik";
            }
        }
        else if (umur <= 16){
            if (nilaiKeanggotaan < 0.5) {
                returnUmurString = "Mulai merasa udah gede. Remaja awal-awal";
            } else {
                returnUmurString = "Udah bisa galau ini kayaknya. Remaja ABG";
            }
        }
        else if (umur <=25) {
            if (nilaiKeanggotaan > 0.5) {
                returnUmurString = "Keinginan overload. Duit nggak ada. Mulai dewasa ini";
            } else {
                returnUmurString = "Mikir kerja, cari duit + kenal cinta-cintaan. Dewasa banget ya?";
            }
        }
        else if (umur <= 35) {
            if (nilaiKeanggotaan < 0.5) {
                returnUmurString = "Hampir kepala tiga, cari gandengan woi! Udah dewasa tau!";
            } else {
                returnUmurString = "Kalau ini, pikirannya udah macem-macem. Tanggungan banyak";
            }
        }
        else if (umur <= 40) {
            returnUmurString = "Dewasa yang sebenarnya...";
        }
        else if (umur <= 45) {
            if (nilaiKeanggotaan > 0.5) {
                returnUmurString = "Anak sudah gede kayaknya. Muka saya kayak apa ya?";
            } else {
                returnUmurString = "Pikiran masa depan pada waktu itu mulai terasa kah?";
            }
        }
        else if (umur <= 65) {
            if (nilaiKeanggotaan < 0.5) {
                returnUmurString = "Kayaknya sudah mulai tua..";
            } else {
                returnUmurString = "Bukan kayaknya lagi. Saya memang sudah tua ini";
            }
        }
        else if (umur > 65) {
            returnUmurString = "Giliran anak ikut membantu saya. Sudah manula...";
        }
        return returnUmurString;
    }
}
