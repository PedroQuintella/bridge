import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleRadioTest {

    @Test
    void deveRetornarRadioLigado() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        assertEquals("Rádio ligado.", controleRemoto.ligarOuDesligar());
    }

    @Test
    void deveRetornarRadioDesligado() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals("Rádio desligado.", controleRemoto.ligarOuDesligar());
    }

    @Test
    void deveRetornarProximoCanal() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals(2, controleRemoto.passarCanal());
    }

    @Test
    void deveRetornarCanalAnterior() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals(10, controleRemoto.voltarCanal());
    }

    @Test
    void deveRetornarPrimeiroCanalAposPassarPeloUltimo() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        controleRemoto.ligarOuDesligar();
        controleRemoto.passarCanal();
        controleRemoto.passarCanal();
        controleRemoto.passarCanal();
        controleRemoto.passarCanal();
        controleRemoto.passarCanal();
        controleRemoto.passarCanal();
        controleRemoto.passarCanal();
        controleRemoto.passarCanal();
        controleRemoto.passarCanal();
        assertEquals(1, controleRemoto.passarCanal());
    }

    @Test
    void deveRetornarValorVolumeAumentado() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals(55, controleRemoto.aumentarVolume());
    }

    @Test
    void deveRetornarValorVolumeDiminuido() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals(45, controleRemoto.diminuirVolume());
    }

    @Test
    void deveRetornarVolumeMaximoDeCem() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        controleRemoto.ligarOuDesligar();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        assertEquals(100, controleRemoto.aumentarVolume());
    }

    @Test
    void deveRetornarVolumeMinimoDeZero() {
        Dispositivo dispositivo = new Radio();
        ControleRemoto controleRemoto = new ControleRadio(dispositivo);
        controleRemoto.ligarOuDesligar();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        controleRemoto.diminuirVolume();
        assertEquals(0, controleRemoto.diminuirVolume());
    }
}