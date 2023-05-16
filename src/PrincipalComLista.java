import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        Serie lost = new Serie("lost",2000);
        Filme outroFilme = new Filme("Avatar",2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        filmeDoPaulo.avalia(10);
        lista.add(meuFilme);
        meuFilme.avalia(5);
        lista.add(outroFilme);
        outroFilme.avalia(8);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme){
                System.out.println("Classificação: "+ filme.getClassificacao());
            }

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam sandler");
        buscaPorArtista.add("Lucas");
        buscaPorArtista.add("Biancaa");

        Collections.sort(buscaPorArtista);
        Collections.sort(lista);


        System.out.println(buscaPorArtista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
