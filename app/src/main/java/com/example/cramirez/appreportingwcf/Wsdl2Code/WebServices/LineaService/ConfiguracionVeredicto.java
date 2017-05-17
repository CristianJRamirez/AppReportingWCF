package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoResultadoInspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ConfiguracionVeredicto implements KvmSerializable {
    
    public long fK_IdGravedadDefecto;
    public boolean fK_IdGravedadDefectoSpecified;
    public long fK_IdTipoResultadoInspeccion;
    public boolean fK_IdTipoResultadoInspeccionSpecified;
    public long idConfiguracionVeredicto;
    public boolean idConfiguracionVeredictoSpecified;
    public int orden;
    public boolean ordenSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public TipoResultadoInspeccion tipoResultadoInspeccion;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public int fin;
    public boolean finSpecified;
    public int ini;
    public boolean iniSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public ConfiguracionVeredicto(){}
    
    public ConfiguracionVeredicto(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("FK_IdTipoResultadoInspeccion"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoResultadoInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoResultadoInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoResultadoInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoResultadoInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoResultadoInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoResultadoInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoResultadoInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdConfiguracionVeredicto"))
        {
            Object obj = soapObject.getProperty("IdConfiguracionVeredicto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idConfiguracionVeredicto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idConfiguracionVeredicto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdConfiguracionVeredictoSpecified"))
        {
            Object obj = soapObject.getProperty("IdConfiguracionVeredictoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idConfiguracionVeredictoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idConfiguracionVeredictoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Orden"))
        {
            Object obj = soapObject.getProperty("Orden");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                orden = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                orden = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("OrdenSpecified"))
        {
            Object obj = soapObject.getProperty("OrdenSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ordenSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                ordenSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("TipoResultadoInspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoResultadoInspeccion");
            tipoResultadoInspeccion =  new TipoResultadoInspeccion (j);
            
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
        if (soapObject.hasProperty("fin"))
        {
            Object obj = soapObject.getProperty("fin");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fin = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fin = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("finSpecified"))
        {
            Object obj = soapObject.getProperty("finSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                finSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                finSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ini"))
        {
            Object obj = soapObject.getProperty("ini");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ini = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                ini = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("iniSpecified"))
        {
            Object obj = soapObject.getProperty("iniSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                iniSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                iniSpecified = (Boolean) obj;
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
                return fK_IdGravedadDefecto;
            case 1:
                return fK_IdGravedadDefectoSpecified;
            case 2:
                return fK_IdTipoResultadoInspeccion;
            case 3:
                return fK_IdTipoResultadoInspeccionSpecified;
            case 4:
                return idConfiguracionVeredicto;
            case 5:
                return idConfiguracionVeredictoSpecified;
            case 6:
                return orden;
            case 7:
                return ordenSpecified;
            case 8:
                return publicado;
            case 9:
                return publicadoSpecified;
            case 10:
                return tipoResultadoInspeccion;
            case 11:
                return fechaModificacion;
            case 12:
                return fechaModificacionSpecified;
            case 13:
                return fin;
            case 14:
                return finSpecified;
            case 15:
                return ini;
            case 16:
                return iniSpecified;
            case 17:
                return timestamp.toString();
            case 18:
                return usuarioModificacion;
            case 19:
                return usuarioModificacionSpecified;
            case 20:
                return id;
            case 21:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 22;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Long.class;
                info.name = "FK_IdGravedadDefecto";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGravedadDefectoSpecified";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdTipoResultadoInspeccion";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoResultadoInspeccionSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "IdConfiguracionVeredicto";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdConfiguracionVeredictoSpecified";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Orden";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "OrdenSpecified";
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
                info.type = TipoResultadoInspeccion.class;
                info.name = "TipoResultadoInspeccion";
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
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "fin";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "finSpecified";
                break;
            case 15:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ini";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "iniSpecified";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 18:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 21:
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
