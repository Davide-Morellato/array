public class App {
    public static void main(String[] args){

        /*
         * ARRAY
         * 
         * come creare un array vuoto
         * 
         * array 2D (array di array)
         * 
         */

        // CREO UN ARRAY VUOTO DA POPOLARE
        //
        //array di numeri
        //definisco il tipo di array: int[]
        //creo il tipo di array: new int[]
        //determino il numero di elementi (x) che deve contenere: [x] -> se deve contenere 3 elementi, sarà [3]
        int[] numbers = new int[3];

        //popolo l'array appena creato, prendendo l'indice
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        //stampo um elemento dell'array in base al proprio indice
        System.out.println("numero al primo indice: " + numbers[0]);
        System.out.println("numero al secondo indice: " + numbers[1]);
        System.out.println("numero al terzo indice: " + numbers[2]);


        //////////////
        //
        //array di stringhe
        String[] words = new String[3];

        words[0] = "Ciao";
        words[1] = "Sono";
        words[2] = "Davide";

        System.out.println("stringa al primo indice: " + words[0]);
        System.out.println("stringa al secondo indice: " + words[1]);
        System.out.println("stringa al terzo indice: " + words[2]);


        //
        //CAMBIO VALORE DI UN ELEMENTO
        //richiamo l'elemento di cui voglio cambiare il valore in base all'indice, per assegnargliene uno nuovo
        numbers[0] = 100;

        System.out.println(numbers[0]); //valore modificato
        System.out.println(numbers[1]); //valore inziale
        System.out.println(numbers[2]); //valore iniziale


        //
        //Conoscere la LUNGHEZZA DI UN ARRAY
        System.out.println("lunghezza array numbers: " + numbers.length); //stampa quanti elementi in totale sono presenti nell'array

        System.out.println("lunghezza array words: " + words.length);

    }
}
