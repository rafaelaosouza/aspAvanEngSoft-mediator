package servicos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentralServicosTest {

    @Test
    void deveRetornarSempreAMesmaInstanciaDaCentral() {
        assertSame(CentralServicos.getInstancia(), CentralServicos.getInstancia());
    }

    @Test
    void deveRetornarSempreAMesmaInstanciaDoSetor() {
        assertSame(SuporteTecnico.getInstancia(), SuporteTecnico.getInstancia());
    }

    @Test
    void deveEncaminharIncidenteAoSuporteTecnico() {
        assertEquals("A Central de Serviços registrou seu contato.\nO Suporte Técnico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SuporteTecnico.getInstancia().receberIncidente("Malware detectado"),
                CentralServicos.getInstancia().receberIncidenteSuporte("Malware detectado"));
    }

    @Test
    void deveEncaminharMensagemVaziaSemFalhar() {
        assertEquals("A Central de Serviços registrou seu contato.\nO Suporte Técnico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Suporte Técnico vai investigar o incidente: ",
                CentralServicos.getInstancia().receberIncidenteSuporte(""));
    }

}
