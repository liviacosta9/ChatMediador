public class Usuario extends Colaborador {
    public Usuario(String nome){
        super(nome);
    }

    @Override
    public void enviar(String nome){
        System.out.println(this.getNome() + " envioiu: " + mensagem);
        getMediador().enviarMsg(mensagem, this);
    }

    @Override
    public void receber(String mensagem){
        System.out.println(this.getNome() + " recebeu: " + mensagem);
    }
}
