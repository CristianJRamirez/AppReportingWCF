package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_AlcanceBloquePruebaEtapa_Result implements KvmSerializable {
    
    public String condicionalidadDescripcion;
    public boolean desfinalizarPendiente;
    public boolean desfinalizarPendienteSpecified;
    public String etapaCodigo;
    public String etapaDescripcion;
    public long fK_IdCondicionalidad;
    public boolean fK_IdCondicionalidadSpecified;
    public long fK_IdEtapa;
    public boolean fK_IdEtapaSpecified;
    public long fK_IdMaquina;
    public boolean fK_IdMaquinaSpecified;
    public long fK_IdPrueba;
    public boolean fK_IdPruebaSpecified;
    public boolean finalizada;
    public boolean finalizadaSpecified;
    public long idInspeccionAlcancePrueba;
    public boolean idInspeccionAlcancePruebaSpecified;
    public String maquinaCodigo;
    public String pruebaCodigo;
    public String pruebaDescripcion;
    public boolean seRealiza;
    public boolean seRealizaSpecified;
    public boolean seRealizaPendiente;
    public boolean seRealizaPendienteSpecified;
    public String id;
    public String ref;
    
    public QUERY_AlcanceBloquePruebaEtapa_Result(){}
    
    public QUERY_AlcanceBloquePruebaEtapa_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("CondicionalidadDescripcion"))
        {
            Object obj = soapObject.getProperty("CondicionalidadDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                condicionalidadDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                condicionalidadDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("DesfinalizarPendiente"))
        {
            Object obj = soapObject.getProperty("DesfinalizarPendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                desfinalizarPendiente = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                desfinalizarPendiente = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("DesfinalizarPendienteSpecified"))
        {
            Object obj = soapObject.getProperty("DesfinalizarPendienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                desfinalizarPendienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                desfinalizarPendienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("EtapaCodigo"))
        {
            Object obj = soapObject.getProperty("EtapaCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                etapaCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                etapaCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("EtapaDescripcion"))
        {
            Object obj = soapObject.getProperty("EtapaDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                etapaDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                etapaDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidad"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidad = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCondicionalidad = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCondicionalidadSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdEtapa"))
        {
            Object obj = soapObject.getProperty("FK_IdEtapa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEtapa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdEtapa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdEtapaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdEtapaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEtapaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdEtapaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdMaquina"))
        {
            Object obj = soapObject.getProperty("FK_IdMaquina");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMaquina = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdMaquina = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdMaquinaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdMaquinaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMaquinaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdMaquinaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdPrueba"))
        {
            Object obj = soapObject.getProperty("FK_IdPrueba");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdPrueba = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdPrueba = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdPruebaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdPruebaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdPruebaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdPruebaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Finalizada"))
        {
            Object obj = soapObject.getProperty("Finalizada");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                finalizada = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                finalizada = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FinalizadaSpecified"))
        {
            Object obj = soapObject.getProperty("FinalizadaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                finalizadaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                finalizadaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionAlcancePrueba"))
        {
            Object obj = soapObject.getProperty("IdInspeccionAlcancePrueba");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionAlcancePrueba = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccionAlcancePrueba = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionAlcancePruebaSpecified"))
        {
            Object obj = soapObject.getProperty("IdInspeccionAlcancePruebaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionAlcancePruebaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionAlcancePruebaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MaquinaCodigo"))
        {
            Object obj = soapObject.getProperty("MaquinaCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maquinaCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                maquinaCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("PruebaCodigo"))
        {
            Object obj = soapObject.getProperty("PruebaCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pruebaCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                pruebaCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("PruebaDescripcion"))
        {
            Object obj = soapObject.getProperty("PruebaDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pruebaDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                pruebaDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("SeRealiza"))
        {
            Object obj = soapObject.getProperty("SeRealiza");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                seRealiza = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                seRealiza = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("SeRealizaSpecified"))
        {
            Object obj = soapObject.getProperty("SeRealizaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                seRealizaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                seRealizaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("SeRealizaPendiente"))
        {
            Object obj = soapObject.getProperty("SeRealizaPendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                seRealizaPendiente = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                seRealizaPendiente = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("SeRealizaPendienteSpecified"))
        {
            Object obj = soapObject.getProperty("SeRealizaPendienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                seRealizaPendienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                seRealizaPendienteSpecified = (Boolean) obj;
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
                return condicionalidadDescripcion;
            case 1:
                return desfinalizarPendiente;
            case 2:
                return desfinalizarPendienteSpecified;
            case 3:
                return etapaCodigo;
            case 4:
                return etapaDescripcion;
            case 5:
                return fK_IdCondicionalidad;
            case 6:
                return fK_IdCondicionalidadSpecified;
            case 7:
                return fK_IdEtapa;
            case 8:
                return fK_IdEtapaSpecified;
            case 9:
                return fK_IdMaquina;
            case 10:
                return fK_IdMaquinaSpecified;
            case 11:
                return fK_IdPrueba;
            case 12:
                return fK_IdPruebaSpecified;
            case 13:
                return finalizada;
            case 14:
                return finalizadaSpecified;
            case 15:
                return idInspeccionAlcancePrueba;
            case 16:
                return idInspeccionAlcancePruebaSpecified;
            case 17:
                return maquinaCodigo;
            case 18:
                return pruebaCodigo;
            case 19:
                return pruebaDescripcion;
            case 20:
                return seRealiza;
            case 21:
                return seRealizaSpecified;
            case 22:
                return seRealizaPendiente;
            case 23:
                return seRealizaPendienteSpecified;
            case 24:
                return id;
            case 25:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 26;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CondicionalidadDescripcion";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DesfinalizarPendiente";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DesfinalizarPendienteSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "EtapaCodigo";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "EtapaDescripcion";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidad";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "FK_IdEtapa";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdEtapaSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_IdMaquina";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdMaquinaSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "FK_IdPrueba";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdPruebaSpecified";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Finalizada";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FinalizadaSpecified";
                break;
            case 15:
                info.type = Long.class;
                info.name = "IdInspeccionAlcancePrueba";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionAlcancePruebaSpecified";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MaquinaCodigo";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PruebaCodigo";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PruebaDescripcion";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SeRealiza";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SeRealizaSpecified";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SeRealizaPendiente";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SeRealizaPendienteSpecified";
                break;
            case 24:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 25:
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
