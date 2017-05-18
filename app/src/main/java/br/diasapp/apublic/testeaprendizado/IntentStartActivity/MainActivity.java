package br.diasapp.apublic.testeaprendizado.IntentStartActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import br.diasapp.apublic.testeaprendizado.R;

/**
 * Created by dias on 17/05/17.
 */

public class MainActivity extends AppCompatActivity {

    private Intent changeActivityIntent;
    private EditText characterNameView;
    private Spinner characterClassView;

    private ArrayAdapter<CharSequence> arrayAdapter;

    public static final String CHARACTER_NAME = "char_name";
    public static final String CHARACTER_CLASS = "char_class";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Temos um Spinner em nossa view, para preenchê-la precisamos de um adapter pré definido com um array
         * O array de string é definido em strings.xml
         */

        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.classes_array, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        characterClassView = (Spinner) findViewById(R.id.characterClass);
        characterClassView.setAdapter(arrayAdapter);

    }

    /**
     *
     * @param view objeto responsável por iniciar a action que chamou o método
     */
    public void callActivity(View view){

        changeActivityIntent = new Intent(this, CharacterActivity.class);
        characterNameView = (EditText) findViewById(R.id.characterName);
        characterClassView = (Spinner) findViewById(R.id.characterClass);

        /**
         * o getText() de characterNameView é um Editable herdeirod e View, portanto, é necessário requisitar seu texto com toString()
         */

        String characterName = characterNameView.getText().toString();

        /**
         *  os itens armazenados no spinner são Strings, então podemos simplesmente obter o item selecionado e aplicar o cast
         */

        String characterClass = (String) characterClassView.getSelectedItem();

        changeActivityIntent.putExtra(CHARACTER_NAME,characterName);
        changeActivityIntent.putExtra(CHARACTER_CLASS,characterClass);

        /**
         * startActivity invoca a activity incorporada na intent, contudo mantém a activity atual pausada
         * utiliza-se finish() caso deseja-se finalizar a intent atual
         */
        startActivity(changeActivityIntent);
        //finish();
    }
}
