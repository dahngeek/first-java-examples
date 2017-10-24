import java.util.*;

public class Principal
{
  static ArrayList<Autor> autores;
  static ArrayList<Libro> libros;
  
  public static void main()
  {
      autores = new ArrayList<Autor>();
      libros = new ArrayList<Libro>();
      Menu();
      
  }
  
  public static void Menu()
  {
    System.out.println("############################################");
    System.out.println("0- Generar Autores y Libros de Ejemplo");
    System.out.println("1- Crear Autor");
    System.out.println("2- Listar Autores");
    System.out.println("3- Crear Libro");
    System.out.println("4- Listar Libros");
    System.out.println("5- Salir");
    System.out.println("############################################");
    
    int op = Console.readInt("Seleccione una opcion: ");
    
    switch(op)
    {
        case 0: 
            // Generacion de libros y autores al azar
            seed();
            Console.clear();
            System.out.println(" -Libros y Autores Generados- " );
            Menu();
            break;
        case 1:
            // Creacion de un autor
            Console.clear();
            crearAutor();
            Menu();
            break;
        case 2:
            // listar autores
            Console.clear();
            listarAutores();
            Menu();
            break;
        case 3:
            // Creacion de un libro
            Console.clear();
            crearLibro();
            Menu();
            break;
        case 4:
            // listar libros
            Console.clear();
            listarLibros();
            Menu();
            break;
        case 5: 
            Console.clear();
            System.out.println(" -Adiós- " );
            break;
        default: System.out.println("Opcion no valida"); Menu(); break;
    }
    
    
  }
  
  public static void crearAutor(){
      Autor nuevoAutor = new Autor();
      nuevoAutor.setNombre(Console.readLine("Ingrese el Nombre:"));
      nuevoAutor.setApellido(Console.readLine("Ingrese el Apellido:"));
      nuevoAutor.setNacionalidad(Console.readLine("Ingrese la Nacionalidad:"));
      System.out.println(" Se ha guardado el autor. " );
      autores.add(nuevoAutor); // Lo agregamos al arraylist
  }
  
  public static void ordenarAutores(){
      // ArrayList autores
      
      
  }
  
  public static void listarAutores(){
      // recorremos el arraylist
      for(int i = 0; i < autores.size(); i++){
          Autor actual = autores.get(i);
          System.out.println( (i+1) + ". " + actual.getFullname() + " Libros:"+ actual.getLibrosCount());
      }
  }
  
  public static void crearLibro(){
      Libro nuevo = new Libro();
      nuevo.setTitulo(Console.readLine("Ingrese el Titulo:"));
      nuevo.setAnio(Console.readInt("Ingrese el Año:"));
      nuevo.setResumen(Console.readLine("Ingrese el resumen:"));
      Console.clear();
      
      System.out.println(" ========== Autores ==========" );
      listarAutores();
      System.out.println(" =============================" );
      int id = Console.readInt("Ingrese el ID del autor:");
      Autor autordelLibro = autores.get(id-1);
      nuevo.setAutor(autordelLibro);
      autordelLibro.addBook(nuevo); // agregamos el libro al autor.
      
      System.out.println(" Libro creado" );
  }
  
  public static void listarLibros(){
      for(int i = 0; i < libros.size(); i++){
          Libro actual = libros.get(i);
          System.out.print( (i+1) + ". ");
          actual.imprimirConAutor();
      }
  }
  
  public static void seed(){
      String[] articulos = {"El", "La"};
      String[] sustantivos = {"Terraza", "Ratón", "Cisne", "Lobezno", "Cucaracha", "Extraño"};
      String[] adjetivos = {"Grande", "Rojo", "Demasiado", "Infiel", "Franco", "Mike"};
      Random number = new Random();
      String[] nombres = {"Marcos" , "Pedro" , "Benjamin" , "Juana" , "Carla" , "Ariel"};
      String[] apellidos = {"Van Damme", "Doe", "Zacharias", "Levoy", "Morales" };
      String[] nacionalidades = {"Guatemala", "Argentina", "Peru", "Bolivia", "EEUU", "Alemania"};
      
      // Generamos 10 autores al azar
      for(int i=0; i<10; i++){
          Autor nuevo = new Autor();
          nuevo.setNombre(nombres[number.nextInt(nombres.length)]);
          nuevo.setApellido(apellidos[number.nextInt(apellidos.length)]);
          nuevo.setNacionalidad(nacionalidades[number.nextInt(nacionalidades.length)]);
          autores.add(nuevo); // agregamos al autor en el arraylist
      }
      
      // Ganeramos 10 libros al azar
      for(int i=0; i<10; i++){
          Libro nuevo = new Libro();
          //Generamos titulo al azar
          String titl = articulos[number.nextInt(articulos.length)] + " "
                        + sustantivos[number.nextInt(sustantivos.length)] + " "
                        + adjetivos[number.nextInt(adjetivos.length)];
          nuevo.setTitulo(titl);
          nuevo.setAnio( 1990 + number.nextInt(27));
          nuevo.setResumen("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
          Autor delLibro = autores.get(number.nextInt(autores.size()));
          nuevo.setAutor(delLibro); // Guardamos el autor del libro en el libro
          delLibro.addBook(nuevo); // Guardamos el libro en el autor
          libros.add(nuevo); // Agregamos el libro al arraylist
      }
  }
}
