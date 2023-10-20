package dio.iphone;

interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}
