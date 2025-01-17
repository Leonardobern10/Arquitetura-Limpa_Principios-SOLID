package Resposta;

public class NotificacaoFactory {
    public static Notificacao criarNotificacao(TipoEnvio tipoEnvio) {
        return switch ( tipoEnvio ) {
            case MENSAGEM -> new MensagemService("Pagamento", "Hugo");
            case EMAIL -> new EmailService("hugo@email.com", "HugoMoura2", "leo@email.com");
            case SMS -> new SmsService("9999999999", "888888888");
        };
    }
}
