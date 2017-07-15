package br.diasapp.apublic.testeaprendizado.DynamicList;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.diasapp.apublic.testeaprendizado.R;

/**
 * Created by dias on 10/07/17.
 */


/**
 * Um adapter serve para intermediar uma lista de objetos com uma activity que os apresentará ao usuário
 */

public class myadapter extends BaseAdapter {

    private Context context;
    private List<DataClass> dataArray;

    public myadapter(Context context, List<DataClass> dataArray){
        this.context = context;
        this.dataArray = dataArray;
    }

    @Override
    public int getCount() {
        return dataArray.size();
    }

    @Override
    public Object getItem(int position) {
        return dataArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     *
     * @return a View que vai ser inserida na activity
     */
    @Override
    public View getView(int position, View convertView, ViewGroup container) {
        DataClass data = dataArray.get(position);
        View mDataClassItemList = null;
        TextView mNameView = null;
        TextView mValueView = null;
        String mValue = "";

        /**
         * Verifica se já foi "inflada" alguma vez para evitar processamento desnecessário
         */
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mDataClassItemList = inflater.inflate(R.layout.dynamiclist_model, null);
        } else
            mDataClassItemList = convertView;

        mNameView = (TextView) mDataClassItemList.findViewById(R.id.name);
        mValueView = (TextView) mDataClassItemList.findViewById(R.id.value);

        mValue = data.getInitial_hour();
        mValue = mValue.concat("-");
        mValue = mValue.concat(data.getFinal_hour());

        mNameView.setText(data.getName());
        mValueView.setText(mValue);

        return mDataClassItemList;
    }


}
