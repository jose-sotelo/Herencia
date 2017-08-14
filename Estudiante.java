public class Estudiante extends Persona
{
    //Declaracion de atributos:
    String carrera, matricula;
    
    //Metodo estudiar:
    public String estudiar(){
        return "estudiar";
    }
    
    //Metodo hacer examen:
    public String hacerExamen(){
        return "Examen";
    }
    
    //Setters y Getters
    public void setCarrera(String c){
        carrera = c;
    }
    
    public void setMatricula(String m){
        matricula = m;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public String getMatricula(){
        return matricula;
    }
}
