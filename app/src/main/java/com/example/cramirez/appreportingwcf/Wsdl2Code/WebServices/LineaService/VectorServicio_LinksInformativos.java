package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import java.util.Vector;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Servicio_LinksInformativos;

public class VectorServicio_LinksInformativos extends Vector<Servicio_LinksInformativos> implements KvmSerializable {
    
    
    public VectorServicio_LinksInformativos(){}
    
    public VectorServicio_LinksInformativos(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject != null){
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0<size;i0++){
                Object obj = soapObject.getProperty(i0);
                if (obj!=null && obj.getClass().equals(SoapObject.class)){
                    SoapObject j0 =(SoapObject) soapObject.getProperty(i0);
                    Servicio_LinksInformativos j1= new Servicio_LinksInformativos(j0);
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
        info.name = "Servicio_LinksInformativos";
        info.type = Servicio_LinksInformativos.class;
    }
    
 
    public String getInnerText() {
        return null;
    }
    
    
 
    public void setInnerText(String s) {
    }
    
    
 
    public void setProperty(int arg0, Object arg1) {
    }
    
}
