package br.diasapp.apublic.testeaprendizado.IntentStartActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import br.diasapp.apublic.testeaprendizado.R;

public class CharacterActivity extends AppCompatActivity {

    private Intent lastActivityIntent;
    private TextView labelText;
    private ViewGroup layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        /**
         * recuperamos os dados passados na transição adquirindo a intent e capturando os parâmetros Extras
         */
        lastActivityIntent = getIntent();
        String characterName = lastActivityIntent.getStringExtra(MainActivity.CHARACTER_NAME);
        String characterClass = lastActivityIntent.getStringExtra(MainActivity.CHARACTER_CLASS);

        /**
         * ao invés de recuperarmos um objeto view do layout criamos um e o inserimos na tela
         * não é necessário, é apenas para registro de diferentes formas de fazê-lo
         */
        labelText = new TextView(this);
        labelText.setText(characterName+" : "+characterClass);
        layout = (ViewGroup) findViewById(R.id.activity_character_layout);
        layout.addView(labelText);
    }
}
