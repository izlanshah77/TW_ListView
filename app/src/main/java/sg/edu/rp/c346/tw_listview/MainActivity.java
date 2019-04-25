package sg.edu.rp.c346.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvYears;
    ArrayList<String> Years;
    ArrayAdapter<String> aaYears;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvYears = findViewById(R.id.lvYear);

        Years = new ArrayList<>();
        Years.add("Year 1");
        Years.add("Year 2");
        Years.add("Year 3");

        aaYears = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, Years);
        lvYears.setAdapter(aaYears);

        lvYears.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("selected", i+1);
                startActivity(intent);
            }
        });






    }
}
