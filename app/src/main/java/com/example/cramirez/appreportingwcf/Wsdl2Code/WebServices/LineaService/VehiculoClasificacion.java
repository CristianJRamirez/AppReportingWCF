package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoTarifa_Vehiculo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VehiculoCodigoInterno;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VehiculoConstruccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VehiculoTipoFicha;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VehiculoUtilizacion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class VehiculoClasificacion implements KvmSerializable {
    
    public Autonomia autonomia;
    public long fK_GrupoTarifa_Vehiculo;
    public boolean fK_GrupoTarifa_VehiculoSpecified;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdVehiculoCodigoInterno;
    public boolean fK_IdVehiculoCodigoInternoSpecified;
    public long fK_IdVehiculoConstruccion;
    public boolean fK_IdVehiculoConstruccionSpecified;
    public long fK_IdVehiculoTipoFicha;
    public boolean fK_IdVehiculoTipoFichaSpecified;
    public long fK_IdVehiculoUtilizacion;
    public boolean fK_IdVehiculoUtilizacionSpecified;
    public String fechaFVigencia;
    public boolean fechaFVigenciaSpecified;
    public String fechaIVigencia;
    public boolean fechaIVigenciaSpecified;
    public GrupoTarifa_Vehiculo grupoTarifa_Vehiculo;
    public long idVehiculoClasificacion;
    public boolean idVehiculoClasificacionSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VehiculoCodigoInterno vehiculoCodigoInterno;
    public VehiculoConstruccion vehiculoConstruccion;
    public VehiculoTipoFicha vehiculoTipoFicha;
    public VehiculoUtilizacion vehiculoUtilizacion;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public VehiculoClasificacion(){}
    
    public VehiculoClasificacion(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Autonomia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Autonomia");
            autonomia =  new Autonomia (j);
            
        }
        if (soapObject.hasProperty("FK_GrupoTarifa_Vehiculo"))
        {
            Object obj = soapObject.getProperty("FK_GrupoTarifa_Vehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_GrupoTarifa_Vehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_GrupoTarifa_Vehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_GrupoTarifa_VehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_GrupoTarifa_VehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_GrupoTarifa_VehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_GrupoTarifa_VehiculoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdAutonomia"))
        {
            Object obj = soapObject.getProperty("FK_IdAutonomia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdAutonomia = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdAutonomia = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdAutonomiaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdAutonomiaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdAutonomiaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdAutonomiaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoCodigoInterno"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoCodigoInterno");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoCodigoInterno = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdVehiculoCodigoInterno = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoCodigoInternoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoCodigoInternoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoCodigoInternoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdVehiculoCodigoInternoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoConstruccion"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoConstruccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoConstruccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdVehiculoConstruccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoConstruccionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoConstruccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoConstruccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdVehiculoConstruccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoTipoFicha"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoTipoFicha");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoTipoFicha = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdVehiculoTipoFicha = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoTipoFichaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoTipoFichaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoTipoFichaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdVehiculoTipoFichaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoUtilizacion"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoUtilizacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoUtilizacion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdVehiculoUtilizacion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoUtilizacionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoUtilizacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoUtilizacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdVehiculoUtilizacionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaFVigencia"))
        {
            Object obj = soapObject.getProperty("FechaFVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaFVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaFVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaIVigencia"))
        {
            Object obj = soapObject.getProperty("FechaIVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaIVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaIVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaIVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaIVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoTarifa_Vehiculo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoTarifa_Vehiculo");
            grupoTarifa_Vehiculo =  new GrupoTarifa_Vehiculo (j);
            
        }
        if (soapObject.hasProperty("IdVehiculoClasificacion"))
        {
            Object obj = soapObject.getProperty("IdVehiculoClasificacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idVehiculoClasificacion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idVehiculoClasificacion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdVehiculoClasificacionSpecified"))
        {
            Object obj = soapObject.getProperty("IdVehiculoClasificacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idVehiculoClasificacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idVehiculoClasificacionSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("VehiculoCodigoInterno"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoCodigoInterno");
            vehiculoCodigoInterno =  new VehiculoCodigoInterno (j);
            
        }
        if (soapObject.hasProperty("VehiculoConstruccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoConstruccion");
            vehiculoConstruccion =  new VehiculoConstruccion (j);
            
        }
        if (soapObject.hasProperty("VehiculoTipoFicha"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoTipoFicha");
            vehiculoTipoFicha =  new VehiculoTipoFicha (j);
            
        }
        if (soapObject.hasProperty("VehiculoUtilizacion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoUtilizacion");
            vehiculoUtilizacion =  new VehiculoUtilizacion (j);
            
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
                return autonomia;
            case 1:
                return fK_GrupoTarifa_Vehiculo;
            case 2:
                return fK_GrupoTarifa_VehiculoSpecified;
            case 3:
                return fK_IdAutonomia;
            case 4:
                return fK_IdAutonomiaSpecified;
            case 5:
                return fK_IdVehiculoCodigoInterno;
            case 6:
                return fK_IdVehiculoCodigoInternoSpecified;
            case 7:
                return fK_IdVehiculoConstruccion;
            case 8:
                return fK_IdVehiculoConstruccionSpecified;
            case 9:
                return fK_IdVehiculoTipoFicha;
            case 10:
                return fK_IdVehiculoTipoFichaSpecified;
            case 11:
                return fK_IdVehiculoUtilizacion;
            case 12:
                return fK_IdVehiculoUtilizacionSpecified;
            case 13:
                return fechaFVigencia;
            case 14:
                return fechaFVigenciaSpecified;
            case 15:
                return fechaIVigencia;
            case 16:
                return fechaIVigenciaSpecified;
            case 17:
                return grupoTarifa_Vehiculo;
            case 18:
                return idVehiculoClasificacion;
            case 19:
                return idVehiculoClasificacionSpecified;
            case 20:
                return publicado;
            case 21:
                return publicadoSpecified;
            case 22:
                return vehiculoCodigoInterno;
            case 23:
                return vehiculoConstruccion;
            case 24:
                return vehiculoTipoFicha;
            case 25:
                return vehiculoUtilizacion;
            case 26:
                return fechaModificacion;
            case 27:
                return fechaModificacionSpecified;
            case 28:
                return timestamp.toString();
            case 29:
                return usuarioModificacion;
            case 30:
                return usuarioModificacionSpecified;
            case 31:
                return id;
            case 32:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 33;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 1:
                info.type = Long.class;
                info.name = "FK_GrupoTarifa_Vehiculo";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_GrupoTarifa_VehiculoSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdAutonomia";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdAutonomiaSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdVehiculoCodigoInterno";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdVehiculoCodigoInternoSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "FK_IdVehiculoConstruccion";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdVehiculoConstruccionSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_IdVehiculoTipoFicha";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdVehiculoTipoFichaSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "FK_IdVehiculoUtilizacion";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdVehiculoUtilizacionSpecified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFVigencia";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFVigenciaSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIVigencia";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIVigenciaSpecified";
                break;
            case 17:
                info.type = GrupoTarifa_Vehiculo.class;
                info.name = "GrupoTarifa_Vehiculo";
                break;
            case 18:
                info.type = Long.class;
                info.name = "IdVehiculoClasificacion";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdVehiculoClasificacionSpecified";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 22:
                info.type = VehiculoCodigoInterno.class;
                info.name = "VehiculoCodigoInterno";
                break;
            case 23:
                info.type = VehiculoConstruccion.class;
                info.name = "VehiculoConstruccion";
                break;
            case 24:
                info.type = VehiculoTipoFicha.class;
                info.name = "VehiculoTipoFicha";
                break;
            case 25:
                info.type = VehiculoUtilizacion.class;
                info.name = "VehiculoUtilizacion";
                break;
            case 26:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 28:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 29:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 30:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 31:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 32:
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
