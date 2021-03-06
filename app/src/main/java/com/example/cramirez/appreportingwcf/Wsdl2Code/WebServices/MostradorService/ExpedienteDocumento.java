package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService;
//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 5/15/2017 9:13:05 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.Expediente;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ExpedienteDocumento implements KvmSerializable {
    
    public String descripcion;
    public String documento;
    public Expediente expediente;
    public long fK_IdExpediente;
    public boolean fK_IdExpedienteSpecified;
    public long iDExpedienteDocumento;
    public boolean iDExpedienteDocumentoSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public ExpedienteDocumento(){}
    
    public ExpedienteDocumento(SoapObject soapObject)
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
        if (soapObject.hasProperty("Documento"))
        {
            Object obj = soapObject.getProperty("Documento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documento = j.toString();
            }else if (obj!= null && obj instanceof String){
                documento = (String) obj;
            }
        }
        if (soapObject.hasProperty("Expediente"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Expediente");
            expediente =  new Expediente (j);
            
        }
        if (soapObject.hasProperty("FK_IdExpediente"))
        {
            Object obj = soapObject.getProperty("FK_IdExpediente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdExpediente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdExpediente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdExpedienteSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdExpedienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdExpedienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdExpedienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IDExpedienteDocumento"))
        {
            Object obj = soapObject.getProperty("IDExpedienteDocumento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                iDExpedienteDocumento = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                iDExpedienteDocumento = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IDExpedienteDocumentoSpecified"))
        {
            Object obj = soapObject.getProperty("IDExpedienteDocumentoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                iDExpedienteDocumentoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                iDExpedienteDocumentoSpecified = (Boolean) obj;
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
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return descripcion;
            case 1:
                return documento;
            case 2:
                return expediente;
            case 3:
                return fK_IdExpediente;
            case 4:
                return fK_IdExpedienteSpecified;
            case 5:
                return iDExpedienteDocumento;
            case 6:
                return iDExpedienteDocumentoSpecified;
            case 7:
                return publicado;
            case 8:
                return publicadoSpecified;
            case 9:
                return fechaModificacion;
            case 10:
                return fechaModificacionSpecified;
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
    
    @Override
    public int getPropertyCount() {
        return 16;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Documento";
                break;
            case 2:
                info.type = Expediente.class;
                info.name = "Expediente";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdExpediente";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdExpedienteSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "IDExpedienteDocumento";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IDExpedienteDocumentoSpecified";
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
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
    

    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
