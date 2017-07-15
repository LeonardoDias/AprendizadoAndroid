package br.diasapp.apublic.testeaprendizado.DynamicList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.diasapp.apublic.testeaprendizado.R;

public class dynamicactivity extends AppCompatActivity {

    private ListView dynamicList;
    private List<DataClass> dataClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamicactivity);

        dataClassList = new ArrayList<>();
        fillDataClassList();

        /**
         * pega o listView e passa o adapter à ele para ser reproduzido
         */
        dynamicList = (ListView) findViewById(R.id.dynamicList);
        dynamicList.setAdapter(new myadapter(this.getBaseContext(),dataClassList));
        dynamicList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataClass data = (DataClass) dynamicList.getAdapter().getItem(position);
                Toast.makeText(getBaseContext(), data.getName(), Toast.LENGTH_LONG).show();
                /**
                 * Insira aqui o que você quer fazer
                 */
            }
        });
    }

    private void fillDataClassList(){
        int count = 1;
        while(count < 10){
            dataClassList.add(new DataClass("Activity"+count,String.valueOf(count),String.valueOf(count+1)));
            count++;
        }
    }
}
