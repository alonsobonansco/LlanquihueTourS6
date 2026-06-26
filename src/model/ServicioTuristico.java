package model;

public class ServicioTuristico {
    private String nombre;
    private double duracionHoras;

    public ServicioTuristico(String nombre, double duracionHoras) {
        setNombre(nombre);
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del servicio no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    // Hay una opción con abstract
    @Override
    public String toString() {
        return nombre + " | " + duracionHoras;
    }
}
