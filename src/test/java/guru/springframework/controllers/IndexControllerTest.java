package guru.springframework.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;

import guru.springframework.services.RecipeService;

@RunWith(MockitoJUnitRunner.class)
public class IndexControllerTest {
	
	@Mock
	Model model;
	
	@Mock
	RecipeService recipeService;
	
	IndexController indexController;

	@Before
	public void setUp() throws Exception {
		indexController = new IndexController(recipeService);
	}

	@Test
	public void testGetIndexPage() {
		String indexPage = indexController.getIndexPage(model);
		assertEquals("index", indexPage);
		
		Mockito.verify(recipeService, Mockito.times(1)).getRecipes();
		Mockito.verify(model, Mockito.times(1)).addAttribute(Mockito.eq("recipes"), Mockito.anySet());
	}

}
