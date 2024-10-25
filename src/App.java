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


        //////////////////////////
        //
        //
        // ARRAY 2D - definiti anche ARRAY MULTIDIMENSIONALI

         /* come fossero tabelle
         *
         *           elemento[0]   elemento[1]   (...)  elemento[n]
         * array[0]       X             Y                  ...
         * array[1]       J             Z                  ...
         *  (...)
         * array[n]      ...           ...                 ...
         * 
         */


        // ARRAY 2D VUOTO
        //
        //dichiaro il tipo di array: int/String
        //definisco gli array: [][]
        //creo il tipo di array: new int/String
        //dichiaro sia quanti array devono essere sia gli elmenti che devono contenere: ES. 2 array con 3 elementi ciascuno -> [2][3]

        int[][] nums = new int[2][3];

        //popolo l'array creato
        //
        //PRENDO IL PRIMO ARRAY nums[0]
        //popolo in base all'indice
        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;

        //PRENDO IL SECONDO ARRAY nums[1]
        //popolo in base all'indice
        nums[1][0] = 1;
        nums[1][1] = 2;
        nums[1][2] = 3;

        System.out.println("valore secondo array, primo elemento: " + nums[1][0]);

        //
        //cambio il valore del primo elemento del secondo array
        nums[1][0] = 10;

        System.out.println("nuovo valore secondo array, primo elemento: " + nums[1][0]);

        //
        //ciclo l'array
        //
        for(int i = 0; i < nums.length; i++){ //scorro l'array per la sua lunghezza
            System.out.println();

            for(int num = 0; num < nums[i].length; num++){ //scorro il singolo array per la sua lunghezza
                System.out.println(nums[i][num] + " "); //prendo il valore del singolo elemento
            }
        }


        String [][] strings = new String[2][3];

        strings[0][0] = "Luca";
        strings[0][1] = "Marco";
        strings[0][2] = "Cecilia";

        strings[1][0] = "Paolo";
        strings[1][1] = "Manuel";
        strings[1][2] = "Anna";

        //
        //CICLO FOR
        //
        for(int i = 0; i < strings.length; i++){ //scorro l'array per la sua lunghezza
            System.out.println();

            for(int j = 0; j < strings[i].length; j++){ //scorro il singolo array per la sua lunghezza
                System.out.println("ciclo for: " + strings[i][j] + " "); //prendo il valore del singolo elemento
            }
        }


        //
        //CICLO FOR-EACH
        //
        //inizializzo il ciclo: for
        //nella condizione dichiaro il tipo di array, il singolo array, e l'array di riferimento: String[] singolo_array: array
        for(String[] single_array: strings){
            System.out.println();

            //inizializzo il ciclo: for
            //mella condizione dichiaro il tipo di dato, il singolo elemento, e i singolo array di riferimento: String el: singolo_array
            for(String element: single_array){
                System.out.println("ciclo for-each: " + element);
            }
        }


        ////////////////
        //
        // ARRAY 2D 

        String[][] phrases = { {"Luca", "Marco", "Franco"}, {"Anna", "Cecilia", "Chiara"} }; //array di array

        //ciclo for
        //scorro la lunghezza dell'array
        for(int i = 0; i < phrases.length; i++){
            System.out.println();

            //accedo i singoli array contenuti nel primo, trmaite l'indice(i), e li scorro per tutta la loro lunghezza(.length)
            for(int j = 0; j < phrases[i].length; j++){
                //stampo i valori in essi contenuti, prendendo come riferimento sia l'indice dei singoli array(i), sia l'indice per i singoli valori(j)
                System.out.println("ciclo for: " + phrases[i][j]);
            }
        }

        //ciclo for-each
        //definisco il singolo array (phrase) racchiuso nel primo array(phrases): String[] phrase
        for(String[] phrase: phrases){
            System.out.println();
            //definisco il singolo elemento (quote) da prendere dal singolo array (phrase)
            for(String quote: phrase){
                System.out.println("ciclo for-each: " + quote);
            }
        }
    }
}
