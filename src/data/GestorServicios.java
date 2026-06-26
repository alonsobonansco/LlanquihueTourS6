package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {
    private RutaGastronomica ruta1;
    private RutaGastronomica ruta2;

    private PaseoLacustre paseo1;
    private PaseoLacustre paseo2;

    private ExcursionCultural excursion1;
    private ExcursionCultural excursion2;

    public void crearTours() {
        // Aquí el this es opcional pero es buena práctica
        this.paseo1 = new PaseoLacustre("Paseo en lancha", 1.5, "Lancha");
        this.paseo2 = new PaseoLacustre("Paseo en kayak", 2.0, "Kayak");

        this.ruta1 = new RutaGastronomica("Ruta", 3, 5);
    }

    public String mostrarTours() {
        return "--- Rutas Gastronómicas ---\n" +
                ruta1 +
                ruta2 +
                "\n--- Paseos Lacustres ---\n" +
                paseo1 +
                paseo2 +
                "\n--- Excursiones Culturales ---\n" +
                excursion1 +
                excursion2;
    }
}
