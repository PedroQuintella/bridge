import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleTVTest {

    @Test
    void deveRetornarTelevisaoLigada() {
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
        assertEquals("Televisão ligada.", controleRemoto.ligarOuDesligar());
    }

    @Test
    void deveRetornarTelevisaoDesligada() {
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals("Televisão desligada.", controleRemoto.ligarOuDesligar());
    }

    @Test
    void deveRetornarProximoCanal() {
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals(2, controleRemoto.passarCanal());
    }

    @Test
    void deveRetornarCanalAnterior() {
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals(10, controleRemoto.voltarCanal());
    }

    @Test
    void deveRetornarPrimeiroCanalAposPassarPeloUltimo() {
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
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
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals(55, controleRemoto.aumentarVolume());
    }

    @Test
    void deveRetornarValorVolumeDiminuido() {
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
        controleRemoto.ligarOuDesligar();
        assertEquals(45, controleRemoto.diminuirVolume());
    }

    @Test
    void deveRetornarVolumeMaximoDeCem() {
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
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
        Dispositivo dispositivo = new Televisao();
        ControleRemoto controleRemoto = new ControleTV(dispositivo);
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