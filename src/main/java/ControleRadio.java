public class ControleRadio extends ControleRemoto {

    public ControleRadio(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public String ligarOuDesligar() {
        return this.dispositivo.ligarOuDesligar();
    }

    public int aumentarVolume() {
        this.dispositivo.setVolume(this.dispositivo.getVolume() + 5);
        return this.dispositivo.getVolume();
    }

    public int diminuirVolume() {
        this.dispositivo.setVolume(this.dispositivo.getVolume() - 5);
        return this.dispositivo.getVolume();
    }

    public int passarCanal() {
        this.dispositivo.setCanal(this.dispositivo.getCanal() + 1);
        return this.dispositivo.getCanal();
    }

    public int voltarCanal() {
        this.dispositivo.setCanal(this.dispositivo.getCanal() - 1);
        return this.dispositivo.getCanal();
    }
}
