package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorApartadoCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorDefectoCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorPruebaCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicioAlcance;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Condicionalidad implements KvmSerializable {
    
    public VectorApartadoCondicionalidad apartadoCondicionalidad;
    public VectorDefectoCondicionalidad defectoCondicionalidad;
    public VectorPruebaCondicionalidad pruebaCondicionalidad;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorServicioAlcance servicioAlcance;
    public String descripcion;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public long idCondicionalidad;
    public boolean idCondicionalidadSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Condicionalidad(){}
    
    public Condicionalidad(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("ApartadoCondicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ApartadoCondicionalidad");
            apartadoCondicionalidad = new VectorApartadoCondicionalidad(j);
        }
        if (soapObject.hasProperty("DefectoCondicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("DefectoCondicionalidad");
            defectoCondicionalidad = new VectorDefectoCondicionalidad(j);
        }
        if (soapObject.hasProperty("PruebaCondicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("PruebaCondicionalidad");
            pruebaCondicionalidad = new VectorPruebaCondicionalidad(j);
        }
        if (soapObject.hasProperty("Publicado"))
        {
            Object obj = soapObject.getProperty("Publicado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publicado = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                publicado = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PublicadoSpecified"))
        {
            Object obj = soapObject.getProperty("PublicadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publicadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                publicadoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ServicioAlcance"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ServicioAlcance");
            servicioAlcance = new VectorServicioAlcance(j);
        }
        if (soapObject.hasProperty("descripcion"))
        {
            Object obj = soapObject.getProperty("descripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("fechaModificacion"))
        {
            Object obj = soapObject.getProperty("fechaModificacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaModificacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaModificacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("fechaModificacionSpecified"))
        {
            Object obj = soapObject.getProperty("fechaModificacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaModificacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaModificacionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("idCondicionalidad"))
        {
            Object obj = soapObject.getProperty("idCondicionalidad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCondicionalidad = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCondicionalidad = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idCondicionalidadSpecified"))
        {
            Object obj = soapObject.getProperty("idCondicionalidadSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCondicionalidadSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCondicionalidadSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("timestamp"))
        {
            SoapPrimitive j = (SoapPrimitive)soapObject.getProperty("timestamp");
            timestamp = new VectorByte(j);
        }
        if (soapObject.hasProperty("usuarioModificacion"))
        {
            Object obj = soapObject.getProperty("usuarioModificacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                usuarioModificacion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                usuarioModificacion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("usuarioModificacionSpecified"))
        {
            Object obj = soapObject.getProperty("usuarioModificacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                usuarioModificacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                usuarioModificacionSpecified = (Boolean) obj;
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
                return apartadoCondicionalidad;
            case 1:
                return defectoCondicionalidad;
            case 2:
                return pruebaCondicionalidad;
            case 3:
                return publicado;
            case 4:
                return publicadoSpecified;
            case 5:
                return servicioAlcance;
            case 6:
                return descripcion;
            case 7:
                return fechaModificacion;
            case 8:
                return fechaModificacionSpecified;
            case 9:
                return idCondicionalidad;
            case 10:
                return idCondicionalidadSpecified;
            case 11:
                return timestamp.toString();
            case 12:
                return usuarioModificacion;
            case 13:
                return usuarioModificacionSpecified;
            case 14:
                return id;
            case 15:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 16;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ApartadoCondicionalidad";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "DefectoCondicionalidad";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "PruebaCondicionalidad";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 5:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ServicioAlcance";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "descripcion";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "idCondicionalidad";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idCondicionalidadSpecified";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 12:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 15:
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
