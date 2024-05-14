package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta extends EstruturaBase {
    private String marca;
    private float custo;
    FerramentaDAO dao;

    public Ferramenta() {
        this(0,"","",0);
    }

    public Ferramenta(int id, String nome, String marca, float custo) {
        super(id,nome);
        this.marca = marca;
        this.custo = custo;
        dao = new FerramentaDAO();
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

    public void setCusto(float custo) {
        this.custo = custo;
    }
    
    public ArrayList<Ferramenta> getMinhaLista() {
        return dao.getMinhalista();
    }
    
    public boolean InsertFerramentaBD(String nome, String marca, float custo) {
        int id = dao.maiorID()+1;
        Ferramenta objeto = new Ferramenta(id,nome,marca,custo);
        dao.insertFerramentaBD(objeto);
        return true;
    }
}
