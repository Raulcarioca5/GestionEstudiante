public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Luis", 22, "Programacion");
        estudiante1.mostrarInformacion();
        if (estudiante1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        Estudiante estudiante2 = new Estudiante("Walter Rivera", 15, "Gastronomia");
        estudiante2.mostrarInformacion();

        if (estudiante2.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
      }
    }
//Actualizacion del sistema
//Se agregaron getters, setters y validacion de edad