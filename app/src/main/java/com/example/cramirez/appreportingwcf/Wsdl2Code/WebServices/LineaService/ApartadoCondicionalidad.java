package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Apartado;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Condicionalidad;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoVehiculoLinea;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ApartadoCondicionalidad implements KvmSerializable {
    
    public Apartado apartado;
    public Condicionalidad condicionalidad;
    public long fK_IdApartado;
    public boolean fK_IdApartadoSpecified;
    public long fK_IdCondicionalidad;
    public boolean fK_IdCondicionalidadSpecified;
    public long fK_IdGrupoVehiculo;
    public boolean fK_IdGrupoVehiculoSpecified;
    public String fechaFinVigencia;
    public boolean fechaFinVigenciaSpecified;
    public String fechaIniVigencia;
    public boolean fechaIniVigenciaSpecified;
    public GrupoVehiculoLinea grupoVehiculoLinea;
    public long idApartadoCondicionalidad;
    public boolean idApartadoCondicionalidadSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public ApartadoCondicionalidad(){}
    
    public ApartadoCondicionalidad(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Apartado"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Apartado");
            apartado =  new Apartado (j);
            
        }
        if (soapObject.hasProperty("Condicionalidad"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Condicionalidad");
            condicionalidad =  new Condicionalidad (j);
            
        }
        if (soapObject.hasProperty("FK_IdApartado"))
        {
            Object obj = soapObject.getProperty("FK_IdApartado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdApartado = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdApartado = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdApartadoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdApartadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdApartadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdApartadoSpecified = (Boolean) obj;
            }
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
        if (soapObject.hasProperty("FK_IdGrupoVehiculo"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoVehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoVehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoVehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoVehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoVehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoVehiculoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("FechaIniVigencia"))
        {
            Object obj = soapObject.getProperty("FechaIniVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIniVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaIniVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaIniVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaIniVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIniVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaIniVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoVehiculoLinea"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoVehiculoLinea");
            grupoVehiculoLinea =  new GrupoVehiculoLinea (j);
            
        }
        if (soapObject.hasProperty("IdApartadoCondicionalidad"))
        {
            Object obj = soapObject.getProperty("IdApartadoCondicionalidad");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idApartadoCondicionalidad = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idApartadoCondicionalidad = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdApartadoCondicionalidadSpecified"))
        {
            Object obj = soapObject.getProperty("IdApartadoCondicionalidadSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idApartadoCondicionalidadSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idApartadoCondicionalidadSpecified = (Boolean) obj;
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
                return apartado;
            case 1:
                return condicionalidad;
            case 2:
                return fK_IdApartado;
            case 3:
                return fK_IdApartadoSpecified;
            case 4:
                return fK_IdCondicionalidad;
            case 5:
                return fK_IdCondicionalidadSpecified;
            case 6:
                return fK_IdGrupoVehiculo;
            case 7:
                return fK_IdGrupoVehiculoSpecified;
            case 8:
                return fechaFinVigencia;
            case 9:
                return fechaFinVigenciaSpecified;
            case 10:
                return fechaIniVigencia;
            case 11:
                return fechaIniVigenciaSpecified;
            case 12:
                return grupoVehiculoLinea;
            case 13:
                return idApartadoCondicionalidad;
            case 14:
                return idApartadoCondicionalidadSpecified;
            case 15:
                return publicado;
            case 16:
                return publicadoSpecified;
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
                info.type = Apartado.class;
                info.name = "Apartado";
                break;
            case 1:
                info.type = Condicionalidad.class;
                info.name = "Condicionalidad";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdApartado";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdApartadoSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdCondicionalidad";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCondicionalidadSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdGrupoVehiculo";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoVehiculoSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFinVigencia";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinVigenciaSpecified";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIniVigencia";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIniVigenciaSpecified";
                break;
            case 12:
                info.type = GrupoVehiculoLinea.class;
                info.name = "GrupoVehiculoLinea";
                break;
            case 13:
                info.type = Long.class;
                info.name = "IdApartadoCondicionalidad";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdApartadoCondicionalidadSpecified";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
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
