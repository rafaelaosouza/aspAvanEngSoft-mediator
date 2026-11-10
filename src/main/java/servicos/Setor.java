package servicos;

public interface Setor {
    String receberIncidente(String mensagem);
    String receberSolicitacaoAcesso(String mensagem);
    String receberSolicitacaoRevogacao(String mensagem);
}
