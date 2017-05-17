package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class InspeccionImagen implements KvmSerializable {
    
    public long idImagen;
    public boolean idImagenSpecified;
    public VectorByte imagen;
    
    public InspeccionImagen(){}
    
    public InspeccionImagen(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("IdImagen"))
        {
            Object obj = soapObject.getProperty("IdImagen");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idImagen = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idImagen = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdImagenSpecified"))
        {
            Object obj = soapObject.getProperty("IdImagenSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idImagenSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idImagenSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Imagen"))
        {
            SoapPrimitive j = (SoapPrimitive)soapObject.getProperty("Imagen");
            imagen = new VectorByte(j);
        }
    }
 
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return idImagen;
            case 1:
                return idImagenSpecified;
            case 2:
                return imagen.toString();
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
                info.name = "IdImagen";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdImagenSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Imagen";
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
