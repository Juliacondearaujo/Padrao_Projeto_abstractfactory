package padroescriacao_exercicio.abstractfactory;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.abstractfactory.FabricaAbstrata;
import padroescriacao_exercicios.abstractfactory.FabricaFisica;
import padroescriacao_exercicios.abstractfactory.FabricaJuridica;
import padroescriacao_exercicios.abstractfactory.Pessoa;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    void deveEmitirDocumentacaoPessoaFisica(){
        FabricaAbstrata fabrica = new FabricaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Documentacao Pessoa Fisica", pessoa.emitirDocumentacao());
    }

    @Test
    void deveEmitirDocumentacaoPessoaJuridica(){
        FabricaAbstrata fabrica = new FabricaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Documentacao Pessoa Juridica", pessoa.emitirDocumentacao());
    }

}
