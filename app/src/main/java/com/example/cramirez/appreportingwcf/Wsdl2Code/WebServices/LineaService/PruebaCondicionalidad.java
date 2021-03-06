package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Condicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoVehiculoLinea;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Prueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class PruebaCondicionalidad implements KvmSerializable {
    
    public Condicionalidad condicionalidad;
    public long fK_IdCondicionalidad;
    public boolean fK_IdCondicionalidadSpecified;
    public long fK_IdGrupoVehiculoLinea;
    public boolean fK_IdGrupoVehiculoLineaSpecified;
    public long fK_IdPrueba;
    public boolean fK_IdPruebaSpecified;
    public GrupoVehiculoLinea grupoVehiculoLinea;
    public Prueba prueba;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public long idPruebaCondicionalidad;
    public boolean idPruebaCondicionalidadSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public PruebaCondicionalidad(){}
    
    public PruebaCondicionalidad(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Condicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Condicionalidad");
            condicionalidad =  new Condicionalidad (j);
            
        }
        if (soapObject.hasProperty("FK_IdCondicionalidad"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidad = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCondicionalidad = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCondicionalidadSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCondicionalidadSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCondicionalidadSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCondicionalidadSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoVehiculoLinea"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoVehiculoLinea");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoVehiculoLinea = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoVehiculoLinea = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoVehiculoLineaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoVehiculoLineaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoVehiculoLineaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoVehiculoLineaSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("GrupoVehiculoLinea"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoVehiculoLinea");
            grupoVehiculoLinea =  new GrupoVehiculoLinea (j);
            
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
        if (soapObject.hasProperty("idPruebaCondicionalidad"))
        {
            Object obj = soapObject.getProperty("idPruebaCondicionalidad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idPruebaCondicionalidad = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idPruebaCondicionalidad = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idPruebaCondicionalidadSpecified"))
        {
            Object obj = soapObject.getProperty("idPruebaCondicionalidadSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idPruebaCondicionalidadSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idPruebaCondicionalidadSpecified = (Boolean) obj;
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
                return condicionalidad;
            case 1:
                return fK_IdCondicionalidad;
            case 2:
                return fK_IdCondicionalidadSpecified;
            case 3:
                return fK_IdGrupoVehiculoLinea;
            case 4:
                return fK_IdGrupoVehiculoLineaSpecified;
            case 5:
                return fK_IdPrueba;
            case 6:
                return fK_IdPruebaSpecified;
            case 7:
                return grupoVehiculoLinea;
            case 8:
                return prueba;
            case 9:
                return publicado;
            case 10:
                return publicadoSpecified;
            case 11:
                return fechaModificacion;
            case 12:
                return fechaModificacionSpecified;
            case 13:
                return idPruebaCondicionalidad;
            case 14:
                return idPruebaCondicionalidadSpecified;
            case 15:
                return timestamp.toString();
            case 16:
                return usuarioModificacion;
            case 17:
                return usuarioModificacionSpecified;
            case 18:
                return id;
            case 19:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 20;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Condicionalidad.class;
                info.name = "Condicionalidad";
                break;
            case 1:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidad";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdGrupoVehiculoLinea";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoVehiculoLineaSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdPrueba";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdPruebaSpecified";
                break;
            case 7:
                info.type = GrupoVehiculoLinea.class;
                info.name = "GrupoVehiculoLinea";
                break;
            case 8:
                info.type = Prueba.class;
                info.name = "Prueba";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 13:
                info.type = Long.class;
                info.name = "idPruebaCondicionalidad";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idPruebaCondicionalidadSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 16:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 19:
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
