package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_AlcanceBloques_Result implements KvmSerializable {
    
    public String codigo;
    public String descripcion;
    public String fullCodigo;
    public long idCondicionalidadLineaFinal;
    public boolean idCondicionalidadLineaFinalSpecified;
    public long idCondicionalidadLineaFinalPendiente;
    public boolean idCondicionalidadLineaFinalPendienteSpecified;
    public long idCondicionalidadOrigen;
    public boolean idCondicionalidadOrigenSpecified;
    public long idInspeccion;
    public boolean idInspeccionSpecified;
    public long idInspeccionAlcance;
    public boolean idInspeccionAlcanceSpecified;
    public boolean pendiente;
    public boolean pendienteSpecified;
    public String descripcionCondicionalidad;
    public String descripcionCondicionalidadFinal;
    public String descripcionCondicionalidadFinalPendiente;
    public long idApartado;
    public boolean idApartadoSpecified;
    public String id;
    public String ref;
    
    public QUERY_AlcanceBloques_Result(){}
    
    public QUERY_AlcanceBloques_Result(SoapObject soapObject)
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
        if (soapObject.hasProperty("FullCodigo"))
        {
            Object obj = soapObject.getProperty("FullCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fullCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                fullCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("IdCondicionalidadLineaFinal"))
        {
            Object obj = soapObject.getProperty("IdCondicionalidadLineaFinal");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCondicionalidadLineaFinal = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCondicionalidadLineaFinal = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdCondicionalidadLineaFinalSpecified"))
        {
            Object obj = soapObject.getProperty("IdCondicionalidadLineaFinalSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCondicionalidadLineaFinalSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCondicionalidadLineaFinalSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdCondicionalidadLineaFinalPendiente"))
        {
            Object obj = soapObject.getProperty("IdCondicionalidadLineaFinalPendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCondicionalidadLineaFinalPendiente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCondicionalidadLineaFinalPendiente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdCondicionalidadLineaFinalPendienteSpecified"))
        {
            Object obj = soapObject.getProperty("IdCondicionalidadLineaFinalPendienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCondicionalidadLineaFinalPendienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCondicionalidadLineaFinalPendienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdCondicionalidadOrigen"))
        {
            Object obj = soapObject.getProperty("IdCondicionalidadOrigen");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCondicionalidadOrigen = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCondicionalidadOrigen = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdCondicionalidadOrigenSpecified"))
        {
            Object obj = soapObject.getProperty("IdCondicionalidadOrigenSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCondicionalidadOrigenSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCondicionalidadOrigenSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("IdInspeccionAlcance"))
        {
            Object obj = soapObject.getProperty("IdInspeccionAlcance");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionAlcance = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccionAlcance = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionAlcanceSpecified"))
        {
            Object obj = soapObject.getProperty("IdInspeccionAlcanceSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionAlcanceSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionAlcanceSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Pendiente"))
        {
            Object obj = soapObject.getProperty("Pendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pendiente = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pendiente = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PendienteSpecified"))
        {
            Object obj = soapObject.getProperty("PendienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pendienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pendienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("descripcionCondicionalidad"))
        {
            Object obj = soapObject.getProperty("descripcionCondicionalidad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionCondicionalidad = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionCondicionalidad = (String) obj;
            }
        }
        if (soapObject.hasProperty("descripcionCondicionalidadFinal"))
        {
            Object obj = soapObject.getProperty("descripcionCondicionalidadFinal");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionCondicionalidadFinal = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionCondicionalidadFinal = (String) obj;
            }
        }
        if (soapObject.hasProperty("descripcionCondicionalidadFinalPendiente"))
        {
            Object obj = soapObject.getProperty("descripcionCondicionalidadFinalPendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionCondicionalidadFinalPendiente = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionCondicionalidadFinalPendiente = (String) obj;
            }
        }
        if (soapObject.hasProperty("idApartado"))
        {
            Object obj = soapObject.getProperty("idApartado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idApartado = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idApartado = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idApartadoSpecified"))
        {
            Object obj = soapObject.getProperty("idApartadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idApartadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idApartadoSpecified = (Boolean) obj;
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
                return fullCodigo;
            case 3:
                return idCondicionalidadLineaFinal;
            case 4:
                return idCondicionalidadLineaFinalSpecified;
            case 5:
                return idCondicionalidadLineaFinalPendiente;
            case 6:
                return idCondicionalidadLineaFinalPendienteSpecified;
            case 7:
                return idCondicionalidadOrigen;
            case 8:
                return idCondicionalidadOrigenSpecified;
            case 9:
                return idInspeccion;
            case 10:
                return idInspeccionSpecified;
            case 11:
                return idInspeccionAlcance;
            case 12:
                return idInspeccionAlcanceSpecified;
            case 13:
                return pendiente;
            case 14:
                return pendienteSpecified;
            case 15:
                return descripcionCondicionalidad;
            case 16:
                return descripcionCondicionalidadFinal;
            case 17:
                return descripcionCondicionalidadFinalPendiente;
            case 18:
                return idApartado;
            case 19:
                return idApartadoSpecified;
            case 20:
                return id;
            case 21:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 22;
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FullCodigo";
                break;
            case 3:
                info.type = Long.class;
                info.name = "IdCondicionalidadLineaFinal";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdCondicionalidadLineaFinalSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "IdCondicionalidadLineaFinalPendiente";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdCondicionalidadLineaFinalPendienteSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "IdCondicionalidadOrigen";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdCondicionalidadOrigenSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "IdInspeccion";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "IdInspeccionAlcance";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionAlcanceSpecified";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Pendiente";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PendienteSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "descripcionCondicionalidad";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "descripcionCondicionalidadFinal";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "descripcionCondicionalidadFinalPendiente";
                break;
            case 18:
                info.type = Long.class;
                info.name = "idApartado";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idApartadoSpecified";
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
    
 
    public String getInnerText() {
        return null;
    }
    
    
 
    public void setInnerText(String s) {
    }
    
    
 
    public void setProperty(int arg0, Object arg1) {
    }
    
}
