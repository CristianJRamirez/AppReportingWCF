package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoVehiculoLinea;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GrupoVehiculoLineaCategoria implements KvmSerializable {
    
    public String codigoConstruccion;
    public String codigoInterno;
    public String codigoUtilizacion;
    public long fK_IdGrupoVehiculoLinea;
    public boolean fK_IdGrupoVehiculoLineaSpecified;
    public GrupoVehiculoLinea grupoVehiculoLinea;
    public long idGrupoVehiculoLineaCategoria;
    public boolean idGrupoVehiculoLineaCategoriaSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public GrupoVehiculoLineaCategoria(){}
    
    public GrupoVehiculoLineaCategoria(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("CodigoConstruccion"))
        {
            Object obj = soapObject.getProperty("CodigoConstruccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoConstruccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoConstruccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoInterno"))
        {
            Object obj = soapObject.getProperty("CodigoInterno");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoInterno = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoInterno = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoUtilizacion"))
        {
            Object obj = soapObject.getProperty("CodigoUtilizacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoUtilizacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoUtilizacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoVehiculoLinea"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoVehiculoLinea");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoVehiculoLinea = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoVehiculoLinea = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoVehiculoLineaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoVehiculoLineaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoVehiculoLineaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoVehiculoLineaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoVehiculoLinea"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoVehiculoLinea");
            grupoVehiculoLinea =  new GrupoVehiculoLinea (j);
            
        }
        if (soapObject.hasProperty("IdGrupoVehiculoLineaCategoria"))
        {
            Object obj = soapObject.getProperty("IdGrupoVehiculoLineaCategoria");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoVehiculoLineaCategoria = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idGrupoVehiculoLineaCategoria = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdGrupoVehiculoLineaCategoriaSpecified"))
        {
            Object obj = soapObject.getProperty("IdGrupoVehiculoLineaCategoriaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoVehiculoLineaCategoriaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idGrupoVehiculoLineaCategoriaSpecified = (Boolean) obj;
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
                return codigoConstruccion;
            case 1:
                return codigoInterno;
            case 2:
                return codigoUtilizacion;
            case 3:
                return fK_IdGrupoVehiculoLinea;
            case 4:
                return fK_IdGrupoVehiculoLineaSpecified;
            case 5:
                return grupoVehiculoLinea;
            case 6:
                return idGrupoVehiculoLineaCategoria;
            case 7:
                return idGrupoVehiculoLineaCategoriaSpecified;
            case 8:
                return publicado;
            case 9:
                return publicadoSpecified;
            case 10:
                return fechaModificacion;
            case 11:
                return fechaModificacionSpecified;
            case 12:
                return timestamp.toString();
            case 13:
                return usuarioModificacion;
            case 14:
                return usuarioModificacionSpecified;
            case 15:
                return id;
            case 16:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 17;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoConstruccion";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoInterno";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoUtilizacion";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdGrupoVehiculoLinea";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoVehiculoLineaSpecified";
                break;
            case 5:
                info.type = GrupoVehiculoLinea.class;
                info.name = "GrupoVehiculoLinea";
                break;
            case 6:
                info.type = Long.class;
                info.name = "IdGrupoVehiculoLineaCategoria";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdGrupoVehiculoLineaCategoriaSpecified";
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 13:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 16:
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
