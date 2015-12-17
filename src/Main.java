/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASSIMO PICCIAFUOCO
 */
import java.io.*;

public class Main {
    public static void main(String args[]){
    String marca = "", colore = "";
    
    InputStreamReader input=new InputStreamReader(System.in);
    BufferedReader tastiera=new BufferedReader(input);
    System.out.println("Inserisci il colore : ");
    try{
        colore = tastiera.readLine();
    }
    catch(Exception e) {
        System.out.println("Errore");
    }

    System.out.println("Inserisci la marca : ");
    try{
        marca = tastiera.readLine();
    }
    catch(Exception e) {
        System.out.println("Errore");
    }
    Automobile autoDelPiccia = new Automobile(colore, marca);
        
    autoDelPiccia.mostraStato();
    autoDelPiccia.avviaMotore();
    autoDelPiccia.mostraStato();
    }
}
