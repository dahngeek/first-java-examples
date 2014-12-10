class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;
        int[] otroArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
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
        System.out.println("Otro Arrray: ");
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
    }
} 