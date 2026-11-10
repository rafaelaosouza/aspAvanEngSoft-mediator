package servicos;

public class SuporteTecnico implements Setor {

    private static SuporteTecnico instancia = new SuporteTecnico();

    private SuporteTecnico() {}

    public static SuporteTecnico getInstancia() {
        return instancia;
    }

    public String receberIncidente(String mensagem) {
        return "O Suporte Técnico vai investigar o incidente: " + mensagem;
    }

    public String receberSolicitacaoAcesso(String mensagem) {
        return "O Suporte Técnico vai analisar a solicitação de acesso: " + mensagem;
    }

    public String receberSolicitacaoRevogacao(String mensagem) {
        return "O Suporte Técnico vai executar a revogação de acesso: " + mensagem;
    }
}
