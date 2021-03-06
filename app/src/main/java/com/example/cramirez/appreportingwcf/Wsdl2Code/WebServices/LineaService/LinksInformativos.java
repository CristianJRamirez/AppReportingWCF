package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio_LinksInformativos;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class LinksInformativos implements KvmSerializable {
    
    public String descripcion;
    public String fechaFVigencia;
    public boolean fechaFVigenciaSpecified;
    public String fechaIVigencia;
    public boolean fechaIVigenciaSpecified;
    public long idLinkInformativos;
    public boolean idLinkInformativosSpecified;
    public String link;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorServicio_LinksInformativos servicio_LinksInformativos;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public LinksInformativos(){}
    
    public LinksInformativos(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Descripcion"))
        {
            Object obj = soapObject.getProperty("Descripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFVigencia"))
        {
            Object obj = soapObject.getProperty("FechaFVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaFVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaFVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaIVigencia"))
        {
            Object obj = soapObject.getProperty("FechaIVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaIVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaIVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaIVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaIVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdLinkInformativos"))
        {
            Object obj = soapObject.getProperty("IdLinkInformativos");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idLinkInformativos = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idLinkInformativos = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdLinkInformativosSpecified"))
        {
            Object obj = soapObject.getProperty("IdLinkInformativosSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idLinkInformativosSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idLinkInformativosSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Link"))
        {
            Object obj = soapObject.getProperty("Link");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                link = j.toString();
            }else if (obj!= null && obj instanceof String){
                link = (String) obj;
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
        if (soapObject.hasProperty("Servicio_LinksInformativos"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Servicio_LinksInformativos");
            servicio_LinksInformativos = new VectorServicio_LinksInformativos(j);
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
                return descripcion;
            case 1:
                return fechaFVigencia;
            case 2:
                return fechaFVigenciaSpecified;
            case 3:
                return fechaIVigencia;
            case 4:
                return fechaIVigenciaSpecified;
            case 5:
                return idLinkInformativos;
            case 6:
                return idLinkInformativosSpecified;
            case 7:
                return link;
            case 8:
                return publicado;
            case 9:
                return publicadoSpecified;
            case 10:
                return servicio_LinksInformativos;
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
                info.name = "Descripcion";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFVigencia";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFVigenciaSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIVigencia";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIVigenciaSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "IdLinkInformativos";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdLinkInformativosSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Link";
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
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio_LinksInformativos";
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
