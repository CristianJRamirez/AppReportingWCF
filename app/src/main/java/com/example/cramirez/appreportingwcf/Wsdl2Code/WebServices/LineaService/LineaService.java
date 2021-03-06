package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import java.util.List;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import android.os.AsyncTask;


public class LineaService {
    
    public String NAMESPACE ="http://tempuri.org/";
    public String url="http://172.18.2.190/DNOTALinea/LineaService.svc";
    public int timeOut = 60000;
    public IWsdl2CodeEvents eventHandler;
    public WS_Enums.SoapProtocolVersion soapVersion;


    public LineaService(){}
    
    public LineaService(IWsdl2CodeEvents eventHandler)
    {
        this.eventHandler = eventHandler;
    }
    public LineaService(IWsdl2CodeEvents eventHandler,String url)
    {
        this.eventHandler = eventHandler;
        this.url = url;
    }
    public LineaService(IWsdl2CodeEvents eventHandler,String url,int timeOutInSeconds)
    {
        this.eventHandler = eventHandler;
        this.url = url;
        this.setTimeOut(timeOutInSeconds);
    }
    public void setTimeOut(int seconds){
        this.timeOut = seconds * 1000;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public void setInspeccionAlcance_CondicionalidadFinalAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccionAlcance,boolean idInspeccionAlcanceSpecified,long idCondicionalidadFinal,boolean idCondicionalidadFinalSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setInspeccionAlcance_CondicionalidadFinalAsync(idUsuario, idUsuarioSpecified, idInspeccionAlcance, idInspeccionAlcanceSpecified, idCondicionalidadFinal, idCondicionalidadFinalSpecified, null);
    }
    
    public void setInspeccionAlcance_CondicionalidadFinalAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccionAlcance,final boolean idInspeccionAlcanceSpecified,final long idCondicionalidadFinal,final boolean idCondicionalidadFinalSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setInspeccionAlcance_CondicionalidadFinal(idUsuario, idUsuarioSpecified, idInspeccionAlcance, idInspeccionAlcanceSpecified, idCondicionalidadFinal, idCondicionalidadFinalSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setInspeccionAlcance_CondicionalidadFinal", result);
                }
            }
        }.execute();
    }
    
    public String setInspeccionAlcance_CondicionalidadFinal(long idUsuario,boolean idUsuarioSpecified,long idInspeccionAlcance,boolean idInspeccionAlcanceSpecified,long idCondicionalidadFinal,boolean idCondicionalidadFinalSpecified){
        return setInspeccionAlcance_CondicionalidadFinal(idUsuario, idUsuarioSpecified, idInspeccionAlcance, idInspeccionAlcanceSpecified, idCondicionalidadFinal, idCondicionalidadFinalSpecified, null);
    }
    
    public String setInspeccionAlcance_CondicionalidadFinal(long idUsuario,boolean idUsuarioSpecified,long idInspeccionAlcance,boolean idInspeccionAlcanceSpecified,long idCondicionalidadFinal,boolean idCondicionalidadFinalSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setInspeccionAlcance_CondicionalidadFinal");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccionAlcance",idInspeccionAlcance);
        soapReq.addProperty("idInspeccionAlcanceSpecified",idInspeccionAlcanceSpecified);
        soapReq.addProperty("idCondicionalidadFinal",idCondicionalidadFinal);
        soapReq.addProperty("idCondicionalidadFinalSpecified",idCondicionalidadFinalSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionAlcance_CondicionalidadFinal", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionAlcance_CondicionalidadFinal", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getInspeccionBloqueEstadoByInspeccionBloqueAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long idbloque,boolean idbloqueSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionBloqueEstadoByInspeccionBloqueAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, idbloque, idbloqueSpecified, null);
    }
    
    public void getInspeccionBloqueEstadoByInspeccionBloqueAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final long idbloque,final boolean idbloqueSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, InspeccionBloqueEstado>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected InspeccionBloqueEstado doInBackground(Void... params) {
                return getInspeccionBloqueEstadoByInspeccionBloque(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, idbloque, idbloqueSpecified, headers);
            }
         
            protected void onPostExecute(InspeccionBloqueEstado result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionBloqueEstadoByInspeccionBloque", result);
                }
            }
        }.execute();
    }
    
    public InspeccionBloqueEstado getInspeccionBloqueEstadoByInspeccionBloque(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long idbloque,boolean idbloqueSpecified){
        return getInspeccionBloqueEstadoByInspeccionBloque(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, idbloque, idbloqueSpecified, null);
    }
    
    public InspeccionBloqueEstado getInspeccionBloqueEstadoByInspeccionBloque(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long idbloque,boolean idbloqueSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionBloqueEstadoByInspeccionBloque");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("idbloque",idbloque);
        soapReq.addProperty("idbloqueSpecified",idbloqueSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionBloqueEstadoByInspeccionBloque", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionBloqueEstadoByInspeccionBloque", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    InspeccionBloqueEstado resultVariable =  new InspeccionBloqueEstado (j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void esEtapaCerradaAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long idetapa,boolean idetapaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        esEtapaCerradaAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, idetapa, idetapaSpecified, null);
    }
    
    public void esEtapaCerradaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final long idetapa,final boolean idetapaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                esEtapaCerrada(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, idetapa, idetapaSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("esEtapaCerrada", result);
                }
            }
        }.execute();
    }
    
    public void esEtapaCerrada(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long idetapa,boolean idetapaSpecified){
        esEtapaCerrada(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, idetapa, idetapaSpecified, null);
    }
    
    public void esEtapaCerrada(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long idetapa,boolean idetapaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","esEtapaCerrada");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("idetapa",idetapa);
        soapReq.addProperty("idetapaSpecified",idetapaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/esEtapaCerrada", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/esEtapaCerrada", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setCerrarInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idVehiculo,boolean idVehiculoSpecified,String fechaValidez,boolean fechaValidezSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setCerrarInspeccionAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idVehiculo, idVehiculoSpecified, fechaValidez, fechaValidezSpecified, null);
    }
    
    public void setCerrarInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long idVehiculo,final boolean idVehiculoSpecified,final String fechaValidez,final boolean fechaValidezSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setCerrarInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idVehiculo, idVehiculoSpecified, fechaValidez, fechaValidezSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setCerrarInspeccion", result);
                }
            }
        }.execute();
    }
    
    public String setCerrarInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idVehiculo,boolean idVehiculoSpecified,String fechaValidez,boolean fechaValidezSpecified){
        return setCerrarInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idVehiculo, idVehiculoSpecified, fechaValidez, fechaValidezSpecified, null);
    }
    
    public String setCerrarInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idVehiculo,boolean idVehiculoSpecified,String fechaValidez,boolean fechaValidezSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setCerrarInspeccion");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idVehiculo",idVehiculo);
        soapReq.addProperty("idVehiculoSpecified",idVehiculoSpecified);
        soapReq.addProperty("fechaValidez",fechaValidez);
        soapReq.addProperty("fechaValidezSpecified",fechaValidezSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setCerrarInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setCerrarInspeccion", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void setReabrirInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setReabrirInspeccionAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void setReabrirInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setReabrirInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setReabrirInspeccion", result);
                }
            }
        }.execute();
    }
    
    public String setReabrirInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return setReabrirInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public String setReabrirInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setReabrirInspeccion");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setReabrirInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setReabrirInspeccion", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getNeumaticosAsync(long idUsuario,boolean idUsuarioSpecified,String empiezaPor) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getNeumaticosAsync(idUsuario, idUsuarioSpecified, empiezaPor, null);
    }
    
    public void getNeumaticosAsync(final long idUsuario,final boolean idUsuarioSpecified,final String empiezaPor,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorNeumaticos>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorNeumaticos doInBackground(Void... params) {
                return getNeumaticos(idUsuario, idUsuarioSpecified, empiezaPor, headers);
            }
         
            protected void onPostExecute(VectorNeumaticos result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getNeumaticos", result);
                }
            }
        }.execute();
    }
    
    public VectorNeumaticos getNeumaticos(long idUsuario,boolean idUsuarioSpecified,String empiezaPor){
        return getNeumaticos(idUsuario, idUsuarioSpecified, empiezaPor, null);
    }
    
    public VectorNeumaticos getNeumaticos(long idUsuario,boolean idUsuarioSpecified,String empiezaPor,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getNeumaticos");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("empiezaPor",empiezaPor);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getNeumaticos", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getNeumaticos", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorNeumaticos resultVariable = new VectorNeumaticos(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getNeumaticosVelocidadAsync(long idUsuario,boolean idUsuarioSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getNeumaticosVelocidadAsync(idUsuario, idUsuarioSpecified, null);
    }
    
    public void getNeumaticosVelocidadAsync(final long idUsuario,final boolean idUsuarioSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorNeumaticosVelocidad>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorNeumaticosVelocidad doInBackground(Void... params) {
                return getNeumaticosVelocidad(idUsuario, idUsuarioSpecified, headers);
            }
         
            protected void onPostExecute(VectorNeumaticosVelocidad result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getNeumaticosVelocidad", result);
                }
            }
        }.execute();
    }
    
    public VectorNeumaticosVelocidad getNeumaticosVelocidad(long idUsuario,boolean idUsuarioSpecified){
        return getNeumaticosVelocidad(idUsuario, idUsuarioSpecified, null);
    }
    
    public VectorNeumaticosVelocidad getNeumaticosVelocidad(long idUsuario,boolean idUsuarioSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getNeumaticosVelocidad");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getNeumaticosVelocidad", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getNeumaticosVelocidad", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorNeumaticosVelocidad resultVariable = new VectorNeumaticosVelocidad(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getNeumaticosCargaAsync(long idUsuario,boolean idUsuarioSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getNeumaticosCargaAsync(idUsuario, idUsuarioSpecified, null);
    }
    
    public void getNeumaticosCargaAsync(final long idUsuario,final boolean idUsuarioSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorNeumaticosCarga>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorNeumaticosCarga doInBackground(Void... params) {
                return getNeumaticosCarga(idUsuario, idUsuarioSpecified, headers);
            }
         
            protected void onPostExecute(VectorNeumaticosCarga result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getNeumaticosCarga", result);
                }
            }
        }.execute();
    }
    
    public VectorNeumaticosCarga getNeumaticosCarga(long idUsuario,boolean idUsuarioSpecified){
        return getNeumaticosCarga(idUsuario, idUsuarioSpecified, null);
    }
    
    public VectorNeumaticosCarga getNeumaticosCarga(long idUsuario,boolean idUsuarioSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getNeumaticosCarga");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getNeumaticosCarga", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getNeumaticosCarga", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorNeumaticosCarga resultVariable = new VectorNeumaticosCarga(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getDefectosInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,long idinspe,boolean idinspeSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getDefectosInspeccionAsync(idUsuario, idUsuarioSpecified, idinspe, idinspeSpecified, null);
    }
    
    public void getDefectosInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinspe,final boolean idinspeSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQUERY_InspeccionDefectos_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQUERY_InspeccionDefectos_Result doInBackground(Void... params) {
                return getDefectosInspeccion(idUsuario, idUsuarioSpecified, idinspe, idinspeSpecified, headers);
            }
         
            protected void onPostExecute(VectorQUERY_InspeccionDefectos_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getDefectosInspeccion", result);
                }
            }
        }.execute();
    }
    
    public VectorQUERY_InspeccionDefectos_Result getDefectosInspeccion(long idUsuario,boolean idUsuarioSpecified,long idinspe,boolean idinspeSpecified){
        return getDefectosInspeccion(idUsuario, idUsuarioSpecified, idinspe, idinspeSpecified, null);
    }
    
    public VectorQUERY_InspeccionDefectos_Result getDefectosInspeccion(long idUsuario,boolean idUsuarioSpecified,long idinspe,boolean idinspeSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getDefectosInspeccion");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinspe",idinspe);
        soapReq.addProperty("idinspeSpecified",idinspeSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getDefectosInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getDefectosInspeccion", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQUERY_InspeccionDefectos_Result resultVariable = new VectorQUERY_InspeccionDefectos_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getDefectosBloquesAsync(long idUsuario,boolean idUsuarioSpecified,String bloques,String defectos,long idClassificacionField,boolean idClassificacionSpecifiedField,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getDefectosBloquesAsync(idUsuario, idUsuarioSpecified, bloques, defectos, idClassificacionField, idClassificacionSpecifiedField, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getDefectosBloquesAsync(final long idUsuario,final boolean idUsuarioSpecified,final String bloques,final String defectos,final long idClassificacionField,final boolean idClassificacionSpecifiedField,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQUERY_DefectosBloques_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQUERY_DefectosBloques_Result doInBackground(Void... params) {
                return getDefectosBloques(idUsuario, idUsuarioSpecified, bloques, defectos, idClassificacionField, idClassificacionSpecifiedField, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(VectorQUERY_DefectosBloques_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getDefectosBloques", result);
                }
            }
        }.execute();
    }
    
    public VectorQUERY_DefectosBloques_Result getDefectosBloques(long idUsuario,boolean idUsuarioSpecified,String bloques,String defectos,long idClassificacionField,boolean idClassificacionSpecifiedField,long idInspeccion,boolean idInspeccionSpecified){
        return getDefectosBloques(idUsuario, idUsuarioSpecified, bloques, defectos, idClassificacionField, idClassificacionSpecifiedField, idInspeccion, idInspeccionSpecified, null);
    }
    
    public VectorQUERY_DefectosBloques_Result getDefectosBloques(long idUsuario,boolean idUsuarioSpecified,String bloques,String defectos,long idClassificacionField,boolean idClassificacionSpecifiedField,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getDefectosBloques");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("bloques",bloques);
        soapReq.addProperty("defectos",defectos);
        soapReq.addProperty("idClassificacion",idClassificacionField);
        soapReq.addProperty("idClassificacionSpecified",idClassificacionSpecifiedField);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getDefectosBloques", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getDefectosBloques", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQUERY_DefectosBloques_Result resultVariable = new VectorQUERY_DefectosBloques_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void setInspeccionDefectoAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long iddef,boolean iddefSpecified,long tipo,boolean tipoSpecified,long idetapa,boolean idetapaSpecified,long idbloque,boolean idbloqueSpecified,String observaciones,String localizacion) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setInspeccionDefectoAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, iddef, iddefSpecified, tipo, tipoSpecified, idetapa, idetapaSpecified, idbloque, idbloqueSpecified, observaciones, localizacion, null);
    }
    
    public void setInspeccionDefectoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final long iddef,final boolean iddefSpecified,final long tipo,final boolean tipoSpecified,final long idetapa,final boolean idetapaSpecified,final long idbloque,final boolean idbloqueSpecified,final String observaciones,final String localizacion,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setInspeccionDefecto(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, iddef, iddefSpecified, tipo, tipoSpecified, idetapa, idetapaSpecified, idbloque, idbloqueSpecified, observaciones, localizacion, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setInspeccionDefecto", result);
                }
            }
        }.execute();
    }
    
    public String setInspeccionDefecto(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long iddef,boolean iddefSpecified,long tipo,boolean tipoSpecified,long idetapa,boolean idetapaSpecified,long idbloque,boolean idbloqueSpecified,String observaciones,String localizacion){
        return setInspeccionDefecto(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, iddef, iddefSpecified, tipo, tipoSpecified, idetapa, idetapaSpecified, idbloque, idbloqueSpecified, observaciones, localizacion, null);
    }
    
    public String setInspeccionDefecto(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,long iddef,boolean iddefSpecified,long tipo,boolean tipoSpecified,long idetapa,boolean idetapaSpecified,long idbloque,boolean idbloqueSpecified,String observaciones,String localizacion,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setInspeccionDefecto");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("iddef",iddef);
        soapReq.addProperty("iddefSpecified",iddefSpecified);
        soapReq.addProperty("tipo",tipo);
        soapReq.addProperty("tipoSpecified",tipoSpecified);
        soapReq.addProperty("idetapa",idetapa);
        soapReq.addProperty("idetapaSpecified",idetapaSpecified);
        soapReq.addProperty("idbloque",idbloque);
        soapReq.addProperty("idbloqueSpecified",idbloqueSpecified);
        soapReq.addProperty("observaciones",observaciones);
        soapReq.addProperty("localizacion",localizacion);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionDefecto", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionDefecto", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void delInspeccionDefectoAsync(long idUsuario,boolean idUsuarioSpecified,long idinspdef,boolean idinspdefSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        delInspeccionDefectoAsync(idUsuario, idUsuarioSpecified, idinspdef, idinspdefSpecified, null);
    }
    
    public void delInspeccionDefectoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinspdef,final boolean idinspdefSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return delInspeccionDefecto(idUsuario, idUsuarioSpecified, idinspdef, idinspdefSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("delInspeccionDefecto", result);
                }
            }
        }.execute();
    }
    
    public String delInspeccionDefecto(long idUsuario,boolean idUsuarioSpecified,long idinspdef,boolean idinspdefSpecified){
        return delInspeccionDefecto(idUsuario, idUsuarioSpecified, idinspdef, idinspdefSpecified, null);
    }
    
    public String delInspeccionDefecto(long idUsuario,boolean idUsuarioSpecified,long idinspdef,boolean idinspdefSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","delInspeccionDefecto");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinspdef",idinspdef);
        soapReq.addProperty("idinspdefSpecified",idinspdefSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/delInspeccionDefecto", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/delInspeccionDefecto", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void setInspeccionObservacionesAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String texto) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setInspeccionObservacionesAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, texto, null);
    }
    
    public void setInspeccionObservacionesAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final String texto,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setInspeccionObservaciones(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, texto, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setInspeccionObservaciones", result);
                }
            }
        }.execute();
    }
    
    public String setInspeccionObservaciones(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String texto){
        return setInspeccionObservaciones(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, texto, null);
    }
    
    public String setInspeccionObservaciones(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String texto,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setInspeccionObservaciones");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("texto",texto);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionObservaciones", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionObservaciones", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void setInspeccionNotasInternasAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String texto) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setInspeccionNotasInternasAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, texto, null);
    }
    
    public void setInspeccionNotasInternasAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final String texto,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setInspeccionNotasInternas(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, texto, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setInspeccionNotasInternas", result);
                }
            }
        }.execute();
    }
    
    public String setInspeccionNotasInternas(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String texto){
        return setInspeccionNotasInternas(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, texto, null);
    }
    
    public String setInspeccionNotasInternas(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String texto,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setInspeccionNotasInternas");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("texto",texto);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionNotasInternas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionNotasInternas", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void updataAllInspeccionDefectoPruebaAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idEtapa,boolean idEtapaSpecified,VectorString codigosDefectos) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        updataAllInspeccionDefectoPruebaAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idEtapa, idEtapaSpecified, codigosDefectos, null);
    }
    
    public void updataAllInspeccionDefectoPruebaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long idEtapa,final boolean idEtapaSpecified,final VectorString codigosDefectos,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                updataAllInspeccionDefectoPrueba(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idEtapa, idEtapaSpecified, codigosDefectos, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("updataAllInspeccionDefectoPrueba", result);
                }
            }
        }.execute();
    }
    
    public void updataAllInspeccionDefectoPrueba(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idEtapa,boolean idEtapaSpecified,VectorString codigosDefectos){
        updataAllInspeccionDefectoPrueba(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idEtapa, idEtapaSpecified, codigosDefectos, null);
    }
    
    public void updataAllInspeccionDefectoPrueba(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idEtapa,boolean idEtapaSpecified,VectorString codigosDefectos,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","updataAllInspeccionDefectoPrueba");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idEtapa",idEtapa);
        soapReq.addProperty("idEtapaSpecified",idEtapaSpecified);
        soapReq.addProperty("codigosDefectos",codigosDefectos);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/updataAllInspeccionDefectoPrueba", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/updataAllInspeccionDefectoPrueba", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void ActInspeccionDefectoTipoAsync(long idUsuario,boolean idUsuarioSpecified,long idinspdef,boolean idinspdefSpecified,long tipo,boolean tipoSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        ActInspeccionDefectoTipoAsync(idUsuario, idUsuarioSpecified, idinspdef, idinspdefSpecified, tipo, tipoSpecified, null);
    }
    
    public void ActInspeccionDefectoTipoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinspdef,final boolean idinspdefSpecified,final long tipo,final boolean tipoSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return ActInspeccionDefectoTipo(idUsuario, idUsuarioSpecified, idinspdef, idinspdefSpecified, tipo, tipoSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("ActInspeccionDefectoTipo", result);
                }
            }
        }.execute();
    }
    
    public String ActInspeccionDefectoTipo(long idUsuario,boolean idUsuarioSpecified,long idinspdef,boolean idinspdefSpecified,long tipo,boolean tipoSpecified){
        return ActInspeccionDefectoTipo(idUsuario, idUsuarioSpecified, idinspdef, idinspdefSpecified, tipo, tipoSpecified, null);
    }
    
    public String ActInspeccionDefectoTipo(long idUsuario,boolean idUsuarioSpecified,long idinspdef,boolean idinspdefSpecified,long tipo,boolean tipoSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","ActInspeccionDefectoTipo");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinspdef",idinspdef);
        soapReq.addProperty("idinspdefSpecified",idinspdefSpecified);
        soapReq.addProperty("tipo",tipo);
        soapReq.addProperty("tipoSpecified",tipoSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/ActInspeccionDefectoTipo", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/ActInspeccionDefectoTipo", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getInspeccionResultadosPruebasAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionResultadosPruebasAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getInspeccionResultadosPruebasAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorInspeccionResultadoPrueba>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorInspeccionResultadoPrueba doInBackground(Void... params) {
                return getInspeccionResultadosPruebas(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(VectorInspeccionResultadoPrueba result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionResultadosPruebas", result);
                }
            }
        }.execute();
    }
    
    public VectorInspeccionResultadoPrueba getInspeccionResultadosPruebas(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return getInspeccionResultadosPruebas(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public VectorInspeccionResultadoPrueba getInspeccionResultadosPruebas(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionResultadosPruebas");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionResultadosPruebas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionResultadosPruebas", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorInspeccionResultadoPrueba resultVariable = new VectorInspeccionResultadoPrueba(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getInspeccionesNoFinalidasAvanzadoAsync(long idUsuario,boolean idUsuarioSpecified,long idCentro,boolean idCentroSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionesNoFinalidasAvanzadoAsync(idUsuario, idUsuarioSpecified, idCentro, idCentroSpecified, null);
    }
    
    public void getInspeccionesNoFinalidasAvanzadoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idCentro,final boolean idCentroSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQUERY_InspeccionesNoFinalidas_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQUERY_InspeccionesNoFinalidas_Result doInBackground(Void... params) {
                return getInspeccionesNoFinalidasAvanzado(idUsuario, idUsuarioSpecified, idCentro, idCentroSpecified, headers);
            }
         
            protected void onPostExecute(VectorQUERY_InspeccionesNoFinalidas_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionesNoFinalidasAvanzado", result);
                }
            }
        }.execute();
    }
    
    public VectorQUERY_InspeccionesNoFinalidas_Result getInspeccionesNoFinalidasAvanzado(long idUsuario,boolean idUsuarioSpecified,long idCentro,boolean idCentroSpecified){
        return getInspeccionesNoFinalidasAvanzado(idUsuario, idUsuarioSpecified, idCentro, idCentroSpecified, null);
    }
    
    public VectorQUERY_InspeccionesNoFinalidas_Result getInspeccionesNoFinalidasAvanzado(long idUsuario,boolean idUsuarioSpecified,long idCentro,boolean idCentroSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionesNoFinalidasAvanzado");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idCentro",idCentro);
        soapReq.addProperty("idCentroSpecified",idCentroSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionesNoFinalidasAvanzado", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionesNoFinalidasAvanzado", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQUERY_InspeccionesNoFinalidas_Result resultVariable = new VectorQUERY_InspeccionesNoFinalidas_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void agregarInspeccionPruebaResultadoAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorSimpleLongString pruebasElementos) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        agregarInspeccionPruebaResultadoAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, pruebasElementos, null);
    }
    
    public void agregarInspeccionPruebaResultadoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final VectorSimpleLongString pruebasElementos,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                agregarInspeccionPruebaResultado(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, pruebasElementos, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("agregarInspeccionPruebaResultado", result);
                }
            }
        }.execute();
    }
    
    public void agregarInspeccionPruebaResultado(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorSimpleLongString pruebasElementos){
        agregarInspeccionPruebaResultado(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, pruebasElementos, null);
    }
    
    public void agregarInspeccionPruebaResultado(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorSimpleLongString pruebasElementos,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","agregarInspeccionPruebaResultado");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("pruebasElementos",pruebasElementos);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/agregarInspeccionPruebaResultado", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/agregarInspeccionPruebaResultado", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void updateInspeccionPruebaResultadoAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorSimpleLongString pruebasElementos) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        updateInspeccionPruebaResultadoAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, pruebasElementos, null);
    }
    
    public void updateInspeccionPruebaResultadoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final VectorSimpleLongString pruebasElementos,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                updateInspeccionPruebaResultado(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, pruebasElementos, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("updateInspeccionPruebaResultado", result);
                }
            }
        }.execute();
    }
    
    public void updateInspeccionPruebaResultado(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorSimpleLongString pruebasElementos){
        updateInspeccionPruebaResultado(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, pruebasElementos, null);
    }
    
    public void updateInspeccionPruebaResultado(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorSimpleLongString pruebasElementos,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","updateInspeccionPruebaResultado");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("pruebasElementos",pruebasElementos);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/updateInspeccionPruebaResultado", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/updateInspeccionPruebaResultado", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setAbrirEtapaAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String etapa,String usuario) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setAbrirEtapaAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, etapa, usuario, null);
    }
    
    public void setAbrirEtapaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final String etapa,final String usuario,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setAbrirEtapa(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, etapa, usuario, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setAbrirEtapa", result);
                }
            }
        }.execute();
    }
    
    public String setAbrirEtapa(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String etapa,String usuario){
        return setAbrirEtapa(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, etapa, usuario, null);
    }
    
    public String setAbrirEtapa(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String etapa,String usuario,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setAbrirEtapa");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("etapa",etapa);
        soapReq.addProperty("usuario",usuario);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setAbrirEtapa", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setAbrirEtapa", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void setSalirEtapaAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,boolean borrar,boolean borrarSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setSalirEtapaAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, borrar, borrarSpecified, null);
    }
    
    public void setSalirEtapaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final boolean borrar,final boolean borrarSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setSalirEtapa(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, borrar, borrarSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setSalirEtapa", result);
                }
            }
        }.execute();
    }
    
    public String setSalirEtapa(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,boolean borrar,boolean borrarSpecified){
        return setSalirEtapa(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, borrar, borrarSpecified, null);
    }
    
    public String setSalirEtapa(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,boolean borrar,boolean borrarSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setSalirEtapa");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("borrar",borrar);
        soapReq.addProperty("borrarSpecified",borrarSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setSalirEtapa", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setSalirEtapa", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void setInspeccionDefectoPorCodigoAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String coddef,long tipo,boolean tipoSpecified,long idetapa,boolean idetapaSpecified,long idbloque,boolean idbloqueSpecified,String observaciones,String localizacion) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setInspeccionDefectoPorCodigoAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, coddef, tipo, tipoSpecified, idetapa, idetapaSpecified, idbloque, idbloqueSpecified, observaciones, localizacion, null);
    }
    
    public void setInspeccionDefectoPorCodigoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final String coddef,final long tipo,final boolean tipoSpecified,final long idetapa,final boolean idetapaSpecified,final long idbloque,final boolean idbloqueSpecified,final String observaciones,final String localizacion,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setInspeccionDefectoPorCodigo(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, coddef, tipo, tipoSpecified, idetapa, idetapaSpecified, idbloque, idbloqueSpecified, observaciones, localizacion, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setInspeccionDefectoPorCodigo", result);
                }
            }
        }.execute();
    }
    
    public String setInspeccionDefectoPorCodigo(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String coddef,long tipo,boolean tipoSpecified,long idetapa,boolean idetapaSpecified,long idbloque,boolean idbloqueSpecified,String observaciones,String localizacion){
        return setInspeccionDefectoPorCodigo(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, coddef, tipo, tipoSpecified, idetapa, idetapaSpecified, idbloque, idbloqueSpecified, observaciones, localizacion, null);
    }
    
    public String setInspeccionDefectoPorCodigo(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,String coddef,long tipo,boolean tipoSpecified,long idetapa,boolean idetapaSpecified,long idbloque,boolean idbloqueSpecified,String observaciones,String localizacion,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setInspeccionDefectoPorCodigo");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("coddef",coddef);
        soapReq.addProperty("tipo",tipo);
        soapReq.addProperty("tipoSpecified",tipoSpecified);
        soapReq.addProperty("idetapa",idetapa);
        soapReq.addProperty("idetapaSpecified",idetapaSpecified);
        soapReq.addProperty("idbloque",idbloque);
        soapReq.addProperty("idbloqueSpecified",idbloqueSpecified);
        soapReq.addProperty("observaciones",observaciones);
        soapReq.addProperty("localizacion",localizacion);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionDefectoPorCodigo", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionDefectoPorCodigo", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void delInspeccionDefectoPedientesAsync(long idUsuario,boolean idUsuarioSpecified,long idins,boolean idinsSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        delInspeccionDefectoPedientesAsync(idUsuario, idUsuarioSpecified, idins, idinsSpecified, null);
    }
    
    public void delInspeccionDefectoPedientesAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idins,final boolean idinsSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return delInspeccionDefectoPedientes(idUsuario, idUsuarioSpecified, idins, idinsSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("delInspeccionDefectoPedientes", result);
                }
            }
        }.execute();
    }
    
    public String delInspeccionDefectoPedientes(long idUsuario,boolean idUsuarioSpecified,long idins,boolean idinsSpecified){
        return delInspeccionDefectoPedientes(idUsuario, idUsuarioSpecified, idins, idinsSpecified, null);
    }
    
    public String delInspeccionDefectoPedientes(long idUsuario,boolean idUsuarioSpecified,long idins,boolean idinsSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","delInspeccionDefectoPedientes");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idins",idins);
        soapReq.addProperty("idinsSpecified",idinsSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/delInspeccionDefectoPedientes", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/delInspeccionDefectoPedientes", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getDatosVehiculoAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getDatosVehiculoAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getDatosVehiculoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, QUERY_DatosVehiculo_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected QUERY_DatosVehiculo_Result doInBackground(Void... params) {
                return getDatosVehiculo(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(QUERY_DatosVehiculo_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getDatosVehiculo", result);
                }
            }
        }.execute();
    }
    
    public QUERY_DatosVehiculo_Result getDatosVehiculo(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return getDatosVehiculo(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public QUERY_DatosVehiculo_Result getDatosVehiculo(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getDatosVehiculo");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getDatosVehiculo", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getDatosVehiculo", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    QUERY_DatosVehiculo_Result resultVariable =  new QUERY_DatosVehiculo_Result (j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void hayCambioDeImporteAsync(long idCentro,boolean idCentroSpecified,long nuevaClasificacion,boolean nuevaClasificacionSpecified,long nuevoCombustible,boolean nuevoCombustibleSpecified,long idSolicitud,boolean idSolicitudSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        hayCambioDeImporteAsync(idCentro, idCentroSpecified, nuevaClasificacion, nuevaClasificacionSpecified, nuevoCombustible, nuevoCombustibleSpecified, idSolicitud, idSolicitudSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void hayCambioDeImporteAsync(final long idCentro,final boolean idCentroSpecified,final long nuevaClasificacion,final boolean nuevaClasificacionSpecified,final long nuevoCombustible,final boolean nuevoCombustibleSpecified,final long idSolicitud,final boolean idSolicitudSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                hayCambioDeImporte(idCentro, idCentroSpecified, nuevaClasificacion, nuevaClasificacionSpecified, nuevoCombustible, nuevoCombustibleSpecified, idSolicitud, idSolicitudSpecified, idInspeccion, idInspeccionSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("hayCambioDeImporte", result);
                }
            }
        }.execute();
    }
    
    public void hayCambioDeImporte(long idCentro,boolean idCentroSpecified,long nuevaClasificacion,boolean nuevaClasificacionSpecified,long nuevoCombustible,boolean nuevoCombustibleSpecified,long idSolicitud,boolean idSolicitudSpecified,long idInspeccion,boolean idInspeccionSpecified){
        hayCambioDeImporte(idCentro, idCentroSpecified, nuevaClasificacion, nuevaClasificacionSpecified, nuevoCombustible, nuevoCombustibleSpecified, idSolicitud, idSolicitudSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void hayCambioDeImporte(long idCentro,boolean idCentroSpecified,long nuevaClasificacion,boolean nuevaClasificacionSpecified,long nuevoCombustible,boolean nuevoCombustibleSpecified,long idSolicitud,boolean idSolicitudSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","hayCambioDeImporte");
        soapReq.addProperty("idCentro",idCentro);
        soapReq.addProperty("idCentroSpecified",idCentroSpecified);
        soapReq.addProperty("nuevaClasificacion",nuevaClasificacion);
        soapReq.addProperty("nuevaClasificacionSpecified",nuevaClasificacionSpecified);
        soapReq.addProperty("nuevoCombustible",nuevoCombustible);
        soapReq.addProperty("nuevoCombustibleSpecified",nuevoCombustibleSpecified);
        soapReq.addProperty("idSolicitud",idSolicitud);
        soapReq.addProperty("idSolicitudSpecified",idSolicitudSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/hayCambioDeImporte", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/hayCambioDeImporte", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setCerrarEtapaAsync(long idUsuario,boolean idUsuarioSpecified,String codUsuario,long idinsp,boolean idinspSpecified,long idetapa,boolean idetapaSpecified,VectorInt64 bloqAct) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setCerrarEtapaAsync(idUsuario, idUsuarioSpecified, codUsuario, idinsp, idinspSpecified, idetapa, idetapaSpecified, bloqAct, null);
    }
    
    public void setCerrarEtapaAsync(final long idUsuario,final boolean idUsuarioSpecified,final String codUsuario,final long idinsp,final boolean idinspSpecified,final long idetapa,final boolean idetapaSpecified,final VectorInt64 bloqAct,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setCerrarEtapa(idUsuario, idUsuarioSpecified, codUsuario, idinsp, idinspSpecified, idetapa, idetapaSpecified, bloqAct, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setCerrarEtapa", result);
                }
            }
        }.execute();
    }
    
    public String setCerrarEtapa(long idUsuario,boolean idUsuarioSpecified,String codUsuario,long idinsp,boolean idinspSpecified,long idetapa,boolean idetapaSpecified,VectorInt64 bloqAct){
        return setCerrarEtapa(idUsuario, idUsuarioSpecified, codUsuario, idinsp, idinspSpecified, idetapa, idetapaSpecified, bloqAct, null);
    }
    
    public String setCerrarEtapa(long idUsuario,boolean idUsuarioSpecified,String codUsuario,long idinsp,boolean idinspSpecified,long idetapa,boolean idetapaSpecified,VectorInt64 bloqAct,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setCerrarEtapa");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("codUsuario",codUsuario);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapReq.addProperty("idetapa",idetapa);
        soapReq.addProperty("idetapaSpecified",idetapaSpecified);
        soapReq.addProperty("bloqAct",bloqAct);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setCerrarEtapa", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setCerrarEtapa", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void HayInspeccionDefectoPedientesAsync(long idins,boolean idinsSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        HayInspeccionDefectoPedientesAsync(idins, idinsSpecified, null);
    }
    
    public void HayInspeccionDefectoPedientesAsync(final long idins,final boolean idinsSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                HayInspeccionDefectoPedientes(idins, idinsSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("HayInspeccionDefectoPedientes", result);
                }
            }
        }.execute();
    }
    
    public void HayInspeccionDefectoPedientes(long idins,boolean idinsSpecified){
        HayInspeccionDefectoPedientes(idins, idinsSpecified, null);
    }
    
    public void HayInspeccionDefectoPedientes(long idins,boolean idinsSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","HayInspeccionDefectoPedientes");
        soapReq.addProperty("idins",idins);
        soapReq.addProperty("idinsSpecified",idinsSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/HayInspeccionDefectoPedientes", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/HayInspeccionDefectoPedientes", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getAlcanceBloquesAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,String bloques) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getAlcanceBloquesAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, bloques, null);
    }
    
    public void getAlcanceBloquesAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final String bloques,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQUERY_AlcanceBloques_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQUERY_AlcanceBloques_Result doInBackground(Void... params) {
                return getAlcanceBloques(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, bloques, headers);
            }
         
            protected void onPostExecute(VectorQUERY_AlcanceBloques_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getAlcanceBloques", result);
                }
            }
        }.execute();
    }
    
    public VectorQUERY_AlcanceBloques_Result getAlcanceBloques(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,String bloques){
        return getAlcanceBloques(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, bloques, null);
    }
    
    public VectorQUERY_AlcanceBloques_Result getAlcanceBloques(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,String bloques,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getAlcanceBloques");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("bloques",bloques);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getAlcanceBloques", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getAlcanceBloques", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQUERY_AlcanceBloques_Result resultVariable = new VectorQUERY_AlcanceBloques_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void SincronicarInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,String codigoInspeccion,long idCentroPeticion,boolean idCentroPeticionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        SincronicarInspeccionAsync(idUsuario, idUsuarioSpecified, codigoInspeccion, idCentroPeticion, idCentroPeticionSpecified, null);
    }
    
    public void SincronicarInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final String codigoInspeccion,final long idCentroPeticion,final boolean idCentroPeticionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                SincronicarInspeccion(idUsuario, idUsuarioSpecified, codigoInspeccion, idCentroPeticion, idCentroPeticionSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("SincronicarInspeccion", result);
                }
            }
        }.execute();
    }
    
    public void SincronicarInspeccion(long idUsuario,boolean idUsuarioSpecified,String codigoInspeccion,long idCentroPeticion,boolean idCentroPeticionSpecified){
        SincronicarInspeccion(idUsuario, idUsuarioSpecified, codigoInspeccion, idCentroPeticion, idCentroPeticionSpecified, null);
    }
    
    public void SincronicarInspeccion(long idUsuario,boolean idUsuarioSpecified,String codigoInspeccion,long idCentroPeticion,boolean idCentroPeticionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","SincronicarInspeccion");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("codigoInspeccion",codigoInspeccion);
        soapReq.addProperty("idCentroPeticion",idCentroPeticion);
        soapReq.addProperty("idCentroPeticionSpecified",idCentroPeticionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/SincronicarInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/SincronicarInspeccion", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getInspeccionByNumAsync(long idUsuario,boolean idUsuarioSpecified,String numInspeccion,long idCentro,boolean idCentroSpecified,boolean sincronizar,boolean sincronizarSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionByNumAsync(idUsuario, idUsuarioSpecified, numInspeccion, idCentro, idCentroSpecified, sincronizar, sincronizarSpecified, null);
    }
    
    public void getInspeccionByNumAsync(final long idUsuario,final boolean idUsuarioSpecified,final String numInspeccion,final long idCentro,final boolean idCentroSpecified,final boolean sincronizar,final boolean sincronizarSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Inspeccion>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Inspeccion doInBackground(Void... params) {
                return getInspeccionByNum(idUsuario, idUsuarioSpecified, numInspeccion, idCentro, idCentroSpecified, sincronizar, sincronizarSpecified, headers);
            }
         
            protected void onPostExecute(Inspeccion result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionByNum", result);
                }
            }
        }.execute();
    }
    
    public Inspeccion getInspeccionByNum(long idUsuario,boolean idUsuarioSpecified,String numInspeccion,long idCentro,boolean idCentroSpecified,boolean sincronizar,boolean sincronizarSpecified){
        return getInspeccionByNum(idUsuario, idUsuarioSpecified, numInspeccion, idCentro, idCentroSpecified, sincronizar, sincronizarSpecified, null);
    }
    
    public Inspeccion getInspeccionByNum(long idUsuario,boolean idUsuarioSpecified,String numInspeccion,long idCentro,boolean idCentroSpecified,boolean sincronizar,boolean sincronizarSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionByNum");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("numInspeccion",numInspeccion);
        soapReq.addProperty("idCentro",idCentro);
        soapReq.addProperty("idCentroSpecified",idCentroSpecified);
        soapReq.addProperty("sincronizar",sincronizar);
        soapReq.addProperty("sincronizarSpecified",sincronizarSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionByNum", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionByNum", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    Inspeccion resultVariable =  new Inspeccion (j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void agregarTramaPruebaAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPrueba,boolean idPruebaSpecified,long idMaquina,boolean idMaquinaSpecified,String trama) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        agregarTramaPruebaAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idPrueba, idPruebaSpecified, idMaquina, idMaquinaSpecified, trama, null);
    }
    
    public void agregarTramaPruebaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long idPrueba,final boolean idPruebaSpecified,final long idMaquina,final boolean idMaquinaSpecified,final String trama,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                agregarTramaPrueba(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idPrueba, idPruebaSpecified, idMaquina, idMaquinaSpecified, trama, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("agregarTramaPrueba", result);
                }
            }
        }.execute();
    }
    
    public void agregarTramaPrueba(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPrueba,boolean idPruebaSpecified,long idMaquina,boolean idMaquinaSpecified,String trama){
        agregarTramaPrueba(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idPrueba, idPruebaSpecified, idMaquina, idMaquinaSpecified, trama, null);
    }
    
    public void agregarTramaPrueba(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPrueba,boolean idPruebaSpecified,long idMaquina,boolean idMaquinaSpecified,String trama,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","agregarTramaPrueba");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idPrueba",idPrueba);
        soapReq.addProperty("idPruebaSpecified",idPruebaSpecified);
        soapReq.addProperty("idMaquina",idMaquina);
        soapReq.addProperty("idMaquinaSpecified",idMaquinaSpecified);
        soapReq.addProperty("trama",trama);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/agregarTramaPrueba", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/agregarTramaPrueba", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void calcularTipoResultadoInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        calcularTipoResultadoInspeccionAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void calcularTipoResultadoInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                calcularTipoResultadoInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("calcularTipoResultadoInspeccion", result);
                }
            }
        }.execute();
    }
    
    public void calcularTipoResultadoInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        calcularTipoResultadoInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void calcularTipoResultadoInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","calcularTipoResultadoInspeccion");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/calcularTipoResultadoInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/calcularTipoResultadoInspeccion", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setInspeccionAlcancePruebas_CondicionalidadFinalAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long bloque,boolean bloqueSpecified,String restoBloques,VectorString apartadosSiSeEjecutan,VectorString apartadosNoSeEjecutan) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setInspeccionAlcancePruebas_CondicionalidadFinalAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, bloque, bloqueSpecified, restoBloques, apartadosSiSeEjecutan, apartadosNoSeEjecutan, null);
    }
    
    public void setInspeccionAlcancePruebas_CondicionalidadFinalAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long bloque,final boolean bloqueSpecified,final String restoBloques,final VectorString apartadosSiSeEjecutan,final VectorString apartadosNoSeEjecutan,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                setInspeccionAlcancePruebas_CondicionalidadFinal(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, bloque, bloqueSpecified, restoBloques, apartadosSiSeEjecutan, apartadosNoSeEjecutan, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setInspeccionAlcancePruebas_CondicionalidadFinal", result);
                }
            }
        }.execute();
    }
    
    public void setInspeccionAlcancePruebas_CondicionalidadFinal(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long bloque,boolean bloqueSpecified,String restoBloques,VectorString apartadosSiSeEjecutan,VectorString apartadosNoSeEjecutan){
        setInspeccionAlcancePruebas_CondicionalidadFinal(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, bloque, bloqueSpecified, restoBloques, apartadosSiSeEjecutan, apartadosNoSeEjecutan, null);
    }
    
    public void setInspeccionAlcancePruebas_CondicionalidadFinal(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long bloque,boolean bloqueSpecified,String restoBloques,VectorString apartadosSiSeEjecutan,VectorString apartadosNoSeEjecutan,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setInspeccionAlcancePruebas_CondicionalidadFinal");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("bloque",bloque);
        soapReq.addProperty("bloqueSpecified",bloqueSpecified);
        soapReq.addProperty("restoBloques",restoBloques);
        soapReq.addProperty("apartadosSiSeEjecutan",apartadosSiSeEjecutan);
        soapReq.addProperty("apartadosNoSeEjecutan",apartadosNoSeEjecutan);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionAlcancePruebas_CondicionalidadFinal", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionAlcancePruebas_CondicionalidadFinal", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getInspeciconLineaBoxAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeciconLineaBoxAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getInspeciconLineaBoxAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, InspeccionBoxLinea>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected InspeccionBoxLinea doInBackground(Void... params) {
                return getInspeciconLineaBox(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(InspeccionBoxLinea result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeciconLineaBox", result);
                }
            }
        }.execute();
    }
    
    public InspeccionBoxLinea getInspeciconLineaBox(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return getInspeciconLineaBox(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public InspeccionBoxLinea getInspeciconLineaBox(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeciconLineaBox");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeciconLineaBox", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeciconLineaBox", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    InspeccionBoxLinea resultVariable =  new InspeccionBoxLinea (j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void setInspecionBloqueEstadoEvaluacionAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idBloque,boolean idBloqueSpecified,boolean evaluado,boolean evaluadoSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setInspecionBloqueEstadoEvaluacionAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idBloque, idBloqueSpecified, evaluado, evaluadoSpecified, null);
    }
    
    public void setInspecionBloqueEstadoEvaluacionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long idBloque,final boolean idBloqueSpecified,final boolean evaluado,final boolean evaluadoSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                setInspecionBloqueEstadoEvaluacion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idBloque, idBloqueSpecified, evaluado, evaluadoSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setInspecionBloqueEstadoEvaluacion", result);
                }
            }
        }.execute();
    }
    
    public void setInspecionBloqueEstadoEvaluacion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idBloque,boolean idBloqueSpecified,boolean evaluado,boolean evaluadoSpecified){
        setInspecionBloqueEstadoEvaluacion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idBloque, idBloqueSpecified, evaluado, evaluadoSpecified, null);
    }
    
    public void setInspecionBloqueEstadoEvaluacion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idBloque,boolean idBloqueSpecified,boolean evaluado,boolean evaluadoSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setInspecionBloqueEstadoEvaluacion");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idBloque",idBloque);
        soapReq.addProperty("idBloqueSpecified",idBloqueSpecified);
        soapReq.addProperty("evaluado",evaluado);
        soapReq.addProperty("evaluadoSpecified",evaluadoSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setInspecionBloqueEstadoEvaluacion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setInspecionBloqueEstadoEvaluacion", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setAlcancePruebaFinalizadoAsync(long idUsuario,boolean idUsuarioSpecified,long idAlcancePrueba,boolean idAlcancePruebaSpecified,boolean finalizar,boolean finalizarSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setAlcancePruebaFinalizadoAsync(idUsuario, idUsuarioSpecified, idAlcancePrueba, idAlcancePruebaSpecified, finalizar, finalizarSpecified, null);
    }
    
    public void setAlcancePruebaFinalizadoAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idAlcancePrueba,final boolean idAlcancePruebaSpecified,final boolean finalizar,final boolean finalizarSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                setAlcancePruebaFinalizado(idUsuario, idUsuarioSpecified, idAlcancePrueba, idAlcancePruebaSpecified, finalizar, finalizarSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setAlcancePruebaFinalizado", result);
                }
            }
        }.execute();
    }
    
    public void setAlcancePruebaFinalizado(long idUsuario,boolean idUsuarioSpecified,long idAlcancePrueba,boolean idAlcancePruebaSpecified,boolean finalizar,boolean finalizarSpecified){
        setAlcancePruebaFinalizado(idUsuario, idUsuarioSpecified, idAlcancePrueba, idAlcancePruebaSpecified, finalizar, finalizarSpecified, null);
    }
    
    public void setAlcancePruebaFinalizado(long idUsuario,boolean idUsuarioSpecified,long idAlcancePrueba,boolean idAlcancePruebaSpecified,boolean finalizar,boolean finalizarSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setAlcancePruebaFinalizado");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idAlcancePrueba",idAlcancePrueba);
        soapReq.addProperty("idAlcancePruebaSpecified",idAlcancePruebaSpecified);
        soapReq.addProperty("finalizar",finalizar);
        soapReq.addProperty("finalizarSpecified",finalizarSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setAlcancePruebaFinalizado", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setAlcancePruebaFinalizado", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void DoWorkAsync() throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        DoWorkAsync(null);
    }
    
    public void DoWorkAsync(final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                DoWork(headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("DoWork", result);
                }
            }
        }.execute();
    }
    
    public void DoWork(){
        DoWork(null);
    }
    
    public void DoWork(List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","DoWork");
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/DoWork", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/DoWork", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setRegistroEtiquetasAsync(SetRegistroEtiquetasInput setRegistroEtiquetasInput) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setRegistroEtiquetasAsync(setRegistroEtiquetasInput, null);
    }
    
    public void setRegistroEtiquetasAsync(final SetRegistroEtiquetasInput setRegistroEtiquetasInput,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                setRegistroEtiquetas(setRegistroEtiquetasInput, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setRegistroEtiquetas", result);
                }
            }
        }.execute();
    }
    
    public void setRegistroEtiquetas(SetRegistroEtiquetasInput setRegistroEtiquetasInput){
        setRegistroEtiquetas(setRegistroEtiquetasInput, null);
    }
    
    public void setRegistroEtiquetas(SetRegistroEtiquetasInput setRegistroEtiquetasInput,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setRegistroEtiquetas");
        soapEnvelope.addMapping("http://tempuri.org/","SetRegistroEtiquetasInput",new SetRegistroEtiquetasInput().getClass());
        soapReq.addProperty("SetRegistroEtiquetasInput",setRegistroEtiquetasInput);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setRegistroEtiquetas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setRegistroEtiquetas", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setAsignarEtiquetaAsync(long idUsuario,boolean idUsuarioSpecified,long nEtiqueta,boolean nEtiquetaSpecified,long idInspeccion,boolean idInspeccionSpecified,long tipo,boolean tipoSpecified,String observaciones) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setAsignarEtiquetaAsync(idUsuario, idUsuarioSpecified, nEtiqueta, nEtiquetaSpecified, idInspeccion, idInspeccionSpecified, tipo, tipoSpecified, observaciones, null);
    }
    
    public void setAsignarEtiquetaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long nEtiqueta,final boolean nEtiquetaSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long tipo,final boolean tipoSpecified,final String observaciones,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                setAsignarEtiqueta(idUsuario, idUsuarioSpecified, nEtiqueta, nEtiquetaSpecified, idInspeccion, idInspeccionSpecified, tipo, tipoSpecified, observaciones, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setAsignarEtiqueta", result);
                }
            }
        }.execute();
    }
    
    public void setAsignarEtiqueta(long idUsuario,boolean idUsuarioSpecified,long nEtiqueta,boolean nEtiquetaSpecified,long idInspeccion,boolean idInspeccionSpecified,long tipo,boolean tipoSpecified,String observaciones){
        setAsignarEtiqueta(idUsuario, idUsuarioSpecified, nEtiqueta, nEtiquetaSpecified, idInspeccion, idInspeccionSpecified, tipo, tipoSpecified, observaciones, null);
    }
    
    public void setAsignarEtiqueta(long idUsuario,boolean idUsuarioSpecified,long nEtiqueta,boolean nEtiquetaSpecified,long idInspeccion,boolean idInspeccionSpecified,long tipo,boolean tipoSpecified,String observaciones,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setAsignarEtiqueta");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("NEtiqueta",nEtiqueta);
        soapReq.addProperty("NEtiquetaSpecified",nEtiquetaSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("tipo",tipo);
        soapReq.addProperty("tipoSpecified",tipoSpecified);
        soapReq.addProperty("observaciones",observaciones);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setAsignarEtiqueta", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setAsignarEtiqueta", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getBuscadorInspeccionesAsync(long idUsuario,boolean idUsuarioSpecified,String txtMatricula,String txtNInspeccion,String txtDNI,String dtpDesde,boolean dtpDesdeSpecified,String dtpHasta,boolean dtpHastaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getBuscadorInspeccionesAsync(idUsuario, idUsuarioSpecified, txtMatricula, txtNInspeccion, txtDNI, dtpDesde, dtpDesdeSpecified, dtpHasta, dtpHastaSpecified, null);
    }
    
    public void getBuscadorInspeccionesAsync(final long idUsuario,final boolean idUsuarioSpecified,final String txtMatricula,final String txtNInspeccion,final String txtDNI,final String dtpDesde,final boolean dtpDesdeSpecified,final String dtpHasta,final boolean dtpHastaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQUERY_BuscadorInspecciones_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQUERY_BuscadorInspecciones_Result doInBackground(Void... params) {
                return getBuscadorInspecciones(idUsuario, idUsuarioSpecified, txtMatricula, txtNInspeccion, txtDNI, dtpDesde, dtpDesdeSpecified, dtpHasta, dtpHastaSpecified, headers);
            }
         
            protected void onPostExecute(VectorQUERY_BuscadorInspecciones_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getBuscadorInspecciones", result);
                }
            }
        }.execute();
    }
    
    public VectorQUERY_BuscadorInspecciones_Result getBuscadorInspecciones(long idUsuario,boolean idUsuarioSpecified,String txtMatricula,String txtNInspeccion,String txtDNI,String dtpDesde,boolean dtpDesdeSpecified,String dtpHasta,boolean dtpHastaSpecified){
        return getBuscadorInspecciones(idUsuario, idUsuarioSpecified, txtMatricula, txtNInspeccion, txtDNI, dtpDesde, dtpDesdeSpecified, dtpHasta, dtpHastaSpecified, null);
    }
    
    public VectorQUERY_BuscadorInspecciones_Result getBuscadorInspecciones(long idUsuario,boolean idUsuarioSpecified,String txtMatricula,String txtNInspeccion,String txtDNI,String dtpDesde,boolean dtpDesdeSpecified,String dtpHasta,boolean dtpHastaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getBuscadorInspecciones");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("txtMatricula",txtMatricula);
        soapReq.addProperty("txtNInspeccion",txtNInspeccion);
        soapReq.addProperty("txtDNI",txtDNI);
        soapReq.addProperty("dtpDesde",dtpDesde);
        soapReq.addProperty("dtpDesdeSpecified",dtpDesdeSpecified);
        soapReq.addProperty("dtpHasta",dtpHasta);
        soapReq.addProperty("dtpHastaSpecified",dtpHastaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getBuscadorInspecciones", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getBuscadorInspecciones", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQUERY_BuscadorInspecciones_Result resultVariable = new VectorQUERY_BuscadorInspecciones_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void generaInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,long idsolicitud,boolean idsolicitudSpecified,long idservicio,boolean idservicioSpecified,long idvehiculo,boolean idvehiculoSpecified,long idClasificacion,boolean idClasificacionSpecified,long idtipoinspeccion,boolean idtipoinspeccionSpecified,boolean alcanceTotal,boolean alcanceTotalSpecified,long idcentro,boolean idcentroSpecified,String codigoNumericoCentro,boolean generaFechaValidez,boolean generaFechaValidezSpecified,String culturaDocumento,long idInspeccionDeAlcance,boolean idInspeccionDeAlcanceSpecified,String fechaInspeccion,boolean fechaInspeccionSpecified,boolean esSegunda,boolean esSegundaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        generaInspeccionAsync(idUsuario, idUsuarioSpecified, idsolicitud, idsolicitudSpecified, idservicio, idservicioSpecified, idvehiculo, idvehiculoSpecified, idClasificacion, idClasificacionSpecified, idtipoinspeccion, idtipoinspeccionSpecified, alcanceTotal, alcanceTotalSpecified, idcentro, idcentroSpecified, codigoNumericoCentro, generaFechaValidez, generaFechaValidezSpecified, culturaDocumento, idInspeccionDeAlcance, idInspeccionDeAlcanceSpecified, fechaInspeccion, fechaInspeccionSpecified, esSegunda, esSegundaSpecified, null);
    }
    
    public void generaInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idsolicitud,final boolean idsolicitudSpecified,final long idservicio,final boolean idservicioSpecified,final long idvehiculo,final boolean idvehiculoSpecified,final long idClasificacion,final boolean idClasificacionSpecified,final long idtipoinspeccion,final boolean idtipoinspeccionSpecified,final boolean alcanceTotal,final boolean alcanceTotalSpecified,final long idcentro,final boolean idcentroSpecified,final String codigoNumericoCentro,final boolean generaFechaValidez,final boolean generaFechaValidezSpecified,final String culturaDocumento,final long idInspeccionDeAlcance,final boolean idInspeccionDeAlcanceSpecified,final String fechaInspeccion,final boolean fechaInspeccionSpecified,final boolean esSegunda,final boolean esSegundaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, KeyValuePairOfstringlong>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected KeyValuePairOfstringlong doInBackground(Void... params) {
                return generaInspeccion(idUsuario, idUsuarioSpecified, idsolicitud, idsolicitudSpecified, idservicio, idservicioSpecified, idvehiculo, idvehiculoSpecified, idClasificacion, idClasificacionSpecified, idtipoinspeccion, idtipoinspeccionSpecified, alcanceTotal, alcanceTotalSpecified, idcentro, idcentroSpecified, codigoNumericoCentro, generaFechaValidez, generaFechaValidezSpecified, culturaDocumento, idInspeccionDeAlcance, idInspeccionDeAlcanceSpecified, fechaInspeccion, fechaInspeccionSpecified, esSegunda, esSegundaSpecified, headers);
            }
         
            protected void onPostExecute(KeyValuePairOfstringlong result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("generaInspeccion", result);
                }
            }
        }.execute();
    }
    
    public KeyValuePairOfstringlong generaInspeccion(long idUsuario,boolean idUsuarioSpecified,long idsolicitud,boolean idsolicitudSpecified,long idservicio,boolean idservicioSpecified,long idvehiculo,boolean idvehiculoSpecified,long idClasificacion,boolean idClasificacionSpecified,long idtipoinspeccion,boolean idtipoinspeccionSpecified,boolean alcanceTotal,boolean alcanceTotalSpecified,long idcentro,boolean idcentroSpecified,String codigoNumericoCentro,boolean generaFechaValidez,boolean generaFechaValidezSpecified,String culturaDocumento,long idInspeccionDeAlcance,boolean idInspeccionDeAlcanceSpecified,String fechaInspeccion,boolean fechaInspeccionSpecified,boolean esSegunda,boolean esSegundaSpecified){
        return generaInspeccion(idUsuario, idUsuarioSpecified, idsolicitud, idsolicitudSpecified, idservicio, idservicioSpecified, idvehiculo, idvehiculoSpecified, idClasificacion, idClasificacionSpecified, idtipoinspeccion, idtipoinspeccionSpecified, alcanceTotal, alcanceTotalSpecified, idcentro, idcentroSpecified, codigoNumericoCentro, generaFechaValidez, generaFechaValidezSpecified, culturaDocumento, idInspeccionDeAlcance, idInspeccionDeAlcanceSpecified, fechaInspeccion, fechaInspeccionSpecified, esSegunda, esSegundaSpecified, null);
    }
    
    public KeyValuePairOfstringlong generaInspeccion(long idUsuario,boolean idUsuarioSpecified,long idsolicitud,boolean idsolicitudSpecified,long idservicio,boolean idservicioSpecified,long idvehiculo,boolean idvehiculoSpecified,long idClasificacion,boolean idClasificacionSpecified,long idtipoinspeccion,boolean idtipoinspeccionSpecified,boolean alcanceTotal,boolean alcanceTotalSpecified,long idcentro,boolean idcentroSpecified,String codigoNumericoCentro,boolean generaFechaValidez,boolean generaFechaValidezSpecified,String culturaDocumento,long idInspeccionDeAlcance,boolean idInspeccionDeAlcanceSpecified,String fechaInspeccion,boolean fechaInspeccionSpecified,boolean esSegunda,boolean esSegundaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","generaInspeccion");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idsolicitud",idsolicitud);
        soapReq.addProperty("idsolicitudSpecified",idsolicitudSpecified);
        soapReq.addProperty("idservicio",idservicio);
        soapReq.addProperty("idservicioSpecified",idservicioSpecified);
        soapReq.addProperty("idvehiculo",idvehiculo);
        soapReq.addProperty("idvehiculoSpecified",idvehiculoSpecified);
        soapReq.addProperty("idClasificacion",idClasificacion);
        soapReq.addProperty("idClasificacionSpecified",idClasificacionSpecified);
        soapReq.addProperty("idtipoinspeccion",idtipoinspeccion);
        soapReq.addProperty("idtipoinspeccionSpecified",idtipoinspeccionSpecified);
        soapReq.addProperty("alcanceTotal",alcanceTotal);
        soapReq.addProperty("alcanceTotalSpecified",alcanceTotalSpecified);
        soapReq.addProperty("idcentro",idcentro);
        soapReq.addProperty("idcentroSpecified",idcentroSpecified);
        soapReq.addProperty("codigoNumericoCentro",codigoNumericoCentro);
        soapReq.addProperty("GeneraFechaValidez",generaFechaValidez);
        soapReq.addProperty("GeneraFechaValidezSpecified",generaFechaValidezSpecified);
        soapReq.addProperty("CulturaDocumento",culturaDocumento);
        soapReq.addProperty("idInspeccionDeAlcance",idInspeccionDeAlcance);
        soapReq.addProperty("idInspeccionDeAlcanceSpecified",idInspeccionDeAlcanceSpecified);
        soapReq.addProperty("fechaInspeccion",fechaInspeccion);
        soapReq.addProperty("fechaInspeccionSpecified",fechaInspeccionSpecified);
        soapReq.addProperty("esSegunda",esSegunda);
        soapReq.addProperty("esSegundaSpecified",esSegundaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/generaInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/generaInspeccion", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    KeyValuePairOfstringlong resultVariable =  new KeyValuePairOfstringlong (j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void actualizaAlcanceAsync(long idUsuario,boolean idUsuarioSpecified,long idinspeccion,boolean idinspeccionSpecified,long idservicio,boolean idservicioSpecified,long idClasificacionNueva,boolean idClasificacionNuevaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        actualizaAlcanceAsync(idUsuario, idUsuarioSpecified, idinspeccion, idinspeccionSpecified, idservicio, idservicioSpecified, idClasificacionNueva, idClasificacionNuevaSpecified, null);
    }
    
    public void actualizaAlcanceAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinspeccion,final boolean idinspeccionSpecified,final long idservicio,final boolean idservicioSpecified,final long idClasificacionNueva,final boolean idClasificacionNuevaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return actualizaAlcance(idUsuario, idUsuarioSpecified, idinspeccion, idinspeccionSpecified, idservicio, idservicioSpecified, idClasificacionNueva, idClasificacionNuevaSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("actualizaAlcance", result);
                }
            }
        }.execute();
    }
    
    public String actualizaAlcance(long idUsuario,boolean idUsuarioSpecified,long idinspeccion,boolean idinspeccionSpecified,long idservicio,boolean idservicioSpecified,long idClasificacionNueva,boolean idClasificacionNuevaSpecified){
        return actualizaAlcance(idUsuario, idUsuarioSpecified, idinspeccion, idinspeccionSpecified, idservicio, idservicioSpecified, idClasificacionNueva, idClasificacionNuevaSpecified, null);
    }
    
    public String actualizaAlcance(long idUsuario,boolean idUsuarioSpecified,long idinspeccion,boolean idinspeccionSpecified,long idservicio,boolean idservicioSpecified,long idClasificacionNueva,boolean idClasificacionNuevaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","actualizaAlcance");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinspeccion",idinspeccion);
        soapReq.addProperty("idinspeccionSpecified",idinspeccionSpecified);
        soapReq.addProperty("idservicio",idservicio);
        soapReq.addProperty("idservicioSpecified",idservicioSpecified);
        soapReq.addProperty("idClasificacionNueva",idClasificacionNueva);
        soapReq.addProperty("idClasificacionNuevaSpecified",idClasificacionNuevaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/actualizaAlcance", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/actualizaAlcance", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getInspeccionesNoFinalizadasAsync(long idUsuario,boolean idUsuarioSpecified,long idCentro,boolean idCentroSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionesNoFinalizadasAsync(idUsuario, idUsuarioSpecified, idCentro, idCentroSpecified, null);
    }
    
    public void getInspeccionesNoFinalizadasAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idCentro,final boolean idCentroSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorInspecionResumen>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorInspecionResumen doInBackground(Void... params) {
                return getInspeccionesNoFinalizadas(idUsuario, idUsuarioSpecified, idCentro, idCentroSpecified, headers);
            }
         
            protected void onPostExecute(VectorInspecionResumen result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionesNoFinalizadas", result);
                }
            }
        }.execute();
    }
    
    public VectorInspecionResumen getInspeccionesNoFinalizadas(long idUsuario,boolean idUsuarioSpecified,long idCentro,boolean idCentroSpecified){
        return getInspeccionesNoFinalizadas(idUsuario, idUsuarioSpecified, idCentro, idCentroSpecified, null);
    }
    
    public VectorInspecionResumen getInspeccionesNoFinalizadas(long idUsuario,boolean idUsuarioSpecified,long idCentro,boolean idCentroSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionesNoFinalizadas");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idCentro",idCentro);
        soapReq.addProperty("idCentroSpecified",idCentroSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionesNoFinalizadas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionesNoFinalizadas", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorInspecionResumen resultVariable = new VectorInspecionResumen(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,long idinspe,boolean idinspeSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionAsync(idUsuario, idUsuarioSpecified, idinspe, idinspeSpecified, null);
    }
    
    public void getInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinspe,final boolean idinspeSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Inspeccion>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Inspeccion doInBackground(Void... params) {
                return getInspeccion(idUsuario, idUsuarioSpecified, idinspe, idinspeSpecified, headers);
            }
         
            protected void onPostExecute(Inspeccion result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccion", result);
                }
            }
        }.execute();
    }
    
    public Inspeccion getInspeccion(long idUsuario,boolean idUsuarioSpecified,long idinspe,boolean idinspeSpecified){
        return getInspeccion(idUsuario, idUsuarioSpecified, idinspe, idinspeSpecified, null);
    }
    
    public Inspeccion getInspeccion(long idUsuario,boolean idUsuarioSpecified,long idinspe,boolean idinspeSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccion");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinspe",idinspe);
        soapReq.addProperty("idinspeSpecified",idinspeSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccion", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    Inspeccion resultVariable =  new Inspeccion (j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void GenerarNumeroInspeccionAsync(String codigoNumericoCentro) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GenerarNumeroInspeccionAsync(codigoNumericoCentro, null);
    }
    
    public void GenerarNumeroInspeccionAsync(final String codigoNumericoCentro,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return GenerarNumeroInspeccion(codigoNumericoCentro, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("GenerarNumeroInspeccion", result);
                }
            }
        }.execute();
    }
    
    public String GenerarNumeroInspeccion(String codigoNumericoCentro){
        return GenerarNumeroInspeccion(codigoNumericoCentro, null);
    }
    
    public String GenerarNumeroInspeccion(String codigoNumericoCentro,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","GenerarNumeroInspeccion");
        soapReq.addProperty("codigoNumericoCentro",codigoNumericoCentro);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/GenerarNumeroInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/GenerarNumeroInspeccion", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getEtapaBloqueByEtapaAsync(long idUsuario,boolean idUsuarioSpecified,long idetapa,boolean idetapaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getEtapaBloqueByEtapaAsync(idUsuario, idUsuarioSpecified, idetapa, idetapaSpecified, null);
    }
    
    public void getEtapaBloqueByEtapaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idetapa,final boolean idetapaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorEtapaBloque>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorEtapaBloque doInBackground(Void... params) {
                return getEtapaBloqueByEtapa(idUsuario, idUsuarioSpecified, idetapa, idetapaSpecified, headers);
            }
         
            protected void onPostExecute(VectorEtapaBloque result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getEtapaBloqueByEtapa", result);
                }
            }
        }.execute();
    }
    
    public VectorEtapaBloque getEtapaBloqueByEtapa(long idUsuario,boolean idUsuarioSpecified,long idetapa,boolean idetapaSpecified){
        return getEtapaBloqueByEtapa(idUsuario, idUsuarioSpecified, idetapa, idetapaSpecified, null);
    }
    
    public VectorEtapaBloque getEtapaBloqueByEtapa(long idUsuario,boolean idUsuarioSpecified,long idetapa,boolean idetapaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getEtapaBloqueByEtapa");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idetapa",idetapa);
        soapReq.addProperty("idetapaSpecified",idetapaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getEtapaBloqueByEtapa", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getEtapaBloqueByEtapa", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorEtapaBloque resultVariable = new VectorEtapaBloque(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getImagenesInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getImagenesInspeccionAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getImagenesInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorInspeccionImagen>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorInspeccionImagen doInBackground(Void... params) {
                return getImagenesInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(VectorInspeccionImagen result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getImagenesInspeccion", result);
                }
            }
        }.execute();
    }
    
    public VectorInspeccionImagen getImagenesInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return getImagenesInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public VectorInspeccionImagen getImagenesInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getImagenesInspeccion");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getImagenesInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getImagenesInspeccion", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorInspeccionImagen resultVariable = new VectorInspeccionImagen(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void agregarImagenAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorByte imagen) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        agregarImagenAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, imagen, null);
    }
    
    public void agregarImagenAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final VectorByte imagen,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                agregarImagen(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, imagen, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("agregarImagen", result);
                }
            }
        }.execute();
    }
    
    public void agregarImagen(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorByte imagen){
        agregarImagen(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, imagen, null);
    }
    
    public void agregarImagen(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,VectorByte imagen,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","agregarImagen");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("imagen",imagen.toString());
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/agregarImagen", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/agregarImagen", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void eliminarImagenAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idImagen,boolean idImagenSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        eliminarImagenAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idImagen, idImagenSpecified, null);
    }
    
    public void eliminarImagenAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long idImagen,final boolean idImagenSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return eliminarImagen(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idImagen, idImagenSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("eliminarImagen", result);
                }
            }
        }.execute();
    }
    
    public String eliminarImagen(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idImagen,boolean idImagenSpecified){
        return eliminarImagen(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idImagen, idImagenSpecified, null);
    }
    
    public String eliminarImagen(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idImagen,boolean idImagenSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","eliminarImagen");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idImagen",idImagen);
        soapReq.addProperty("idImagenSpecified",idImagenSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/eliminarImagen", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/eliminarImagen", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getListaEtiquetasAsync(long idUsuario,boolean idUsuarioSpecified,long desde,boolean desdeSpecified,long hasta,boolean hastaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getListaEtiquetasAsync(idUsuario, idUsuarioSpecified, desde, desdeSpecified, hasta, hastaSpecified, null);
    }
    
    public void getListaEtiquetasAsync(final long idUsuario,final boolean idUsuarioSpecified,final long desde,final boolean desdeSpecified,final long hasta,final boolean hastaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQUERY_ListaEtiquetas_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQUERY_ListaEtiquetas_Result doInBackground(Void... params) {
                return getListaEtiquetas(idUsuario, idUsuarioSpecified, desde, desdeSpecified, hasta, hastaSpecified, headers);
            }
         
            protected void onPostExecute(VectorQUERY_ListaEtiquetas_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getListaEtiquetas", result);
                }
            }
        }.execute();
    }
    
    public VectorQUERY_ListaEtiquetas_Result getListaEtiquetas(long idUsuario,boolean idUsuarioSpecified,long desde,boolean desdeSpecified,long hasta,boolean hastaSpecified){
        return getListaEtiquetas(idUsuario, idUsuarioSpecified, desde, desdeSpecified, hasta, hastaSpecified, null);
    }
    
    public VectorQUERY_ListaEtiquetas_Result getListaEtiquetas(long idUsuario,boolean idUsuarioSpecified,long desde,boolean desdeSpecified,long hasta,boolean hastaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getListaEtiquetas");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("desde",desde);
        soapReq.addProperty("desdeSpecified",desdeSpecified);
        soapReq.addProperty("hasta",hasta);
        soapReq.addProperty("hastaSpecified",hastaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getListaEtiquetas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getListaEtiquetas", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQUERY_ListaEtiquetas_Result resultVariable = new VectorQUERY_ListaEtiquetas_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getFechaValidezCalculadaAsync(long idVehiculoClasificacion,boolean idVehiculoClasificacionSpecified,String fechaPrimeraMatriculacion,boolean fechaPrimeraMatriculacionSpecified,String fechaCierreInspeccion,boolean fechaCierreInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getFechaValidezCalculadaAsync(idVehiculoClasificacion, idVehiculoClasificacionSpecified, fechaPrimeraMatriculacion, fechaPrimeraMatriculacionSpecified, fechaCierreInspeccion, fechaCierreInspeccionSpecified, null);
    }
    
    public void getFechaValidezCalculadaAsync(final long idVehiculoClasificacion,final boolean idVehiculoClasificacionSpecified,final String fechaPrimeraMatriculacion,final boolean fechaPrimeraMatriculacionSpecified,final String fechaCierreInspeccion,final boolean fechaCierreInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                getFechaValidezCalculada(idVehiculoClasificacion, idVehiculoClasificacionSpecified, fechaPrimeraMatriculacion, fechaPrimeraMatriculacionSpecified, fechaCierreInspeccion, fechaCierreInspeccionSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getFechaValidezCalculada", result);
                }
            }
        }.execute();
    }
    
    public void getFechaValidezCalculada(long idVehiculoClasificacion,boolean idVehiculoClasificacionSpecified,String fechaPrimeraMatriculacion,boolean fechaPrimeraMatriculacionSpecified,String fechaCierreInspeccion,boolean fechaCierreInspeccionSpecified){
        getFechaValidezCalculada(idVehiculoClasificacion, idVehiculoClasificacionSpecified, fechaPrimeraMatriculacion, fechaPrimeraMatriculacionSpecified, fechaCierreInspeccion, fechaCierreInspeccionSpecified, null);
    }
    
    public void getFechaValidezCalculada(long idVehiculoClasificacion,boolean idVehiculoClasificacionSpecified,String fechaPrimeraMatriculacion,boolean fechaPrimeraMatriculacionSpecified,String fechaCierreInspeccion,boolean fechaCierreInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getFechaValidezCalculada");
        soapReq.addProperty("IdVehiculoClasificacion",idVehiculoClasificacion);
        soapReq.addProperty("IdVehiculoClasificacionSpecified",idVehiculoClasificacionSpecified);
        soapReq.addProperty("FechaPrimeraMatriculacion",fechaPrimeraMatriculacion);
        soapReq.addProperty("FechaPrimeraMatriculacionSpecified",fechaPrimeraMatriculacionSpecified);
        soapReq.addProperty("fechaCierreInspeccion",fechaCierreInspeccion);
        soapReq.addProperty("fechaCierreInspeccionSpecified",fechaCierreInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getFechaValidezCalculada", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getFechaValidezCalculada", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setFechaValidezCalculadaAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long numeroDistintivo,boolean numeroDistintivoSpecified,long tipoDistitivo,boolean tipoDistitivoSpecified,String fechaValidezNueva,boolean fechaValidezNuevaSpecified,String obsercaciones) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setFechaValidezCalculadaAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, numeroDistintivo, numeroDistintivoSpecified, tipoDistitivo, tipoDistitivoSpecified, fechaValidezNueva, fechaValidezNuevaSpecified, obsercaciones, null);
    }
    
    public void setFechaValidezCalculadaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long numeroDistintivo,final boolean numeroDistintivoSpecified,final long tipoDistitivo,final boolean tipoDistitivoSpecified,final String fechaValidezNueva,final boolean fechaValidezNuevaSpecified,final String obsercaciones,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                setFechaValidezCalculada(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, numeroDistintivo, numeroDistintivoSpecified, tipoDistitivo, tipoDistitivoSpecified, fechaValidezNueva, fechaValidezNuevaSpecified, obsercaciones, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setFechaValidezCalculada", result);
                }
            }
        }.execute();
    }
    
    public void setFechaValidezCalculada(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long numeroDistintivo,boolean numeroDistintivoSpecified,long tipoDistitivo,boolean tipoDistitivoSpecified,String fechaValidezNueva,boolean fechaValidezNuevaSpecified,String obsercaciones){
        setFechaValidezCalculada(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, numeroDistintivo, numeroDistintivoSpecified, tipoDistitivo, tipoDistitivoSpecified, fechaValidezNueva, fechaValidezNuevaSpecified, obsercaciones, null);
    }
    
    public void setFechaValidezCalculada(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long numeroDistintivo,boolean numeroDistintivoSpecified,long tipoDistitivo,boolean tipoDistitivoSpecified,String fechaValidezNueva,boolean fechaValidezNuevaSpecified,String obsercaciones,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setFechaValidezCalculada");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("NumeroDistintivo",numeroDistintivo);
        soapReq.addProperty("NumeroDistintivoSpecified",numeroDistintivoSpecified);
        soapReq.addProperty("TipoDistitivo",tipoDistitivo);
        soapReq.addProperty("TipoDistitivoSpecified",tipoDistitivoSpecified);
        soapReq.addProperty("FechaValidezNueva",fechaValidezNueva);
        soapReq.addProperty("FechaValidezNuevaSpecified",fechaValidezNuevaSpecified);
        soapReq.addProperty("Obsercaciones",obsercaciones);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setFechaValidezCalculada", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setFechaValidezCalculada", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void HayAlcancePendienteAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        HayAlcancePendienteAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void HayAlcancePendienteAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                HayAlcancePendiente(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("HayAlcancePendiente", result);
                }
            }
        }.execute();
    }
    
    public void HayAlcancePendiente(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        HayAlcancePendiente(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void HayAlcancePendiente(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","HayAlcancePendiente");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/HayAlcancePendiente", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/HayAlcancePendiente", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void HayDefectosConsultaAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        HayDefectosConsultaAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void HayDefectosConsultaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                HayDefectosConsulta(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("HayDefectosConsulta", result);
                }
            }
        }.execute();
    }
    
    public void HayDefectosConsulta(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        HayDefectosConsulta(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void HayDefectosConsulta(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","HayDefectosConsulta");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/HayDefectosConsulta", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/HayDefectosConsulta", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void DuplicarInspeccionAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,String texto,long idServicio,boolean idServicioSpecified,String centro,long tipoDuplicar,boolean tipoDuplicarSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        DuplicarInspeccionAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, texto, idServicio, idServicioSpecified, centro, tipoDuplicar, tipoDuplicarSpecified, null);
    }
    
    public void DuplicarInspeccionAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final String texto,final long idServicio,final boolean idServicioSpecified,final String centro,final long tipoDuplicar,final boolean tipoDuplicarSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Inspeccion>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Inspeccion doInBackground(Void... params) {
                return DuplicarInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, texto, idServicio, idServicioSpecified, centro, tipoDuplicar, tipoDuplicarSpecified, headers);
            }
         
            protected void onPostExecute(Inspeccion result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("DuplicarInspeccion", result);
                }
            }
        }.execute();
    }
    
    public Inspeccion DuplicarInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,String texto,long idServicio,boolean idServicioSpecified,String centro,long tipoDuplicar,boolean tipoDuplicarSpecified){
        return DuplicarInspeccion(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, texto, idServicio, idServicioSpecified, centro, tipoDuplicar, tipoDuplicarSpecified, null);
    }
    
    public Inspeccion DuplicarInspeccion(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,String texto,long idServicio,boolean idServicioSpecified,String centro,long tipoDuplicar,boolean tipoDuplicarSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","DuplicarInspeccion");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("texto",texto);
        soapReq.addProperty("idServicio",idServicio);
        soapReq.addProperty("idServicioSpecified",idServicioSpecified);
        soapReq.addProperty("centro",centro);
        soapReq.addProperty("tipoDuplicar",tipoDuplicar);
        soapReq.addProperty("tipoDuplicarSpecified",tipoDuplicarSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/DuplicarInspeccion", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/DuplicarInspeccion", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    Inspeccion resultVariable =  new Inspeccion (j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getInspeccionesDeVehiculoFinalizadasAsync(long idUsuario,boolean idUsuarioSpecified,long idVehiculo,boolean idVehiculoSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionesDeVehiculoFinalizadasAsync(idUsuario, idUsuarioSpecified, idVehiculo, idVehiculoSpecified, null);
    }
    
    public void getInspeccionesDeVehiculoFinalizadasAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idVehiculo,final boolean idVehiculoSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorInspeccion>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorInspeccion doInBackground(Void... params) {
                return getInspeccionesDeVehiculoFinalizadas(idUsuario, idUsuarioSpecified, idVehiculo, idVehiculoSpecified, headers);
            }
         
            protected void onPostExecute(VectorInspeccion result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionesDeVehiculoFinalizadas", result);
                }
            }
        }.execute();
    }
    
    public VectorInspeccion getInspeccionesDeVehiculoFinalizadas(long idUsuario,boolean idUsuarioSpecified,long idVehiculo,boolean idVehiculoSpecified){
        return getInspeccionesDeVehiculoFinalizadas(idUsuario, idUsuarioSpecified, idVehiculo, idVehiculoSpecified, null);
    }
    
    public VectorInspeccion getInspeccionesDeVehiculoFinalizadas(long idUsuario,boolean idUsuarioSpecified,long idVehiculo,boolean idVehiculoSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionesDeVehiculoFinalizadas");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idVehiculo",idVehiculo);
        soapReq.addProperty("idVehiculoSpecified",idVehiculoSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionesDeVehiculoFinalizadas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionesDeVehiculoFinalizadas", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorInspeccion resultVariable = new VectorInspeccion(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void setLineaJefeEquipoAsync(long idUsuario,boolean idUsuarioSpecified,VectorLineaJefeEquipo lista) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setLineaJefeEquipoAsync(idUsuario, idUsuarioSpecified, lista, null);
    }
    
    public void setLineaJefeEquipoAsync(final long idUsuario,final boolean idUsuarioSpecified,final VectorLineaJefeEquipo lista,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setLineaJefeEquipo(idUsuario, idUsuarioSpecified, lista, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setLineaJefeEquipo", result);
                }
            }
        }.execute();
    }
    
    public String setLineaJefeEquipo(long idUsuario,boolean idUsuarioSpecified,VectorLineaJefeEquipo lista){
        return setLineaJefeEquipo(idUsuario, idUsuarioSpecified, lista, null);
    }
    
    public String setLineaJefeEquipo(long idUsuario,boolean idUsuarioSpecified,VectorLineaJefeEquipo lista,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setLineaJefeEquipo");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("Lista",lista);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setLineaJefeEquipo", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setLineaJefeEquipo", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void tieneLineaJefeEquipoAsync(long idUsuario,boolean idUsuarioSpecified,String codigo) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        tieneLineaJefeEquipoAsync(idUsuario, idUsuarioSpecified, codigo, null);
    }
    
    public void tieneLineaJefeEquipoAsync(final long idUsuario,final boolean idUsuarioSpecified,final String codigo,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                tieneLineaJefeEquipo(idUsuario, idUsuarioSpecified, codigo, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("tieneLineaJefeEquipo", result);
                }
            }
        }.execute();
    }
    
    public void tieneLineaJefeEquipo(long idUsuario,boolean idUsuarioSpecified,String codigo){
        tieneLineaJefeEquipo(idUsuario, idUsuarioSpecified, codigo, null);
    }
    
    public void tieneLineaJefeEquipo(long idUsuario,boolean idUsuarioSpecified,String codigo,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","tieneLineaJefeEquipo");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("codigo",codigo);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/tieneLineaJefeEquipo", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/tieneLineaJefeEquipo", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getInspeccionAlcancePruebasYElementosAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionAlcancePruebasYElementosAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getInspeccionAlcancePruebasYElementosAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQueryInspeccionResultadoPrueba_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQueryInspeccionResultadoPrueba_Result doInBackground(Void... params) {
                return getInspeccionAlcancePruebasYElementos(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(VectorQueryInspeccionResultadoPrueba_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionAlcancePruebasYElementos", result);
                }
            }
        }.execute();
    }
    
    public VectorQueryInspeccionResultadoPrueba_Result getInspeccionAlcancePruebasYElementos(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return getInspeccionAlcancePruebasYElementos(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public VectorQueryInspeccionResultadoPrueba_Result getInspeccionAlcancePruebasYElementos(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionAlcancePruebasYElementos");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionAlcancePruebasYElementos", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionAlcancePruebasYElementos", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQueryInspeccionResultadoPrueba_Result resultVariable = new VectorQueryInspeccionResultadoPrueba_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getAlcanceBloquePruebaEtapaAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idEtapa,boolean idEtapaSpecified,String bloques) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getAlcanceBloquePruebaEtapaAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idEtapa, idEtapaSpecified, bloques, null);
    }
    
    public void getAlcanceBloquePruebaEtapaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long idEtapa,final boolean idEtapaSpecified,final String bloques,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQUERY_AlcanceBloquePruebaEtapa_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQUERY_AlcanceBloquePruebaEtapa_Result doInBackground(Void... params) {
                return getAlcanceBloquePruebaEtapa(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idEtapa, idEtapaSpecified, bloques, headers);
            }
         
            protected void onPostExecute(VectorQUERY_AlcanceBloquePruebaEtapa_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getAlcanceBloquePruebaEtapa", result);
                }
            }
        }.execute();
    }
    
    public VectorQUERY_AlcanceBloquePruebaEtapa_Result getAlcanceBloquePruebaEtapa(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idEtapa,boolean idEtapaSpecified,String bloques){
        return getAlcanceBloquePruebaEtapa(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idEtapa, idEtapaSpecified, bloques, null);
    }
    
    public VectorQUERY_AlcanceBloquePruebaEtapa_Result getAlcanceBloquePruebaEtapa(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idEtapa,boolean idEtapaSpecified,String bloques,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getAlcanceBloquePruebaEtapa");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idEtapa",idEtapa);
        soapReq.addProperty("idEtapaSpecified",idEtapaSpecified);
        soapReq.addProperty("bloques",bloques);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getAlcanceBloquePruebaEtapa", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getAlcanceBloquePruebaEtapa", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQUERY_AlcanceBloquePruebaEtapa_Result resultVariable = new VectorQUERY_AlcanceBloquePruebaEtapa_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void setAlcancePruebaMaquinaAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPrueba,boolean idPruebaSpecified,boolean realizada,boolean realizadaSpecified,long idMaquina,boolean idMaquinaSpecified,long idEtapa,boolean idEtapaSpecified,boolean autoConfirmar,boolean autoConfirmarSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setAlcancePruebaMaquinaAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idPrueba, idPruebaSpecified, realizada, realizadaSpecified, idMaquina, idMaquinaSpecified, idEtapa, idEtapaSpecified, autoConfirmar, autoConfirmarSpecified, null);
    }
    
    public void setAlcancePruebaMaquinaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long idPrueba,final boolean idPruebaSpecified,final boolean realizada,final boolean realizadaSpecified,final long idMaquina,final boolean idMaquinaSpecified,final long idEtapa,final boolean idEtapaSpecified,final boolean autoConfirmar,final boolean autoConfirmarSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                setAlcancePruebaMaquina(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idPrueba, idPruebaSpecified, realizada, realizadaSpecified, idMaquina, idMaquinaSpecified, idEtapa, idEtapaSpecified, autoConfirmar, autoConfirmarSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setAlcancePruebaMaquina", result);
                }
            }
        }.execute();
    }
    
    public void setAlcancePruebaMaquina(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPrueba,boolean idPruebaSpecified,boolean realizada,boolean realizadaSpecified,long idMaquina,boolean idMaquinaSpecified,long idEtapa,boolean idEtapaSpecified,boolean autoConfirmar,boolean autoConfirmarSpecified){
        setAlcancePruebaMaquina(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, idPrueba, idPruebaSpecified, realizada, realizadaSpecified, idMaquina, idMaquinaSpecified, idEtapa, idEtapaSpecified, autoConfirmar, autoConfirmarSpecified, null);
    }
    
    public void setAlcancePruebaMaquina(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPrueba,boolean idPruebaSpecified,boolean realizada,boolean realizadaSpecified,long idMaquina,boolean idMaquinaSpecified,long idEtapa,boolean idEtapaSpecified,boolean autoConfirmar,boolean autoConfirmarSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setAlcancePruebaMaquina");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idPrueba",idPrueba);
        soapReq.addProperty("idPruebaSpecified",idPruebaSpecified);
        soapReq.addProperty("realizada",realizada);
        soapReq.addProperty("realizadaSpecified",realizadaSpecified);
        soapReq.addProperty("idMaquina",idMaquina);
        soapReq.addProperty("idMaquinaSpecified",idMaquinaSpecified);
        soapReq.addProperty("idEtapa",idEtapa);
        soapReq.addProperty("idEtapaSpecified",idEtapaSpecified);
        soapReq.addProperty("autoConfirmar",autoConfirmar);
        soapReq.addProperty("autoConfirmarSpecified",autoConfirmarSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setAlcancePruebaMaquina", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setAlcancePruebaMaquina", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void setAlcancePruebaCondicionalidadAsync(long idUsuario,boolean idUsuarioSpecified,long idAlcancePrueba,boolean idAlcancePruebaSpecified,long idCondicionalidad,boolean idCondicionalidadSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setAlcancePruebaCondicionalidadAsync(idUsuario, idUsuarioSpecified, idAlcancePrueba, idAlcancePruebaSpecified, idCondicionalidad, idCondicionalidadSpecified, null);
    }
    
    public void setAlcancePruebaCondicionalidadAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idAlcancePrueba,final boolean idAlcancePruebaSpecified,final long idCondicionalidad,final boolean idCondicionalidadSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                setAlcancePruebaCondicionalidad(idUsuario, idUsuarioSpecified, idAlcancePrueba, idAlcancePruebaSpecified, idCondicionalidad, idCondicionalidadSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setAlcancePruebaCondicionalidad", result);
                }
            }
        }.execute();
    }
    
    public void setAlcancePruebaCondicionalidad(long idUsuario,boolean idUsuarioSpecified,long idAlcancePrueba,boolean idAlcancePruebaSpecified,long idCondicionalidad,boolean idCondicionalidadSpecified){
        setAlcancePruebaCondicionalidad(idUsuario, idUsuarioSpecified, idAlcancePrueba, idAlcancePruebaSpecified, idCondicionalidad, idCondicionalidadSpecified, null);
    }
    
    public void setAlcancePruebaCondicionalidad(long idUsuario,boolean idUsuarioSpecified,long idAlcancePrueba,boolean idAlcancePruebaSpecified,long idCondicionalidad,boolean idCondicionalidadSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setAlcancePruebaCondicionalidad");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idAlcancePrueba",idAlcancePrueba);
        soapReq.addProperty("idAlcancePruebaSpecified",idAlcancePruebaSpecified);
        soapReq.addProperty("idCondicionalidad",idCondicionalidad);
        soapReq.addProperty("idCondicionalidadSpecified",idCondicionalidadSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setAlcancePruebaCondicionalidad", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setAlcancePruebaCondicionalidad", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void hayOtrasInspeccionesAbiertasAsync(long idCentro,boolean idCentroSpecified,long idEtapa,boolean idEtapaSpecified,String codigo) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        hayOtrasInspeccionesAbiertasAsync(idCentro, idCentroSpecified, idEtapa, idEtapaSpecified, codigo, null);
    }
    
    public void hayOtrasInspeccionesAbiertasAsync(final long idCentro,final boolean idCentroSpecified,final long idEtapa,final boolean idEtapaSpecified,final String codigo,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorString>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorString doInBackground(Void... params) {
                return hayOtrasInspeccionesAbiertas(idCentro, idCentroSpecified, idEtapa, idEtapaSpecified, codigo, headers);
            }
         
            protected void onPostExecute(VectorString result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("hayOtrasInspeccionesAbiertas", result);
                }
            }
        }.execute();
    }
    
    public VectorString hayOtrasInspeccionesAbiertas(long idCentro,boolean idCentroSpecified,long idEtapa,boolean idEtapaSpecified,String codigo){
        return hayOtrasInspeccionesAbiertas(idCentro, idCentroSpecified, idEtapa, idEtapaSpecified, codigo, null);
    }
    
    public VectorString hayOtrasInspeccionesAbiertas(long idCentro,boolean idCentroSpecified,long idEtapa,boolean idEtapaSpecified,String codigo,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","hayOtrasInspeccionesAbiertas");
        soapReq.addProperty("idCentro",idCentro);
        soapReq.addProperty("idCentroSpecified",idCentroSpecified);
        soapReq.addProperty("IdEtapa",idEtapa);
        soapReq.addProperty("IdEtapaSpecified",idEtapaSpecified);
        soapReq.addProperty("Codigo",codigo);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/hayOtrasInspeccionesAbiertas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/hayOtrasInspeccionesAbiertas", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorString resultVariable = new VectorString(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getInspeccionDocumentosAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionDocumentosAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getInspeccionDocumentosAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorInspeccionDocumento>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorInspeccionDocumento doInBackground(Void... params) {
                return getInspeccionDocumentos(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(VectorInspeccionDocumento result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionDocumentos", result);
                }
            }
        }.execute();
    }
    
    public VectorInspeccionDocumento getInspeccionDocumentos(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return getInspeccionDocumentos(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public VectorInspeccionDocumento getInspeccionDocumentos(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionDocumentos");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionDocumentos", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionDocumentos", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorInspeccionDocumento resultVariable = new VectorInspeccionDocumento(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void setInspeccionDocumentosAsync(long _IdUsuario,boolean _IdUsuarioSpecified,long _idInspeccion,boolean _idInspeccionSpecified,String _URL,String _Observaciones,long _IdInspeccionDocumento,boolean _IdInspeccionDocumentoSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        setInspeccionDocumentosAsync(_IdUsuario, _IdUsuarioSpecified, _idInspeccion, _idInspeccionSpecified, _URL, _Observaciones, _IdInspeccionDocumento, _IdInspeccionDocumentoSpecified, null);
    }
    
    public void setInspeccionDocumentosAsync(final long _IdUsuario,final boolean _IdUsuarioSpecified,final long _idInspeccion,final boolean _idInspeccionSpecified,final String _URL,final String _Observaciones,final long _IdInspeccionDocumento,final boolean _IdInspeccionDocumentoSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return setInspeccionDocumentos(_IdUsuario, _IdUsuarioSpecified, _idInspeccion, _idInspeccionSpecified, _URL, _Observaciones, _IdInspeccionDocumento, _IdInspeccionDocumentoSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("setInspeccionDocumentos", result);
                }
            }
        }.execute();
    }
    
    public String setInspeccionDocumentos(long _IdUsuario,boolean _IdUsuarioSpecified,long _idInspeccion,boolean _idInspeccionSpecified,String _URL,String _Observaciones,long _IdInspeccionDocumento,boolean _IdInspeccionDocumentoSpecified){
        return setInspeccionDocumentos(_IdUsuario, _IdUsuarioSpecified, _idInspeccion, _idInspeccionSpecified, _URL, _Observaciones, _IdInspeccionDocumento, _IdInspeccionDocumentoSpecified, null);
    }
    
    public String setInspeccionDocumentos(long _IdUsuario,boolean _IdUsuarioSpecified,long _idInspeccion,boolean _idInspeccionSpecified,String _URL,String _Observaciones,long _IdInspeccionDocumento,boolean _IdInspeccionDocumentoSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","setInspeccionDocumentos");
        soapReq.addProperty("_IdUsuario",_IdUsuario);
        soapReq.addProperty("_IdUsuarioSpecified",_IdUsuarioSpecified);
        soapReq.addProperty("_idInspeccion",_idInspeccion);
        soapReq.addProperty("_idInspeccionSpecified",_idInspeccionSpecified);
        soapReq.addProperty("_URL",_URL);
        soapReq.addProperty("_Observaciones",_Observaciones);
        soapReq.addProperty("_IdInspeccionDocumento",_IdInspeccionDocumento);
        soapReq.addProperty("_IdInspeccionDocumentoSpecified",_IdInspeccionDocumentoSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionDocumentos", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/setInspeccionDocumentos", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void delInspeccionDocumentosAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccionDocumento,boolean idInspeccionDocumentoSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        delInspeccionDocumentosAsync(idUsuario, idUsuarioSpecified, idInspeccionDocumento, idInspeccionDocumentoSpecified, null);
    }
    
    public void delInspeccionDocumentosAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccionDocumento,final boolean idInspeccionDocumentoSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return delInspeccionDocumentos(idUsuario, idUsuarioSpecified, idInspeccionDocumento, idInspeccionDocumentoSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("delInspeccionDocumentos", result);
                }
            }
        }.execute();
    }
    
    public String delInspeccionDocumentos(long idUsuario,boolean idUsuarioSpecified,long idInspeccionDocumento,boolean idInspeccionDocumentoSpecified){
        return delInspeccionDocumentos(idUsuario, idUsuarioSpecified, idInspeccionDocumento, idInspeccionDocumentoSpecified, null);
    }
    
    public String delInspeccionDocumentos(long idUsuario,boolean idUsuarioSpecified,long idInspeccionDocumento,boolean idInspeccionDocumentoSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","delInspeccionDocumentos");
        soapReq.addProperty("IdUsuario",idUsuario);
        soapReq.addProperty("IdUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccionDocumento",idInspeccionDocumento);
        soapReq.addProperty("idInspeccionDocumentoSpecified",idInspeccionDocumentoSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/delInspeccionDocumentos", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/delInspeccionDocumentos", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getMaquinasUtilizadasEnInspeciconAsync(long idInspeccion,boolean idInspeccionSpecified,int idIdioma,boolean idIdiomaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getMaquinasUtilizadasEnInspeciconAsync(idInspeccion, idInspeccionSpecified, idIdioma, idIdiomaSpecified, null);
    }
    
    public void getMaquinasUtilizadasEnInspeciconAsync(final long idInspeccion,final boolean idInspeccionSpecified,final int idIdioma,final boolean idIdiomaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return getMaquinasUtilizadasEnInspecicon(idInspeccion, idInspeccionSpecified, idIdioma, idIdiomaSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getMaquinasUtilizadasEnInspecicon", result);
                }
            }
        }.execute();
    }
    
    public String getMaquinasUtilizadasEnInspecicon(long idInspeccion,boolean idInspeccionSpecified,int idIdioma,boolean idIdiomaSpecified){
        return getMaquinasUtilizadasEnInspecicon(idInspeccion, idInspeccionSpecified, idIdioma, idIdiomaSpecified, null);
    }
    
    public String getMaquinasUtilizadasEnInspecicon(long idInspeccion,boolean idInspeccionSpecified,int idIdioma,boolean idIdiomaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getMaquinasUtilizadasEnInspecicon");
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idIdioma",idIdioma);
        soapReq.addProperty("idIdiomaSpecified",idIdiomaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getMaquinasUtilizadasEnInspecicon", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getMaquinasUtilizadasEnInspecicon", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getPruebasTraducidasAsync(VectorInt64 idsPruebas,long idIdioma,boolean idIdiomaSpecified,String fecha,boolean fechaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getPruebasTraducidasAsync(idsPruebas, idIdioma, idIdiomaSpecified, fecha, fechaSpecified, null);
    }
    
    public void getPruebasTraducidasAsync(final VectorInt64 idsPruebas,final long idIdioma,final boolean idIdiomaSpecified,final String fecha,final boolean fechaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorPrueba>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorPrueba doInBackground(Void... params) {
                return getPruebasTraducidas(idsPruebas, idIdioma, idIdiomaSpecified, fecha, fechaSpecified, headers);
            }
         
            protected void onPostExecute(VectorPrueba result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getPruebasTraducidas", result);
                }
            }
        }.execute();
    }
    
    public VectorPrueba getPruebasTraducidas(VectorInt64 idsPruebas,long idIdioma,boolean idIdiomaSpecified,String fecha,boolean fechaSpecified){
        return getPruebasTraducidas(idsPruebas, idIdioma, idIdiomaSpecified, fecha, fechaSpecified, null);
    }
    
    public VectorPrueba getPruebasTraducidas(VectorInt64 idsPruebas,long idIdioma,boolean idIdiomaSpecified,String fecha,boolean fechaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getPruebasTraducidas");
        soapReq.addProperty("idsPruebas",idsPruebas);
        soapReq.addProperty("idIdioma",idIdioma);
        soapReq.addProperty("idIdiomaSpecified",idIdiomaSpecified);
        soapReq.addProperty("fecha",fecha);
        soapReq.addProperty("fechaSpecified",fechaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getPruebasTraducidas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getPruebasTraducidas", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorPrueba resultVariable = new VectorPrueba(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void NecesitaEtiquetaCierreAsync(long idusuario,boolean idusuarioSpecified,long idInpseccion,boolean idInpseccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        NecesitaEtiquetaCierreAsync(idusuario, idusuarioSpecified, idInpseccion, idInpseccionSpecified, null);
    }
    
    public void NecesitaEtiquetaCierreAsync(final long idusuario,final boolean idusuarioSpecified,final long idInpseccion,final boolean idInpseccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                NecesitaEtiquetaCierre(idusuario, idusuarioSpecified, idInpseccion, idInpseccionSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("NecesitaEtiquetaCierre", result);
                }
            }
        }.execute();
    }
    
    public void NecesitaEtiquetaCierre(long idusuario,boolean idusuarioSpecified,long idInpseccion,boolean idInpseccionSpecified){
        NecesitaEtiquetaCierre(idusuario, idusuarioSpecified, idInpseccion, idInpseccionSpecified, null);
    }
    
    public void NecesitaEtiquetaCierre(long idusuario,boolean idusuarioSpecified,long idInpseccion,boolean idInpseccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","NecesitaEtiquetaCierre");
        soapReq.addProperty("idusuario",idusuario);
        soapReq.addProperty("idusuarioSpecified",idusuarioSpecified);
        soapReq.addProperty("idInpseccion",idInpseccion);
        soapReq.addProperty("idInpseccionSpecified",idInpseccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/NecesitaEtiquetaCierre", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/NecesitaEtiquetaCierre", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getMaquinaPruebaEtapaAsync(long idEtapa,boolean idEtapaSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPueba,boolean idPuebaSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getMaquinaPruebaEtapaAsync(idEtapa, idEtapaSpecified, idInspeccion, idInspeccionSpecified, idPueba, idPuebaSpecified, null);
    }
    
    public void getMaquinaPruebaEtapaAsync(final long idEtapa,final boolean idEtapaSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final long idPueba,final boolean idPuebaSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                getMaquinaPruebaEtapa(idEtapa, idEtapaSpecified, idInspeccion, idInspeccionSpecified, idPueba, idPuebaSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getMaquinaPruebaEtapa", result);
                }
            }
        }.execute();
    }
    
    public void getMaquinaPruebaEtapa(long idEtapa,boolean idEtapaSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPueba,boolean idPuebaSpecified){
        getMaquinaPruebaEtapa(idEtapa, idEtapaSpecified, idInspeccion, idInspeccionSpecified, idPueba, idPuebaSpecified, null);
    }
    
    public void getMaquinaPruebaEtapa(long idEtapa,boolean idEtapaSpecified,long idInspeccion,boolean idInspeccionSpecified,long idPueba,boolean idPuebaSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getMaquinaPruebaEtapa");
        soapReq.addProperty("idEtapa",idEtapa);
        soapReq.addProperty("idEtapaSpecified",idEtapaSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("idPueba",idPueba);
        soapReq.addProperty("idPuebaSpecified",idPuebaSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getMaquinaPruebaEtapa", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getMaquinaPruebaEtapa", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getEtiquetaAsignadaAsync(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getEtiquetaAsignadaAsync(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, null);
    }
    
    public void getEtiquetaAsignadaAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idinsp,final boolean idinspSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected Void doInBackground(Void... params) {
                getEtiquetaAsignada(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, headers);
                return null;
            }
         
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getEtiquetaAsignada", result);
                }
            }
        }.execute();
    }
    
    public void getEtiquetaAsignada(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified){
        getEtiquetaAsignada(idUsuario, idUsuarioSpecified, idinsp, idinspSpecified, null);
    }
    
    public void getEtiquetaAsignada(long idUsuario,boolean idUsuarioSpecified,long idinsp,boolean idinspSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getEtiquetaAsignada");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idinsp",idinsp);
        soapReq.addProperty("idinspSpecified",idinspSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getEtiquetaAsignada", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getEtiquetaAsignada", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getBloquesInspeccionadosAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getBloquesInspeccionadosAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getBloquesInspeccionadosAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, String>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected String doInBackground(Void... params) {
                return getBloquesInspeccionados(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(String result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getBloquesInspeccionados", result);
                }
            }
        }.execute();
    }
    
    public String getBloquesInspeccionados(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return getBloquesInspeccionados(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public String getBloquesInspeccionados(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getBloquesInspeccionados");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getBloquesInspeccionados", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getBloquesInspeccionados", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                        SoapPrimitive j =(SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    }else if (obj!= null && obj instanceof String){
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }
    
    public void getInspeccionAlcanceAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,boolean soloRevisados,boolean soloRevisadosSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionAlcanceAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, soloRevisados, soloRevisadosSpecified, null);
    }
    
    public void getInspeccionAlcanceAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final boolean soloRevisados,final boolean soloRevisadosSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorInt64>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorInt64 doInBackground(Void... params) {
                return getInspeccionAlcance(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, soloRevisados, soloRevisadosSpecified, headers);
            }
         
            protected void onPostExecute(VectorInt64 result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionAlcance", result);
                }
            }
        }.execute();
    }
    
    public VectorInt64 getInspeccionAlcance(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,boolean soloRevisados,boolean soloRevisadosSpecified){
        return getInspeccionAlcance(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, soloRevisados, soloRevisadosSpecified, null);
    }
    
    public VectorInt64 getInspeccionAlcance(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,boolean soloRevisados,boolean soloRevisadosSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionAlcance");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapReq.addProperty("soloRevisados",soloRevisados);
        soapReq.addProperty("soloRevisadosSpecified",soloRevisadosSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionAlcance", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionAlcance", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorInt64 resultVariable = new VectorInt64(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getInspeccionAlcancePruebasAsync(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getInspeccionAlcancePruebasAsync(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public void getInspeccionAlcancePruebasAsync(final long idUsuario,final boolean idUsuarioSpecified,final long idInspeccion,final boolean idInspeccionSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorInspeccionAlcancePrueba>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorInspeccionAlcancePrueba doInBackground(Void... params) {
                return getInspeccionAlcancePruebas(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, headers);
            }
         
            protected void onPostExecute(VectorInspeccionAlcancePrueba result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getInspeccionAlcancePruebas", result);
                }
            }
        }.execute();
    }
    
    public VectorInspeccionAlcancePrueba getInspeccionAlcancePruebas(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified){
        return getInspeccionAlcancePruebas(idUsuario, idUsuarioSpecified, idInspeccion, idInspeccionSpecified, null);
    }
    
    public VectorInspeccionAlcancePrueba getInspeccionAlcancePruebas(long idUsuario,boolean idUsuarioSpecified,long idInspeccion,boolean idInspeccionSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getInspeccionAlcancePruebas");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapReq.addProperty("idInspeccion",idInspeccion);
        soapReq.addProperty("idInspeccionSpecified",idInspeccionSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionAlcancePruebas", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getInspeccionAlcancePruebas", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorInspeccionAlcancePrueba resultVariable = new VectorInspeccionAlcancePrueba(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getEtiquetaResumenAsync(long idUsuario,boolean idUsuarioSpecified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getEtiquetaResumenAsync(idUsuario, idUsuarioSpecified, null);
    }
    
    public void getEtiquetaResumenAsync(final long idUsuario,final boolean idUsuarioSpecified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, VectorQUERY_ResumenEtiquetas_Result>(){
         
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
         
            protected VectorQUERY_ResumenEtiquetas_Result doInBackground(Void... params) {
                return getEtiquetaResumen(idUsuario, idUsuarioSpecified, headers);
            }
         
            protected void onPostExecute(VectorQUERY_ResumenEtiquetas_Result result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getEtiquetaResumen", result);
                }
            }
        }.execute();
    }
    
    public VectorQUERY_ResumenEtiquetas_Result getEtiquetaResumen(long idUsuario,boolean idUsuarioSpecified){
        return getEtiquetaResumen(idUsuario, idUsuarioSpecified, null);
    }
    
    public VectorQUERY_ResumenEtiquetas_Result getEtiquetaResumen(long idUsuario,boolean idUsuarioSpecified,List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://tempuri.org/","getEtiquetaResumen");
        soapReq.addProperty("idUsuario",idUsuario);
        soapReq.addProperty("idUsuarioSpecified",idUsuarioSpecified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://tempuri.org/ILineaService/getEtiquetaResumen", soapEnvelope,headers);
            }else{
                httpTransport.call("http://tempuri.org/ILineaService/getEtiquetaResumen", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    VectorQUERY_ResumenEtiquetas_Result resultVariable = new VectorQUERY_ResumenEtiquetas_Result(j);
                    return resultVariable;
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
}
