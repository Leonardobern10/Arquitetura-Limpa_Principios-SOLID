public class Pedido {
    private final EmailService emailService;

    public Pedido() {
        this.emailService = new EmailService();
    }

    public void processar() {
        System.out.println("Processando pedido...");
        emailService.enviarEmail("Seu pedido foi processado!");
    }
}