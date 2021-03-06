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
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_ListadoFacturas_Result implements KvmSerializable {
    
    public boolean abono;
    public boolean abonoSpecified;
    public String apellidos;
    public long fK_IdFacturaPrevia;
    public boolean fK_IdFacturaPreviaSpecified;
    public long fK_IdTipoDocumento;
    public boolean fK_IdTipoDocumentoSpecified;
    public long fK_IdTipoFactura;
    public boolean fK_IdTipoFacturaSpecified;
    public String fechaEmision;
    public boolean fechaEmisionSpecified;
    public long idFactura;
    public boolean idFacturaSpecified;
    public long idInspeccion;
    public boolean idInspeccionSpecified;
    public String mecanismoPago;
    public String nIF;
    public String nombre;
    public String numFactura;
    public String numSolicitud;
    public String numeroInspeccion;
    public double totalFactura;
    public boolean totalFacturaSpecified;
    public long idSolicitudServicio;
    public boolean idSolicitudServicioSpecified;
    public String servicios;
    public String vehBastidor;
    public String vehContrasenyaHomologacion;
    public String vehMatricula;
    public String id;
    public String ref;
    
    public QUERY_ListadoFacturas_Result(){}
    
    public QUERY_ListadoFacturas_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Abono"))
        {
            Object obj = soapObject.getProperty("Abono");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                abono = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                abono = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("AbonoSpecified"))
        {
            Object obj = soapObject.getProperty("AbonoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                abonoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                abonoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Apellidos"))
        {
            Object obj = soapObject.getProperty("Apellidos");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                apellidos = j.toString();
            }else if (obj!= null && obj instanceof String){
                apellidos = (String) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdFacturaPrevia"))
        {
            Object obj = soapObject.getProperty("FK_IdFacturaPrevia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdFacturaPrevia = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdFacturaPrevia = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdFacturaPreviaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdFacturaPreviaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdFacturaPreviaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdFacturaPreviaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoDocumento"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoDocumento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoDocumento = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoDocumento = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoDocumentoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoDocumentoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoDocumentoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoDocumentoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoFactura"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoFactura");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoFactura = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoFactura = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoFacturaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoFacturaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoFacturaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoFacturaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaEmision"))
        {
            Object obj = soapObject.getProperty("FechaEmision");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaEmision = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaEmision = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaEmisionSpecified"))
        {
            Object obj = soapObject.getProperty("FechaEmisionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaEmisionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaEmisionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdFactura"))
        {
            Object obj = soapObject.getProperty("IdFactura");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idFactura = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idFactura = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdFacturaSpecified"))
        {
            Object obj = soapObject.getProperty("IdFacturaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idFacturaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idFacturaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccion"))
        {
            Object obj = soapObject.getProperty("IdInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("IdInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MecanismoPago"))
        {
            Object obj = soapObject.getProperty("MecanismoPago");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mecanismoPago = j.toString();
            }else if (obj!= null && obj instanceof String){
                mecanismoPago = (String) obj;
            }
        }
        if (soapObject.hasProperty("NIF"))
        {
            Object obj = soapObject.getProperty("NIF");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nIF = j.toString();
            }else if (obj!= null && obj instanceof String){
                nIF = (String) obj;
            }
        }
        if (soapObject.hasProperty("Nombre"))
        {
            Object obj = soapObject.getProperty("Nombre");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nombre = j.toString();
            }else if (obj!= null && obj instanceof String){
                nombre = (String) obj;
            }
        }
        if (soapObject.hasProperty("NumFactura"))
        {
            Object obj = soapObject.getProperty("NumFactura");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numFactura = j.toString();
            }else if (obj!= null && obj instanceof String){
                numFactura = (String) obj;
            }
        }
        if (soapObject.hasProperty("NumSolicitud"))
        {
            Object obj = soapObject.getProperty("NumSolicitud");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numSolicitud = j.toString();
            }else if (obj!= null && obj instanceof String){
                numSolicitud = (String) obj;
            }
        }
        if (soapObject.hasProperty("NumeroInspeccion"))
        {
            Object obj = soapObject.getProperty("NumeroInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numeroInspeccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                numeroInspeccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("TotalFactura"))
        {
            Object obj = soapObject.getProperty("TotalFactura");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                totalFactura = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                totalFactura = (Double) obj;
            }
        }
        if (soapObject.hasProperty("TotalFacturaSpecified"))
        {
            Object obj = soapObject.getProperty("TotalFacturaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                totalFacturaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                totalFacturaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("idSolicitudServicio"))
        {
            Object obj = soapObject.getProperty("idSolicitudServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idSolicitudServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idSolicitudServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idSolicitudServicioSpecified"))
        {
            Object obj = soapObject.getProperty("idSolicitudServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idSolicitudServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idSolicitudServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("servicios"))
        {
            Object obj = soapObject.getProperty("servicios");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                servicios = j.toString();
            }else if (obj!= null && obj instanceof String){
                servicios = (String) obj;
            }
        }
        if (soapObject.hasProperty("vehBastidor"))
        {
            Object obj = soapObject.getProperty("vehBastidor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                vehBastidor = j.toString();
            }else if (obj!= null && obj instanceof String){
                vehBastidor = (String) obj;
            }
        }
        if (soapObject.hasProperty("vehContrasenyaHomologacion"))
        {
            Object obj = soapObject.getProperty("vehContrasenyaHomologacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                vehContrasenyaHomologacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                vehContrasenyaHomologacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("vehMatricula"))
        {
            Object obj = soapObject.getProperty("vehMatricula");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                vehMatricula = j.toString();
            }else if (obj!= null && obj instanceof String){
                vehMatricula = (String) obj;
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
                return abono;
            case 1:
                return abonoSpecified;
            case 2:
                return apellidos;
            case 3:
                return fK_IdFacturaPrevia;
            case 4:
                return fK_IdFacturaPreviaSpecified;
            case 5:
                return fK_IdTipoDocumento;
            case 6:
                return fK_IdTipoDocumentoSpecified;
            case 7:
                return fK_IdTipoFactura;
            case 8:
                return fK_IdTipoFacturaSpecified;
            case 9:
                return fechaEmision;
            case 10:
                return fechaEmisionSpecified;
            case 11:
                return idFactura;
            case 12:
                return idFacturaSpecified;
            case 13:
                return idInspeccion;
            case 14:
                return idInspeccionSpecified;
            case 15:
                return mecanismoPago;
            case 16:
                return nIF;
            case 17:
                return nombre;
            case 18:
                return numFactura;
            case 19:
                return numSolicitud;
            case 20:
                return numeroInspeccion;
            case 21:
                return totalFactura;
            case 22:
                return totalFacturaSpecified;
            case 23:
                return idSolicitudServicio;
            case 24:
                return idSolicitudServicioSpecified;
            case 25:
                return servicios;
            case 26:
                return vehBastidor;
            case 27:
                return vehContrasenyaHomologacion;
            case 28:
                return vehMatricula;
            case 29:
                return id;
            case 30:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 31;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Abono";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "AbonoSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Apellidos";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdFacturaPrevia";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdFacturaPreviaSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdTipoDocumento";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoDocumentoSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "FK_IdTipoFactura";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoFacturaSpecified";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaEmision";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaEmisionSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "IdFactura";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdFacturaSpecified";
                break;
            case 13:
                info.type = Long.class;
                info.name = "IdInspeccion";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MecanismoPago";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NIF";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Nombre";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumFactura";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumSolicitud";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumeroInspeccion";
                break;
            case 21:
                info.type = Double.class;
                info.name = "TotalFactura";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TotalFacturaSpecified";
                break;
            case 23:
                info.type = Long.class;
                info.name = "idSolicitudServicio";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSolicitudServicioSpecified";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "servicios";
                break;
            case 26:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "vehBastidor";
                break;
            case 27:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "vehContrasenyaHomologacion";
                break;
            case 28:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "vehMatricula";
                break;
            case 29:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 30:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
