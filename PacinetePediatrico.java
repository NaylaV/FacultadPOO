public class PacinetePediatrico extends Paciente implements IDepartamentoAdministracion,IDepartamentoNoticion{

    private double peso;
    private String celular;
    private String tutor;

    public PacinetePediatrico(){
    }

    public PacinetePediatrico(double peso,String celular, String tutor){
        this.peso=peso;
        this.celular=celular;
        this.tutor=tutor;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }

    public String getCelular(){
        return celular;
    }
    public void setCelular(String celular){
        this.celular=celular;
    }

    @Override
    public void obtenerCoberturaObraSocial() {
        System.out.println("El paciente pediatrico no tiene covertura de obra social");
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
    public void obtenerTipoDeDieta() {
    }
}
