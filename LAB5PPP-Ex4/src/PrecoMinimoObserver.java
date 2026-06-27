public class PrecoMinimoObserver implements InvestidorObserver {
    private AcaoBroker broker;
    private String nomeInvestidor;
    private double precoMinimoCompra;

    public PrecoMinimoObserver(AcaoBroker broker, double precoMinimoCompra) {
        setBroker(broker);
        setPrecoMinimoCompra(precoMinimoCompra);
    }

    @Override
    public void update(String codigoAcao, double precoAtual) {
        if (precoAtual <= precoMinimoCompra) {
            broker.comprar(codigoAcao, precoAtual);
        }
    }

    public AcaoBroker getBroker() {
        return broker;
    }

    public void setBroker(AcaoBroker broker) {
        this.broker = broker;
    }

    public String getNomeInvestidor() {
        return nomeInvestidor;
    }

    public void setNomeInvestidor(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }

    public double getPrecoMinimoCompra() {
        return precoMinimoCompra;
    }

    public void setPrecoMinimoCompra(double precoMinimoCompra) {
        this.precoMinimoCompra = precoMinimoCompra;
    }
}
