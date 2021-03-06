package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class SimpleLongString implements KvmSerializable {
    
    public long numero;
    public boolean numeroSpecified;
    public String texto;
    
    public SimpleLongString(){}
    
    public SimpleLongString(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("Texto"))
        {
            Object obj = soapObject.getProperty("Texto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                texto = j.toString();
            }else if (obj!= null && obj instanceof String){
                texto = (String) obj;
            }
        }
    }
 
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return numero;
            case 1:
                return numeroSpecified;
            case 2:
                return texto;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 3;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Long.class;
                info.name = "Numero";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NumeroSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Texto";
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
