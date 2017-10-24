
/**
 * Write a description of class Turno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Turno
{
    Paciente paciente;
    Medico medico;
    int dia;
    int mes;
    int anio;
    int hora;
    
    public Turno()
    {}
    
    public Turno(Paciente paciente, Medico medico, int dia, int mes,int anio, int hora)
    {
        this.paciente = paciente;
        this.medico = medico;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
    }
    
    public Paciente getPaciente()
    {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente)
    {
        this.paciente = paciente;
    }
    
    public Medico getMedico()
    {
        return medico;
    }
    
    public void setMedico(Medico medico)
    {
        this.medico = medico;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public void setDia(int dia)
    {
        this.dia = dia;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    
    public int getAnio()
    {
        return anio;
    }
    
    public void setAnio(int anio)
    {
        this.anio = anio;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public void setHora(int hora)
    {
        this.hora = hora;
    }
    
    public String getFecha()
    {
        return dia + "/" + mes + "/" + anio + " " + hora + ":00 ";
    }
    
}
