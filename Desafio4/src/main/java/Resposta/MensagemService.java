package Resposta;

public class MensagemService implements Notificacao {
    private final String subject;
    private final String destinatario;

    MensagemService (String subject, String destinatario) {
        this.subject = subject;
        this.destinatario = destinatario;
    }

    @Override
    public void enviar (String message, TipoEnvio tipoEnvio) {
        System.out.printf("Enviando %s\n", TipoEnvio.MENSAGEM.toString());
        System.out.printf("Enviando mensagem para %s\n", destinatario);
        System.out.printf("Assunto da mensagem: %s\n", subject);
    }
}
