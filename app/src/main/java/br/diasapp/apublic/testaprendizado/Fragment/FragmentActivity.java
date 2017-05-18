package br.diasapp.apublic.testaprendizado.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.diasapp.apublic.testeaprendizado.R;

/**
 * A activity que vai incorporar um Fragment pode extender de FragmentActivity ou AppCompatActivity, se for compativel com API 7 ou maior
 */
public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
