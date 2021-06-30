package week1;

import java.util.Scanner;

/**
 * Kullanıcıların manavdan almış oldukları ürünlerin ağırlık değerlerini alıp, 
 * bu değerlere göre toplam tutarı ekrana yazdıran program.
 * 
 * Fiyat listesi:
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 * 
 */
public class GreenGrocer {
    public static void main(String[] args) {
        final double PEAR = 2.14;
        final double APPLE = 3.67;
        final double TOMATO = 1.11;
        final double BANANA = 0.95;
        final double EGGPLANT = 5;
        double total = 0;
        double weight;
        double prices[] = { PEAR, APPLE, TOMATO, BANANA, EGGPLANT };
        String[] messages = {
            "Weight of pear in kgs: " ,
            "Weight of apple in kgs: ",
            "Weight of tomato in kgs: ",
            "Weight of banana in kgs: ",
            "Weight of eggplant in kgs: "
        };

        for (int i = 0; i < messages.length; i++) {
            weight = getWeight(messages[i]);
            total += weight * prices[i];
        }

        System.out.print("Toplam tutar: " + total);
    }

    /**
     * input: a message to ask the weight value for a particular product
     * output: weight value of the particular product
     */
    public static double getWeight(String message){
        System.out.print(message);

        Scanner scan = new Scanner(System.in);
        while(!scan.hasNextDouble()){
            System.out.print("Weight value must be a number!");
        }
        scan.close();

        return scan.nextDouble();
    }   
}