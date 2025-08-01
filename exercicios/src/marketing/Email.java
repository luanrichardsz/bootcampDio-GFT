package marketing;

public record Email() implements ServiceMessage {

    private static final String mensagemEmail = "\nOlá! Temos uma super promoção esperando por você! Confira agora mesmo os descontos exclusivos em nossa loja. Aproveite!";

    @Override
    public String submit() {
        return mensagemEmail;
    }
}
