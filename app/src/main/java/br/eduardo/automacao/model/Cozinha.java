package br.eduardo.automacao.model;

public class Cozinha {
    private Boolean lamp_kit;
    private Boolean lamp_laundry;

    public Boolean getLamp_kit() {
        return lamp_kit;
    }

    public void setLamp_kit(Boolean lamp_kit) {
        this.lamp_kit = lamp_kit;
    }

    public Boolean getLamp_laundry() {
        return lamp_laundry;
    }

    public void setLamp_laundry(Boolean lamp_laundry) {
        this.lamp_laundry = lamp_laundry;
    }

    @Override
    public String toString(){
        return "Estrutura da Residência{" +
                " Cozinha e Lavanderia: [lamp_kit: " + lamp_kit + ", " + "lamp_laundry: " + lamp_laundry + "]" +
                "}";
    }
}