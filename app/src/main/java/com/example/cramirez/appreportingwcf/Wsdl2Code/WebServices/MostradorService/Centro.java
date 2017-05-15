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
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorBanco;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorCajaFuerte;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorCajaMostrador;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorCofre;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorFactura;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorFacturaAlbaran;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorSolicitudVehiculoSaliente;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorTransferencia;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Centro implements KvmSerializable {
    
    public VectorBanco banco;
    public VectorCajaFuerte cajaFuerte;
    public VectorCajaMostrador cajaMostrador;
    public String codigoInterno;
    public String codigoNumerico;
    public VectorCofre cofre;
    public String descripcion;
    public boolean esCentral;
    public boolean esCentralSpecified;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public VectorFactura factura;
    public VectorFacturaAlbaran facturaAlbaran;
    public String fechaFVigencia;
    public boolean fechaFVigenciaSpecified;
    public String fechaIVigencia;
    public boolean fechaIVigenciaSpecified;
    public long idCentro;
    public boolean idCentroSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorSolicitudVehiculoSaliente solicitudVehiculoSaliente;
    public VectorTransferencia transferencia;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Centro(){}
    
    public Centro(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Banco"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Banco");
            banco = new VectorBanco(j);
        }
        if (soapObject.hasProperty("CajaFuerte"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("CajaFuerte");
            cajaFuerte = new VectorCajaFuerte(j);
        }
        if (soapObject.hasProperty("CajaMostrador"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("CajaMostrador");
            cajaMostrador = new VectorCajaMostrador(j);
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
        if (soapObject.hasProperty("CodigoNumerico"))
        {
            Object obj = soapObject.getProperty("CodigoNumerico");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoNumerico = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoNumerico = (String) obj;
            }
        }
        if (soapObject.hasProperty("Cofre"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Cofre");
            cofre = new VectorCofre(j);
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
        if (soapObject.hasProperty("EsCentral"))
        {
            Object obj = soapObject.getProperty("EsCentral");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esCentral = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                esCentral = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("EsCentralSpecified"))
        {
            Object obj = soapObject.getProperty("EsCentralSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esCentralSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                esCentralSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Factura"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Factura");
            factura = new VectorFactura(j);
        }
        if (soapObject.hasProperty("FacturaAlbaran"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("FacturaAlbaran");
            facturaAlbaran = new VectorFacturaAlbaran(j);
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
        if (soapObject.hasProperty("IdCentro"))
        {
            Object obj = soapObject.getProperty("IdCentro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCentro = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCentro = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdCentroSpecified"))
        {
            Object obj = soapObject.getProperty("IdCentroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCentroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCentroSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("SolicitudVehiculoSaliente"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("SolicitudVehiculoSaliente");
            solicitudVehiculoSaliente = new VectorSolicitudVehiculoSaliente(j);
        }
        if (soapObject.hasProperty("Transferencia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Transferencia");
            transferencia = new VectorTransferencia(j);
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
                return banco;
            case 1:
                return cajaFuerte;
            case 2:
                return cajaMostrador;
            case 3:
                return codigoInterno;
            case 4:
                return codigoNumerico;
            case 5:
                return cofre;
            case 6:
                return descripcion;
            case 7:
                return esCentral;
            case 8:
                return esCentralSpecified;
            case 9:
                return fK_IdAutonomia;
            case 10:
                return fK_IdAutonomiaSpecified;
            case 11:
                return factura;
            case 12:
                return facturaAlbaran;
            case 13:
                return fechaFVigencia;
            case 14:
                return fechaFVigenciaSpecified;
            case 15:
                return fechaIVigencia;
            case 16:
                return fechaIVigenciaSpecified;
            case 17:
                return idCentro;
            case 18:
                return idCentroSpecified;
            case 19:
                return publicado;
            case 20:
                return publicadoSpecified;
            case 21:
                return solicitudVehiculoSaliente;
            case 22:
                return transferencia;
            case 23:
                return fechaModificacion;
            case 24:
                return fechaModificacionSpecified;
            case 25:
                return timestamp.toString();
            case 26:
                return usuarioModificacion;
            case 27:
                return usuarioModificacionSpecified;
            case 28:
                return id;
            case 29:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 30;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Banco";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "CajaFuerte";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "CajaMostrador";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoInterno";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoNumerico";
                break;
            case 5:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Cofre";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "EsCentral";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "EsCentralSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_IdAutonomia";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdAutonomiaSpecified";
                break;
            case 11:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Factura";
                break;
            case 12:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "FacturaAlbaran";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFVigencia";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFVigenciaSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIVigencia";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIVigenciaSpecified";
                break;
            case 17:
                info.type = Long.class;
                info.name = "IdCentro";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdCentroSpecified";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 21:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "SolicitudVehiculoSaliente";
                break;
            case 22:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Transferencia";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 26:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 28:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 29:
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
