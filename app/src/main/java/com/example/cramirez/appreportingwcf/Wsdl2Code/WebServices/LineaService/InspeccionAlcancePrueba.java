package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Etapa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Inspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class InspeccionAlcancePrueba implements KvmSerializable {
    
    public boolean desfinalizarPendiente;
    public boolean desfinalizarPendienteSpecified;
    public Etapa etapa;
    public Etapa etapa1;
    public long fK_IdCondicionalidad;
    public boolean fK_IdCondicionalidadSpecified;
    public long fK_IdEtapa;
    public boolean fK_IdEtapaSpecified;
    public long fK_IdEtapaPendiente;
    public boolean fK_IdEtapaPendienteSpecified;
    public long fK_IdInspeccion;
    public boolean fK_IdInspeccionSpecified;
    public long fK_IdMaquina;
    public boolean fK_IdMaquinaSpecified;
    public long fK_IdMaquinaPendiente;
    public boolean fK_IdMaquinaPendienteSpecified;
    public long fK_IdPrueba;
    public boolean fK_IdPruebaSpecified;
    public boolean finalizada;
    public boolean finalizadaSpecified;
    public long idInspeccionAlcancePrueba;
    public boolean idInspeccionAlcancePruebaSpecified;
    public Inspeccion inspeccion;
    public boolean pendiente;
    public boolean pendienteSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public boolean seRealiza;
    public boolean seRealizaSpecified;
    public boolean seRealizaPendiente;
    public boolean seRealizaPendienteSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public InspeccionAlcancePrueba(){}
    
    public InspeccionAlcancePrueba(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("Etapa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Etapa");
            etapa =  new Etapa (j);
            
        }
        if (soapObject.hasProperty("Etapa1"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Etapa1");
            etapa1 =  new Etapa (j);
            
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
        if (soapObject.hasProperty("FK_IdEtapaPendiente"))
        {
            Object obj = soapObject.getProperty("FK_IdEtapaPendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEtapaPendiente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdEtapaPendiente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdEtapaPendienteSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdEtapaPendienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEtapaPendienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdEtapaPendienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdInspeccion"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdInspeccionSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("FK_IdMaquinaPendiente"))
        {
            Object obj = soapObject.getProperty("FK_IdMaquinaPendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMaquinaPendiente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdMaquinaPendiente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdMaquinaPendienteSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdMaquinaPendienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMaquinaPendienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdMaquinaPendienteSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Inspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Inspeccion");
            inspeccion =  new Inspeccion (j);
            
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
        if (soapObject.hasProperty("Publicado"))
        {
            Object obj = soapObject.getProperty("Publicado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publicado = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                publicado = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PublicadoSpecified"))
        {
            Object obj = soapObject.getProperty("PublicadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                publicadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                publicadoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("fechaModificacion"))
        {
            Object obj = soapObject.getProperty("fechaModificacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaModificacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaModificacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("fechaModificacionSpecified"))
        {
            Object obj = soapObject.getProperty("fechaModificacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaModificacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaModificacionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("timestamp"))
        {
            SoapPrimitive j = (SoapPrimitive)soapObject.getProperty("timestamp");
            timestamp = new VectorByte(j);
        }
        if (soapObject.hasProperty("usuarioModificacion"))
        {
            Object obj = soapObject.getProperty("usuarioModificacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                usuarioModificacion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                usuarioModificacion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("usuarioModificacionSpecified"))
        {
            Object obj = soapObject.getProperty("usuarioModificacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                usuarioModificacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                usuarioModificacionSpecified = (Boolean) obj;
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
                return desfinalizarPendiente;
            case 1:
                return desfinalizarPendienteSpecified;
            case 2:
                return etapa;
            case 3:
                return etapa1;
            case 4:
                return fK_IdCondicionalidad;
            case 5:
                return fK_IdCondicionalidadSpecified;
            case 6:
                return fK_IdEtapa;
            case 7:
                return fK_IdEtapaSpecified;
            case 8:
                return fK_IdEtapaPendiente;
            case 9:
                return fK_IdEtapaPendienteSpecified;
            case 10:
                return fK_IdInspeccion;
            case 11:
                return fK_IdInspeccionSpecified;
            case 12:
                return fK_IdMaquina;
            case 13:
                return fK_IdMaquinaSpecified;
            case 14:
                return fK_IdMaquinaPendiente;
            case 15:
                return fK_IdMaquinaPendienteSpecified;
            case 16:
                return fK_IdPrueba;
            case 17:
                return fK_IdPruebaSpecified;
            case 18:
                return finalizada;
            case 19:
                return finalizadaSpecified;
            case 20:
                return idInspeccionAlcancePrueba;
            case 21:
                return idInspeccionAlcancePruebaSpecified;
            case 22:
                return inspeccion;
            case 23:
                return pendiente;
            case 24:
                return pendienteSpecified;
            case 25:
                return publicado;
            case 26:
                return publicadoSpecified;
            case 27:
                return seRealiza;
            case 28:
                return seRealizaSpecified;
            case 29:
                return seRealizaPendiente;
            case 30:
                return seRealizaPendienteSpecified;
            case 31:
                return fechaModificacion;
            case 32:
                return fechaModificacionSpecified;
            case 33:
                return timestamp.toString();
            case 34:
                return usuarioModificacion;
            case 35:
                return usuarioModificacionSpecified;
            case 36:
                return id;
            case 37:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 38;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DesfinalizarPendiente";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DesfinalizarPendienteSpecified";
                break;
            case 2:
                info.type = Etapa.class;
                info.name = "Etapa";
                break;
            case 3:
                info.type = Etapa.class;
                info.name = "Etapa1";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidad";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdEtapa";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdEtapaSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "FK_IdEtapaPendiente";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdEtapaPendienteSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "FK_IdInspeccion";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdInspeccionSpecified";
                break;
            case 12:
                info.type = Long.class;
                info.name = "FK_IdMaquina";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdMaquinaSpecified";
                break;
            case 14:
                info.type = Long.class;
                info.name = "FK_IdMaquinaPendiente";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdMaquinaPendienteSpecified";
                break;
            case 16:
                info.type = Long.class;
                info.name = "FK_IdPrueba";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdPruebaSpecified";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Finalizada";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FinalizadaSpecified";
                break;
            case 20:
                info.type = Long.class;
                info.name = "IdInspeccionAlcancePrueba";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionAlcancePruebaSpecified";
                break;
            case 22:
                info.type = Inspeccion.class;
                info.name = "Inspeccion";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Pendiente";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PendienteSpecified";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SeRealiza";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SeRealizaSpecified";
                break;
            case 29:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SeRealizaPendiente";
                break;
            case 30:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SeRealizaPendienteSpecified";
                break;
            case 31:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 32:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 33:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 34:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 35:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 36:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 37:
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
