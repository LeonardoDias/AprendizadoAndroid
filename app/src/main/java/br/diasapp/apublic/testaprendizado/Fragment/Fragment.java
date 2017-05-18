package br.diasapp.apublic.testaprendizado.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import br.diasapp.apublic.testeaprendizado.R;

/**
 * Created by dias on 17/05/17.
 */

public class Fragment extends android.support.v4.app.Fragment{


    /**
     * para um fragment enviar um dado ou requisição à uma activity, deve-se utilizar uma interface
     * que faça essa conexão
     */

    private FragmentInterface mCallback;
    private TextView textViewFragment;
    private Button buttonUpdateTextView;

    /**
     * diferente de activities, tem como callback o método onCreateView de início ao invés de onCreate
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment, container, false);
        textViewFragment = (TextView) view.findViewById(R.id.textViewFragment);
        buttonUpdateTextView = (Button) view.findViewById(R.id.buttonUpdateFragment);

        /**
         * ao clicarmos no button o texto de textView é atualizado de acordo com o valor em activity
         */

        buttonUpdateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTextView(mCallback.getActivityText());
            }
        });

        return view;
    }

    /**
     * onAttach ocorre no vínculo entre o fragment e a activity, por isso a conexão do callback é feita neste momento
     * caso a activity não implemente a interface, uma ClassCastException será jogada
     */

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        mCallback = (FragmentInterface) getActivity();
    }

    public void updateTextView(String text){
        textViewFragment.setText(text);
    }
}
