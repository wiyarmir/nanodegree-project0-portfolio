package es.guillermoorellana.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyToast(View view) {
        toast("This button will launch my Spotify app!");
    }

    private void toast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void scoresToast(View view) {
        toast("This button will launch my Scores app!");
    }

    public void libraryToast(View view) {
        toast("This button will launch my Library app!");
    }

    public void biggerToast(View view) {
        toast("This button will launch my Bigger app!");
    }

    public void readerToast(View view) {
        toast("This button will launch my Reader app!");
    }

    public void ownToast(View view) {
        toast("This button will launch my own app!");
    }
}
