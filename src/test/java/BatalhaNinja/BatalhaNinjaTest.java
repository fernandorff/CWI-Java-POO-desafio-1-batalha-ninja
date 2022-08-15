package BatalhaNinja;

import org.junit.Assert;
import org.junit.Test;

public class BatalhaNinjaTest {

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakraParaAtacar() {
        Jutsu hasengan = new Jutsu("Hasengan", 3, 6);
        Jutsu chidori = new Jutsu("Chidori", 3, 5);

        Ninja naruto = new Ninja("Naruto", hasengan);
        Ninja sasuke = new Ninja("Sasuke", chidori);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(naruto,sasuke);

        Assert.assertEquals(naruto,ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu hasengan = new Jutsu("Hasengan", 3, 6);
        Ninja naruto = new Ninja("Naruto", hasengan);

        Jutsu chidori = new Jutsu("Chidori", 3, 5);
        Ninja sasuke = new Ninja("Sasuke", chidori);

        naruto.atacar(sasuke);

        int nivelChakraEsperado = 94;

        Assert.assertEquals(nivelChakraEsperado,sasuke.chakraDoNinja);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu amaterasu = new Jutsu("Amaterasu", 4, 9);
        Ninja itachi = new Ninja("Itachi", amaterasu);

        Jutsu chidori = new Jutsu("Chidori", 3, 5);
        Ninja sasuke = new Ninja("Sasuke", chidori);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(itachi,sasuke);

        Assert.assertEquals(itachi,ninjaVencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu amaterasu = new Jutsu("Amaterasu", 4, 9);
        Ninja itachi = new Ninja("Itachi", amaterasu);

        Jutsu chidori = new Jutsu("Chidori", 3, 5);
        Ninja sasuke = new Ninja("Sasuke", chidori);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(sasuke,itachi);

        Assert.assertEquals(itachi,ninjaVencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoEmpatar() {
        Jutsu chidori = new Jutsu("Chidori", 3, 5);

        Ninja sasuke = new Ninja("Sasuke", chidori);

        Ninja kakashi = new Ninja("Itachi", chidori);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(sasuke,kakashi);

        Assert.assertEquals(sasuke,ninjaVencedor);
    }


}
