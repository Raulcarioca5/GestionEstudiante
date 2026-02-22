public class Estudiante {
    String nombre;
    int edad;
    String carrera;
    public Estudiante(String nombre, int edad, String carrera) {        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("carrera: " + carrera);
    }
}
