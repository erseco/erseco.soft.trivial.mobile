package erseco.soft;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

public  class Functions_MesageBox_Rate {

	public static void ShowMessageBoxRate(Context context){
	
	AlertDialog.Builder builder = new AlertDialog.Builder(context);
	builder.setMessage("Valora la aplicación en Google Play!")
	.setCancelable(false)
	       .setPositiveButton("Vale, ir a Google Play", new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	                dialog.cancel();
	            MainActivity.instance.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=erseco.soft") ) );     
	           }
	       })
	       .setNegativeButton("Ahora no", new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
		       		dialog.cancel();
	           }
	       });
	AlertDialog alert = builder.create();
	alert.show();
	}
}
