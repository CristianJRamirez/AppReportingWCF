package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Prueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoPruebaElemento;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class PruebaElemento implements KvmSerializable {
    
    public String codigo;
    public String descripcion;
    public long fK_IdPrueba;
    public boolean fK_IdPruebaSpecified;
    public long fK_IdTipoPruebaElemento;
    public boolean fK_IdTipoPruebaElementoSpecified;
    public String fechaFin;
    public boolean fechaFinSpecified;
    public String fechaIni;
    public boolean fechaIniSpecified;
    public String funcion;
    public long idPruebaElemento;
    public boolean idPruebaElementoSpecified;
    public Prueba prueba;
    public boolean publicado;
    public boolean publicadoSpecified;
    public TipoPruebaElemento tipoPruebaElemento;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public PruebaElemento(){}
    
    public PruebaElemento(SoapObject soapObject)
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
        if (soapObject.hasProperty("FK_IdTipoPruebaElemento"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoPruebaElemento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoPruebaElemento = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoPruebaElemento = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoPruebaElementoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoPruebaElementoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoPruebaElementoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoPruebaElementoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Funcion"))
        {
            Object obj = soapObject.getProperty("Funcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                funcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                funcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("IdPruebaElemento"))
        {
            Object obj = soapObject.getProperty("IdPruebaElemento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idPruebaElemento = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idPruebaElemento = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdPruebaElementoSpecified"))
        {
            Object obj = soapObject.getProperty("IdPruebaElementoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idPruebaElementoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idPruebaElementoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Prueba"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Prueba");
            prueba =  new Prueba (j);
            
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
        if (soapObject.hasProperty("TipoPruebaElemento"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoPruebaElemento");
            tipoPruebaElemento =  new TipoPruebaElemento (j);
            
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
                return fK_IdPrueba;
            case 3:
                return fK_IdPruebaSpecified;
            case 4:
                return fK_IdTipoPruebaElemento;
            case 5:
                return fK_IdTipoPruebaElementoSpecified;
            case 6:
                return fechaFin;
            case 7:
                return fechaFinSpecified;
            case 8:
                return fechaIni;
            case 9:
                return fechaIniSpecified;
            case 10:
                return funcion;
            case 11:
                return idPruebaElemento;
            case 12:
                return idPruebaElementoSpecified;
            case 13:
                return prueba;
            case 14:
                return publicado;
            case 15:
                return publicadoSpecified;
            case 16:
                return tipoPruebaElemento;
            case 17:
                return fechaModificacion;
            case 18:
                return fechaModificacionSpecified;
            case 19:
                return timestamp.toString();
            case 20:
                return usuarioModificacion;
            case 21:
                return usuarioModificacionSpecified;
            case 22:
                return id;
            case 23:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 24;
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
                info.type = Long.class;
                info.name = "FK_IdPrueba";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdPruebaSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdTipoPruebaElemento";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoPruebaElementoSpecified";
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Funcion";
                break;
            case 11:
                info.type = Long.class;
                info.name = "IdPruebaElemento";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdPruebaElementoSpecified";
                break;
            case 13:
                info.type = Prueba.class;
                info.name = "Prueba";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 16:
                info.type = TipoPruebaElemento.class;
                info.name = "TipoPruebaElemento";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 20:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 22:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 23:
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
