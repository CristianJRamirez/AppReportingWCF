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
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.Cliente;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.EstadoExpediente;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorExpedienteDocumento;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorExpedienteInspeccion;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorExpedienteLogEstado;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorExpedienteServicio;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorSolicitudServicio;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Expediente implements KvmSerializable {
    
    public Cliente cliente;
    public EstadoExpediente estadoExpediente;
    public VectorExpedienteDocumento expedienteDocumento;
    public VectorExpedienteInspeccion expedienteInspeccion;
    public VectorExpedienteLogEstado expedienteLogEstado;
    public VectorExpedienteServicio expedienteServicio;
    public long fK_IdCliente;
    public boolean fK_IdClienteSpecified;
    public long fK_IdEstadoExpediente;
    public boolean fK_IdEstadoExpedienteSpecified;
    public long fK_IdInspeccion;
    public boolean fK_IdInspeccionSpecified;
    public String fechaValidez;
    public boolean fechaValidezSpecified;
    public String numExpediente;
    public String observaciones;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorSolicitudServicio solicitudServicio;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public long idExpediente;
    public boolean idExpedienteSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Expediente(){}
    
    public Expediente(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Cliente"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Cliente");
            cliente =  new Cliente (j);
            
        }
        if (soapObject.hasProperty("EstadoExpediente"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("EstadoExpediente");
            estadoExpediente =  new EstadoExpediente (j);
            
        }
        if (soapObject.hasProperty("ExpedienteDocumento"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ExpedienteDocumento");
            expedienteDocumento = new VectorExpedienteDocumento(j);
        }
        if (soapObject.hasProperty("ExpedienteInspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ExpedienteInspeccion");
            expedienteInspeccion = new VectorExpedienteInspeccion(j);
        }
        if (soapObject.hasProperty("ExpedienteLogEstado"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ExpedienteLogEstado");
            expedienteLogEstado = new VectorExpedienteLogEstado(j);
        }
        if (soapObject.hasProperty("ExpedienteServicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ExpedienteServicio");
            expedienteServicio = new VectorExpedienteServicio(j);
        }
        if (soapObject.hasProperty("FK_IdCliente"))
        {
            Object obj = soapObject.getProperty("FK_IdCliente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCliente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCliente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdClienteSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdClienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdClienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdClienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdEstadoExpediente"))
        {
            Object obj = soapObject.getProperty("FK_IdEstadoExpediente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEstadoExpediente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdEstadoExpediente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdEstadoExpedienteSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdEstadoExpedienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEstadoExpedienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdEstadoExpedienteSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("FechaValidez"))
        {
            Object obj = soapObject.getProperty("FechaValidez");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaValidez = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaValidez = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaValidezSpecified"))
        {
            Object obj = soapObject.getProperty("FechaValidezSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaValidezSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaValidezSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("NumExpediente"))
        {
            Object obj = soapObject.getProperty("NumExpediente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numExpediente = j.toString();
            }else if (obj!= null && obj instanceof String){
                numExpediente = (String) obj;
            }
        }
        if (soapObject.hasProperty("Observaciones"))
        {
            Object obj = soapObject.getProperty("Observaciones");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                observaciones = j.toString();
            }else if (obj!= null && obj instanceof String){
                observaciones = (String) obj;
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
        if (soapObject.hasProperty("SolicitudServicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("SolicitudServicio");
            solicitudServicio = new VectorSolicitudServicio(j);
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
        if (soapObject.hasProperty("idExpediente"))
        {
            Object obj = soapObject.getProperty("idExpediente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idExpediente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idExpediente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idExpedienteSpecified"))
        {
            Object obj = soapObject.getProperty("idExpedienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idExpedienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idExpedienteSpecified = (Boolean) obj;
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
                return cliente;
            case 1:
                return estadoExpediente;
            case 2:
                return expedienteDocumento;
            case 3:
                return expedienteInspeccion;
            case 4:
                return expedienteLogEstado;
            case 5:
                return expedienteServicio;
            case 6:
                return fK_IdCliente;
            case 7:
                return fK_IdClienteSpecified;
            case 8:
                return fK_IdEstadoExpediente;
            case 9:
                return fK_IdEstadoExpedienteSpecified;
            case 10:
                return fK_IdInspeccion;
            case 11:
                return fK_IdInspeccionSpecified;
            case 12:
                return fechaValidez;
            case 13:
                return fechaValidezSpecified;
            case 14:
                return numExpediente;
            case 15:
                return observaciones;
            case 16:
                return publicado;
            case 17:
                return publicadoSpecified;
            case 18:
                return solicitudServicio;
            case 19:
                return fechaModificacion;
            case 20:
                return fechaModificacionSpecified;
            case 21:
                return idExpediente;
            case 22:
                return idExpedienteSpecified;
            case 23:
                return timestamp.toString();
            case 24:
                return usuarioModificacion;
            case 25:
                return usuarioModificacionSpecified;
            case 26:
                return id;
            case 27:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 28;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Cliente.class;
                info.name = "Cliente";
                break;
            case 1:
                info.type = EstadoExpediente.class;
                info.name = "EstadoExpediente";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ExpedienteDocumento";
                break;
            case 3:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ExpedienteInspeccion";
                break;
            case 4:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ExpedienteLogEstado";
                break;
            case 5:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ExpedienteServicio";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdCliente";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdClienteSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "FK_IdEstadoExpediente";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdEstadoExpedienteSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "FK_IdInspeccion";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdInspeccionSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaValidez";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaValidezSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumExpediente";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Observaciones";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 18:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "SolicitudServicio";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 21:
                info.type = Long.class;
                info.name = "idExpediente";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idExpedienteSpecified";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 24:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 26:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 27:
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
