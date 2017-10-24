
/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Principal
{
    static ArrayList<Paciente> pacientes;
    static ArrayList<Medico> medicos;
    static ArrayList<Especialidad> especialidades;
    static ArrayList<Turno> turnos;
    public static void main(String args[])
    {
        pacientes = new ArrayList<Paciente>();
        medicos = new ArrayList<Medico>();
        especialidades = new ArrayList<Especialidad>();
        turnos = new ArrayList<Turno>();
        CargarDatos();
        Menu();
        
    }
    
    public static void Menu()
    {
        BorrarConsola();
        System.out.println("################################");
        System.out.println("# 1 # Crear Turno              #");
        System.out.println("# 2 # Listar Turnos Medico     #");
        System.out.println("# 3 # Listar Especialidades    #");
        System.out.println("# 4 # Listar pacientes/turnos  #");
        System.out.println("# 5 # Salir                    #");
        System.out.println("################################");
        int op = Console.readInt("Seleccione una opcion");
        
        switch(op)
        {
            case 1: BorrarConsola();
                    crearTurno();
                    Menu(); break;
            case 2: BorrarConsola();
                    listarTurnosMedico();
                    Console.readLine("Presione una enter para continuar");
                    Menu(); break;
            case 3: BorrarConsola();
                    listarEspecialidades();
                    Console.readLine("Presione una enter para continuar");
                    Menu(); break;
            case 4: BorrarConsola();
                    listarPacientesTurnos();
                    Console.readLine("Presione una enter para continuar");
                    Menu(); break;
            case 5: break;
            default: Menu(); break;
        }
    }
    
    
    //Metodo para listar los medicos
    public static void ListarMedicos()
    {
        for(int i = 0; i < medicos.size(); i++)
        {
            System.out.println((i + 1) + " - " + medicos.get(i).getNombreCompleto());
        }
    }
    //Metodo para listar los pacientes
    public static void ListarPacientes()
    {
        for(int i = 0; i < pacientes.size(); i++)
        {
            System.out.println((i + 1) + " - " + pacientes.get(i).getNombreCompleto());
        }
    }
    
    public static void BorrarConsola()
    {
         System.out.print('\u000C');
    }
    
    //Carga datos en las listas para pruebas.
    public static void CargarDatos()
    {
        especialidades.add(new Especialidad("Clinico"));
        especialidades.add(new Especialidad("Cardiologo"));
        especialidades.add(new Especialidad("Traumatologo"));
        especialidades.add(new Especialidad("Pediatra"));
        
        medicos.add(new Medico("Gomez", "Juan", 24345876, especialidades.get(0)));
        medicos.add(new Medico("Perez", "Pablo", 28234675, especialidades.get(2)));
        medicos.add(new Medico("Ramirez", "Ariel", 29876123, especialidades.get(1)));
        medicos.add(new Medico("Smith", "Juliana", 28234921, especialidades.get(3)));
        
        pacientes.add(new Paciente("Mendez", "Micaela", 34567987, 123));
        pacientes.add(new Paciente("Gonzalez", "Mauro", 21345612, 122));
        pacientes.add(new Paciente("Martinez", "Pedro", 45678900, 120));
        pacientes.add(new Paciente("Kalbermatter", "Priscila", 55234123, 121));
        
        //Generador de turnos
        Random number = new Random();
        for(int i=0; i< 10; i++){
            turnos.add(new Turno(pacientes.get(number.nextInt(pacientes.size())),
                                    medicos.get(number.nextInt(medicos.size())),
                                    number.nextInt(30), //dia
                                    number.nextInt(13), //mes
                                    2000+number.nextInt(18), //anio
                                    7+number.nextInt(12))); //hora
        }
        
    }
    
    //método para crear un turno
    public static void crearTurno(){
        Turno nuevo = new Turno();
        System.out.println("#### Seleccione un paciente: ###");
        ListarPacientes();
        int pacienteindice = Console.readInt(" No. de paciente: ") - 1;
        if((pacienteindice >= pacientes.size()) || (pacienteindice < 0) ){
            System.out.println(" Número Incorrecto ");
            return;
        }
        nuevo.setPaciente(pacientes.get(pacienteindice));
        
        ListarMedicos();
        int medicoindice = Console.readInt(" No. de Médico: ") - 1;
        if((medicoindice >= medicos.size()) || (medicoindice < 0)){
            System.out.println(" Número Incorrecto ");
            return;
        }
        nuevo.setMedico(medicos.get(medicoindice));
        
        nuevo.setAnio(Console.readInt("Ingrese el año del turno:"));
        nuevo.setMes(Console.readInt("Ingrese el mes del turno:"));
        nuevo.setDia(Console.readInt("Ingrese el día del turno:"));
        nuevo.setHora(Console.readInt("Hora de la cita:"));
        
        turnos.add(nuevo);
    }
    
    //metodo para listar los turnos de un medico
    public static void listarTurnosMedico(){
        System.out.println("##### Listar turnos Medico #####");
        ListarMedicos();
        int medicoindice = Console.readInt(" No. de Médico: ") - 1;
        if((medicoindice >= medicos.size()) || (medicoindice < 0 )){
            System.out.println(" Número Incorrecto ");
            return;
        }
        Medico buscado = medicos.get(medicoindice);
        
        //recorrer todos los turnos
        for(int i=0; i < turnos.size(); i++){
            Turno actual = turnos.get(i);
            if(actual.getMedico() == buscado){ //comparar al medico
                System.out.println(" [" + actual.getFecha() + "] " + actual.getPaciente().getNombreCompleto() );
            }
        }
    }
    
    //método para listar las especialidades en orden de cantidad de turnos
    public static void listarEspecialidades(){
        boolean hayCambios = true;
        while(hayCambios){
            hayCambios = false;
            for(int i = 0; i < especialidades.size()-1; i++){
                Especialidad actual = especialidades.get(i);
                Especialidad siguiente = especialidades.get(i+1);
                
                if(turnosEspecialidad(actual) < turnosEspecialidad(siguiente)){
                    especialidades.set(i, siguiente);
                    especialidades.set(i+1, actual);
                    hayCambios = true;
                }
                
            }
        }
        System.out.println("######### Especiaidades ########");
        for(int i = 0; i < especialidades.size()-1; i++){
                Especialidad actual = especialidades.get(i);
                System.out.println((i+1)+ ". " + actual.getNombre() + " Turnos:" + turnosEspecialidad(actual) );
        }
    }
    
    //método que ayuda a contar los turnos de una especialidad
    public static int turnosEspecialidad(Especialidad seleccionada){
        int turnosEspecialidad = 0;
        for(int t=0; t < turnos.size(); t++){
            Especialidad delturno = turnos.get(t).getEspecialidad();
            if(delturno.getNombre().equals(seleccionada.getNombre())){
                turnosEspecialidad++;
            }
        }
        return turnosEspecialidad;
    }
    
    //metodo para listar los pacientes y los turnos por especialidad
    public static void listarPacientesTurnos(){
        System.out.println("###### Pacientes / Turnos ######");
        for(int p = 0; p < pacientes.size(); p++){
            Paciente pactual = pacientes.get(p);
            System.out.println(pactual.getNombreCompleto()+":" );
            for(int e=0; e < especialidades.size(); e++){
                Especialidad espactual = especialidades.get(e);
                System.out.println("       " + espactual.getNombre() + ": " + turnosEspecialidadPaciente(espactual, pactual));
            }        
        }
    }
    
    //metodo que ayuda a contar los turnos para una especialidad y paciente dados.
    public static int turnosEspecialidadPaciente(Especialidad seleccionada, Paciente paciente){
        int turnosEspecialidad = 0;
        for(int t=0; t < turnos.size(); t++){
            Especialidad delturno = turnos.get(t).getEspecialidad();
            Paciente pacienteturno = turnos.get(t).getPaciente();
            if(delturno.getNombre().equals(seleccionada.getNombre()) && 
                paciente.getNombre().equals(pacienteturno.getNombre())){
                turnosEspecialidad++;
            }
        }
        return turnosEspecialidad;
    }
}
