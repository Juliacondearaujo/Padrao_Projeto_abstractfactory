package padroescriacao_exercicios.abstractfactory;


public class FabricaFisica implements FabricaAbstrata{

    @Override
    public Documentacao createDocumentacao() {return new DocumentacaoFisica();
    }
}
