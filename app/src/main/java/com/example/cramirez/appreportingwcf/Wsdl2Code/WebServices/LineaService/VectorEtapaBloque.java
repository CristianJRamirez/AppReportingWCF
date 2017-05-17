package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import java.util.Vector;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.EtapaBloque;

public class VectorEtapaBloque extends Vector<EtapaBloque> implements KvmSerializable {
    
    
    public VectorEtapaBloque(){}
    
    public VectorEtapaBloque(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject != null){
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0<size;i0++){
                Object obj = soapObject.getProperty(i0);
                if (obj!=null && obj.getClass().equals(SoapObject.class)){
                    SoapObject j0 =(SoapObject) soapObject.getProperty(i0);
                    EtapaBloque j1= new EtapaBloque(j0);
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
        info.name = "EtapaBloque";
        info.type = EtapaBloque.class;
    }
    
 
    public String getInnerText() {
        return null;
    }
    
    
 
    public void setInnerText(String s) {
    }
    
    
 
    public void setProperty(int arg0, Object arg1) {
    }
    
}
