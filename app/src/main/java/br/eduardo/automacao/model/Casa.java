package br.eduardo.automacao.model;

public class Casa {
    // Modelagem da estrura da residência

    // Corredor
    private Boolean lamp_bath;
    private Boolean lamp_cor;

    // Cozinha
    private Boolean lamp_kit;
    private Boolean lamp_laundry;

    // Garagem
    private Boolean gate_garage;
    private Boolean lamp_garage;

    // Living
    private Boolean lamp_dining;
    private Boolean lamp_hall;
    private Boolean lamp_living;

    // Quarto 1 (suíte)
//    private Boolean ar_bed_1;
//    private Boolean lamp_bed_1;
//    private Boolean lamp_closed_1;
//    private Boolean lamp_wc_1;

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

    public Boolean getLamp_closed() {
        return lamp_closed;
    }

    public void setLamp_closed(Boolean lamp_closed) {
        this.lamp_closed = lamp_closed;
    }

    public Boolean getLamp_wc() {
        return lamp_wc;
    }

    public void setLamp_wc(Boolean lamp_wc) {
        this.lamp_wc = lamp_wc;
    }



    // Quarto 2
    private Boolean ar_bed_2;
    private Boolean lamp_bed_2;

    // Quarto 3
    private Boolean ar_bed_3;
    private Boolean lamp_bed_3;

    // Varanda
    private Boolean lamp_balc_hall;
    private Boolean lamp_balc_liv;


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

    public Boolean getGate_garage() {
        return gate_garage;
    }

    public void setGate_garage(Boolean gate_garage) {
        this.gate_garage = gate_garage;
    }

    public Boolean getLamp_garage() {
        return lamp_garage;
    }

    public void setLamp_garage(Boolean lamp_garage) {
        this.lamp_garage = lamp_garage;
    }

    public Boolean getLamp_dining() {
        return lamp_dining;
    }

    public void setLamp_dining(Boolean lamp_dining) {
        this.lamp_dining = lamp_dining;
    }

    public Boolean getLamp_hall() {
        return lamp_hall;
    }

    public void setLamp_hall(Boolean lamp_hall) {
        this.lamp_hall = lamp_hall;
    }

    public Boolean getLamp_living() {
        return lamp_living;
    }

    public void setLamp_living(Boolean lamp_living) {
        this.lamp_living = lamp_living;
    }

//    public Boolean getAr_bed_1() {
//        return ar_bed_1;
//    }
//
//    public void setAr_bed_1(Boolean ar_bed_1) {
//        this.ar_bed_1 = ar_bed_1;
//    }
//
//    public Boolean getLamp_bed_1() {
//        return lamp_bed_1;
//    }
//
//    public void setLamp_bed_1(Boolean lamp_bed_1) {
//        this.lamp_bed_1 = lamp_bed_1;
//    }
//
//    public Boolean getLamp_closed_1() {
//        return lamp_closed_1;
//    }
//
//    public void setLamp_closed_1(Boolean lamp_closed_1) {
//        this.lamp_closed_1 = lamp_closed_1;
//    }
//
//    public Boolean getLamp_wc_1() {
//        return lamp_wc_1;
//    }
//
//    public void setLamp_wc_1(Boolean lamp_wc_1) {
//        this.lamp_wc_1 = lamp_wc_1;
//    }

    public Boolean getAr_bed_2() {
        return ar_bed_2;
    }

    public void setAr_bed_2(Boolean ar_bed_2) {
        this.ar_bed_2 = ar_bed_2;
    }

    public Boolean getLamp_bed_2() {
        return lamp_bed_2;
    }

    public void setLamp_bed_2(Boolean lamp_bed_2) {
        this.lamp_bed_2 = lamp_bed_2;
    }

    public Boolean getAr_bed_3() {
        return ar_bed_3;
    }

    public void setAr_bed_3(Boolean ar_bed_3) {
        this.ar_bed_3 = ar_bed_3;
    }

    public Boolean getLamp_bed_3() {
        return lamp_bed_3;
    }

    public void setLamp_bed_3(Boolean lamp_bed_3) {
        this.lamp_bed_3 = lamp_bed_3;
    }

    public Boolean getLamp_balc_hall() {
        return lamp_balc_hall;
    }

    public void setLamp_balc_hall(Boolean lamp_balc_hall) {
        this.lamp_balc_hall = lamp_balc_hall;
    }

    public Boolean getLamp_balc_liv() {
        return lamp_balc_liv;
    }

    public void setLamp_balc_liv(Boolean lamp_balc_liv) {
        this.lamp_balc_liv = lamp_balc_liv;
    }

    @Override
    public String toString(){
        return "Estrutura da Residência{" +
//                "Corredor: [lamp_bath: " + lamp_bath + ", " + "lamp_cor: " + lamp_cor + "]" +
//                " Cozinha: [lamp_kit: " + lamp_kit + ", " + "lamp_laundry: " + lamp_laundry + "]" +
//                " Garagem: [gate_garage: " + gate_garage + ", " + "lamp_garage: " + lamp_garage + "]" +
//                " Living: [lamp_dining: " + lamp_dining + ", " + "lamp_hall: " + lamp_hall + ", " + "lamp_living: " + lamp_living + "]" +
                " Quarto 1 (suíte): [ar_bed_1: " + ar_bed + ", " + "lamp_bed_1: " + lamp_bed + ", " + "lamp_closed_1: " + lamp_closed + ", " + "lamp_wc_1: " + lamp_wc + "]" +
//                " Quarto 2: [ar_bed_2: " + ar_bed_2 + ", " + "lamp_bed_2: " + lamp_bed_2 + "]" +
//                " Quarto 3: [ar_bed_3: " + ar_bed_3 + ", " + "lamp_bed_3: " + lamp_bed_3 + "]" +
//                " Varanda: [lamp_balc_hall: " + lamp_balc_hall + ", " + "lamp_balc_liv: " + lamp_balc_liv + "]" +
                "}";
    }
}