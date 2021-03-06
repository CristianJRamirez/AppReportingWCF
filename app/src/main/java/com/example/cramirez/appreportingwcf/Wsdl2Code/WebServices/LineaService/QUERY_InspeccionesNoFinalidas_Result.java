package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_InspeccionesNoFinalidas_Result implements KvmSerializable {
    
    public String codigoCodigoInterno;
    public String codigoConstruccion;
    public String codigoUtilizacion;
    public String etapa;
    public String horaInspeccion;
    public long idVehiculo;
    public boolean idVehiculoSpecified;
    public String inspector;
    public String matricula;
    public String numeroInterno;
    public String servicios;
    public String situacion;
    public long idInspeccion;
    public boolean idInspeccionSpecified;
    public String id;
    public String ref;
    
    public QUERY_InspeccionesNoFinalidas_Result(){}
    
    public QUERY_InspeccionesNoFinalidas_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("CodigoCodigoInterno"))
        {
            Object obj = soapObject.getProperty("CodigoCodigoInterno");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoCodigoInterno = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoCodigoInterno = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoConstruccion"))
        {
            Object obj = soapObject.getProperty("CodigoConstruccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoConstruccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoConstruccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoUtilizacion"))
        {
            Object obj = soapObject.getProperty("CodigoUtilizacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoUtilizacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoUtilizacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("Etapa"))
        {
            Object obj = soapObject.getProperty("Etapa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                etapa = j.toString();
            }else if (obj!= null && obj instanceof String){
                etapa = (String) obj;
            }
        }
        if (soapObject.hasProperty("HoraInspeccion"))
        {
            Object obj = soapObject.getProperty("HoraInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                horaInspeccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                horaInspeccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("IdVehiculo"))
        {
            Object obj = soapObject.getProperty("IdVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idVehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idVehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdVehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("IdVehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idVehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idVehiculoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Inspector"))
        {
            Object obj = soapObject.getProperty("Inspector");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                inspector = j.toString();
            }else if (obj!= null && obj instanceof String){
                inspector = (String) obj;
            }
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
        if (soapObject.hasProperty("NumeroInterno"))
        {
            Object obj = soapObject.getProperty("NumeroInterno");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numeroInterno = j.toString();
            }else if (obj!= null && obj instanceof String){
                numeroInterno = (String) obj;
            }
        }
        if (soapObject.hasProperty("Servicios"))
        {
            Object obj = soapObject.getProperty("Servicios");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                servicios = j.toString();
            }else if (obj!= null && obj instanceof String){
                servicios = (String) obj;
            }
        }
        if (soapObject.hasProperty("Situacion"))
        {
            Object obj = soapObject.getProperty("Situacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                situacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                situacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("idInspeccion"))
        {
            Object obj = soapObject.getProperty("idInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("idInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionSpecified = (Boolean) obj;
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
                return codigoCodigoInterno;
            case 1:
                return codigoConstruccion;
            case 2:
                return codigoUtilizacion;
            case 3:
                return etapa;
            case 4:
                return horaInspeccion;
            case 5:
                return idVehiculo;
            case 6:
                return idVehiculoSpecified;
            case 7:
                return inspector;
            case 8:
                return matricula;
            case 9:
                return numeroInterno;
            case 10:
                return servicios;
            case 11:
                return situacion;
            case 12:
                return idInspeccion;
            case 13:
                return idInspeccionSpecified;
            case 14:
                return id;
            case 15:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 16;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoCodigoInterno";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoConstruccion";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoUtilizacion";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Etapa";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "HoraInspeccion";
                break;
            case 5:
                info.type = Long.class;
                info.name = "IdVehiculo";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdVehiculoSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Inspector";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Matricula";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumeroInterno";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Servicios";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Situacion";
                break;
            case 12:
                info.type = Long.class;
                info.name = "idInspeccion";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idInspeccionSpecified";
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
    
 
    public String getInnerText() {
        return null;
    }
    
    
 
    public void setInnerText(String s) {
    }
    
    
 
    public void setProperty(int arg0, Object arg1) {
    }
    
}
