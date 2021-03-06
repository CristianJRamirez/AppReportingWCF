package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Servicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoAplicacion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoValor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Servicio_TipoValor implements KvmSerializable {
    
    public Autonomia autonomia;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdServicio;
    public boolean fK_IdServicioSpecified;
    public long fK_IdTipoAplicacion;
    public boolean fK_IdTipoAplicacionSpecified;
    public long fK_IdTipoValor;
    public boolean fK_IdTipoValorSpecified;
    public long idServicio_TipoValor;
    public boolean idServicio_TipoValorSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public Servicio servicio;
    public TipoAplicacion tipoAplicacion;
    public TipoValor tipoValor;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Servicio_TipoValor(){}
    
    public Servicio_TipoValor(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Autonomia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Autonomia");
            autonomia =  new Autonomia (j);
            
        }
        if (soapObject.hasProperty("FK_IdAutonomia"))
        {
            Object obj = soapObject.getProperty("FK_IdAutonomia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdAutonomia = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdAutonomia = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdAutonomiaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdAutonomiaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdAutonomiaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdAutonomiaSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("FK_IdTipoAplicacion"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoAplicacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoAplicacion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoAplicacion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoAplicacionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoAplicacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoAplicacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoAplicacionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoValor"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoValor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoValor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoValor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoValorSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoValorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoValorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdServicio_TipoValor"))
        {
            Object obj = soapObject.getProperty("IdServicio_TipoValor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicio_TipoValor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idServicio_TipoValor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdServicio_TipoValorSpecified"))
        {
            Object obj = soapObject.getProperty("IdServicio_TipoValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicio_TipoValorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idServicio_TipoValorSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("TipoAplicacion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoAplicacion");
            tipoAplicacion =  new TipoAplicacion (j);
            
        }
        if (soapObject.hasProperty("TipoValor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoValor");
            tipoValor =  new TipoValor (j);
            
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
                return autonomia;
            case 1:
                return fK_IdAutonomia;
            case 2:
                return fK_IdAutonomiaSpecified;
            case 3:
                return fK_IdServicio;
            case 4:
                return fK_IdServicioSpecified;
            case 5:
                return fK_IdTipoAplicacion;
            case 6:
                return fK_IdTipoAplicacionSpecified;
            case 7:
                return fK_IdTipoValor;
            case 8:
                return fK_IdTipoValorSpecified;
            case 9:
                return idServicio_TipoValor;
            case 10:
                return idServicio_TipoValorSpecified;
            case 11:
                return publicado;
            case 12:
                return publicadoSpecified;
            case 13:
                return servicio;
            case 14:
                return tipoAplicacion;
            case 15:
                return tipoValor;
            case 16:
                return fechaModificacion;
            case 17:
                return fechaModificacionSpecified;
            case 18:
                return timestamp.toString();
            case 19:
                return usuarioModificacion;
            case 20:
                return usuarioModificacionSpecified;
            case 21:
                return id;
            case 22:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 23;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 1:
                info.type = Long.class;
                info.name = "FK_IdAutonomia";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdAutonomiaSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdServicio";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdServicioSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdTipoAplicacion";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoAplicacionSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "FK_IdTipoValor";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoValorSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "IdServicio_TipoValor";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdServicio_TipoValorSpecified";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 13:
                info.type = Servicio.class;
                info.name = "Servicio";
                break;
            case 14:
                info.type = TipoAplicacion.class;
                info.name = "TipoAplicacion";
                break;
            case 15:
                info.type = TipoValor.class;
                info.name = "TipoValor";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 19:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 22:
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
