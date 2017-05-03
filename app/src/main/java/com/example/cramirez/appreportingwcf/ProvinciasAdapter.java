package com.example.cramirez.appreportingwcf;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.ReportingService.QUERY_Provincias_Result;

import java.util.List;

/**
 * Created by cramirez on 26/04/2017.
 */

public class ProvinciasAdapter extends ArrayAdapter<QUERY_Provincias_Result> {

    public ProvinciasAdapter(Context context, int resource, List<QUERY_Provincias_Result> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Obtenim l'objecte en la possició corresponent
        QUERY_Provincias_Result p  = getItem(position);
        Log.w("XXXX", p.toString());
        // Mirem a veure si la View s'està reusant, si no es així "inflem" la View
        // https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView#row-view-recycling
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.provincias_item_layout, parent, false);
        }

        // Unim el codi en les Views del Layout
        TextView nombre = (TextView) convertView.findViewById(R.id.txtNombre);
        TextView codigo = (TextView) convertView.findViewById(R.id.txtCodigoCorreo);

        // Fiquem les dades dels objectes (provinents del JSON) en el layout
        nombre.setText(p.nombre);
        codigo.setText(p.codigoCorreos);


        // Retornem la View replena per a mostrarla
        return convertView;
    }
}
