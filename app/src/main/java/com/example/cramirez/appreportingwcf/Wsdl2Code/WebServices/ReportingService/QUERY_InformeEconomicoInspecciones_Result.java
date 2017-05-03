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

public class QUERY_InformeEconomicoInspecciones_Result implements KvmSerializable {
    
    public double base;
    public boolean baseSpecified;
    public String centro;
    public String codigoCentro;
    public String descripcionTasa1;
    public String descripcionTasa2;
    public String descripcionTasa3;
    public double iVA;
    public boolean iVASpecified;
    public int inspecciones;
    public boolean inspeccionesSpecified;
    public int prestaciones;
    public boolean prestacionesSpecified;
    public String servicio;
    public double sumaTotal;
    public boolean sumaTotalSpecified;
    public double tasa1;
    public boolean tasa1Specified;
    public double tasa2;
    public boolean tasa2Specified;
    public double tasa3;
    public boolean tasa3Specified;
    public String tipo;
    public double totalInspeccion;
    public boolean totalInspeccionSpecified;
    public String id;
    public String ref;
    
    public QUERY_InformeEconomicoInspecciones_Result(){}
    
    public QUERY_InformeEconomicoInspecciones_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Base"))
        {
            Object obj = soapObject.getProperty("Base");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                base = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                base = (Double) obj;
            }
        }
        if (soapObject.hasProperty("BaseSpecified"))
        {
            Object obj = soapObject.getProperty("BaseSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                baseSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                baseSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("DescripcionTasa1"))
        {
            Object obj = soapObject.getProperty("DescripcionTasa1");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionTasa1 = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionTasa1 = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescripcionTasa2"))
        {
            Object obj = soapObject.getProperty("DescripcionTasa2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionTasa2 = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionTasa2 = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescripcionTasa3"))
        {
            Object obj = soapObject.getProperty("DescripcionTasa3");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionTasa3 = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionTasa3 = (String) obj;
            }
        }
        if (soapObject.hasProperty("IVA"))
        {
            Object obj = soapObject.getProperty("IVA");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                iVA = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                iVA = (Double) obj;
            }
        }
        if (soapObject.hasProperty("IVASpecified"))
        {
            Object obj = soapObject.getProperty("IVASpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                iVASpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                iVASpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Inspecciones"))
        {
            Object obj = soapObject.getProperty("Inspecciones");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                inspecciones = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                inspecciones = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("InspeccionesSpecified"))
        {
            Object obj = soapObject.getProperty("InspeccionesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                inspeccionesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                inspeccionesSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Prestaciones"))
        {
            Object obj = soapObject.getProperty("Prestaciones");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                prestaciones = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                prestaciones = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("PrestacionesSpecified"))
        {
            Object obj = soapObject.getProperty("PrestacionesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                prestacionesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                prestacionesSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("SumaTotal"))
        {
            Object obj = soapObject.getProperty("SumaTotal");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sumaTotal = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                sumaTotal = (Double) obj;
            }
        }
        if (soapObject.hasProperty("SumaTotalSpecified"))
        {
            Object obj = soapObject.getProperty("SumaTotalSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sumaTotalSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                sumaTotalSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Tasa1"))
        {
            Object obj = soapObject.getProperty("Tasa1");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tasa1 = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                tasa1 = (Double) obj;
            }
        }
        if (soapObject.hasProperty("Tasa1Specified"))
        {
            Object obj = soapObject.getProperty("Tasa1Specified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tasa1Specified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tasa1Specified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Tasa2"))
        {
            Object obj = soapObject.getProperty("Tasa2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tasa2 = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                tasa2 = (Double) obj;
            }
        }
        if (soapObject.hasProperty("Tasa2Specified"))
        {
            Object obj = soapObject.getProperty("Tasa2Specified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tasa2Specified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tasa2Specified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Tasa3"))
        {
            Object obj = soapObject.getProperty("Tasa3");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tasa3 = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                tasa3 = (Double) obj;
            }
        }
        if (soapObject.hasProperty("Tasa3Specified"))
        {
            Object obj = soapObject.getProperty("Tasa3Specified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tasa3Specified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tasa3Specified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Tipo"))
        {
            Object obj = soapObject.getProperty("Tipo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tipo = j.toString();
            }else if (obj!= null && obj instanceof String){
                tipo = (String) obj;
            }
        }
        if (soapObject.hasProperty("TotalInspeccion"))
        {
            Object obj = soapObject.getProperty("TotalInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                totalInspeccion = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                totalInspeccion = (Double) obj;
            }
        }
        if (soapObject.hasProperty("TotalInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("TotalInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                totalInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                totalInspeccionSpecified = (Boolean) obj;
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
                return base;
            case 1:
                return baseSpecified;
            case 2:
                return centro;
            case 3:
                return codigoCentro;
            case 4:
                return descripcionTasa1;
            case 5:
                return descripcionTasa2;
            case 6:
                return descripcionTasa3;
            case 7:
                return iVA;
            case 8:
                return iVASpecified;
            case 9:
                return inspecciones;
            case 10:
                return inspeccionesSpecified;
            case 11:
                return prestaciones;
            case 12:
                return prestacionesSpecified;
            case 13:
                return servicio;
            case 14:
                return sumaTotal;
            case 15:
                return sumaTotalSpecified;
            case 16:
                return tasa1;
            case 17:
                return tasa1Specified;
            case 18:
                return tasa2;
            case 19:
                return tasa2Specified;
            case 20:
                return tasa3;
            case 21:
                return tasa3Specified;
            case 22:
                return tipo;
            case 23:
                return totalInspeccion;
            case 24:
                return totalInspeccionSpecified;
            case 25:
                return id;
            case 26:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 27;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Double.class;
                info.name = "Base";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "BaseSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Centro";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoCentro";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionTasa1";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionTasa2";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionTasa3";
                break;
            case 7:
                info.type = Double.class;
                info.name = "IVA";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IVASpecified";
                break;
            case 9:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Inspecciones";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "InspeccionesSpecified";
                break;
            case 11:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Prestaciones";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PrestacionesSpecified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Servicio";
                break;
            case 14:
                info.type = Double.class;
                info.name = "SumaTotal";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SumaTotalSpecified";
                break;
            case 16:
                info.type = Double.class;
                info.name = "Tasa1";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Tasa1Specified";
                break;
            case 18:
                info.type = Double.class;
                info.name = "Tasa2";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Tasa2Specified";
                break;
            case 20:
                info.type = Double.class;
                info.name = "Tasa3";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Tasa3Specified";
                break;
            case 22:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Tipo";
                break;
            case 23:
                info.type = Double.class;
                info.name = "TotalInspeccion";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TotalInspeccionSpecified";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 26:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
