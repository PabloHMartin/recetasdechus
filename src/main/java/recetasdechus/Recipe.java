package recetasdechus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
    @Column(name = "name")
	private String name;
	private String elaboration;
	private String thumbnail;
	private String photo;

	@ManyToMany(mappedBy = "recipes")
	private List<Family> families = new ArrayList<>();

	@ManyToMany(mappedBy = "recipes")
	private List<Ingredient> ingredients = new ArrayList<>();

	public Recipe() {}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Recipe(String name, String elaboration,String thumbnail, String photo) {
		this.name = name;
		this.elaboration = elaboration;
		this.thumbnail = thumbnail;
		this.photo = photo;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List<Family> getFamilies() {
		return families;
	}

	public void setFamilies(List<Family> families) {
		this.families = families;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getElaboration() {
		return elaboration;
	}

	public void setElaboration(String elaboration) {
		this.elaboration = elaboration;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
