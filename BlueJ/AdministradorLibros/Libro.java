

public class Libro
{
    private String titulo;
    private int anio;
    private String resumen;
    private Autor autor;
    Libro (){
    }
    
    Libro (String tit, int ani, String res, Autor aut){
        this.titulo = tit;
        this.anio = ani;
        this.resumen = res;
        this.autor = aut;
    }
    
    public void setTitulo(String tit){
        this.titulo = tit;
    }
    
    public void setAnio(int an){
        this.anio = an;
    }
    
    public void setResumen(String res){
        this.resumen = res;
    }
    
    public void setAutor(Autor aut){
        this.autor = aut;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public int getAnio(){
        return this.anio;
    }
    
    public String getResumen(){
        return this.titulo;
    }
    
    public Autor getAutor(){
        return this.autor;
    }
    
    public void imprimir() {
        System.out.println(" Titulo: "+this.titulo);
        System.out.println(" -- Año: "+this.anio);
        System.out.println(" -- Resumen: "+this.resumen);
    }
    
    public void imprimirConAutor() {
        imprimir();
        System.out.println(" -- Autor: "+this.autor.getFullname());
    }
}
