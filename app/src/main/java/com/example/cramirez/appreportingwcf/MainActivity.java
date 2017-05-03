package com.example.cramirez.appreportingwcf;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.ReportingService.*;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.ReportingService.ReportingService;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;


public class MainActivity extends AppCompatActivity  implements com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.ReportingService.IWsdl2CodeEvents {

    private ArrayList<QUERY_Provincias_Result> provincias;
    private TextView txt;
    private Button bt;
    private ProvinciasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ListView listViewProvincias = (ListView) findViewById(R.id.listaProvincias);


        txt = (TextView) findViewById(R.id.txtDatos);
        bt =(Button) findViewById(R.id.btCargar);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        provincias = new ArrayList<>();

        adapter = new ProvinciasAdapter(
                this,
                R.layout.provincias_item_layout,
                //R.id.txtChampion,
                provincias
        );

        listViewProvincias.setAdapter(adapter);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public ArrayList<QUERY_Provincias_Result> callWebService(){
        ReportingService reportingService = new ReportingService(this);
        Drawable drw = getResources().getDrawable(R.drawable.icon);
        Bitmap bitmap = ((BitmapDrawable)drw).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] bitmapdata = stream.toByteArray();

        try {
            VectorQUERY_Provincias_Result resultado= reportingService.getProvincias();



            ArrayList<QUERY_Provincias_Result> list = new ArrayList<QUERY_Provincias_Result>(resultado);

            Log.d("DATOS",resultado.get(0).codigoCorreos);
            txt.setText(resultado.get(0).codigoCorreos);


            return  list;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        RefreshDataTask rdt= new RefreshDataTask();
        rdt.execute();
    }


    private class RefreshDataTask extends AsyncTask<Void, Void,ArrayList<QUERY_Provincias_Result>> {
        @Override
        protected ArrayList<QUERY_Provincias_Result> doInBackground(Void... voids) {

            return callWebService();
        }
        @Override
        protected void onPostExecute(ArrayList<QUERY_Provincias_Result> provin) {
            super.onPostExecute(provin);
            adapter.clear();
            Log.d("DA",provin.size()+"");
            for (QUERY_Provincias_Result p : provin) {
                adapter.add(p);
            }
        }
    }


    //region Codigo WSDL2CodeInterface
    @Override
    public void Wsdl2CodeStartedRequest() {
        Log.e("Wsdl2Code", "Wsdl2CodeStartedRequest");

    }
    @Override
    public void Wsdl2CodeFinished(String methodName, Object Data) {
        Log.e("Wsdl2Code", "Wsdl2CodeFinished");
        Log.e("Wsdl2Code",methodName);

    }
    @Override
    public void Wsdl2CodeFinishedWithException(Exception ex) {
        Log.e("Wsdl2Code", "Wsdl2CodeFinishedWithException");

    }
    @Override
    public void Wsdl2CodeEndedRequest() {
        Log.e("Wsdl2Code", "Wsdl2CodeEndedRequest");
    }
    //endregion
}
