package br.eduardo.automacao.model;

public class Quarto2 {
    private Boolean ar_bed;
    private Boolean lamp_bed;

    public Boolean getAr_bed() {
        return ar_bed;
    }

    public void setAr_bed(Boolean ar_bed) {
        this.ar_bed = ar_bed;
    }

    public Boolean getLamp_bed() {
        return lamp_bed;
    }

    public void setLamp_bed(Boolean lamp_bed) {
        this.lamp_bed = lamp_bed;
    }

    @Override
    public String toString(){
        return "Estrutura da Residência{" +
                " Quarto 2 (suíte): [ar_bed: " + ar_bed + ", " + "lamp_bed: " + lamp_bed + "]" +
                "}";
    }
}


