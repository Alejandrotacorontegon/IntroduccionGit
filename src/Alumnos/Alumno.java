package Alumnos;

/**
 * Clase Alumno.
 *
 * @author Alejandro
 * @version 2021.06.16
 */

public class Alumno {
    private String Nombre;
    private int fechaAnioNacimiento;


    public Alumno(String nombre, int fechaAnioNacimiento) {
        Nombre = nombre;
        this.fechaAnioNacimiento = fechaAnioNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getFechaAnioNacimiento() {
        return fechaAnioNacimiento;
    }

    public void setFechaAnioNacimiento(int fechaAnioNacimiento) {
        this.fechaAnioNacimiento = fechaAnioNacimiento;
    }

    /**
     *
     * @param anioActual año actual
     * @return edad del alumno
     */

    public int calcularEdad(int anioActual){

        return anioActual-fechaAnioNacimiento;
    }

}
