package br.banco.services.fund.domain.national;


public class Conteiner<T> {

    private final Class<T> type;
    public String Value;

    public Conteiner (String Value, Class<T> type) {
        this.type = type;
        this.Value = Value;
    }

    public Class<T> getType() {
        return this.type;
    }

}
