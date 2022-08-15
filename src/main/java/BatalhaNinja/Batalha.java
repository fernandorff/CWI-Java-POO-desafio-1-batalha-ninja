package BatalhaNinja;

public class Batalha {

    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja) {
        for (int i = 0; i < 3; i++) {
            primeiroNinja.atacar(segundoNinja);
            segundoNinja.atacar(primeiroNinja);
        }
        if (primeiroNinja.chakraDoNinja >= segundoNinja.chakraDoNinja) {
            return primeiroNinja;
        } else {
            return segundoNinja;
        }
    }
}

