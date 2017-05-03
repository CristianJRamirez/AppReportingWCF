package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.ReportingService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 4/25/2017 7:43:53 AM
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

public class QUERY_ResumenEstadisticoDefectos_Result implements KvmSerializable {
    
    public String apartado;
    public String centro;
    public String codigo;
    public String codigoCentro;
    public String defecto;
    public int grave;
    public boolean graveSpecified;
    public int leve;
    public boolean leveSpecified;
    public int muyGrave;
    public boolean muyGraveSpecified;
    public String id;
    public String ref;
    
    public QUERY_ResumenEstadisticoDefectos_Result(){}
    
    public QUERY_ResumenEstadisticoDefectos_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Apartado"))
        {
            Object obj = soapObject.getProperty("Apartado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                apartado = j.toString();
            }else if (obj!= null && obj instanceof String){
                apartado = (String) obj;
            }
        }
        if (soapObject.hasProperty("Centro"))
        {
            Object obj = soapObject.getProperty("Centro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                centro = j.toString();
            }else if (obj!= null && obj instanceof String){
                centro = (String) obj;
            }
        }
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
        if (soapObject.hasProperty("CodigoCentro"))
        {
            Object obj = soapObject.getProperty("CodigoCentro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoCentro = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoCentro = (String) obj;
            }
        }
        if (soapObject.hasProperty("Defecto"))
        {
            Object obj = soapObject.getProperty("Defecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defecto = j.toString();
            }else if (obj!= null && obj instanceof String){
                defecto = (String) obj;
            }
        }
        if (soapObject.hasProperty("Grave"))
        {
            Object obj = soapObject.getProperty("Grave");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                grave = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                grave = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("GraveSpecified"))
        {
            Object obj = soapObject.getProperty("GraveSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                graveSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                graveSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Leve"))
        {
            Object obj = soapObject.getProperty("Leve");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                leve = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                leve = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LeveSpecified"))
        {
            Object obj = soapObject.getProperty("LeveSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                leveSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                leveSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MuyGrave"))
        {
            Object obj = soapObject.getProperty("MuyGrave");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                muyGrave = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                muyGrave = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("MuyGraveSpecified"))
        {
            Object obj = soapObject.getProperty("MuyGraveSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                muyGraveSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                muyGraveSpecified = (Boolean) obj;
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
                return apartado;
            case 1:
                return centro;
            case 2:
                return codigo;
            case 3:
                return codigoCentro;
            case 4:
                return defecto;
            case 5:
                return grave;
            case 6:
                return graveSpecified;
            case 7:
                return leve;
            case 8:
                return leveSpecified;
            case 9:
                return muyGrave;
            case 10:
                return muyGraveSpecified;
            case 11:
                return id;
            case 12:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 13;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Apartado";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Centro";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoCentro";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Defecto";
                break;
            case 5:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Grave";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GraveSpecified";
                break;
            case 7:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Leve";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "LeveSpecified";
                break;
            case 9:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "MuyGrave";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MuyGraveSpecified";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}