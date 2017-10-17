package guru.springframework;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import guru.springframework.domain.Category;
import guru.springframework.domain.Recipe;

public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}

	private void initData() {

	}

}
