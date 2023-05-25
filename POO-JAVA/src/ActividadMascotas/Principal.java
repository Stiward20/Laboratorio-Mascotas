package ActividadMascotas;

public class Principal {
    public static void main(String[] args) {
        Mascotas misMascotas = new Mascotas();

        misMascotas.ingresar();
        misMascotas.mostrarInformacion();
        misMascotas.mostrarInformacionGeneral();
        misMascotas.consultaIndividual();
    }
}