package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorApartadoCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorDefectoCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoVehiculoLineaCategoria;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorPruebaCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GrupoVehiculoLinea implements KvmSerializable {
    
    public VectorApartadoCondicionalidad apartadoCondicionalidad;
    public String codigo;
    public VectorDefectoCondicionalidad defectoCondicionalidad;
    public String descripcion;
    public String fechaFin;
    public boolean fechaFinSpecified;
    public String fechaInicio;
    public boolean fechaInicioSpecified;
    public VectorGrupoVehiculoLineaCategoria grupoVehiculoLineaCategoria;
    public long idGrupoVehiculoLinea;
    public boolean idGrupoVehiculoLineaSpecified;
    public VectorPruebaCondicionalidad pruebaCondicionalidad;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public GrupoVehiculoLinea(){}
    
    public GrupoVehiculoLinea(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("ApartadoCondicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ApartadoCondicionalidad");
            apartadoCondicionalidad = new VectorApartadoCondicionalidad(j);
        }
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
        if (soapObject.hasProperty("FechaInicio"))
        {
            Object obj = soapObject.getProperty("FechaInicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInicio = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaInicio = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaInicioSpecified"))
        {
            Object obj = soapObject.getProperty("FechaInicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaInicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoVehiculoLineaCategoria"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoVehiculoLineaCategoria");
            grupoVehiculoLineaCategoria = new VectorGrupoVehiculoLineaCategoria(j);
        }
        if (soapObject.hasProperty("IdGrupoVehiculoLinea"))
        {
            Object obj = soapObject.getProperty("IdGrupoVehiculoLinea");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoVehiculoLinea = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idGrupoVehiculoLinea = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdGrupoVehiculoLineaSpecified"))
        {
            Object obj = soapObject.getProperty("IdGrupoVehiculoLineaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoVehiculoLineaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idGrupoVehiculoLineaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PruebaCondicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("PruebaCondicionalidad");
            pruebaCondicionalidad = new VectorPruebaCondicionalidad(j);
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
                return apartadoCondicionalidad;
            case 1:
                return codigo;
            case 2:
                return defectoCondicionalidad;
            case 3:
                return descripcion;
            case 4:
                return fechaFin;
            case 5:
                return fechaFinSpecified;
            case 6:
                return fechaInicio;
            case 7:
                return fechaInicioSpecified;
            case 8:
                return grupoVehiculoLineaCategoria;
            case 9:
                return idGrupoVehiculoLinea;
            case 10:
                return idGrupoVehiculoLineaSpecified;
            case 11:
                return pruebaCondicionalidad;
            case 12:
                return publicado;
            case 13:
                return publicadoSpecified;
            case 14:
                return fechaModificacion;
            case 15:
                return fechaModificacionSpecified;
            case 16:
                return timestamp.toString();
            case 17:
                return usuarioModificacion;
            case 18:
                return usuarioModificacionSpecified;
            case 19:
                return id;
            case 20:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 21;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ApartadoCondicionalidad";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "DefectoCondicionalidad";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFin";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaInicio";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaInicioSpecified";
                break;
            case 8:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoVehiculoLineaCategoria";
                break;
            case 9:
                info.type = Long.class;
                info.name = "IdGrupoVehiculoLinea";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdGrupoVehiculoLineaSpecified";
                break;
            case 11:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "PruebaCondicionalidad";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 17:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 20:
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
