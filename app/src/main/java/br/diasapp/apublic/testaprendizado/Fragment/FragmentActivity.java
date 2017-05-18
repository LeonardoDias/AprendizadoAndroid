package br.diasapp.apublic.testaprendizado.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.diasapp.apublic.testeaprendizado.R;

/**
 * A activity que vai incorporar um Fragment pode extender de FragmentActivity ou AppCompatActivity, se for compativel com API 7 ou maior
 */
public class FragmentActivity extends AppCompatActivity implements FragmentInterface{


    private Fragment fragment;
    private EditText editTextFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        editTextFragment = (EditText) findViewById(R.id.editTextFragment);
        fragment = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
    }

    @Override
    public String getActivityText() {
        return editTextFragment.getText().toString();
    }

    /**
     * um método para servir como callback quando um touch for executado em um botão
     */

    public void updateFragmentText(View view){
        fragment.updateTextView(editTextFragment.getText().toString());
    }
}
