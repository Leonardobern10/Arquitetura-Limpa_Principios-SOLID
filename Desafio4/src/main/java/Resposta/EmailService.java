package Resposta;

public class EmailService implements Notificacao {

    private final String email;
    private final String username;
    private final String adminEmail;

    EmailService (String email, String username, String adminEmail) {
        this.email = email;
        this.adminEmail = adminEmail;
        this.username = username;
    }

    @Override
    public void enviar (String message, TipoEnvio tipoEnvio) {
        System.out.printf("Enviando %s\n", TipoEnvio.EMAIL.toString());
        System.out.printf("Enviando de %s\n", adminEmail);
        System.out.printf("Enviando para %s\n", email);
        System.out.printf("Enviando à pessoa %s\n", username);
    }
}
