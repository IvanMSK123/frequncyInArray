/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencyHashMap;

/**
 *
 * @author Ivan Madleňák
 */

    import java.util.HashMap;
public class frequencyHashMap {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        // patova narocnost je hashMap o velkosti pole-pocet rovnakych cisel
       // O(n) is O(n*m)+O(n*m)
        HashMap<Integer,Integer> pocetnost = new HashMap<Integer,Integer>();
        int pole[]={2,5,9,1,5,20000,1,-4,8,50694,8,500000,1};
        pocetnost.put(pole[0], 0);

            for (int i : pocetnost.keySet()) {
                for (int j = 0; j < pole.length; j++) {

                if(pole[j]!=i)//ak nieje ziaden prvok z pola cisel v hashmape tak pridaj prvok do pocetnost 
                {
                    //int a=pocetnost.get(pole[i]).intValue();
                    pocetnost.put(pole[j], 0);
                }    
            }
        }

        for (int i = 0; i < pole.length; i++) {
            for (int j : pocetnost.keySet()) {
            if(pole[i]==j)
            {
                int a=pocetnost.get(pole[i]).intValue();
                a++;
                pocetnost.put(pole[i], a);
            }
            
            
            }
        }
        for (int i : pocetnost.keySet()) {
        System.out.println("number "+i+" is "+pocetnost.get(i)+" time");
        }
    }
    
}
