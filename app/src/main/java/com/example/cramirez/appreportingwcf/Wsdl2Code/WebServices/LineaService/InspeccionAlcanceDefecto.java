package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Inspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class InspeccionAlcanceDefecto implements KvmSerializable {
    
    public long fK_IdApartado;
    public boolean fK_IdApartadoSpecified;
    public long fK_IdCondicionalidadLineaFinal;
    public boolean fK_IdCondicionalidadLineaFinalSpecified;
    public long fK_IdCondicionalidadLineaFinalPendiente;
    public boolean fK_IdCondicionalidadLineaFinalPendienteSpecified;
    public long fK_IdCondicionalidadOrigen;
    public boolean fK_IdCondicionalidadOrigenSpecified;
    public long fK_IdDefecto;
    public boolean fK_IdDefectoSpecified;
    public long fK_IdInspeccion;
    public boolean fK_IdInspeccionSpecified;
    public long idInspeccionAlcanceDefecto;
    public boolean idInspeccionAlcanceDefectoSpecified;
    public Inspeccion inspeccion;
    public boolean pendiente;
    public boolean pendienteSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public InspeccionAlcanceDefecto(){}
    
    public InspeccionAlcanceDefecto(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("FK_IdApartado"))
        {
            Object obj = soapObject.getProperty("FK_IdApartado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdApartado = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdApartado = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdApartadoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdApartadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdApartadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdApartadoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadLineaFinal"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadLineaFinal");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadLineaFinal = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCondicionalidadLineaFinal = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadLineaFinalSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadLineaFinalSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadLineaFinalSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCondicionalidadLineaFinalSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadLineaFinalPendiente"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadLineaFinalPendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadLineaFinalPendiente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCondicionalidadLineaFinalPendiente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadLineaFinalPendienteSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadLineaFinalPendienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadLineaFinalPendienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCondicionalidadLineaFinalPendienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadOrigen"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadOrigen");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadOrigen = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCondicionalidadOrigen = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadOrigenSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadOrigenSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadOrigenSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCondicionalidadOrigenSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdDefecto"))
        {
            Object obj = soapObject.getProperty("FK_IdDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdDefectoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("IdInspeccionAlcanceDefecto"))
        {
            Object obj = soapObject.getProperty("IdInspeccionAlcanceDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionAlcanceDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccionAlcanceDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionAlcanceDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("IdInspeccionAlcanceDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionAlcanceDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionAlcanceDefectoSpecified = (Boolean) obj;
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
                return fK_IdApartado;
            case 1:
                return fK_IdApartadoSpecified;
            case 2:
                return fK_IdCondicionalidadLineaFinal;
            case 3:
                return fK_IdCondicionalidadLineaFinalSpecified;
            case 4:
                return fK_IdCondicionalidadLineaFinalPendiente;
            case 5:
                return fK_IdCondicionalidadLineaFinalPendienteSpecified;
            case 6:
                return fK_IdCondicionalidadOrigen;
            case 7:
                return fK_IdCondicionalidadOrigenSpecified;
            case 8:
                return fK_IdDefecto;
            case 9:
                return fK_IdDefectoSpecified;
            case 10:
                return fK_IdInspeccion;
            case 11:
                return fK_IdInspeccionSpecified;
            case 12:
                return idInspeccionAlcanceDefecto;
            case 13:
                return idInspeccionAlcanceDefectoSpecified;
            case 14:
                return inspeccion;
            case 15:
                return pendiente;
            case 16:
                return pendienteSpecified;
            case 17:
                return publicado;
            case 18:
                return publicadoSpecified;
            case 19:
                return fechaModificacion;
            case 20:
                return fechaModificacionSpecified;
            case 21:
                return timestamp.toString();
            case 22:
                return usuarioModificacion;
            case 23:
                return usuarioModificacionSpecified;
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
                info.type = Long.class;
                info.name = "FK_IdApartado";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdApartadoSpecified";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidadLineaFinal";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadLineaFinalSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidadLineaFinalPendiente";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadLineaFinalPendienteSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidadOrigen";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadOrigenSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "FK_IdDefecto";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdDefectoSpecified";
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
                info.name = "IdInspeccionAlcanceDefecto";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionAlcanceDefectoSpecified";
                break;
            case 14:
                info.type = Inspeccion.class;
                info.name = "Inspeccion";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Pendiente";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PendienteSpecified";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 22:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
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
