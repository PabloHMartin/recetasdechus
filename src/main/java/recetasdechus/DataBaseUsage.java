package recetasdechus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataBaseUsage implements CommandLineRunner{

    @Autowired
    private RecipeRepository repository;

    @Override
    public void run(String... args) throws Exception {

    }
}
