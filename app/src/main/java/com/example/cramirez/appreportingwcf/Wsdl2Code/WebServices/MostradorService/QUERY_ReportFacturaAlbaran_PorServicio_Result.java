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
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_ReportFacturaAlbaran_PorServicio_Result implements KvmSerializable {
    
    public String descCategoria_Valor;
    public String descCentro;
    public String descFactura;
    public String descImporte;
    public String descServicio;
    public String descVehiculo;
    public long idCategoria_Valor;
    public boolean idCategoria_ValorSpecified;
    public long idCentro;
    public boolean idCentroSpecified;
    public long idServicio;
    public boolean idServicioSpecified;
    public double importe;
    public boolean importeSpecified;
    public String tipo;
    public String id;
    public String ref;
    
    public QUERY_ReportFacturaAlbaran_PorServicio_Result(){}
    
    public QUERY_ReportFacturaAlbaran_PorServicio_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("DescCategoria_Valor"))
        {
            Object obj = soapObject.getProperty("DescCategoria_Valor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descCategoria_Valor = j.toString();
            }else if (obj!= null && obj instanceof String){
                descCategoria_Valor = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescCentro"))
        {
            Object obj = soapObject.getProperty("DescCentro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descCentro = j.toString();
            }else if (obj!= null && obj instanceof String){
                descCentro = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescFactura"))
        {
            Object obj = soapObject.getProperty("DescFactura");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descFactura = j.toString();
            }else if (obj!= null && obj instanceof String){
                descFactura = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescImporte"))
        {
            Object obj = soapObject.getProperty("DescImporte");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descImporte = j.toString();
            }else if (obj!= null && obj instanceof String){
                descImporte = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescServicio"))
        {
            Object obj = soapObject.getProperty("DescServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descServicio = j.toString();
            }else if (obj!= null && obj instanceof String){
                descServicio = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescVehiculo"))
        {
            Object obj = soapObject.getProperty("DescVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descVehiculo = j.toString();
            }else if (obj!= null && obj instanceof String){
                descVehiculo = (String) obj;
            }
        }
        if (soapObject.hasProperty("IdCategoria_Valor"))
        {
            Object obj = soapObject.getProperty("IdCategoria_Valor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCategoria_Valor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCategoria_Valor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdCategoria_ValorSpecified"))
        {
            Object obj = soapObject.getProperty("IdCategoria_ValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCategoria_ValorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCategoria_ValorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdCentro"))
        {
            Object obj = soapObject.getProperty("IdCentro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCentro = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCentro = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdCentroSpecified"))
        {
            Object obj = soapObject.getProperty("IdCentroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCentroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCentroSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Importe"))
        {
            Object obj = soapObject.getProperty("Importe");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                importe = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                importe = (Double) obj;
            }
        }
        if (soapObject.hasProperty("ImporteSpecified"))
        {
            Object obj = soapObject.getProperty("ImporteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                importeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                importeSpecified = (Boolean) obj;
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
                return descCategoria_Valor;
            case 1:
                return descCentro;
            case 2:
                return descFactura;
            case 3:
                return descImporte;
            case 4:
                return descServicio;
            case 5:
                return descVehiculo;
            case 6:
                return idCategoria_Valor;
            case 7:
                return idCategoria_ValorSpecified;
            case 8:
                return idCentro;
            case 9:
                return idCentroSpecified;
            case 10:
                return idServicio;
            case 11:
                return idServicioSpecified;
            case 12:
                return importe;
            case 13:
                return importeSpecified;
            case 14:
                return tipo;
            case 15:
                return id;
            case 16:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 17;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescCategoria_Valor";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescCentro";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescFactura";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescImporte";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescServicio";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescVehiculo";
                break;
            case 6:
                info.type = Long.class;
                info.name = "IdCategoria_Valor";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdCategoria_ValorSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "IdCentro";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdCentroSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "IdServicio";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdServicioSpecified";
                break;
            case 12:
                info.type = Double.class;
                info.name = "Importe";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ImporteSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Tipo";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 16:
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