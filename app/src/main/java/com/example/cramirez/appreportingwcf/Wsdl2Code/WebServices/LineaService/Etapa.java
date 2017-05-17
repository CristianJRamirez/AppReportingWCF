package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorEtapaBloque;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorEtapaPueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionAlcancePrueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionBloqueEstado;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionDefecto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Etapa implements KvmSerializable {
    
    public String codigo;
    public String descripcion;
    public VectorEtapaBloque etapaBloque;
    public VectorEtapaPueba etapaPueba;
    public long fK_IdCentro;
    public boolean fK_IdCentroSpecified;
    public String fechaFin;
    public boolean fechaFinSpecified;
    public String fechaIni;
    public boolean fechaIniSpecified;
    public long idEtapa;
    public boolean idEtapaSpecified;
    public VectorInspeccionAlcancePrueba inspeccionAlcancePrueba;
    public VectorInspeccionAlcancePrueba inspeccionAlcancePrueba1;
    public VectorInspeccionBloqueEstado inspeccionBloqueEstado;
    public VectorInspeccionDefecto inspeccionDefecto;
    public String nombre;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Etapa(){}
    
    public Etapa(SoapObject soapObject)
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
        if (soapObject.hasProperty("EtapaBloque"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("EtapaBloque");
            etapaBloque = new VectorEtapaBloque(j);
        }
        if (soapObject.hasProperty("EtapaPueba"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("EtapaPueba");
            etapaPueba = new VectorEtapaPueba(j);
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
        if (soapObject.hasProperty("FechaFin"))
        {
            Object obj = soapObject.getProperty("FechaFin");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFin = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaFin = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinSpecified"))
        {
            Object obj = soapObject.getProperty("FechaFinSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFinSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaIni"))
        {
            Object obj = soapObject.getProperty("FechaIni");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIni = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaIni = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaIniSpecified"))
        {
            Object obj = soapObject.getProperty("FechaIniSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIniSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaIniSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdEtapa"))
        {
            Object obj = soapObject.getProperty("IdEtapa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idEtapa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idEtapa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdEtapaSpecified"))
        {
            Object obj = soapObject.getProperty("IdEtapaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idEtapaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idEtapaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("InspeccionAlcancePrueba"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionAlcancePrueba");
            inspeccionAlcancePrueba = new VectorInspeccionAlcancePrueba(j);
        }
        if (soapObject.hasProperty("InspeccionAlcancePrueba1"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionAlcancePrueba1");
            inspeccionAlcancePrueba1 = new VectorInspeccionAlcancePrueba(j);
        }
        if (soapObject.hasProperty("InspeccionBloqueEstado"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionBloqueEstado");
            inspeccionBloqueEstado = new VectorInspeccionBloqueEstado(j);
        }
        if (soapObject.hasProperty("InspeccionDefecto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionDefecto");
            inspeccionDefecto = new VectorInspeccionDefecto(j);
        }
        if (soapObject.hasProperty("Nombre"))
        {
            Object obj = soapObject.getProperty("Nombre");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nombre = j.toString();
            }else if (obj!= null && obj instanceof String){
                nombre = (String) obj;
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
                return codigo;
            case 1:
                return descripcion;
            case 2:
                return etapaBloque;
            case 3:
                return etapaPueba;
            case 4:
                return fK_IdCentro;
            case 5:
                return fK_IdCentroSpecified;
            case 6:
                return fechaFin;
            case 7:
                return fechaFinSpecified;
            case 8:
                return fechaIni;
            case 9:
                return fechaIniSpecified;
            case 10:
                return idEtapa;
            case 11:
                return idEtapaSpecified;
            case 12:
                return inspeccionAlcancePrueba;
            case 13:
                return inspeccionAlcancePrueba1;
            case 14:
                return inspeccionBloqueEstado;
            case 15:
                return inspeccionDefecto;
            case 16:
                return nombre;
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "EtapaBloque";
                break;
            case 3:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "EtapaPueba";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdCentro";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCentroSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFin";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIni";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIniSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "IdEtapa";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdEtapaSpecified";
                break;
            case 12:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionAlcancePrueba";
                break;
            case 13:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionAlcancePrueba1";
                break;
            case 14:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionBloqueEstado";
                break;
            case 15:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionDefecto";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Nombre";
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
