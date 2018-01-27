package recetasdechus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@Controller
public class AddRecipeController {
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private FamilyRepository familyRepository;

	@Autowired
	private IngridientRepository ingredientRepository;


	@PostConstruct
	public void init(){


		Recipe recipe2 = new Recipe("Pisto","atope", "e","sa");
		Recipe recipe = new Recipe("Croquetas", "Mezclar todo", "thumbnail", "photo");

		recipeRepository.save(recipe2);
		recipeRepository.save(recipe);
		Family family = new Family("tipicas");
		Family family2 = new Family("legumbre");
        Ingredient ingrediente = new Ingredient("Queso");
        ingrediente.getRecipes().add(recipe);
        ingredientRepository.save(ingrediente);
		family.getRecipes().add(recipe);
		family2.getRecipes().add(recipe);
		family2.getRecipes().add(recipe2);
		familyRepository.save(family);
		familyRepository.save(family2);
	}
	
	@RequestMapping("/addRecipe")
	public String addRecipe(Model model) {


		return "addRecipe";
	}

	@RequestMapping("/saveRecipe")
	public String saveRecipe(Recipe recipe) {


		recipeRepository.save(recipe);

		return "saveRecipe";
	}
	
	@RequestMapping("/showRecipes")
	public String showRecipes(Model model) {


		
		return "showRecipes";
	}
}
