package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorEtiqueta;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Lote implements KvmSerializable {
    
    public String descripcion;
    public VectorEtiqueta etiqueta;
    public String fechaFin;
    public boolean fechaFinSpecified;
    public String fechaIni;
    public boolean fechaIniSpecified;
    public long idLote;
    public boolean idLoteSpecified;
    public long numFin;
    public boolean numFinSpecified;
    public long numIni;
    public boolean numIniSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Lote(){}
    
    public Lote(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("Etiqueta"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Etiqueta");
            etiqueta = new VectorEtiqueta(j);
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
        if (soapObject.hasProperty("IdLote"))
        {
            Object obj = soapObject.getProperty("IdLote");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idLote = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idLote = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdLoteSpecified"))
        {
            Object obj = soapObject.getProperty("IdLoteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idLoteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idLoteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("NumFin"))
        {
            Object obj = soapObject.getProperty("NumFin");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numFin = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                numFin = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NumFinSpecified"))
        {
            Object obj = soapObject.getProperty("NumFinSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numFinSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                numFinSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("NumIni"))
        {
            Object obj = soapObject.getProperty("NumIni");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numIni = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                numIni = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NumIniSpecified"))
        {
            Object obj = soapObject.getProperty("NumIniSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numIniSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                numIniSpecified = (Boolean) obj;
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
                return descripcion;
            case 1:
                return etiqueta;
            case 2:
                return fechaFin;
            case 3:
                return fechaFinSpecified;
            case 4:
                return fechaIni;
            case 5:
                return fechaIniSpecified;
            case 6:
                return idLote;
            case 7:
                return idLoteSpecified;
            case 8:
                return numFin;
            case 9:
                return numFinSpecified;
            case 10:
                return numIni;
            case 11:
                return numIniSpecified;
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Etiqueta";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFin";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIni";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIniSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "IdLote";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdLoteSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "NumFin";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NumFinSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "NumIni";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NumIniSpecified";
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
