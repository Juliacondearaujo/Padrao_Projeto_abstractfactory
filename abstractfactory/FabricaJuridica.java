package padroescriacao_exercicios.abstractfactory;

public class FabricaJuridica implements FabricaAbstrata{

    @Override
    public Documentacao createDocumentacao() {return new DocumetacaoJuridica();
    }
}
