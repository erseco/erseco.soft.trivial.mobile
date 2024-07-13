package erseco.soft;

import java.util.ArrayList;
import java.util.LinkedList;
import android.content.Context;
import android.widget.ArrayAdapter;

class Functions_Categories {

	protected static String GetCategoryName(int id) {

		String r = "";

		switch (id) {

		case 1:
			r = MainActivity.instance.getString(R.string.category_art);
			break;

		case 2:
			r = MainActivity.instance.getString(R.string.category_science);
			break;

		case 3:
			r = MainActivity.instance.getString(R.string.category_sports);
			break;

		case 4:
			r = MainActivity.instance.getString(R.string.category_entertainment);
			break;

		case 5:
			r = MainActivity.instance.getString(R.string.category_geography);
			break;

		case 6:
			r = MainActivity.instance.getString(R.string.category_history);
			break;

		}

		return r;
	}

	protected static int GetCategoryBackground(int id) {

		int res = 0;

		switch (id) {
		case 1:
			res = R.drawable.category_brown;
			break;
		case 2:
			res = R.drawable.category_green;
			break;
		case 3:
			res = R.drawable.category_orange;
			break;
		case 4:
			res = R.drawable.category_pink;
			break;
		case 5:
			res = R.drawable.category_blue;
			break;
		case 6:
			res = R.drawable.category_yellow;
			break;
		}
		return res;
	}
	
	protected static ArrayAdapter<Category> GetCategoriesAdapter(Context context){
		
		//Creamos la lista
		LinkedList<Category> categories = new LinkedList<Category>();
		//La poblamos con los ejemplos
		categories.add(new Category(1, context.getString(R.string.category_art )));
		categories.add(new Category(2, context.getString(R.string.category_science )));
		categories.add(new Category(3, context.getString(R.string.category_sports )));
		categories.add(new Category(4, context.getString(R.string.category_entertainment )));
		categories.add(new Category(5, context.getString(R.string.category_geography )));
		categories.add(new Category(6, context.getString(R.string.category_history )));
		
		//Creamos el adaptador
		ArrayAdapter<Category> adapter = new ArrayAdapter<Category>(context, android.R.layout.simple_list_item_1, categories);
		//Añadimos el layout para el menú y se lo damos al spinner
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		return adapter;
		
	}
	
	protected static ArrayAdapter<Category> GetReasonsAdapter(Context context){
		
		//Creamos la lista
		LinkedList<Category> categories = new LinkedList<Category>();
		//La poblamos con los ejemplos
		categories.add(new Category(0, context.getString(R.string.reason_select_reason )));
		categories.add(new Category(1, context.getString(R.string.reason_wrong_answer )));
		categories.add(new Category(2, context.getString(R.string.reason_wrong_category )));
		categories.add(new Category(3, context.getString(R.string.reason_wrong_question )));
		categories.add(new Category(4, context.getString(R.string.reason_wrong_difficulty )));
				
		
		//Creamos el adaptador
		ArrayAdapter<Category> adapter = new ArrayAdapter<Category>(context, android.R.layout.simple_list_item_1, categories);
		//Añadimos el layout para el menú y se lo damos al spinner
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		return adapter;
		
	}	
	
	protected static ArrayAdapter<Category> GetDifficultyAdapter(Context context){
		
		//Creamos la lista
		LinkedList<Category> categories = new LinkedList<Category>();
		//La poblamos con los ejemplos
		categories.add(new Category(1, context.getString(R.string.difficulty_easy )));
		categories.add(new Category(2, context.getString(R.string.difficulty_medium )));
		categories.add(new Category(3, context.getString(R.string.difficulty_hard )));

		
		//Creamos el adaptador
		ArrayAdapter<Category> adapter = new ArrayAdapter<Category>(context, android.R.layout.simple_list_item_1, categories);
		//Añadimos el layout para el menú y se lo damos al spinner
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		return adapter;
		
	}	
	
	protected  static ArrayList<String> GetCategoriesArray(Context context) {
		
		ArrayList<String> items = new ArrayList<String>();

		items.add(context.getString(R.string.category_art));
		items.add(context.getString(R.string.category_science));
		items.add(context.getString(R.string.category_sports));
		items.add(context.getString(R.string.category_entertainment));
		items.add(context.getString(R.string.category_geography));
		items.add(context.getString(R.string.category_history));
	
		return items;
		
	}
	
	
}
