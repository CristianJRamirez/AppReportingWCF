package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.HojaDeCampo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Servicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Servicio_HojadeCampo implements KvmSerializable {
    
    public Autonomia autonomia;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdHojaDeCampo;
    public boolean fK_IdHojaDeCampoSpecified;
    public long fK_IdServicio;
    public boolean fK_IdServicioSpecified;
    public HojaDeCampo hojaDeCampo;
    public long idServicio_HojadeCampo;
    public boolean idServicio_HojadeCampoSpecified;
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
    
    public Servicio_HojadeCampo(){}
    
    public Servicio_HojadeCampo(SoapObject soapObject)
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
        if (soapObject.hasProperty("FK_IdHojaDeCampo"))
        {
            Object obj = soapObject.getProperty("FK_IdHojaDeCampo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdHojaDeCampo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdHojaDeCampo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdHojaDeCampoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdHojaDeCampoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdHojaDeCampoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdHojaDeCampoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("HojaDeCampo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("HojaDeCampo");
            hojaDeCampo =  new HojaDeCampo (j);
            
        }
        if (soapObject.hasProperty("IdServicio_HojadeCampo"))
        {
            Object obj = soapObject.getProperty("IdServicio_HojadeCampo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicio_HojadeCampo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idServicio_HojadeCampo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdServicio_HojadeCampoSpecified"))
        {
            Object obj = soapObject.getProperty("IdServicio_HojadeCampoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicio_HojadeCampoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idServicio_HojadeCampoSpecified = (Boolean) obj;
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
                return autonomia;
            case 1:
                return fK_IdAutonomia;
            case 2:
                return fK_IdAutonomiaSpecified;
            case 3:
                return fK_IdHojaDeCampo;
            case 4:
                return fK_IdHojaDeCampoSpecified;
            case 5:
                return fK_IdServicio;
            case 6:
                return fK_IdServicioSpecified;
            case 7:
                return hojaDeCampo;
            case 8:
                return idServicio_HojadeCampo;
            case 9:
                return idServicio_HojadeCampoSpecified;
            case 10:
                return publicado;
            case 11:
                return publicadoSpecified;
            case 12:
                return servicio;
            case 13:
                return fechaModificacion;
            case 14:
                return fechaModificacionSpecified;
            case 15:
                return timestamp.toString();
            case 16:
                return usuarioModificacion;
            case 17:
                return usuarioModificacionSpecified;
            case 18:
                return id;
            case 19:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 20;
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
                info.name = "FK_IdHojaDeCampo";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdHojaDeCampoSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdServicio";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdServicioSpecified";
                break;
            case 7:
                info.type = HojaDeCampo.class;
                info.name = "HojaDeCampo";
                break;
            case 8:
                info.type = Long.class;
                info.name = "IdServicio_HojadeCampo";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdServicio_HojadeCampoSpecified";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 12:
                info.type = Servicio.class;
                info.name = "Servicio";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 16:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 19:
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
