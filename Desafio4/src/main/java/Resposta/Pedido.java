package Resposta;

public class Pedido {
    private final Notificacao notificacao;

    // A dependência é passada para a classe Pedido, ao invés de ser criada dentro dela
    public Pedido(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void processar(String mensagem) {
        System.out.println("Processando pedido...");
        notificacao.enviar(mensagem, TipoEnvio.EMAIL);  // Exemplo de tipo de envio
    }
}
