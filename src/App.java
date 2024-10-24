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

        //
        //CICLO L'ARRAY CREATO 
        //
        // MODO 1 - ciclo for
        for(int i = 0; i < numbers.length; i++){
            System.out.println("elementi ciclo for: " + numbers[i]);
        }

        //
        // MODO 2 - ciclo for-each
        //inizializzo il ciclo: for(condizione)
        //dichiaro il tipo di dato ed il singolo elemento: String word:
        //definisco l'array da ciclare
        for(String word: words){
            System.out.println("elementi ciclo foreach: " + word);
        }


        ////////////
        //
        // ARRAY POPOLATO

        //definisco il tipo di array: int/String[]
        //popolo di elementi: {....}
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("value: " + values[0]); //stampo l'elemento all'indice 0

        //cambio il valore del primo elemento
        values[0] = 10;

        System.out.println("nuovo value: " + values[0]); //stampo il nuovo elemento all'indice 0


        //ciclo l'array
        //
        //ciclo for
        for(int i = 0; i < values.length; i++){

            int value = values[i];

            System.out.println("singolo elemento ciclo for: " + value);
        }

        //
        //ciclo for-each
        for(int value: values){
            System.out.println("singolo elemento ciclo for-each: " + value);
        }


        ////////////////
        //
        // RECUPERO ULTIMO VALORE DELL'ARRAY
        //prendo l'array: values
        //prendo la lunghezza dell'array: [values.length]
        //dichiaro che parte dall'ultimo elemento: -1
        int lastValue = values[values.length - 1];

        System.out.println("ultimo elemento dell'array values: " + lastValue);


        String lastWord = words[words.length - 1];

        System.out.println("ultimo elemento dell'array words: " + lastWord);

    }
}
