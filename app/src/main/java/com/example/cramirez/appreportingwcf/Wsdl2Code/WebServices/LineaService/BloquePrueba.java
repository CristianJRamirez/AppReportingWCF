package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Bloque;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Prueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class BloquePrueba implements KvmSerializable {
    
    public Bloque bloque;
    public long fK_IdBloque;
    public boolean fK_IdBloqueSpecified;
    public long fK_IdPrueba;
    public boolean fK_IdPruebaSpecified;
    public long idBloquePrueba;
    public boolean idBloquePruebaSpecified;
    public Prueba prueba;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public BloquePrueba(){}
    
    public BloquePrueba(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Bloque"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Bloque");
            bloque =  new Bloque (j);
            
        }
        if (soapObject.hasProperty("FK_IdBloque"))
        {
            Object obj = soapObject.getProperty("FK_IdBloque");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdBloque = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdBloque = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdBloqueSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdBloqueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdBloqueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdBloqueSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("IdBloquePrueba"))
        {
            Object obj = soapObject.getProperty("IdBloquePrueba");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idBloquePrueba = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idBloquePrueba = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdBloquePruebaSpecified"))
        {
            Object obj = soapObject.getProperty("IdBloquePruebaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idBloquePruebaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idBloquePruebaSpecified = (Boolean) obj;
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
                return bloque;
            case 1:
                return fK_IdBloque;
            case 2:
                return fK_IdBloqueSpecified;
            case 3:
                return fK_IdPrueba;
            case 4:
                return fK_IdPruebaSpecified;
            case 5:
                return idBloquePrueba;
            case 6:
                return idBloquePruebaSpecified;
            case 7:
                return prueba;
            case 8:
                return publicado;
            case 9:
                return publicadoSpecified;
            case 10:
                return fechaModificacion;
            case 11:
                return fechaModificacionSpecified;
            case 12:
                return timestamp.toString();
            case 13:
                return usuarioModificacion;
            case 14:
                return usuarioModificacionSpecified;
            case 15:
                return id;
            case 16:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 17;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Bloque.class;
                info.name = "Bloque";
                break;
            case 1:
                info.type = Long.class;
                info.name = "FK_IdBloque";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdBloqueSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdPrueba";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdPruebaSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "IdBloquePrueba";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdBloquePruebaSpecified";
                break;
            case 7:
                info.type = Prueba.class;
                info.name = "Prueba";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 13:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 16:
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
