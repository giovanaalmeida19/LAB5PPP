public class PrecoMaximoObserver implements InvestidorObserver {
    private AcaoBroker broker;
    private double precoMaximoVenda;

    public PrecoMaximoObserver(AcaoBroker broker, double precoMaximoVenda) {
        setBroker(broker);
        setPrecoMaximoVenda(precoMaximoVenda);
    }

    @Override
    public void update(String codigoAcao, double precoAtual) {
        if (precoAtual >= precoMaximoVenda) {
            broker.vender(codigoAcao, precoAtual);
        }
    }

    public AcaoBroker getBroker() {
        return broker;
    }

    public void setBroker(AcaoBroker broker) {
        this.broker = broker;
    }

    public double getPrecoMaximoVenda() {
        return precoMaximoVenda;
    }

    public void setPrecoMaximoVenda(double precoMaximoVenda) {
        this.precoMaximoVenda = precoMaximoVenda;
    }
}
