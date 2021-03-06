package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QueryInspeccionResultadoPrueba_Result implements KvmSerializable {
    
    public String codigo;
    public String descripcion;
    public long fK_IdPruebaElemento;
    public boolean fK_IdPruebaElementoSpecified;
    public long idInspeccionResultadoPrueba;
    public boolean idInspeccionResultadoPruebaSpecified;
    public String resultado;
    public String id;
    public String ref;
    
    public QueryInspeccionResultadoPrueba_Result(){}
    
    public QueryInspeccionResultadoPrueba_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Codigo"))
        {
            Object obj = soapObject.getProperty("Codigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigo = (String) obj;
            }
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
        if (soapObject.hasProperty("FK_IdPruebaElemento"))
        {
            Object obj = soapObject.getProperty("FK_IdPruebaElemento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdPruebaElemento = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdPruebaElemento = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdPruebaElementoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdPruebaElementoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdPruebaElementoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdPruebaElementoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionResultadoPrueba"))
        {
            Object obj = soapObject.getProperty("IdInspeccionResultadoPrueba");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionResultadoPrueba = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccionResultadoPrueba = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionResultadoPruebaSpecified"))
        {
            Object obj = soapObject.getProperty("IdInspeccionResultadoPruebaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionResultadoPruebaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionResultadoPruebaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Resultado"))
        {
            Object obj = soapObject.getProperty("Resultado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                resultado = j.toString();
            }else if (obj!= null && obj instanceof String){
                resultado = (String) obj;
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
                return codigo;
            case 1:
                return descripcion;
            case 2:
                return fK_IdPruebaElemento;
            case 3:
                return fK_IdPruebaElementoSpecified;
            case 4:
                return idInspeccionResultadoPrueba;
            case 5:
                return idInspeccionResultadoPruebaSpecified;
            case 6:
                return resultado;
            case 7:
                return id;
            case 8:
                return ref;
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
                info.name = "Codigo";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdPruebaElemento";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdPruebaElementoSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "IdInspeccionResultadoPrueba";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionResultadoPruebaSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Resultado";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 8:
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
