package marketing;

public record SMS() implements ServiceMessage {

    private static final String mensagemSMS = "\nPromoção na loja! Descontos incríveis só hoje. Corra!";

    @Override
    public String submit() {
        return mensagemSMS;
    }
}
