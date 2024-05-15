package modelo;

import java.util.Date;
import dao.EmprestimoDAO;
import java.util.ArrayList;
public class Emprestimo {


    
    private int id; 
    private int idFerramenta;
    private int idAmigo;
    private String dataEmprestimo;
    private String dataDevolucao;
    EmprestimoDAO dao;
    public Emprestimo() {
        this(0,0,0,"","");
    }

     public Emprestimo(int id, int idFerramenta, int idAmigo, String dataEmprestimo) {
        this.id = id; 
        this.idFerramenta = idFerramenta;
        this.idAmigo = idAmigo;
        this.dataEmprestimo = dataEmprestimo;
        
    }
    
    public Emprestimo(int id, int idFerramenta, int idAmigo, String dataEmprestimo, String dataDevolucao) {
        this.id = id; 
        this.idFerramenta = idFerramenta;
        this.idAmigo = idAmigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        dao = new EmprestimoDAO();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public int getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
 public ArrayList<Emprestimo> getMinhaLista() {
        return dao.getMinhalista();
   
 }
    public boolean InsertEmprestimoBD(int idFerramenta, int idAmigo, String dataEmprestimo) {
        
        int id = dao.maiorID()+1;
        Emprestimo objeto = new Emprestimo(id,idFerramenta,idAmigo,dataEmprestimo);
        dao.insertEmprestimoBD(objeto);
        return true;
    }
}

    
