package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_BuscadorInspecciones_Result implements KvmSerializable {
    
    public String codigoConstruccion;
    public String codigoInterno;
    public String codigoUtilizacion;
    public String fechaInspeccion;
    public boolean fechaInspeccionSpecified;
    public long idInspeccion;
    public boolean idInspeccionSpecified;
    public String matricula;
    public String numeroInterno;
    public String servicio;
    public String veredicto;
    public long idVehiculo;
    public boolean idVehiculoSpecified;
    public String id;
    public String ref;
    
    public QUERY_BuscadorInspecciones_Result(){}
    
    public QUERY_BuscadorInspecciones_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("FechaInspeccion"))
        {
            Object obj = soapObject.getProperty("FechaInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInspeccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaInspeccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FechaInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaInspeccionSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Servicio"))
        {
            Object obj = soapObject.getProperty("Servicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                servicio = j.toString();
            }else if (obj!= null && obj instanceof String){
                servicio = (String) obj;
            }
        }
        if (soapObject.hasProperty("Veredicto"))
        {
            Object obj = soapObject.getProperty("Veredicto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                veredicto = j.toString();
            }else if (obj!= null && obj instanceof String){
                veredicto = (String) obj;
            }
        }
        if (soapObject.hasProperty("idVehiculo"))
        {
            Object obj = soapObject.getProperty("idVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idVehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idVehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idVehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("idVehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idVehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idVehiculoSpecified = (Boolean) obj;
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
                return codigoConstruccion;
            case 1:
                return codigoInterno;
            case 2:
                return codigoUtilizacion;
            case 3:
                return fechaInspeccion;
            case 4:
                return fechaInspeccionSpecified;
            case 5:
                return idInspeccion;
            case 6:
                return idInspeccionSpecified;
            case 7:
                return matricula;
            case 8:
                return numeroInterno;
            case 9:
                return servicio;
            case 10:
                return veredicto;
            case 11:
                return idVehiculo;
            case 12:
                return idVehiculoSpecified;
            case 13:
                return id;
            case 14:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 15;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoConstruccion";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoInterno";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoUtilizacion";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaInspeccion";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaInspeccionSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "IdInspeccion";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Matricula";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumeroInterno";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Servicio";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Veredicto";
                break;
            case 11:
                info.type = Long.class;
                info.name = "idVehiculo";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idVehiculoSpecified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 14:
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
