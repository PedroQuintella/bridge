public abstract class ControleRemoto {

    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract String ligarOuDesligar();

    public abstract int aumentarVolume();

    public abstract int diminuirVolume();

    public abstract int passarCanal();

    public abstract int voltarCanal();
}
