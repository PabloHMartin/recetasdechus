package recetasdechus.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import recetasdechus.entity.Family;
import recetasdechus.entity.Ingredient;
import recetasdechus.entity.Recipe;

import java.io.Serializable;
import java.util.List;

@Repository
@Qualifier("recipeJpaRepository")
public interface RecipeJpaRepository extends JpaRepository<Recipe, Serializable>{

}
