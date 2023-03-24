/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.pkg2;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("sapi");
        Hewan.add("kelinci");
        Hewan.add("kambing");
        Hewan.add("unta");
        Hewan.add("domba");
                 
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("kambing");
        DeleteHewan.add("unta");
        DeleteHewan.add("domba");
        
        System.out.println("Hewan : ");
        System.out.println(Hewan);
        
        System.out.println("\nHewan yang dihapus : ");
        System.out.println(DeleteHewan);

        for (int i = 0; i < DeleteHewan.size(); i++) {
            String warna = DeleteHewan.get(i);
            if (Hewan.contains(warna)) {
                Hewan.remove(warna);
            }
        }

        System.out.println("\nOutput Hewan : ");
        System.out.println(Hewan);
        
    }
    
}
