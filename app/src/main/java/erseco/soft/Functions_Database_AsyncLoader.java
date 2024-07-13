package erseco.soft;

import java.util.Locale;
import android.os.AsyncTask;

class Functions_Database_AsyncLoader extends AsyncTask<Object, Object, Object>{

	@Override
	protected Boolean doInBackground(Object... params) {
				
        String language = Functions_Settings.get_language(); 
        
 		if (language.equals("xx")) {
 			language = Locale.getDefault().getLanguage();
 		}

 		language = language.toLowerCase(Locale.US);
 		
         if (language.equals("es")) {
        	 MainActivity.instance.db = new Functions_DataBase_ES();
         } else if (language.equals("ca")) {
        	 MainActivity.instance.db = new Functions_DataBase_ES(); 
         } else if (language.equals("gl")) { //Gallego
	         MainActivity.instance.db = new Functions_DataBase_ES();  
	     } else if (language.equals("eu")) { //Euskera
	         MainActivity.instance.db = new Functions_DataBase_ES();        	 
         } else if (language.equals("pt")) {
        	 MainActivity.instance.db = new Functions_DataBase_PT();
         } else if (language.equals("fr")) {      	 
        	 MainActivity.instance.db = new Functions_DataBase_FR();
         } else if (language.equals("de")) {
        	 MainActivity.instance.db = new Functions_DataBase_DE(); 
         } else if (language.equals("it")) {
        	 MainActivity.instance.db = new Functions_DataBase_IT();        	 
         } else {
        	 MainActivity.instance.db = new Functions_DataBase_EN();
         }
                  
         MainActivity.instance.db.initQuestionList();
		
		return true;
	}
	
    @Override
    protected void onPreExecute() {

    }
    
    @Override
    protected void onPostExecute(Object result) {

    	//Ocultamos la ventana de cargando...
    	MainActivity.instance.pDialog.dismiss();
    	
    	//Cargamos la ventana de seleccionar categorias, pues ya se han cargado las preguntas
    	SelectDifficultyLoader.loadCategoryLayout();
  
    }



}
