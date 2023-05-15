public class PacienteInternado extends Paciente implements IDepartamentoAdministracion,IDepartamentoClinicaMedica,IDepartamentoNoticion{

    private int habitacion;
    private int PA;
    private String rh;

    public PacienteInternado(){
    }

    public PacienteInternado(int habitacion,int PA,String rh){
        this.habitacion=habitacion;
        this.PA=PA;
        this.rh=rh;
    }

    public int getHabitacion() {
        return habitacion;
    }
    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getPA() {
        return PA;
    }
    public void setPA(int PA) {
        this.PA = PA;
    }

    public String getRh() {
        return rh;
    }
    public void setRh(String rh) {
        this.rh = rh;
    }

    @Override
    public void obtenerCoberturaObraSocial() {
        System.out.println("El paciente internado tiene covertura de obra social");

    }

    @Override
    public void obtenerDescuento() {

    }

    @Override
    public void obtenerVademecum() {

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

    @Override
    public void obtenerTipoDeDieta() {

    }
}
