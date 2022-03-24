public class Televisao implements Dispositivo {

    private boolean energiaLigada;
    private int volume;
    private int canal;

    public Televisao() {
        this.energiaLigada = false;
        this.volume = 50;
        this.canal = 1;
    }

    public String ligarOuDesligar() {
        if (this.energiaLigada == false) {
            this.energiaLigada = true;
            return "Televisão ligada.";
        }
        else {
            this.energiaLigada = false;
            return "Televisão desligada.";
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        }
        else if (volume < 0) {
            this.volume = 0;
        }
        else {
            this.volume = volume;
        }
    }

    @Override
    public int getCanal() {
        return this.canal;
    }

    @Override
    public void setCanal(int canal) {
        if (canal > 10) {
            this.canal = 1;
        }
        else if (canal < 1) {
            this.canal = 10;
        }
        else {
            this.canal = canal;
        }
    }
}
