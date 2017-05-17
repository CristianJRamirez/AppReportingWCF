package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class InspeccionBoxLinea implements KvmSerializable {
    
    public String box;
    public String boxDescripcion;
    public String linea;
    
    public InspeccionBoxLinea(){}
    
    public InspeccionBoxLinea(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Box"))
        {
            Object obj = soapObject.getProperty("Box");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                box = j.toString();
            }else if (obj!= null && obj instanceof String){
                box = (String) obj;
            }
        }
        if (soapObject.hasProperty("BoxDescripcion"))
        {
            Object obj = soapObject.getProperty("BoxDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                boxDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                boxDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("Linea"))
        {
            Object obj = soapObject.getProperty("Linea");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                linea = j.toString();
            }else if (obj!= null && obj instanceof String){
                linea = (String) obj;
            }
        }
    }
 
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return box;
            case 1:
                return boxDescripcion;
            case 2:
                return linea;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 3;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Box";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "BoxDescripcion";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Linea";
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
