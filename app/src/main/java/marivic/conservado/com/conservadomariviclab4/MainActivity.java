package marivic.conservado.com.conservadomariviclab4;

import android.support.design.widget.Snackbar;
import android.support.v13.view.DragStartHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate() has been executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart() has been executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume() has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause() has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop() has been executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "onRestart() has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE", "onDestroy() has executed");
    }

    public void showNext (View v){
        //Toast.makeText(this, "Heyy", Toast.LENGTH_LONG).show();
        //Snackbar.make(v, "Hey", SnackBar.LENGTH_LONG).show();
        Snackbar.make(v, "You have clicked next.", Snackbar.LENGTH_LONG).show();
    }


    public void showBack (View v){
        Toast.makeText(this, "You have clicked back.", Toast.LENGTH_LONG).show();
        //Snackbar.make(v, "Hey", SnackBar.LENGTH_LONG).show();
        //Snackbar.make(v, "Heyyyyy!", Snackbar.LENGTH_LONG).show();
    }
}
