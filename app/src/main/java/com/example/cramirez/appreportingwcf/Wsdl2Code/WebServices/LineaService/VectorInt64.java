package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import java.util.Vector;

public class VectorInt64 extends Vector<Number> implements KvmSerializable {
    
    
    public VectorInt64(){}
    
    public VectorInt64(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject != null){
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0<size;i0++){
                Object obj = soapObject.getProperty(i0);
                if (obj !=null && obj.getClass().equals(SoapPrimitive.class)){
                    SoapPrimitive j0 =(SoapPrimitive) soapObject.getProperty(i0);
                    Number j1=Integer.parseInt(j0.toString());
                    add(j1);
                }
            }
        }
    }
 
    public Object getProperty(int arg0) {
        return this.get(arg0);
    }
    
 
    public int getPropertyCount() {
        return this.size();
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "long";
        info.type = long.class;
    }
    
 
    public String getInnerText() {
        return null;
    }
    
    
 
    public void setInnerText(String s) {
    }
    
    
 
    public void setProperty(int arg0, Object arg1) {
    }
    
}
