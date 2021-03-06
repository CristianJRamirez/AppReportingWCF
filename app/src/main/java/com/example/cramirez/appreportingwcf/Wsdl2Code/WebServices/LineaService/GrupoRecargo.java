package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoCentro;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoRecargo_Tarifa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorRecargosAplicacion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoCliente;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GrupoRecargo implements KvmSerializable {
    
    public Autonomia autonomia;
    public String descripcion;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdGrupoCentro;
    public boolean fK_IdGrupoCentroSpecified;
    public long fK_IdTipoCliente;
    public boolean fK_IdTipoClienteSpecified;
    public GrupoCentro grupoCentro;
    public VectorGrupoRecargo_Tarifa grupoRecargo_Tarifa;
    public long idGrupoRecargo;
    public boolean idGrupoRecargoSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorRecargosAplicacion recargosAplicacion;
    public TipoCliente tipoCliente;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public GrupoRecargo(){}
    
    public GrupoRecargo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Autonomia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Autonomia");
            autonomia =  new Autonomia (j);
            
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
        if (soapObject.hasProperty("FK_IdGrupoCentro"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoCentro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoCentro = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoCentro = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoCentroSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoCentroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoCentroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoCentroSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoCliente"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoCliente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoCliente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoCliente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoClienteSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoClienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoClienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoClienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoCentro"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoCentro");
            grupoCentro =  new GrupoCentro (j);
            
        }
        if (soapObject.hasProperty("GrupoRecargo_Tarifa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoRecargo_Tarifa");
            grupoRecargo_Tarifa = new VectorGrupoRecargo_Tarifa(j);
        }
        if (soapObject.hasProperty("IdGrupoRecargo"))
        {
            Object obj = soapObject.getProperty("IdGrupoRecargo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoRecargo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idGrupoRecargo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdGrupoRecargoSpecified"))
        {
            Object obj = soapObject.getProperty("IdGrupoRecargoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoRecargoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idGrupoRecargoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("RecargosAplicacion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("RecargosAplicacion");
            recargosAplicacion = new VectorRecargosAplicacion(j);
        }
        if (soapObject.hasProperty("TipoCliente"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoCliente");
            tipoCliente =  new TipoCliente (j);
            
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
                return descripcion;
            case 2:
                return fK_IdAutonomia;
            case 3:
                return fK_IdAutonomiaSpecified;
            case 4:
                return fK_IdGrupoCentro;
            case 5:
                return fK_IdGrupoCentroSpecified;
            case 6:
                return fK_IdTipoCliente;
            case 7:
                return fK_IdTipoClienteSpecified;
            case 8:
                return grupoCentro;
            case 9:
                return grupoRecargo_Tarifa;
            case 10:
                return idGrupoRecargo;
            case 11:
                return idGrupoRecargoSpecified;
            case 12:
                return publicado;
            case 13:
                return publicadoSpecified;
            case 14:
                return recargosAplicacion;
            case 15:
                return tipoCliente;
            case 16:
                return fechaModificacion;
            case 17:
                return fechaModificacionSpecified;
            case 18:
                return timestamp.toString();
            case 19:
                return usuarioModificacion;
            case 20:
                return usuarioModificacionSpecified;
            case 21:
                return id;
            case 22:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 23;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdAutonomia";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdAutonomiaSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdGrupoCentro";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoCentroSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdTipoCliente";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoClienteSpecified";
                break;
            case 8:
                info.type = GrupoCentro.class;
                info.name = "GrupoCentro";
                break;
            case 9:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoRecargo_Tarifa";
                break;
            case 10:
                info.type = Long.class;
                info.name = "IdGrupoRecargo";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdGrupoRecargoSpecified";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 14:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "RecargosAplicacion";
                break;
            case 15:
                info.type = TipoCliente.class;
                info.name = "TipoCliente";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 19:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 22:
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
