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
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorInt64;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class FiltroListadoSolicitud implements KvmSerializable {
    
    public String bastidor;
    public long centro;
    public boolean centroSpecified;
    public String fechaAbiertosIni;
    public boolean fechaAbiertosIniSpecified;
    public String fechaAbiertosnFin;
    public boolean fechaAbiertosnFinSpecified;
    public long idCliente;
    public boolean idClienteSpecified;
    public long idMarca;
    public boolean idMarcaSpecified;
    public long idServicio;
    public boolean idServicioSpecified;
    public VectorInt64 idsServicios;
    public String matricula;
    public String nIFPortador;
    public String nIFTitular;
    public String nombrePortador;
    public String nombreTitular;
    public int numeroMaximo;
    public boolean numeroMaximoSpecified;
    
    public FiltroListadoSolicitud(){}
    
    public FiltroListadoSolicitud(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Bastidor"))
        {
            Object obj = soapObject.getProperty("Bastidor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                bastidor = j.toString();
            }else if (obj!= null && obj instanceof String){
                bastidor = (String) obj;
            }
        }
        if (soapObject.hasProperty("Centro"))
        {
            Object obj = soapObject.getProperty("Centro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                centro = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                centro = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CentroSpecified"))
        {
            Object obj = soapObject.getProperty("CentroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                centroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                centroSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaAbiertosIni"))
        {
            Object obj = soapObject.getProperty("FechaAbiertosIni");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaAbiertosIni = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaAbiertosIni = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaAbiertosIniSpecified"))
        {
            Object obj = soapObject.getProperty("FechaAbiertosIniSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaAbiertosIniSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaAbiertosIniSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaAbiertosnFin"))
        {
            Object obj = soapObject.getProperty("FechaAbiertosnFin");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaAbiertosnFin = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaAbiertosnFin = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaAbiertosnFinSpecified"))
        {
            Object obj = soapObject.getProperty("FechaAbiertosnFinSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaAbiertosnFinSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaAbiertosnFinSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdCliente"))
        {
            Object obj = soapObject.getProperty("IdCliente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCliente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCliente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdClienteSpecified"))
        {
            Object obj = soapObject.getProperty("IdClienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idClienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idClienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdMarca"))
        {
            Object obj = soapObject.getProperty("IdMarca");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idMarca = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idMarca = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdMarcaSpecified"))
        {
            Object obj = soapObject.getProperty("IdMarcaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idMarcaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idMarcaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdServicio"))
        {
            Object obj = soapObject.getProperty("IdServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdServicioSpecified"))
        {
            Object obj = soapObject.getProperty("IdServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdsServicios"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("IdsServicios");
            idsServicios = new VectorInt64(j);
        }
        if (soapObject.hasProperty("Matricula"))
        {
            Object obj = soapObject.getProperty("Matricula");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                matricula = j.toString();
            }else if (obj!= null && obj instanceof String){
                matricula = (String) obj;
            }
        }
        if (soapObject.hasProperty("NIFPortador"))
        {
            Object obj = soapObject.getProperty("NIFPortador");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nIFPortador = j.toString();
            }else if (obj!= null && obj instanceof String){
                nIFPortador = (String) obj;
            }
        }
        if (soapObject.hasProperty("NIFTitular"))
        {
            Object obj = soapObject.getProperty("NIFTitular");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nIFTitular = j.toString();
            }else if (obj!= null && obj instanceof String){
                nIFTitular = (String) obj;
            }
        }
        if (soapObject.hasProperty("NombrePortador"))
        {
            Object obj = soapObject.getProperty("NombrePortador");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nombrePortador = j.toString();
            }else if (obj!= null && obj instanceof String){
                nombrePortador = (String) obj;
            }
        }
        if (soapObject.hasProperty("NombreTitular"))
        {
            Object obj = soapObject.getProperty("NombreTitular");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nombreTitular = j.toString();
            }else if (obj!= null && obj instanceof String){
                nombreTitular = (String) obj;
            }
        }
        if (soapObject.hasProperty("NumeroMaximo"))
        {
            Object obj = soapObject.getProperty("NumeroMaximo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numeroMaximo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                numeroMaximo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NumeroMaximoSpecified"))
        {
            Object obj = soapObject.getProperty("NumeroMaximoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numeroMaximoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                numeroMaximoSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return bastidor;
            case 1:
                return centro;
            case 2:
                return centroSpecified;
            case 3:
                return fechaAbiertosIni;
            case 4:
                return fechaAbiertosIniSpecified;
            case 5:
                return fechaAbiertosnFin;
            case 6:
                return fechaAbiertosnFinSpecified;
            case 7:
                return idCliente;
            case 8:
                return idClienteSpecified;
            case 9:
                return idMarca;
            case 10:
                return idMarcaSpecified;
            case 11:
                return idServicio;
            case 12:
                return idServicioSpecified;
            case 13:
                return idsServicios;
            case 14:
                return matricula;
            case 15:
                return nIFPortador;
            case 16:
                return nIFTitular;
            case 17:
                return nombrePortador;
            case 18:
                return nombreTitular;
            case 19:
                return numeroMaximo;
            case 20:
                return numeroMaximoSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 21;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Bastidor";
                break;
            case 1:
                info.type = Long.class;
                info.name = "Centro";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CentroSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaAbiertosIni";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaAbiertosIniSpecified";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaAbiertosnFin";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaAbiertosnFinSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "IdCliente";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdClienteSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "IdMarca";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdMarcaSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "IdServicio";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdServicioSpecified";
                break;
            case 13:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "IdsServicios";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Matricula";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NIFPortador";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NIFTitular";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NombrePortador";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NombreTitular";
                break;
            case 19:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "NumeroMaximo";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NumeroMaximoSpecified";
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
