package marketing;

public record RedesSociais() implements ServiceMessage{

    private static final String mensagemRedesSociais = "\n🚨 PROMOÇÃO DO DIA! 🚨 Descontos imperdíveis na nossa loja! Corre no link da bio e aproveite. 🔥 #Desconto #Promoção #Oferta";

    @Override
    public String submit() {
        return mensagemRedesSociais;
    }
}
