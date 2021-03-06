package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Inspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Lote;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Etiqueta implements KvmSerializable {
    
    public long fK_IdInspeccion;
    public boolean fK_IdInspeccionSpecified;
    public long fK_Lote;
    public boolean fK_LoteSpecified;
    public String fechaCambioLibre;
    public boolean fechaCambioLibreSpecified;
    public String fechaCambioValidez;
    public boolean fechaCambioValidezSpecified;
    public long idEtiqueta;
    public boolean idEtiquetaSpecified;
    public Inspeccion inspeccion;
    public boolean libre;
    public boolean libreSpecified;
    public Lote lote;
    public String motivoCambioCalidez;
    public long numero;
    public boolean numeroSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public boolean valido;
    public boolean validoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioCambioCalidez;
    public boolean usuarioCambioCalidezSpecified;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Etiqueta(){}
    
    public Etiqueta(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("FK_IdInspeccion"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_Lote"))
        {
            Object obj = soapObject.getProperty("FK_Lote");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_Lote = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_Lote = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_LoteSpecified"))
        {
            Object obj = soapObject.getProperty("FK_LoteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_LoteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_LoteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaCambioLibre"))
        {
            Object obj = soapObject.getProperty("FechaCambioLibre");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaCambioLibre = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaCambioLibre = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaCambioLibreSpecified"))
        {
            Object obj = soapObject.getProperty("FechaCambioLibreSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaCambioLibreSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaCambioLibreSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaCambioValidez"))
        {
            Object obj = soapObject.getProperty("FechaCambioValidez");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaCambioValidez = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaCambioValidez = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaCambioValidezSpecified"))
        {
            Object obj = soapObject.getProperty("FechaCambioValidezSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaCambioValidezSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaCambioValidezSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdEtiqueta"))
        {
            Object obj = soapObject.getProperty("IdEtiqueta");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idEtiqueta = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idEtiqueta = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdEtiquetaSpecified"))
        {
            Object obj = soapObject.getProperty("IdEtiquetaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idEtiquetaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idEtiquetaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Inspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Inspeccion");
            inspeccion =  new Inspeccion (j);
            
        }
        if (soapObject.hasProperty("Libre"))
        {
            Object obj = soapObject.getProperty("Libre");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                libre = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                libre = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("LibreSpecified"))
        {
            Object obj = soapObject.getProperty("LibreSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                libreSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                libreSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Lote"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Lote");
            lote =  new Lote (j);
            
        }
        if (soapObject.hasProperty("MotivoCambioCalidez"))
        {
            Object obj = soapObject.getProperty("MotivoCambioCalidez");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                motivoCambioCalidez = j.toString();
            }else if (obj!= null && obj instanceof String){
                motivoCambioCalidez = (String) obj;
            }
        }
        if (soapObject.hasProperty("Numero"))
        {
            Object obj = soapObject.getProperty("Numero");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numero = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                numero = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NumeroSpecified"))
        {
            Object obj = soapObject.getProperty("NumeroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numeroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                numeroSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Valido"))
        {
            Object obj = soapObject.getProperty("Valido");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                valido = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                valido = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ValidoSpecified"))
        {
            Object obj = soapObject.getProperty("ValidoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                validoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                validoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("usuarioCambioCalidez"))
        {
            Object obj = soapObject.getProperty("usuarioCambioCalidez");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                usuarioCambioCalidez = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                usuarioCambioCalidez = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("usuarioCambioCalidezSpecified"))
        {
            Object obj = soapObject.getProperty("usuarioCambioCalidezSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                usuarioCambioCalidezSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                usuarioCambioCalidezSpecified = (Boolean) obj;
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
                return fK_IdInspeccion;
            case 1:
                return fK_IdInspeccionSpecified;
            case 2:
                return fK_Lote;
            case 3:
                return fK_LoteSpecified;
            case 4:
                return fechaCambioLibre;
            case 5:
                return fechaCambioLibreSpecified;
            case 6:
                return fechaCambioValidez;
            case 7:
                return fechaCambioValidezSpecified;
            case 8:
                return idEtiqueta;
            case 9:
                return idEtiquetaSpecified;
            case 10:
                return inspeccion;
            case 11:
                return libre;
            case 12:
                return libreSpecified;
            case 13:
                return lote;
            case 14:
                return motivoCambioCalidez;
            case 15:
                return numero;
            case 16:
                return numeroSpecified;
            case 17:
                return publicado;
            case 18:
                return publicadoSpecified;
            case 19:
                return valido;
            case 20:
                return validoSpecified;
            case 21:
                return fechaModificacion;
            case 22:
                return fechaModificacionSpecified;
            case 23:
                return timestamp.toString();
            case 24:
                return usuarioCambioCalidez;
            case 25:
                return usuarioCambioCalidezSpecified;
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
                info.type = Long.class;
                info.name = "FK_IdInspeccion";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdInspeccionSpecified";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_Lote";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_LoteSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaCambioLibre";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaCambioLibreSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaCambioValidez";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaCambioValidezSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "IdEtiqueta";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdEtiquetaSpecified";
                break;
            case 10:
                info.type = Inspeccion.class;
                info.name = "Inspeccion";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Libre";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "LibreSpecified";
                break;
            case 13:
                info.type = Lote.class;
                info.name = "Lote";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MotivoCambioCalidez";
                break;
            case 15:
                info.type = Long.class;
                info.name = "Numero";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NumeroSpecified";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Valido";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ValidoSpecified";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 24:
                info.type = Long.class;
                info.name = "usuarioCambioCalidez";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioCambioCalidezSpecified";
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
