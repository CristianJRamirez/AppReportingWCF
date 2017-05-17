package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_ListaEtiquetas_Result implements KvmSerializable {
    
    public String estado;
    public String inspeccion;
    public long numero;
    public boolean numeroSpecified;
    public String id;
    public String ref;
    
    public QUERY_ListaEtiquetas_Result(){}
    
    public QUERY_ListaEtiquetas_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Estado"))
        {
            Object obj = soapObject.getProperty("Estado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                estado = j.toString();
            }else if (obj!= null && obj instanceof String){
                estado = (String) obj;
            }
        }
        if (soapObject.hasProperty("Inspeccion"))
        {
            Object obj = soapObject.getProperty("Inspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                inspeccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                inspeccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("Numero"))
        {
            Object obj = soapObject.getProperty("Numero");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numero = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                numero = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NumeroSpecified"))
        {
            Object obj = soapObject.getProperty("NumeroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numeroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                numeroSpecified = (Boolean) obj;
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
 
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return estado;
            case 1:
                return inspeccion;
            case 2:
                return numero;
            case 3:
                return numeroSpecified;
            case 4:
                return id;
            case 5:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 6;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Estado";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Inspeccion";
                break;
            case 2:
                info.type = Long.class;
                info.name = "Numero";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NumeroSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    
 
    public String getInnerText() {
        return null;
    }
    
    
 
    public void setInnerText(String s) {
    }
    
    
 
    public void setProperty(int arg0, Object arg1) {
    }
    
}
