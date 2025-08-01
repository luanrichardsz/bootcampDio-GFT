package marketing;

public record WhatsApp() implements ServiceMessage {

    private static final String mensagemWhatsApp = "\nOi! 👋 Nossa loja está com promoções especiais só hoje! Dá uma olhada nas ofertas antes que acabe. 😄🛍️";

    @Override
    public String submit() {
        return mensagemWhatsApp;
    }
}
