package sg.edu.rp.c346.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvModules;
    TextView tvYear;
    ArrayList<Module> year;
    ArrayAdapter<Module> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvModules = findViewById(R.id.lvModules);
        tvYear = findViewById(R.id.tvYear);

        Intent i = getIntent();
        int selected = i.getIntExtra("selected",0);

        year = new ArrayList<Module>();

        if(selected == 1){
            year.add(new Module("Year 1 Mod 1", false));
            year.add(new Module("Year 1 Mod 2", false));
            year.add(new Module("Year 1 Mod 3", false));
            aa = new ModuleAdapter(this, R.layout.row, year);
            lvModules.setAdapter(aa);

        }else if(selected == 2){
            year.add(new Module("Year 2 Mod 1", false));
            year.add(new Module("Year 2 Mod 2", false));
            year.add(new Module("Year 2 Mod 3", false));
            aa = new ModuleAdapter(this, R.layout.row, year);
            lvModules.setAdapter(aa);

        }else{
            year.add(new Module("Year 3 Mod 1", false));
            year.add(new Module("Year 3 Mod 2", false));
            year.add(new Module("Year 3 Mod 3", false));
            aa = new ModuleAdapter(this, R.layout.row, year);
            lvModules.setAdapter(aa);
        }




    }
}
