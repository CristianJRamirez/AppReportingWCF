package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorApartadoComentario;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorApartadoCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Apartado implements KvmSerializable {
    
    public VectorApartadoComentario apartadoComentario;
    public VectorApartadoCondicionalidad apartadoCondicionalidad;
    public String codigo;
    public String codigoCapitulo;
    public String codigoOficial;
    public String descripcion;
    public String fechaFinVigencia;
    public boolean fechaFinVigenciaSpecified;
    public String fechaInIVigencia;
    public boolean fechaInIVigenciaSpecified;
    public long idApartado;
    public boolean idApartadoSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Apartado(){}
    
    public Apartado(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("ApartadoComentario"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ApartadoComentario");
            apartadoComentario = new VectorApartadoComentario(j);
        }
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
        if (soapObject.hasProperty("CodigoCapitulo"))
        {
            Object obj = soapObject.getProperty("CodigoCapitulo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoCapitulo = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoCapitulo = (String) obj;
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
        if (soapObject.hasProperty("FechaInIVigencia"))
        {
            Object obj = soapObject.getProperty("FechaInIVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInIVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaInIVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaInIVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaInIVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInIVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaInIVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdApartado"))
        {
            Object obj = soapObject.getProperty("IdApartado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idApartado = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idApartado = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdApartadoSpecified"))
        {
            Object obj = soapObject.getProperty("IdApartadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idApartadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idApartadoSpecified = (Boolean) obj;
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
                return apartadoComentario;
            case 1:
                return apartadoCondicionalidad;
            case 2:
                return codigo;
            case 3:
                return codigoCapitulo;
            case 4:
                return codigoOficial;
            case 5:
                return descripcion;
            case 6:
                return fechaFinVigencia;
            case 7:
                return fechaFinVigenciaSpecified;
            case 8:
                return fechaInIVigencia;
            case 9:
                return fechaInIVigenciaSpecified;
            case 10:
                return idApartado;
            case 11:
                return idApartadoSpecified;
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
                info.name = "ApartadoComentario";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ApartadoCondicionalidad";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoCapitulo";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoOficial";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFinVigencia";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinVigenciaSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaInIVigencia";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaInIVigenciaSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "IdApartado";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdApartadoSpecified";
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
