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

public class QUERY_RelacionIngresos_Result implements KvmSerializable {
    
    public String centro;
    public double recogidaProsegur;
    public boolean recogidaProsegurSpecified;
    public double recogidaTotal;
    public boolean recogidaTotalSpecified;
    public double recogidaVarios;
    public boolean recogidaVariosSpecified;
    public double traspasosBanco;
    public boolean traspasosBancoSpecified;
    public String id;
    public String ref;
    
    public QUERY_RelacionIngresos_Result(){}
    
    public QUERY_RelacionIngresos_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("RecogidaProsegur"))
        {
            Object obj = soapObject.getProperty("RecogidaProsegur");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                recogidaProsegur = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                recogidaProsegur = (Double) obj;
            }
        }
        if (soapObject.hasProperty("RecogidaProsegurSpecified"))
        {
            Object obj = soapObject.getProperty("RecogidaProsegurSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                recogidaProsegurSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                recogidaProsegurSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("RecogidaTotal"))
        {
            Object obj = soapObject.getProperty("RecogidaTotal");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                recogidaTotal = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                recogidaTotal = (Double) obj;
            }
        }
        if (soapObject.hasProperty("RecogidaTotalSpecified"))
        {
            Object obj = soapObject.getProperty("RecogidaTotalSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                recogidaTotalSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                recogidaTotalSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("RecogidaVarios"))
        {
            Object obj = soapObject.getProperty("RecogidaVarios");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                recogidaVarios = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                recogidaVarios = (Double) obj;
            }
        }
        if (soapObject.hasProperty("RecogidaVariosSpecified"))
        {
            Object obj = soapObject.getProperty("RecogidaVariosSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                recogidaVariosSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                recogidaVariosSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TraspasosBanco"))
        {
            Object obj = soapObject.getProperty("TraspasosBanco");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                traspasosBanco = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                traspasosBanco = (Double) obj;
            }
        }
        if (soapObject.hasProperty("TraspasosBancoSpecified"))
        {
            Object obj = soapObject.getProperty("TraspasosBancoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                traspasosBancoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                traspasosBancoSpecified = (Boolean) obj;
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
                return centro;
            case 1:
                return recogidaProsegur;
            case 2:
                return recogidaProsegurSpecified;
            case 3:
                return recogidaTotal;
            case 4:
                return recogidaTotalSpecified;
            case 5:
                return recogidaVarios;
            case 6:
                return recogidaVariosSpecified;
            case 7:
                return traspasosBanco;
            case 8:
                return traspasosBancoSpecified;
            case 9:
                return id;
            case 10:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 11;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Centro";
                break;
            case 1:
                info.type = Double.class;
                info.name = "RecogidaProsegur";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "RecogidaProsegurSpecified";
                break;
            case 3:
                info.type = Double.class;
                info.name = "RecogidaTotal";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "RecogidaTotalSpecified";
                break;
            case 5:
                info.type = Double.class;
                info.name = "RecogidaVarios";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "RecogidaVariosSpecified";
                break;
            case 7:
                info.type = Double.class;
                info.name = "TraspasosBanco";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TraspasosBancoSpecified";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
