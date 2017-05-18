package br.diasapp.apublic.testaprendizado.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.diasapp.apublic.testeaprendizado.R;

/**
 * Created by dias on 17/05/17.
 */

public class Fragment extends android.support.v4.app.Fragment{

    /**
     * diferente de activities, tem como callback o método onCreateView
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment, container, false);
    }
}
