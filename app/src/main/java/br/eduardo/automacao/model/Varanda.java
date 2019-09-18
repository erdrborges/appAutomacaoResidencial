package br.eduardo.automacao.model;

public class Varanda {
    private Boolean lamp_balc_hall;
    private Boolean lamp_balc_liv;
    private Boolean lamp_balc_laundry;

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

    public Boolean getLamp_balc_laundry() {
        return lamp_balc_laundry;
    }

    public void setLamp_balc_laundry(Boolean lamp_balc_laundry) {
        this.lamp_balc_laundry = lamp_balc_laundry;
    }

    @Override
    public String toString(){
        return "Estrutura da Residência{" +
                " Varanda: [lamp_balc_hall: " + lamp_balc_hall + ", " + "lamp_balc_liv: " + lamp_balc_liv + ", " + "lamp_balc_laundry: " + lamp_balc_laundry +"]" +
                "}";
    }
}