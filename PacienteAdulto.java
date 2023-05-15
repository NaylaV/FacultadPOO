public class PacienteAdulto extends Paciente implements IDepartamentoAdministracion,IDepartamentoClinicaMedica{

    private int PA;
    private double altura;
    private double peso;

    public PacienteAdulto(){
    }

    public PacienteAdulto(int PA,double altura,double peso){
        this.PA=PA;
        this.altura=altura;
        this.peso=peso;
    }

    public int getPA() {
        return PA;
    }
    public void setPA(int PA) {
        this.PA = PA;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void obtenerCoberturaObraSocial() {
        System.out.println("El paciente adulto tiene covertura de obra social ");
    }

    @Override
    public void obtenerDescuento() {
        System.out.println("El paciente adulto tiene descuento");
    }

    @Override
    public void obtenerVademecum() {
        System.out.println("El paciente no tiene Vademecum");
    }

    @Override
    public void obtenerCobertura() {

    }

    @Override
    public void obetenerRx() {

    }

    @Override
    public void obtenerSangre() {

    }
}
