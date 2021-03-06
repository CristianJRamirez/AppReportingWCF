package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class InspecionResumen implements KvmSerializable {
    
    public String codigoUsuario;
    public long estado;
    public boolean estadoSpecified;
    public long idInspeccion;
    public boolean idInspeccionSpecified;
    public long idVehiculo;
    public boolean idVehiculoSpecified;
    public String matricula;
    public String numeroInterno;
    
    public InspecionResumen(){}
    
    public InspecionResumen(SoapObject soapObject)
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
        if (soapObject.hasProperty("Estado"))
        {
            Object obj = soapObject.getProperty("Estado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                estado = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                estado = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("EstadoSpecified"))
        {
            Object obj = soapObject.getProperty("EstadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                estadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                estadoSpecified = (Boolean) obj;
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
    }
 
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return codigoUsuario;
            case 1:
                return estado;
            case 2:
                return estadoSpecified;
            case 3:
                return idInspeccion;
            case 4:
                return idInspeccionSpecified;
            case 5:
                return idVehiculo;
            case 6:
                return idVehiculoSpecified;
            case 7:
                return matricula;
            case 8:
                return numeroInterno;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 9;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoUsuario";
                break;
            case 1:
                info.type = Long.class;
                info.name = "Estado";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "EstadoSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "IdInspeccion";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionSpecified";
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
                info.name = "Matricula";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumeroInterno";
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
