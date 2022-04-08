package com.example.trabajofinal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class vehiculos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculos);
    ActionBar actionbar = getSupportActionBar();
    actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

    ActionBar.Tab tab1 = actionbar.newTab().setText("Nuevo");
    tab1.setTabListener(new MyTabListener(new Nuevovehiculo()));
    actionbar.addTab(tab1);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_vehiculos, menu);

        MenuItem item = menu.findItem(R.id.buscar);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(onSearch());
        return true;
    }

    private SearchView.OnQueryTextListener onSearch(){
        return new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        };
    }


    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.buscar){

        }else if (item.getItemId() == R.id.config){

        }
        return super.onOptionsItemSelected(item);
    }


}