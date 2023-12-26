package colecoes.de.dados.listas.principal;

import colecoes.de.dados.listas.modelos.Filme;
import colecoes.de.dados.listas.modelos.Serie;
import colecoes.de.dados.listas.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Tropa de Elite", 2007);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);

        var filmeDoGean = new Filme("O Profissional", 1994);
        filmeDoGean.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoGean;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoGean);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Gean");
        buscaPorArtista.add("Carlos");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);


    }
}
