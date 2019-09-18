package br.eduardo.automacao.model;

public class Corredor {
    private Boolean lamp_bath;
    private Boolean lamp_cor;

    public Boolean getLamp_bath() {
        return lamp_bath;
    }

    public void setLamp_bath(Boolean lamp_bath) {
        this.lamp_bath = lamp_bath;
    }

    public Boolean getLamp_cor() {
        return lamp_cor;
    }

    public void setLamp_cor(Boolean lamp_cor) {
        this.lamp_cor = lamp_cor;
    }

    @Override
    public String toString(){
        return "Estrutura da Residência{" +
                " Corredor: [lamp_bath: " + lamp_bath + ", " + "lamp_cor: " + lamp_cor + "]" +
                "}";
    }
}