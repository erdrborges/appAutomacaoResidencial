package br.eduardo.automacao.model;

public class Garagem {
    private Boolean gate_garage;
    private Boolean lamp_garage;

    public Boolean getGate_garage() {
        return gate_garage;
    }

    public void setGate_garage(Boolean lamp_gate_garage) {
        this.gate_garage = lamp_gate_garage;
    }

    public Boolean getLamp_garage() {
        return lamp_garage;
    }

    public void setLamp_garage(Boolean lamp_garage) {
        this.lamp_garage = lamp_garage;
    }

    @Override
    public String toString(){
        return "Estrutura da Residência{" +
                " Garagem: [gate_garage: " + gate_garage + ", " + "lamp_garage: " + lamp_garage + "]" +
                "}";
    }
}
