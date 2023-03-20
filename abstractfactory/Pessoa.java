package padroescriacao_exercicios.abstractfactory;



public class Pessoa {

    private Documentacao documentacao;

    public Pessoa (FabricaAbstrata fabrica) {
        this.documentacao = fabrica.createDocumentacao();
    }

    public String emitirDocumentacao() {
        return this.documentacao.emitir();
    }

}
