package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Etapa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class EtapaBloque implements KvmSerializable {
    
    public Etapa etapa;
    public long fK_IdBloque;
    public boolean fK_IdBloqueSpecified;
    public long fK_IdCondicionalidad;
    public boolean fK_IdCondicionalidadSpecified;
    public long fK_IdEtapa;
    public boolean fK_IdEtapaSpecified;
    public long idEtapaBloque;
    public boolean idEtapaBloqueSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public EtapaBloque(){}
    
    public EtapaBloque(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Etapa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Etapa");
            etapa =  new Etapa (j);
            
        }
        if (soapObject.hasProperty("FK_IdBloque"))
        {
            Object obj = soapObject.getProperty("FK_IdBloque");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdBloque = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdBloque = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdBloqueSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdBloqueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdBloqueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdBloqueSpecified = (Boolean) obj;
            }
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
        if (soapObject.hasProperty("FK_IdEtapa"))
        {
            Object obj = soapObject.getProperty("FK_IdEtapa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEtapa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdEtapa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdEtapaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdEtapaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEtapaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdEtapaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdEtapaBloque"))
        {
            Object obj = soapObject.getProperty("IdEtapaBloque");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idEtapaBloque = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idEtapaBloque = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdEtapaBloqueSpecified"))
        {
            Object obj = soapObject.getProperty("IdEtapaBloqueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idEtapaBloqueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idEtapaBloqueSpecified = (Boolean) obj;
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
                return etapa;
            case 1:
                return fK_IdBloque;
            case 2:
                return fK_IdBloqueSpecified;
            case 3:
                return fK_IdCondicionalidad;
            case 4:
                return fK_IdCondicionalidadSpecified;
            case 5:
                return fK_IdEtapa;
            case 6:
                return fK_IdEtapaSpecified;
            case 7:
                return idEtapaBloque;
            case 8:
                return idEtapaBloqueSpecified;
            case 9:
                return publicado;
            case 10:
                return publicadoSpecified;
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
                info.type = Etapa.class;
                info.name = "Etapa";
                break;
            case 1:
                info.type = Long.class;
                info.name = "FK_IdBloque";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdBloqueSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidad";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdEtapa";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdEtapaSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "IdEtapaBloque";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdEtapaBloqueSpecified";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
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
