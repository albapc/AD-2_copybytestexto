package ex2_copybytestexto;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Alba
 */
public class Metodos {

    /*
     2_1)Desenvolve unha pequena aplicacion que usando somente estas duas clases
     e os metodos indicados  copie  byte a byte o contido do  ficheiro de texto
     chamado texto1.txt noutro ficheiro chamado texto2.txt
    
     2_2) Fai a modificacion necesaria na aplicacion anterior para que se engada
     de novo o texto do ficheiro texto1.txt ao ficheiro texto2.txt
     */

    public static void copiarFicheiroaOutro() {

        try {
            FileInputStream fis = new FileInputStream("texto1.txt");
//            FileOutputStream fos = new FileOutputStream("texto2.txt"); //ex 2_1
            FileOutputStream fos = new FileOutputStream("texto2.txt", true); //modificacion ex 2_2
            System.out.println("Arquivo copiado");
            int c;
            while ((c = fis.read()) != -1) {
                fos.write((char) c);
            }
            fis.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
