package br.eduardo.automacao.model;

public class Living {
    private Boolean lamp_dining;
    private Boolean lamp_hall;
    private Boolean lamp_living;

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

    @Override
    public String toString(){
        return "Estrutura da Residência{" +
                " Living: [lamp_dining: " + lamp_dining + ", " + "lamp_hall: " + lamp_hall + ", " + "lamp_living: " + lamp_living + "]" +
                "}";
    }
}