package Resposta;

public class SmsService implements Notificacao {
    private final String emissor;
    private final String destinatario;

    SmsService (String emissor, String destinatario) {
        this.emissor = emissor;
        this.destinatario = destinatario;
    }

    @Override
    public void enviar (String message, TipoEnvio tipoEnvio) {
        System.out.printf("Enviando %s\n", TipoEnvio.SMS.toString());
        System.out.printf("Enviando sms pelo numero: %s\n", emissor);
        System.out.printf("Enviando sms para: %s\n", destinatario);
    }
}
