public class Sanatorio {
    public static void main(String[] args) {

        PacinetePediatrico pediatrico=new PacinetePediatrico();
        PacienteAdulto adulto=new PacienteAdulto();
        PacienteInternado internado=new PacienteInternado();

        pediatrico.obtenerCoberturaObraSocial();
        adulto.obtenerCoberturaObraSocial();
        internado.obtenerCoberturaObraSocial();

    }
}
