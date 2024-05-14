package model;

public class Ferramenta {
    private int idFerramenta;
    private String nome;
    private String marca;
    private double custo;

    public Ferramenta() {
        this(0,"","",0);
    }

    public Ferramenta(int idFerramenta, String nome, String marca, int custo) {
        this.idFerramenta = idFerramenta;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
