package com.semillero.manejo.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ManejadorArchivosPlanos {

    public void escribirArchivoPlano(){


        Scanner sc = new Scanner(System.in);
        String ruta="/Users/dflorezl/Downloads/ejemploArchivo.txt";
        String mensaje;


        File file = new File(ruta);

        try {
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fc  = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fc);

            System.out.println("por favor digite el mensaje que desea guardar");
            mensaje=sc.nextLine();


            bw.write(mensaje);
            bw.close();

        }catch (Exception e){
            System.out.println("fallo el programa " + e.getMessage());
        }

    }
}
