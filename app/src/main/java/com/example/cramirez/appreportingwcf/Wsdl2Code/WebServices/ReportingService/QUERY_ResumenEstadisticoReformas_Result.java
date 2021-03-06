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

public class QUERY_ResumenEstadisticoReformas_Result implements KvmSerializable {
    
    public int cancelados;
    public boolean canceladosSpecified;
    public int incorparecencia;
    public boolean incorparecenciaSpecified;
    public int normales;
    public boolean normalesSpecified;
    public int totalCerrados;
    public boolean totalCerradosSpecified;
    public int abiertos;
    public boolean abiertosSpecified;
    public int abonados;
    public boolean abonadosSpecified;
    public String centro;
    public String descripcion;
    public int pendientes;
    public boolean pendientesSpecified;
    public String id;
    public String ref;
    
    public QUERY_ResumenEstadisticoReformas_Result(){}
    
    public QUERY_ResumenEstadisticoReformas_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Cancelados"))
        {
            Object obj = soapObject.getProperty("Cancelados");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cancelados = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                cancelados = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CanceladosSpecified"))
        {
            Object obj = soapObject.getProperty("CanceladosSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                canceladosSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                canceladosSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Incorparecencia"))
        {
            Object obj = soapObject.getProperty("Incorparecencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                incorparecencia = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                incorparecencia = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IncorparecenciaSpecified"))
        {
            Object obj = soapObject.getProperty("IncorparecenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                incorparecenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                incorparecenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Normales"))
        {
            Object obj = soapObject.getProperty("Normales");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                normales = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                normales = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NormalesSpecified"))
        {
            Object obj = soapObject.getProperty("NormalesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                normalesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                normalesSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TotalCerrados"))
        {
            Object obj = soapObject.getProperty("TotalCerrados");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                totalCerrados = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                totalCerrados = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("TotalCerradosSpecified"))
        {
            Object obj = soapObject.getProperty("TotalCerradosSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                totalCerradosSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                totalCerradosSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("abiertos"))
        {
            Object obj = soapObject.getProperty("abiertos");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                abiertos = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                abiertos = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("abiertosSpecified"))
        {
            Object obj = soapObject.getProperty("abiertosSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                abiertosSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                abiertosSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("abonados"))
        {
            Object obj = soapObject.getProperty("abonados");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                abonados = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                abonados = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("abonadosSpecified"))
        {
            Object obj = soapObject.getProperty("abonadosSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                abonadosSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                abonadosSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("centro"))
        {
            Object obj = soapObject.getProperty("centro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                centro = j.toString();
            }else if (obj!= null && obj instanceof String){
                centro = (String) obj;
            }
        }
        if (soapObject.hasProperty("descripcion"))
        {
            Object obj = soapObject.getProperty("descripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("pendientes"))
        {
            Object obj = soapObject.getProperty("pendientes");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pendientes = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                pendientes = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("pendientesSpecified"))
        {
            Object obj = soapObject.getProperty("pendientesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pendientesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pendientesSpecified = (Boolean) obj;
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
                return cancelados;
            case 1:
                return canceladosSpecified;
            case 2:
                return incorparecencia;
            case 3:
                return incorparecenciaSpecified;
            case 4:
                return normales;
            case 5:
                return normalesSpecified;
            case 6:
                return totalCerrados;
            case 7:
                return totalCerradosSpecified;
            case 8:
                return abiertos;
            case 9:
                return abiertosSpecified;
            case 10:
                return abonados;
            case 11:
                return abonadosSpecified;
            case 12:
                return centro;
            case 13:
                return descripcion;
            case 14:
                return pendientes;
            case 15:
                return pendientesSpecified;
            case 16:
                return id;
            case 17:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 18;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Cancelados";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CanceladosSpecified";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Incorparecencia";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IncorparecenciaSpecified";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Normales";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NormalesSpecified";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "TotalCerrados";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TotalCerradosSpecified";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "abiertos";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "abiertosSpecified";
                break;
            case 10:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "abonados";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "abonadosSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "centro";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "descripcion";
                break;
            case 14:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "pendientes";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "pendientesSpecified";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
