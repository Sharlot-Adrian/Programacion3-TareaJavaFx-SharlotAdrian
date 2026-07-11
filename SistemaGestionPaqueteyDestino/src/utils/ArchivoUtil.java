package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Destino;
import model.Paquete;

public class ArchivoUtil {

    public static void guardarDestino(Destino destino){
        try{

            FileWriter fw = new FileWriter("destinos.txt", true);
            fw.write(destino.getNombre() + "\n");
            fw.close();

            System.out.println("El destino se registro exitosamente.");

        }catch(Exception e){
            System.out.println("Error al guardar el destino " + e.getMessage());
        }
    }

    public static ArrayList<Destino> leerDestino(){

        ArrayList<Destino> listaDestinos = new ArrayList<Destino>();
        try{

            FileReader fr = new FileReader("destinos.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while((linea = br.readLine()) != null){
                listaDestinos.add(new Destino(linea));
            }

            br.close();
            fr.close();

        }catch(IOException e){
            System.out.println("Error al abrir el archivo " + e.getMessage());
        }

        return listaDestinos;

    }

    public static void guardarPaquete(Paquete paquete){
        try{

            FileWriter fr = new FileWriter("Paquetes.txt", true);
            fr.write(paquete.getCodigo() +";" +paquete.getDestinatario() +";" + paquete.getPeso()+";"+ paquete.getDestino());

            fr.close();
            System.out.println("Se guardo el paquete exitosamente. ");
        }catch(Exception e){
            System.out.println("Error al guardar el paquete " + e.getMessage());

        }
    }

    public static ArrayList<Paquete> leerPaquetes(){

        ArrayList<Paquete> paquetes = new ArrayList<Paquete>();

        try{
            FileReader fr = new FileReader("Paquetes.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while((linea = br.readLine()) != null){

                String [] partes = linea.split(";");

                if(partes.length == 4){

                    Double pesoNum = Double.parseDouble(partes[2]);
                    Paquete paquete = new Paquete(partes[0], partes[1], pesoNum, partes[3]);

                    paquetes.add(paquete);

                }

            }

            fr.close();
            br.close();

        }catch(IOException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }

        return paquetes;
    }
    
}

