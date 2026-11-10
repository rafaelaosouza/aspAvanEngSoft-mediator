package servicos;

public abstract class Solicitante {

    public String reportarIncidenteSuporte(String mensagem) {
        return CentralServicos.getInstancia().receberIncidenteSuporte(mensagem);
    }

    public String solicitarAcessoSuporte(String mensagem) {
        return CentralServicos.getInstancia().receberSolicitacaoAcessoSuporte(mensagem);
    }

    public String solicitarRevogacaoSuporte(String mensagem) {
        return CentralServicos.getInstancia().receberSolicitacaoRevogacaoSuporte(mensagem);
    }


}
