package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Condicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Servicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ServicioAlcance implements KvmSerializable {
    
    public String codigoApartado;
    public Condicionalidad condicionalidad;
    public long fK_IdCondicionalidad;
    public boolean fK_IdCondicionalidadSpecified;
    public long fK_IdServicio;
    public boolean fK_IdServicioSpecified;
    public long idServicioAlcance;
    public boolean idServicioAlcanceSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public Servicio servicio;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public ServicioAlcance(){}
    
    public ServicioAlcance(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("CodigoApartado"))
        {
            Object obj = soapObject.getProperty("CodigoApartado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoApartado = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoApartado = (String) obj;
            }
        }
        if (soapObject.hasProperty("Condicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Condicionalidad");
            condicionalidad =  new Condicionalidad (j);
            
        }
        if (soapObject.hasProperty("FK_IdCondicionalidad"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidad = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCondicionalidad = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCondicionalidadSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdServicio"))
        {
            Object obj = soapObject.getProperty("FK_IdServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdServicioSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdServicioAlcance"))
        {
            Object obj = soapObject.getProperty("IdServicioAlcance");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicioAlcance = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idServicioAlcance = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdServicioAlcanceSpecified"))
        {
            Object obj = soapObject.getProperty("IdServicioAlcanceSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicioAlcanceSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idServicioAlcanceSpecified = (Boolean) obj;
            }
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
        if (soapObject.hasProperty("Servicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Servicio");
            servicio =  new Servicio (j);
            
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
                return codigoApartado;
            case 1:
                return condicionalidad;
            case 2:
                return fK_IdCondicionalidad;
            case 3:
                return fK_IdCondicionalidadSpecified;
            case 4:
                return fK_IdServicio;
            case 5:
                return fK_IdServicioSpecified;
            case 6:
                return idServicioAlcance;
            case 7:
                return idServicioAlcanceSpecified;
            case 8:
                return publicado;
            case 9:
                return publicadoSpecified;
            case 10:
                return servicio;
            case 11:
                return fechaModificacion;
            case 12:
                return fechaModificacionSpecified;
            case 13:
                return timestamp.toString();
            case 14:
                return usuarioModificacion;
            case 15:
                return usuarioModificacionSpecified;
            case 16:
                return id;
            case 17:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 18;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoApartado";
                break;
            case 1:
                info.type = Condicionalidad.class;
                info.name = "Condicionalidad";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidad";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdServicio";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdServicioSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "IdServicioAlcance";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdServicioAlcanceSpecified";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 10:
                info.type = Servicio.class;
                info.name = "Servicio";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 14:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 17:
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
