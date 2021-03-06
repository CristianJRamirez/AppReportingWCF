package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorBloquePrueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorPruebaCondicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorPruebaElemento;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoPrueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Prueba implements KvmSerializable {
    
    public VectorBloquePrueba bloquePrueba;
    public String codigo;
    public String codigoApartado;
    public String descripcion;
    public long fK_IdTipoPrueba;
    public boolean fK_IdTipoPruebaSpecified;
    public String fechaFin;
    public boolean fechaFinSpecified;
    public String fechaIni;
    public boolean fechaIniSpecified;
    public long idPrueba;
    public boolean idPruebaSpecified;
    public VectorPruebaCondicionalidad pruebaCondicionalidad;
    public VectorPruebaElemento pruebaElemento;
    public boolean publicado;
    public boolean publicadoSpecified;
    public boolean sinMaquina;
    public boolean sinMaquinaSpecified;
    public TipoPrueba tipoPrueba;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Prueba(){}
    
    public Prueba(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("BloquePrueba"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("BloquePrueba");
            bloquePrueba = new VectorBloquePrueba(j);
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
        if (soapObject.hasProperty("FK_IdTipoPrueba"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoPrueba");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoPrueba = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoPrueba = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoPruebaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoPruebaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoPruebaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoPruebaSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("IdPrueba"))
        {
            Object obj = soapObject.getProperty("IdPrueba");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idPrueba = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idPrueba = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdPruebaSpecified"))
        {
            Object obj = soapObject.getProperty("IdPruebaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idPruebaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idPruebaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PruebaCondicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("PruebaCondicionalidad");
            pruebaCondicionalidad = new VectorPruebaCondicionalidad(j);
        }
        if (soapObject.hasProperty("PruebaElemento"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("PruebaElemento");
            pruebaElemento = new VectorPruebaElemento(j);
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
        if (soapObject.hasProperty("SinMaquina"))
        {
            Object obj = soapObject.getProperty("SinMaquina");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sinMaquina = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                sinMaquina = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("SinMaquinaSpecified"))
        {
            Object obj = soapObject.getProperty("SinMaquinaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sinMaquinaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                sinMaquinaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TipoPrueba"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoPrueba");
            tipoPrueba =  new TipoPrueba (j);
            
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
                return bloquePrueba;
            case 1:
                return codigo;
            case 2:
                return codigoApartado;
            case 3:
                return descripcion;
            case 4:
                return fK_IdTipoPrueba;
            case 5:
                return fK_IdTipoPruebaSpecified;
            case 6:
                return fechaFin;
            case 7:
                return fechaFinSpecified;
            case 8:
                return fechaIni;
            case 9:
                return fechaIniSpecified;
            case 10:
                return idPrueba;
            case 11:
                return idPruebaSpecified;
            case 12:
                return pruebaCondicionalidad;
            case 13:
                return pruebaElemento;
            case 14:
                return publicado;
            case 15:
                return publicadoSpecified;
            case 16:
                return sinMaquina;
            case 17:
                return sinMaquinaSpecified;
            case 18:
                return tipoPrueba;
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
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "BloquePrueba";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoApartado";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdTipoPrueba";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoPruebaSpecified";
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
                info.name = "IdPrueba";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdPruebaSpecified";
                break;
            case 12:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "PruebaCondicionalidad";
                break;
            case 13:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "PruebaElemento";
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
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SinMaquina";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SinMaquinaSpecified";
                break;
            case 18:
                info.type = TipoPrueba.class;
                info.name = "TipoPrueba";
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
