package cc.raupach.android;

import org.apache.commons.math.util.BigReal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;



public class HelloAndroidActivity extends Activity
{

   private static String TAG = "my-android-application";

   /**
    * Called when the activity is first created.
    * 
    * @param savedInstanceState
    *           If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
    */
   @Override
   public void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      
      BigReal sd = BigReal.ONE;
      Log.i(TAG, "onCreate "+sd.toString());
      
//      Hello h = new Hello();
//      Log.i(TAG, "onCreate :"+h.world());
      setContentView(R.layout.main);
   }

}
