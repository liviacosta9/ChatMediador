public abstract class Colaborador {
    private Mediador mediador;
    private String nome;
    
    public Colaborador(String nome){
        this.nome = nome;
    }

    public void setMediador(Mediador m){
        this.mediador = m;
    }

    public Mediador getMediador(){
        return this.mediador;
    }

    public String getNome(){
        return nome;
    }

    public abstract void enviar(String mensagem);
    public abstract void receber(String mensagem);
}
