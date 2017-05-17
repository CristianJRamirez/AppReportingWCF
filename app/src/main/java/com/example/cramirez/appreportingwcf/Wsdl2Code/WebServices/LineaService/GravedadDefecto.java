package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorDefecto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GravedadDefecto implements KvmSerializable {
    
    public String codigo;
    public VectorDefecto defecto;
    public String descripcion;
    public long idGravedadDefecto;
    public boolean idGravedadDefectoSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public GravedadDefecto(){}
    
    public GravedadDefecto(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Codigo"))
        {
            Object obj = soapObject.getProperty("Codigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("Defecto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Defecto");
            defecto = new VectorDefecto(j);
        }
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
        if (soapObject.hasProperty("IdGravedadDefecto"))
        {
            Object obj = soapObject.getProperty("IdGravedadDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGravedadDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idGravedadDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdGravedadDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("IdGravedadDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGravedadDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idGravedadDefectoSpecified = (Boolean) obj;
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
                return codigo;
            case 1:
                return defecto;
            case 2:
                return descripcion;
            case 3:
                return idGravedadDefecto;
            case 4:
                return idGravedadDefectoSpecified;
            case 5:
                return publicado;
            case 6:
                return publicadoSpecified;
            case 7:
                return fechaModificacion;
            case 8:
                return fechaModificacionSpecified;
            case 9:
                return timestamp.toString();
            case 10:
                return usuarioModificacion;
            case 11:
                return usuarioModificacionSpecified;
            case 12:
                return id;
            case 13:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 14;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Defecto";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 3:
                info.type = Long.class;
                info.name = "IdGravedadDefecto";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdGravedadDefectoSpecified";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 10:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 13:
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
