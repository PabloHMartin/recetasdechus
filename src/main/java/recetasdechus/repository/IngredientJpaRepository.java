package recetasdechus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recetasdechus.entity.Ingredient;

public interface IngredientJpaRepository extends JpaRepository<Ingredient, Long> {
}
