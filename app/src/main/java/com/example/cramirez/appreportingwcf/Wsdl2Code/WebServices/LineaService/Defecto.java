package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorDefectoCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GravedadDefecto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Defecto implements KvmSerializable {
    
    public String codigo;
    public String codigoApartado;
    public String codigoOficial;
    public VectorDefectoCondicionalidad defectoCondicionalidad;
    public String descripcion;
    public String descripcionOficial;
    public long fK_IdGravedadDefecto;
    public boolean fK_IdGravedadDefectoSpecified;
    public String fechaFinVigencia;
    public boolean fechaFinVigenciaSpecified;
    public String fechaIniVigencia;
    public boolean fechaIniVigenciaSpecified;
    public GravedadDefecto gravedadDefecto;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String documento;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public long idDefecto;
    public boolean idDefectoSpecified;
    public String notas;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Defecto(){}
    
    public Defecto(SoapObject soapObject)
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
        if (soapObject.hasProperty("DefectoCondicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("DefectoCondicionalidad");
            defectoCondicionalidad = new VectorDefectoCondicionalidad(j);
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
        if (soapObject.hasProperty("GravedadDefecto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GravedadDefecto");
            gravedadDefecto =  new GravedadDefecto (j);
            
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
                return codigoApartado;
            case 2:
                return codigoOficial;
            case 3:
                return defectoCondicionalidad;
            case 4:
                return descripcion;
            case 5:
                return descripcionOficial;
            case 6:
                return fK_IdGravedadDefecto;
            case 7:
                return fK_IdGravedadDefectoSpecified;
            case 8:
                return fechaFinVigencia;
            case 9:
                return fechaFinVigenciaSpecified;
            case 10:
                return fechaIniVigencia;
            case 11:
                return fechaIniVigenciaSpecified;
            case 12:
                return gravedadDefecto;
            case 13:
                return publicado;
            case 14:
                return publicadoSpecified;
            case 15:
                return documento;
            case 16:
                return fechaModificacion;
            case 17:
                return fechaModificacionSpecified;
            case 18:
                return idDefecto;
            case 19:
                return idDefectoSpecified;
            case 20:
                return notas;
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
                info.name = "CodigoApartado";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoOficial";
                break;
            case 3:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "DefectoCondicionalidad";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionOficial";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdGravedadDefecto";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGravedadDefectoSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFinVigencia";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinVigenciaSpecified";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIniVigencia";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIniVigenciaSpecified";
                break;
            case 12:
                info.type = GravedadDefecto.class;
                info.name = "GravedadDefecto";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "documento";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 18:
                info.type = Long.class;
                info.name = "idDefecto";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idDefectoSpecified";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "notas";
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
