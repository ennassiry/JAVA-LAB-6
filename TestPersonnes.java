package ma.projet;

import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;
import java.util.*;

public class TestPersonnes {
    public static void main(String[] args) {
        List<Personne> equipe = new ArrayList<>();
        equipe.add(new Developpeur("Mohammed", 15000));
        equipe.add(new Manager("Youness",      3000));
        equipe.add(new Developpeur("Yousra", 2200));

        // Affiche chaque personne via la méthode générique
        Utils.listerPersonnes(equipe);
    }
}
