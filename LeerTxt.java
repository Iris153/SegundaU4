package regu4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerTxt {

    public static int[] LeerTxt() {

        File archivo = null;
        FileReader Fr = null;
        BufferedReader br = null;

        int matriz[] = null;

        try {
            archivo = new File("C:\\Users\\irisv\\Desktop\\Regula4.txt");
            Fr = new FileReader(archivo.toString());
            br = new BufferedReader(Fr);
            String linea;
            String delimiter = ",";

            while (((linea = br.readLine()) != null)) {

                String a[] = linea.split(delimiter);
                matriz = new int[a.length];

                for (int l = 0; l < a.length; l++) {
                    matriz[l] = Integer.parseInt(a[l]);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        return matriz;
    }

}
