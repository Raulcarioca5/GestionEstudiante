public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    public Estudiante(String nombre, int edad, String carrera) {        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public void mostrarInformacion() {
        System.out.println("----- INFORMACION DEL ESTUDIANTE ----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
    public boolean esMayorDeEdad() {
        return edad >=18;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
