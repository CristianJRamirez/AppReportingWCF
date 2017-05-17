package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class KeyValuePairOfstringlong implements KvmSerializable {
    
    public String key;
    public long value;
    
    public KeyValuePairOfstringlong(){}
    
    public KeyValuePairOfstringlong(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("key"))
        {
            Object obj = soapObject.getProperty("key");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                key = j.toString();
            }else if (obj!= null && obj instanceof String){
                key = (String) obj;
            }
        }
        if (soapObject.hasProperty("value"))
        {
            Object obj = soapObject.getProperty("value");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                value = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                value = (Integer) obj;
            }
        }
    }
 
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return key;
            case 1:
                return value;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 2;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "key";
                break;
            case 1:
                info.type = Long.class;
                info.name = "value";
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
