package servicos;

public class CentralServicos {

    private static CentralServicos instancia = new CentralServicos();

    private CentralServicos() {}

    public static CentralServicos getInstancia() {
        return instancia;
    }

    public String receberIncidenteSuporte(String mensagem) {
        return "A Central de Serviços registrou seu contato.\n"+
                "O Suporte Técnico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SuporteTecnico.getInstancia().receberIncidente(mensagem);
    }

    public String receberSolicitacaoAcessoSuporte(String mensagem) {
        return "A Central de Serviços registrou seu contato.\n"+
                "O Suporte Técnico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SuporteTecnico.getInstancia().receberSolicitacaoAcesso(mensagem);
    }

    public String receberSolicitacaoRevogacaoSuporte(String mensagem) {
        return "A Central de Serviços registrou seu contato.\n"+
                "O Suporte Técnico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SuporteTecnico.getInstancia().receberSolicitacaoRevogacao(mensagem);
    }

}
