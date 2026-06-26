package data;

import model.PaseoLacustre;

// métódo que cree al menos dos objetos de cada subclase
// pero se muestra con el toString de cada clase en el main?
// imprimir DESDE el main
public class GestorServicios {
    private PaseoLacustre paseo1;
    private PaseoLacustre paseo2;

    public void crearTours() {
        this.paseo1 = new PaseoLacustre(
                "Paseo en lancha", 1.5, "Lancha");

        this.paseo2 = new PaseoLacustre(
                "Paseo en kayak", 2.0, "Kayak");
    }

    public String mostrarTours() {
        return paseo1 + "\n" + paseo2;
    }
}
