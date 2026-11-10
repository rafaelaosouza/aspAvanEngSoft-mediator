package servicos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveReportarIncidenteSuporte() {
        Usuario usuario = new Usuario();
        assertEquals("A Central de Serviços registrou seu contato.\nO Suporte Técnico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Suporte Técnico vai investigar o incidente: E-mail suspeito recebido",
                usuario.reportarIncidenteSuporte("E-mail suspeito recebido"));
    }

    @Test
    void deveSolicitarAcessoSuporte() {
        Usuario usuario = new Usuario();
        assertEquals("A Central de Serviços registrou seu contato.\nO Suporte Técnico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Suporte Técnico vai analisar a solicitação de acesso: Acesso ao sistema financeiro",
                usuario.solicitarAcessoSuporte("Acesso ao sistema financeiro"));
    }

    @Test
    void deveSolicitarRevogacaoSuporte() {
        Usuario usuario = new Usuario();
        assertEquals("A Central de Serviços registrou seu contato.\nO Suporte Técnico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Suporte Técnico vai executar a revogação de acesso: Desligamento de colaborador",
                usuario.solicitarRevogacaoSuporte("Desligamento de colaborador"));
    }

}
