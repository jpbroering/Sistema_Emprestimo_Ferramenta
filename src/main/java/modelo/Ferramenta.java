package modelo;

public class Ferramenta extends EstruturaBase {
    private String marca;
    private double custo;

    public Ferramenta() {
        this(0,"","",0);
    }

    public Ferramenta(int id, String nome, String marca, int custo) {
        super(id,nome);
        this.marca = marca;
        this.custo = custo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
}
