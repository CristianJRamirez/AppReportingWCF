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
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_ListaEtiquetas_Result implements KvmSerializable {
    
    public String estado;
    public String inspeccion;
    public long numero;
    public boolean numeroSpecified;
    public String id;
    public String ref;
    
    public QUERY_ListaEtiquetas_Result(){}
    
    public QUERY_ListaEtiquetas_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Estado"))
        {
            Object obj = soapObject.getProperty("Estado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                estado = j.toString();
            }else if (obj!= null && obj instanceof String){
                estado = (String) obj;
            }
        }
        if (soapObject.hasProperty("Inspeccion"))
        {
            Object obj = soapObject.getProperty("Inspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                inspeccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                inspeccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("Numero"))
        {
            Object obj = soapObject.getProperty("Numero");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numero = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                numero = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NumeroSpecified"))
        {
            Object obj = soapObject.getProperty("NumeroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numeroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                numeroSpecified = (Boolean) obj;
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
                return estado;
            case 1:
                return inspeccion;
            case 2:
                return numero;
            case 3:
                return numeroSpecified;
            case 4:
                return id;
            case 5:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 6;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Estado";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Inspeccion";
                break;
            case 2:
                info.type = Long.class;
                info.name = "Numero";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NumeroSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 5:
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