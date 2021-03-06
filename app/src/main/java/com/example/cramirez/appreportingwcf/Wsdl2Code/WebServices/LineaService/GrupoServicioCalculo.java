package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoServicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoCalculoGrupoServicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GrupoServicioCalculo implements KvmSerializable {
    
    public long fK_IdCategoria;
    public boolean fK_IdCategoriaSpecified;
    public long fK_IdGrupoServicio;
    public boolean fK_IdGrupoServicioSpecified;
    public long fK_IdTipoCalculoGrupoServicio;
    public boolean fK_IdTipoCalculoGrupoServicioSpecified;
    public GrupoServicio grupoServicio;
    public long idGrupoServicioCalculo;
    public boolean idGrupoServicioCalculoSpecified;
    public boolean mismoGrupo;
    public boolean mismoGrupoSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public TipoCalculoGrupoServicio tipoCalculoGrupoServicio;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public GrupoServicioCalculo(){}
    
    public GrupoServicioCalculo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("FK_IdCategoria"))
        {
            Object obj = soapObject.getProperty("FK_IdCategoria");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCategoria = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCategoria = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCategoriaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCategoriaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCategoriaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCategoriaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoServicio"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoServicioSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoCalculoGrupoServicio"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoCalculoGrupoServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoCalculoGrupoServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoCalculoGrupoServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoCalculoGrupoServicioSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoCalculoGrupoServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoCalculoGrupoServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoCalculoGrupoServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoServicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoServicio");
            grupoServicio =  new GrupoServicio (j);
            
        }
        if (soapObject.hasProperty("IdGrupoServicioCalculo"))
        {
            Object obj = soapObject.getProperty("IdGrupoServicioCalculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoServicioCalculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idGrupoServicioCalculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdGrupoServicioCalculoSpecified"))
        {
            Object obj = soapObject.getProperty("IdGrupoServicioCalculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoServicioCalculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idGrupoServicioCalculoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MismoGrupo"))
        {
            Object obj = soapObject.getProperty("MismoGrupo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mismoGrupo = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mismoGrupo = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MismoGrupoSpecified"))
        {
            Object obj = soapObject.getProperty("MismoGrupoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mismoGrupoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mismoGrupoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("TipoCalculoGrupoServicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoCalculoGrupoServicio");
            tipoCalculoGrupoServicio =  new TipoCalculoGrupoServicio (j);
            
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
                return fK_IdCategoria;
            case 1:
                return fK_IdCategoriaSpecified;
            case 2:
                return fK_IdGrupoServicio;
            case 3:
                return fK_IdGrupoServicioSpecified;
            case 4:
                return fK_IdTipoCalculoGrupoServicio;
            case 5:
                return fK_IdTipoCalculoGrupoServicioSpecified;
            case 6:
                return grupoServicio;
            case 7:
                return idGrupoServicioCalculo;
            case 8:
                return idGrupoServicioCalculoSpecified;
            case 9:
                return mismoGrupo;
            case 10:
                return mismoGrupoSpecified;
            case 11:
                return publicado;
            case 12:
                return publicadoSpecified;
            case 13:
                return tipoCalculoGrupoServicio;
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
                info.type = Long.class;
                info.name = "FK_IdCategoria";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCategoriaSpecified";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdGrupoServicio";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoServicioSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdTipoCalculoGrupoServicio";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoCalculoGrupoServicioSpecified";
                break;
            case 6:
                info.type = GrupoServicio.class;
                info.name = "GrupoServicio";
                break;
            case 7:
                info.type = Long.class;
                info.name = "IdGrupoServicioCalculo";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdGrupoServicioCalculoSpecified";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MismoGrupo";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MismoGrupoSpecified";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 13:
                info.type = TipoCalculoGrupoServicio.class;
                info.name = "TipoCalculoGrupoServicio";
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
