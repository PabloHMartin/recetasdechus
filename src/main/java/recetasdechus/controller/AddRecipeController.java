package recetasdechus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import recetasdechus.entity.Family;
import recetasdechus.entity.Ingredient;
import recetasdechus.entity.Recipe;
import recetasdechus.service.RecipeService;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller("/crud")
public class AddRecipeController {

    private final String ADD_RECIPE = "addRecipe";
    private final String ADD_RECIPE_RESULT = "addRecipeResult";

    @Autowired
    @Qualifier("recipeServiceImp")
    private RecipeService recipeService;


/*	@PostConstruct
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
*/

    @GetMapping("/crud")
    public ModelAndView printForm() {
        ModelAndView modelAndView = new ModelAndView(ADD_RECIPE);
        modelAndView.addObject("recipe", new Recipe());
        return modelAndView;
    }

    @PostMapping("/processForm")
    public void processForm(@ModelAttribute(name = "recipe") Recipe recipe){
        recipeService.saveRecipe(recipe);
        printForm();
    }

}
