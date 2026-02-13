package sn.edu.isepat.eboutique.init;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitCategorie implements CommandLineRunner {

    private final CategorieRepository categorieRepository;

    @Override
    public void run(String... args) throws Exception {

        String nomCategorie = "ELECTROMENAGER-FAYE-ELHADJI";

        if (categorieRepository.findByNom(nomCategorie) == null) {

            Categorie categorie = new Categorie();
            categorie.setNom(nomCategorie);

            categorieRepository.save(categorie);

            System.out.println("Catégorie créée !");
        }
    }
}

