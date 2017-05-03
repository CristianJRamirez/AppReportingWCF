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

public class QUERY_CajadeVarios_Result implements KvmSerializable {
    
    public String centro;
    public String descripcion;
    public long fK_IdCentro;
    public boolean fK_IdCentroSpecified;
    public long fK_IdTipoTransferencia;
    public boolean fK_IdTipoTransferenciaSpecified;
    public double saldo;
    public boolean saldoSpecified;
    public double cantidad;
    public boolean cantidadSpecified;
    public double entrada;
    public boolean entradaSpecified;
    public String fechaproceso;
    public boolean fechaprocesoSpecified;
    public long id;
    public boolean idSpecified;
    public double salida;
    public boolean salidaSpecified;
    public int tipo;
    public boolean tipoSpecified;
    public String Id;
    public String ref;
    
    public QUERY_CajadeVarios_Result(){}
    
    public QUERY_CajadeVarios_Result(SoapObject soapObject)
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
        if (soapObject.hasProperty("FK_IdCentro"))
        {
            Object obj = soapObject.getProperty("FK_IdCentro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCentro = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCentro = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCentroSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCentroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCentroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCentroSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoTransferencia"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoTransferencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoTransferencia = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoTransferencia = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoTransferenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoTransferenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoTransferenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoTransferenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Saldo"))
        {
            Object obj = soapObject.getProperty("Saldo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saldo = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                saldo = (Double) obj;
            }
        }
        if (soapObject.hasProperty("SaldoSpecified"))
        {
            Object obj = soapObject.getProperty("SaldoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saldoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                saldoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("cantidad"))
        {
            Object obj = soapObject.getProperty("cantidad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cantidad = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                cantidad = (Double) obj;
            }
        }
        if (soapObject.hasProperty("cantidadSpecified"))
        {
            Object obj = soapObject.getProperty("cantidadSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cantidadSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cantidadSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("entrada"))
        {
            Object obj = soapObject.getProperty("entrada");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                entrada = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                entrada = (Double) obj;
            }
        }
        if (soapObject.hasProperty("entradaSpecified"))
        {
            Object obj = soapObject.getProperty("entradaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                entradaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                entradaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("fechaproceso"))
        {
            Object obj = soapObject.getProperty("fechaproceso");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaproceso = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaproceso = (String) obj;
            }
        }
        if (soapObject.hasProperty("fechaprocesoSpecified"))
        {
            Object obj = soapObject.getProperty("fechaprocesoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaprocesoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaprocesoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("id"))
        {
            Object obj = soapObject.getProperty("id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                id = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                id = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idSpecified"))
        {
            Object obj = soapObject.getProperty("idSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("salida"))
        {
            Object obj = soapObject.getProperty("salida");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                salida = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                salida = (Double) obj;
            }
        }
        if (soapObject.hasProperty("salidaSpecified"))
        {
            Object obj = soapObject.getProperty("salidaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                salidaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                salidaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("tipo"))
        {
            Object obj = soapObject.getProperty("tipo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tipo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                tipo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("tipoSpecified"))
        {
            Object obj = soapObject.getProperty("tipoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tipoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tipoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Id"))
        {
            Object obj = soapObject.getProperty("Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                Id = j.toString();
            }else if (obj!= null && obj instanceof String){
                Id = (String) obj;
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
                return descripcion;
            case 2:
                return fK_IdCentro;
            case 3:
                return fK_IdCentroSpecified;
            case 4:
                return fK_IdTipoTransferencia;
            case 5:
                return fK_IdTipoTransferenciaSpecified;
            case 6:
                return saldo;
            case 7:
                return saldoSpecified;
            case 8:
                return cantidad;
            case 9:
                return cantidadSpecified;
            case 10:
                return entrada;
            case 11:
                return entradaSpecified;
            case 12:
                return fechaproceso;
            case 13:
                return fechaprocesoSpecified;
            case 14:
                return id;
            case 15:
                return idSpecified;
            case 16:
                return salida;
            case 17:
                return salidaSpecified;
            case 18:
                return tipo;
            case 19:
                return tipoSpecified;
            case 20:
                return id;
            case 21:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 22;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Centro";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdCentro";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCentroSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdTipoTransferencia";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoTransferenciaSpecified";
                break;
            case 6:
                info.type = Double.class;
                info.name = "Saldo";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SaldoSpecified";
                break;
            case 8:
                info.type = Double.class;
                info.name = "cantidad";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "cantidadSpecified";
                break;
            case 10:
                info.type = Double.class;
                info.name = "entrada";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "entradaSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaproceso";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaprocesoSpecified";
                break;
            case 14:
                info.type = Long.class;
                info.name = "id";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 16:
                info.type = Double.class;
                info.name = "salida";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "salidaSpecified";
                break;
            case 18:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "tipo";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "tipoSpecified";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}