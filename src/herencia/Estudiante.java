package herencia;
import javax.swing.JOptionPane;
public class Estudiante extends Persona {
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;   
    public Estudiante(){
    }
    public Estudiante (String nombre, String apellido, int edad, int peso, String carnet, double promedioNotas, int numeroMaterias){
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public double getPromedioNotas() {
        return promedioNotas;
    }
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    public int getNumeroMaterias() {
        return numeroMaterias;
    }
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public double calculaPromedio(int numMaterias){
        double promedioNotas, sumaNotas;
        sumaNotas = leerNotasEstudiante(numMaterias);
        promedioNotas = sumaNotas/numMaterias;
        return (promedioNotas);
    }
    
    public double leerNotasEstudiante(int numMaterias){
        double nota, sumaNotas = 0;
        for (int i = 0; i < numMaterias; i++) {
            nota = leerDatoTipoReal("Ingrese la nota de la materia " + (i+1));
            sumaNotas += nota; 
        } 
        return (sumaNotas);
    }
        
    public Estudiante ingresarDatosEstudiante (){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        String carnet = "";
        int numeroMaterias = 0;
        double promedioNotas = 0.0;
        
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        numeroMaterias = leerDatoTipoEntero("Ingrese el número de materias del estudiante: ");

        promedioNotas = calculaPromedio(numeroMaterias);
        
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        nuevoEstudiante.setPromedioNotas(promedioNotas);

        return (nuevoEstudiante);
    }
    public void imprimirReporteNotasEstudiante(){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "El carnet del estudiante es: " + carnet + "\n Su cantidad de materias es: " 
                + numeroMaterias + "\n Su promedio es: " + promedioNotas);
    }
   
}

