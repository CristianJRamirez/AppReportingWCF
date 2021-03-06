package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_InspeccionDefectos_Result implements KvmSerializable {
    
    public String codigo;
    public String codigoApartado;
    public String codigoGravedad;
    public String codigoOficial;
    public String codigoTipoInspeccionDefecto;
    public String descripcion;
    public String descripcionGravedad;
    public String descripcionOficial;
    public String descripcionTipoInspeccionDefecto;
    public long fK_IdGravedadDefecto;
    public boolean fK_IdGravedadDefectoSpecified;
    public String fechaFinVigencia;
    public boolean fechaFinVigenciaSpecified;
    public String fechaIniVigencia;
    public boolean fechaIniVigenciaSpecified;
    public long idTipoInspeccionDefecto;
    public boolean idTipoInspeccionDefectoSpecified;
    public String observaciones;
    public String documento;
    public long idDefecto;
    public boolean idDefectoSpecified;
    public long idEtapa;
    public boolean idEtapaSpecified;
    public long idInspeccionDefecto;
    public boolean idInspeccionDefectoSpecified;
    public String notas;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public QUERY_InspeccionDefectos_Result(){}
    
    public QUERY_InspeccionDefectos_Result(SoapObject soapObject)
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
        if (soapObject.hasProperty("CodigoApartado"))
        {
            Object obj = soapObject.getProperty("CodigoApartado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoApartado = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoApartado = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoGravedad"))
        {
            Object obj = soapObject.getProperty("CodigoGravedad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoGravedad = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoGravedad = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoOficial"))
        {
            Object obj = soapObject.getProperty("CodigoOficial");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoOficial = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoOficial = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoTipoInspeccionDefecto"))
        {
            Object obj = soapObject.getProperty("CodigoTipoInspeccionDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoTipoInspeccionDefecto = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoTipoInspeccionDefecto = (String) obj;
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
        if (soapObject.hasProperty("DescripcionGravedad"))
        {
            Object obj = soapObject.getProperty("DescripcionGravedad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionGravedad = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionGravedad = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescripcionOficial"))
        {
            Object obj = soapObject.getProperty("DescripcionOficial");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionOficial = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionOficial = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescripcionTipoInspeccionDefecto"))
        {
            Object obj = soapObject.getProperty("DescripcionTipoInspeccionDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionTipoInspeccionDefecto = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionTipoInspeccionDefecto = (String) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGravedadDefecto"))
        {
            Object obj = soapObject.getProperty("FK_IdGravedadDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGravedadDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGravedadDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGravedadDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGravedadDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGravedadDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGravedadDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinVigencia"))
        {
            Object obj = soapObject.getProperty("FechaFinVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaFinVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaFinVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFinVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaIniVigencia"))
        {
            Object obj = soapObject.getProperty("FechaIniVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIniVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaIniVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaIniVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaIniVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIniVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaIniVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdTipoInspeccionDefecto"))
        {
            Object obj = soapObject.getProperty("IdTipoInspeccionDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idTipoInspeccionDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idTipoInspeccionDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdTipoInspeccionDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("IdTipoInspeccionDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idTipoInspeccionDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idTipoInspeccionDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Observaciones"))
        {
            Object obj = soapObject.getProperty("Observaciones");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                observaciones = j.toString();
            }else if (obj!= null && obj instanceof String){
                observaciones = (String) obj;
            }
        }
        if (soapObject.hasProperty("documento"))
        {
            Object obj = soapObject.getProperty("documento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documento = j.toString();
            }else if (obj!= null && obj instanceof String){
                documento = (String) obj;
            }
        }
        if (soapObject.hasProperty("idDefecto"))
        {
            Object obj = soapObject.getProperty("idDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("idDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("idEtapa"))
        {
            Object obj = soapObject.getProperty("idEtapa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idEtapa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idEtapa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idEtapaSpecified"))
        {
            Object obj = soapObject.getProperty("idEtapaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idEtapaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idEtapaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("idInspeccionDefecto"))
        {
            Object obj = soapObject.getProperty("idInspeccionDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccionDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idInspeccionDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("idInspeccionDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("notas"))
        {
            Object obj = soapObject.getProperty("notas");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                notas = j.toString();
            }else if (obj!= null && obj instanceof String){
                notas = (String) obj;
            }
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
                return codigoApartado;
            case 2:
                return codigoGravedad;
            case 3:
                return codigoOficial;
            case 4:
                return codigoTipoInspeccionDefecto;
            case 5:
                return descripcion;
            case 6:
                return descripcionGravedad;
            case 7:
                return descripcionOficial;
            case 8:
                return descripcionTipoInspeccionDefecto;
            case 9:
                return fK_IdGravedadDefecto;
            case 10:
                return fK_IdGravedadDefectoSpecified;
            case 11:
                return fechaFinVigencia;
            case 12:
                return fechaFinVigenciaSpecified;
            case 13:
                return fechaIniVigencia;
            case 14:
                return fechaIniVigenciaSpecified;
            case 15:
                return idTipoInspeccionDefecto;
            case 16:
                return idTipoInspeccionDefectoSpecified;
            case 17:
                return observaciones;
            case 18:
                return documento;
            case 19:
                return idDefecto;
            case 20:
                return idDefectoSpecified;
            case 21:
                return idEtapa;
            case 22:
                return idEtapaSpecified;
            case 23:
                return idInspeccionDefecto;
            case 24:
                return idInspeccionDefectoSpecified;
            case 25:
                return notas;
            case 26:
                return usuarioModificacion;
            case 27:
                return usuarioModificacionSpecified;
            case 28:
                return id;
            case 29:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 30;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoApartado";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoGravedad";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoOficial";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoTipoInspeccionDefecto";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionGravedad";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionOficial";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionTipoInspeccionDefecto";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_IdGravedadDefecto";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGravedadDefectoSpecified";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFinVigencia";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinVigenciaSpecified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIniVigencia";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIniVigenciaSpecified";
                break;
            case 15:
                info.type = Long.class;
                info.name = "IdTipoInspeccionDefecto";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdTipoInspeccionDefectoSpecified";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Observaciones";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "documento";
                break;
            case 19:
                info.type = Long.class;
                info.name = "idDefecto";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idDefectoSpecified";
                break;
            case 21:
                info.type = Long.class;
                info.name = "idEtapa";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idEtapaSpecified";
                break;
            case 23:
                info.type = Long.class;
                info.name = "idInspeccionDefecto";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idInspeccionDefectoSpecified";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "notas";
                break;
            case 26:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 28:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 29:
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
