package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 5/3/2017 10:21:06 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio_TipoValor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class TipoAplicacion implements KvmSerializable {
    
    public String accion;
    public Autonomia autonomia;
    public String descripcion;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long idTipoAplicacion;
    public boolean idTipoAplicacionSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorServicio_TipoValor servicio_TipoValor;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public TipoAplicacion(){}
    
    public TipoAplicacion(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Accion"))
        {
            Object obj = soapObject.getProperty("Accion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                accion = j.toString();
            }else if (obj!= null && obj instanceof String){
                accion = (String) obj;
            }
        }
        if (soapObject.hasProperty("Autonomia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Autonomia");
            autonomia =  new Autonomia (j);
            
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
        if (soapObject.hasProperty("IdTipoAplicacion"))
        {
            Object obj = soapObject.getProperty("IdTipoAplicacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idTipoAplicacion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idTipoAplicacion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdTipoAplicacionSpecified"))
        {
            Object obj = soapObject.getProperty("IdTipoAplicacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idTipoAplicacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idTipoAplicacionSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Servicio_TipoValor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Servicio_TipoValor");
            servicio_TipoValor = new VectorServicio_TipoValor(j);
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
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return accion;
            case 1:
                return autonomia;
            case 2:
                return descripcion;
            case 3:
                return fK_IdAutonomia;
            case 4:
                return fK_IdAutonomiaSpecified;
            case 5:
                return idTipoAplicacion;
            case 6:
                return idTipoAplicacionSpecified;
            case 7:
                return publicado;
            case 8:
                return publicadoSpecified;
            case 9:
                return servicio_TipoValor;
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
    
    @Override
    public int getPropertyCount() {
        return 17;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Accion";
                break;
            case 1:
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdAutonomia";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdAutonomiaSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "IdTipoAplicacion";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdTipoAplicacionSpecified";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 9:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio_TipoValor";
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
    
    @Override
    public String getInnerText() {
        return null;
    }
    
    
    @Override
    public void setInnerText(String s) {
    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}