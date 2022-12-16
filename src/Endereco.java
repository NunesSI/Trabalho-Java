public class Endereco {
    private String cep;
    private String cidade;
    private String logradouro;
    private String complento;
    private String uf;
    private String numero;

    public Endereco(String cep, String cidade, String logradouro, String complento, String uf, String numero){

        this.numero = numero;
        this.cep = cep;
        this.uf = uf;
        this.logradouro = logradouro;
        this.complento = complento;
        this.cidade = cidade;

    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplento() {
        return complento;
    }

    public void setComplento(String complento) {
        this.complento = complento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
