package br.eduardo.automacao.model;

public class Quarto1 {
    private Boolean ar_bed;
    private Boolean lamp_bed;
    private Boolean lamp_closed;
    private Boolean lamp_wc;


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

    public Boolean getLamp_closet() {
        return lamp_closed;
    }

    public void setLamp_closet(Boolean lamp_closed) {
        this.lamp_closed = lamp_closed;
    }

    public Boolean getLamp_wc() {
        return lamp_wc;
    }

    public void setLamp_wc(Boolean lamp_wc) {
        this.lamp_wc = lamp_wc;
    }

    @Override
    public String toString(){
        return "Estrutura da Residência{" +
                " Quarto 1 (suíte): [ar_bed: " + ar_bed + ", " + "lamp_bed: " + lamp_bed + ", " + "lamp_closed: " + lamp_closed + ", " + "lamp_wc: " + lamp_wc + "]" +
                "}";
    }
}

