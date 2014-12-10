class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;
        int[] otroArray;

        //este si tiene que copiar :D
        int[] otroArreglo;

        // allocates memory for 10 integers
        anArray = new int[10];
        otroArreglo = new int[10];
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        otroArray = anArray;
        otroArray[0] = 1000;
        otroArray[1] = 3000;
        otroArray[2] = 4000;
        otroArray[3] = 5000;
        otroArray[9] = 10;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
        /// Copiado mal el arreglo desplegarlo
        System.out.println("Otro Arrray Copiado Mal: ");
        System.out.println("Element at index 0: "
                           + otroArray[0]);
        System.out.println("Element at index 1: "
                           + otroArray[1]);
        System.out.println("Element at index 2: "
                           + otroArray[2]);
        System.out.println("Element at index 3: "
                           + otroArray[3]);
        System.out.println("Element at index 4: "
                           + otroArray[4]);
        System.out.println("Element at index 5: "
                           + otroArray[5]);
        System.out.println("Element at index 6: "
                           + otroArray[6]);
        System.out.println("Element at index 7: "
                           + otroArray[7]);
        System.out.println("Element at index 8: "
                           + otroArray[8]);
        System.out.println("Element at index 9: "
                           + otroArray[9]);

        // Copiado bien

        for (int i=0;i<10;i=i+1) {
          otroArreglo[i] = otroArray[i];
        }
        otroArreglo[3] = 400;
        otroArreglo[4] = 9999;
        otroArreglo[5] = 8008;
        otroArreglo[6] = 700;
        otroArreglo[7] = 7777777;
        otroArreglo[8] = 900;
        otroArreglo[9] = 1000;
        /// Copiado mal el arreglo desplegarlo
        System.out.println("Otro Arrray Copiado Bien: ");
        System.out.println("Element at index 0: "
                           + otroArreglo[0]);
        System.out.println("Element at index 1: "
                           + otroArreglo[1]);
        System.out.println("Element at index 2: "
                           + otroArreglo[2]);
        System.out.println("Element at index 3: "
                           + otroArreglo[3]);
        System.out.println("Element at index 4: "
                           + otroArreglo[4]);
        System.out.println("Element at index 5: "
                           + otroArreglo[5]);
        System.out.println("Element at index 6: "
                           + otroArreglo[6]);
        System.out.println("Element at index 7: "
                           + otroArreglo[7]);
        System.out.println("Element at index 8: "
                           + otroArreglo[8]);
        System.out.println("Element at index 9: "
                           + otroArreglo[9]);
    }
} 