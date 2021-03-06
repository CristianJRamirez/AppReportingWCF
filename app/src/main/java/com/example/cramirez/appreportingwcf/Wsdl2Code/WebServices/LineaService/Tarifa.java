package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Combustible;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Divisa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoRecargo_Tarifa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoTarifa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoTarifa_Vehiculo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorRedondeo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTarifaImporte;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Tarifa implements KvmSerializable {
    
    public Autonomia autonomia;
    public String codigo;
    public Combustible combustible;
    public String descripcion;
    public Divisa divisa;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdCombustible;
    public boolean fK_IdCombustibleSpecified;
    public long fK_IdDivisa;
    public boolean fK_IdDivisaSpecified;
    public long fK_IdGrupoTarifa;
    public boolean fK_IdGrupoTarifaSpecified;
    public long fK_IdGrupoTarifa_vehiculo;
    public boolean fK_IdGrupoTarifa_vehiculoSpecified;
    public String fechaFVigencia;
    public boolean fechaFVigenciaSpecified;
    public String fechaIVigencia;
    public boolean fechaIVigenciaSpecified;
    public VectorGrupoRecargo_Tarifa grupoRecargo_Tarifa;
    public GrupoTarifa grupoTarifa;
    public GrupoTarifa_Vehiculo grupoTarifa_Vehiculo;
    public long idTarifa;
    public boolean idTarifaSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorRedondeo redondeo;
    public VectorTarifaImporte tarifaImporte;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Tarifa(){}
    
    public Tarifa(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Autonomia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Autonomia");
            autonomia =  new Autonomia (j);
            
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
        if (soapObject.hasProperty("Combustible"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Combustible");
            combustible =  new Combustible (j);
            
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
        if (soapObject.hasProperty("Divisa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Divisa");
            divisa =  new Divisa (j);
            
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
        if (soapObject.hasProperty("FK_IdCombustible"))
        {
            Object obj = soapObject.getProperty("FK_IdCombustible");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCombustible = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCombustible = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCombustibleSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCombustibleSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCombustibleSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCombustibleSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdDivisa"))
        {
            Object obj = soapObject.getProperty("FK_IdDivisa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdDivisa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdDivisa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdDivisaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdDivisaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdDivisaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdDivisaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoTarifa"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoTarifa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoTarifa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoTarifa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoTarifaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoTarifaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoTarifaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoTarifaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoTarifa_vehiculo"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoTarifa_vehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoTarifa_vehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoTarifa_vehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoTarifa_vehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoTarifa_vehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoTarifa_vehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoTarifa_vehiculoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("GrupoRecargo_Tarifa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoRecargo_Tarifa");
            grupoRecargo_Tarifa = new VectorGrupoRecargo_Tarifa(j);
        }
        if (soapObject.hasProperty("GrupoTarifa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoTarifa");
            grupoTarifa =  new GrupoTarifa (j);
            
        }
        if (soapObject.hasProperty("GrupoTarifa_Vehiculo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoTarifa_Vehiculo");
            grupoTarifa_Vehiculo =  new GrupoTarifa_Vehiculo (j);
            
        }
        if (soapObject.hasProperty("IdTarifa"))
        {
            Object obj = soapObject.getProperty("IdTarifa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idTarifa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idTarifa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdTarifaSpecified"))
        {
            Object obj = soapObject.getProperty("IdTarifaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idTarifaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idTarifaSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Redondeo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Redondeo");
            redondeo = new VectorRedondeo(j);
        }
        if (soapObject.hasProperty("TarifaImporte"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TarifaImporte");
            tarifaImporte = new VectorTarifaImporte(j);
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
                return codigo;
            case 2:
                return combustible;
            case 3:
                return descripcion;
            case 4:
                return divisa;
            case 5:
                return fK_IdAutonomia;
            case 6:
                return fK_IdAutonomiaSpecified;
            case 7:
                return fK_IdCombustible;
            case 8:
                return fK_IdCombustibleSpecified;
            case 9:
                return fK_IdDivisa;
            case 10:
                return fK_IdDivisaSpecified;
            case 11:
                return fK_IdGrupoTarifa;
            case 12:
                return fK_IdGrupoTarifaSpecified;
            case 13:
                return fK_IdGrupoTarifa_vehiculo;
            case 14:
                return fK_IdGrupoTarifa_vehiculoSpecified;
            case 15:
                return fechaFVigencia;
            case 16:
                return fechaFVigenciaSpecified;
            case 17:
                return fechaIVigencia;
            case 18:
                return fechaIVigenciaSpecified;
            case 19:
                return grupoRecargo_Tarifa;
            case 20:
                return grupoTarifa;
            case 21:
                return grupoTarifa_Vehiculo;
            case 22:
                return idTarifa;
            case 23:
                return idTarifaSpecified;
            case 24:
                return publicado;
            case 25:
                return publicadoSpecified;
            case 26:
                return redondeo;
            case 27:
                return tarifaImporte;
            case 28:
                return fechaModificacion;
            case 29:
                return fechaModificacionSpecified;
            case 30:
                return timestamp.toString();
            case 31:
                return usuarioModificacion;
            case 32:
                return usuarioModificacionSpecified;
            case 33:
                return id;
            case 34:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 35;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 2:
                info.type = Combustible.class;
                info.name = "Combustible";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 4:
                info.type = Divisa.class;
                info.name = "Divisa";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdAutonomia";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdAutonomiaSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "FK_IdCombustible";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCombustibleSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_IdDivisa";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdDivisaSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "FK_IdGrupoTarifa";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoTarifaSpecified";
                break;
            case 13:
                info.type = Long.class;
                info.name = "FK_IdGrupoTarifa_vehiculo";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoTarifa_vehiculoSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFVigencia";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFVigenciaSpecified";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIVigencia";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIVigenciaSpecified";
                break;
            case 19:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoRecargo_Tarifa";
                break;
            case 20:
                info.type = GrupoTarifa.class;
                info.name = "GrupoTarifa";
                break;
            case 21:
                info.type = GrupoTarifa_Vehiculo.class;
                info.name = "GrupoTarifa_Vehiculo";
                break;
            case 22:
                info.type = Long.class;
                info.name = "IdTarifa";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdTarifaSpecified";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 26:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Redondeo";
                break;
            case 27:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "TarifaImporte";
                break;
            case 28:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 29:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 30:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 31:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 32:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 33:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 34:
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
