package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Etapa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Inspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class InspeccionBloqueEstado implements KvmSerializable {
    
    public String codigoUsuario;
    public Etapa etapa;
    public boolean evaluado;
    public boolean evaluadoSpecified;
    public long fK_IdBloque;
    public boolean fK_IdBloqueSpecified;
    public long fK_IdEtapa;
    public boolean fK_IdEtapaSpecified;
    public long fK_IdInspeccion;
    public boolean fK_IdInspeccionSpecified;
    public long fK_IdUsuario;
    public boolean fK_IdUsuarioSpecified;
    public long idInspeccionBloqueEstado;
    public boolean idInspeccionBloqueEstadoSpecified;
    public Inspeccion inspeccion;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public InspeccionBloqueEstado(){}
    
    public InspeccionBloqueEstado(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("CodigoUsuario"))
        {
            Object obj = soapObject.getProperty("CodigoUsuario");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoUsuario = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoUsuario = (String) obj;
            }
        }
        if (soapObject.hasProperty("Etapa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Etapa");
            etapa =  new Etapa (j);
            
        }
        if (soapObject.hasProperty("Evaluado"))
        {
            Object obj = soapObject.getProperty("Evaluado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                evaluado = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                evaluado = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("EvaluadoSpecified"))
        {
            Object obj = soapObject.getProperty("EvaluadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                evaluadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                evaluadoSpecified = (Boolean) obj;
            }
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
        if (soapObject.hasProperty("FK_IdInspeccion"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdUsuario"))
        {
            Object obj = soapObject.getProperty("FK_IdUsuario");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdUsuario = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdUsuario = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdUsuarioSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdUsuarioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdUsuarioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdUsuarioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionBloqueEstado"))
        {
            Object obj = soapObject.getProperty("IdInspeccionBloqueEstado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionBloqueEstado = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccionBloqueEstado = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionBloqueEstadoSpecified"))
        {
            Object obj = soapObject.getProperty("IdInspeccionBloqueEstadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionBloqueEstadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionBloqueEstadoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Inspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Inspeccion");
            inspeccion =  new Inspeccion (j);
            
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
                return codigoUsuario;
            case 1:
                return etapa;
            case 2:
                return evaluado;
            case 3:
                return evaluadoSpecified;
            case 4:
                return fK_IdBloque;
            case 5:
                return fK_IdBloqueSpecified;
            case 6:
                return fK_IdEtapa;
            case 7:
                return fK_IdEtapaSpecified;
            case 8:
                return fK_IdInspeccion;
            case 9:
                return fK_IdInspeccionSpecified;
            case 10:
                return fK_IdUsuario;
            case 11:
                return fK_IdUsuarioSpecified;
            case 12:
                return idInspeccionBloqueEstado;
            case 13:
                return idInspeccionBloqueEstadoSpecified;
            case 14:
                return inspeccion;
            case 15:
                return publicado;
            case 16:
                return publicadoSpecified;
            case 17:
                return fechaModificacion;
            case 18:
                return fechaModificacionSpecified;
            case 19:
                return timestamp.toString();
            case 20:
                return usuarioModificacion;
            case 21:
                return usuarioModificacionSpecified;
            case 22:
                return id;
            case 23:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 24;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoUsuario";
                break;
            case 1:
                info.type = Etapa.class;
                info.name = "Etapa";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Evaluado";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "EvaluadoSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdBloque";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdBloqueSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdEtapa";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdEtapaSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "FK_IdInspeccion";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdInspeccionSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "FK_IdUsuario";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdUsuarioSpecified";
                break;
            case 12:
                info.type = Long.class;
                info.name = "IdInspeccionBloqueEstado";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionBloqueEstadoSpecified";
                break;
            case 14:
                info.type = Inspeccion.class;
                info.name = "Inspeccion";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 20:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 22:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 23:
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
