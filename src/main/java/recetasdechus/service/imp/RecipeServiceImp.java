package recetasdechus.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import recetasdechus.entity.Recipe;
import recetasdechus.repository.RecipeJpaRepository;
import recetasdechus.service.RecipeService;


@Service
@Qualifier("recipeServiceImp")
public class RecipeServiceImp implements RecipeService{

    @Autowired
    @Qualifier("recipeJpaRepository")
    RecipeJpaRepository recipeJpaRepository;

    @Override
    public void saveRecipe(Recipe recipe) {
        recipeJpaRepository.saveRecipe(recipe);

    }
}
