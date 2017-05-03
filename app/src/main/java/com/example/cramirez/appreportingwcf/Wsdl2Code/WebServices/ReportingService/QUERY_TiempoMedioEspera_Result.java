package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.ReportingService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 4/25/2017 7:43:53 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_TiempoMedioEspera_Result implements KvmSerializable {
    
    public double desviacion;
    public boolean desviacionSpecified;
    public String hora;
    public int maximo;
    public boolean maximoSpecified;
    public int media;
    public boolean mediaSpecified;
    public int media_Total;
    public boolean media_TotalSpecified;
    public String id;
    public String ref;
    
    public QUERY_TiempoMedioEspera_Result(){}
    
    public QUERY_TiempoMedioEspera_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Desviacion"))
        {
            Object obj = soapObject.getProperty("Desviacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                desviacion = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                desviacion = (Double) obj;
            }
        }
        if (soapObject.hasProperty("DesviacionSpecified"))
        {
            Object obj = soapObject.getProperty("DesviacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                desviacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                desviacionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Hora"))
        {
            Object obj = soapObject.getProperty("Hora");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                hora = j.toString();
            }else if (obj!= null && obj instanceof String){
                hora = (String) obj;
            }
        }
        if (soapObject.hasProperty("Maximo"))
        {
            Object obj = soapObject.getProperty("Maximo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maximo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                maximo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("MaximoSpecified"))
        {
            Object obj = soapObject.getProperty("MaximoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maximoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                maximoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Media"))
        {
            Object obj = soapObject.getProperty("Media");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                media = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                media = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("MediaSpecified"))
        {
            Object obj = soapObject.getProperty("MediaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mediaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mediaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Media_Total"))
        {
            Object obj = soapObject.getProperty("Media_Total");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                media_Total = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                media_Total = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("Media_TotalSpecified"))
        {
            Object obj = soapObject.getProperty("Media_TotalSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                media_TotalSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                media_TotalSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Id"))
        {
            Object obj = soapObject.getProperty("Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                id = j.toString();
            }else if (obj!= null && obj instanceof String){
                id = (String) obj;
            }
        }
        if (soapObject.hasProperty("Ref"))
        {
            Object obj = soapObject.getProperty("Ref");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ref = j.toString();
            }else if (obj!= null && obj instanceof String){
                ref = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return desviacion;
            case 1:
                return desviacionSpecified;
            case 2:
                return hora;
            case 3:
                return maximo;
            case 4:
                return maximoSpecified;
            case 5:
                return media;
            case 6:
                return mediaSpecified;
            case 7:
                return media_Total;
            case 8:
                return media_TotalSpecified;
            case 9:
                return id;
            case 10:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 11;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Double.class;
                info.name = "Desviacion";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DesviacionSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Hora";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Maximo";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MaximoSpecified";
                break;
            case 5:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Media";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MediaSpecified";
                break;
            case 7:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Media_Total";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Media_TotalSpecified";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
