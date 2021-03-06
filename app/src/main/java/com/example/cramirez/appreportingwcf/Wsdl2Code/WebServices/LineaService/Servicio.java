package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoCentro;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoServicio_Servicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoTarifa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicioAlcance;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio_HojadeCampo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio_LinksInformativos;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio_TipoValor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoInspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Servicio implements KvmSerializable {
    
    public boolean alcanceTotal;
    public boolean alcanceTotalSpecified;
    public Autonomia autonomia;
    public String codigo;
    public String descripcion;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdGrupoCentro;
    public boolean fK_IdGrupoCentroSpecified;
    public long fK_IdGrupoTarifa;
    public boolean fK_IdGrupoTarifaSpecified;
    public long fK_IdTipoInspeccion;
    public boolean fK_IdTipoInspeccionSpecified;
    public String fechaFVigencia;
    public boolean fechaFVigenciaSpecified;
    public String fechaIVigencia;
    public boolean fechaIVigenciaSpecified;
    public boolean generaExpediente;
    public boolean generaExpedienteSpecified;
    public boolean generaFechaValidez;
    public boolean generaFechaValidezSpecified;
    public boolean generaInspeccion;
    public boolean generaInspeccionSpecified;
    public GrupoCentro grupoCentro;
    public VectorGrupoServicio_Servicio grupoServicio_Servicio;
    public GrupoTarifa grupoTarifa;
    public long idServicio;
    public boolean idServicioSpecified;
    public boolean modificaVehículo;
    public boolean modificaVehículoSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public boolean requiereDatosCentroExterno;
    public boolean requiereDatosCentroExternoSpecified;
    public VectorServicioAlcance servicioAlcance;
    public VectorServicio_HojadeCampo servicio_HojadeCampo;
    public VectorServicio_LinksInformativos servicio_LinksInformativos;
    public VectorServicio_TipoValor servicio_TipoValor;
    public boolean tIT;
    public boolean tITSpecified;
    public TipoInspeccion tipoInspeccion;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Servicio(){}
    
    public Servicio(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("AlcanceTotal"))
        {
            Object obj = soapObject.getProperty("AlcanceTotal");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                alcanceTotal = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                alcanceTotal = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("AlcanceTotalSpecified"))
        {
            Object obj = soapObject.getProperty("AlcanceTotalSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                alcanceTotalSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                alcanceTotalSpecified = (Boolean) obj;
            }
        }
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
        if (soapObject.hasProperty("FK_IdTipoInspeccion"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoInspeccionSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("GeneraExpediente"))
        {
            Object obj = soapObject.getProperty("GeneraExpediente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                generaExpediente = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                generaExpediente = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GeneraExpedienteSpecified"))
        {
            Object obj = soapObject.getProperty("GeneraExpedienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                generaExpedienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                generaExpedienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GeneraFechaValidez"))
        {
            Object obj = soapObject.getProperty("GeneraFechaValidez");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                generaFechaValidez = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                generaFechaValidez = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GeneraFechaValidezSpecified"))
        {
            Object obj = soapObject.getProperty("GeneraFechaValidezSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                generaFechaValidezSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                generaFechaValidezSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GeneraInspeccion"))
        {
            Object obj = soapObject.getProperty("GeneraInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                generaInspeccion = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                generaInspeccion = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GeneraInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("GeneraInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                generaInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                generaInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoCentro"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoCentro");
            grupoCentro =  new GrupoCentro (j);
            
        }
        if (soapObject.hasProperty("GrupoServicio_Servicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoServicio_Servicio");
            grupoServicio_Servicio = new VectorGrupoServicio_Servicio(j);
        }
        if (soapObject.hasProperty("GrupoTarifa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoTarifa");
            grupoTarifa =  new GrupoTarifa (j);
            
        }
        if (soapObject.hasProperty("IdServicio"))
        {
            Object obj = soapObject.getProperty("IdServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdServicioSpecified"))
        {
            Object obj = soapObject.getProperty("IdServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ModificaVehículo"))
        {
            Object obj = soapObject.getProperty("ModificaVehículo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                modificaVehículo = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                modificaVehículo = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ModificaVehículoSpecified"))
        {
            Object obj = soapObject.getProperty("ModificaVehículoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                modificaVehículoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                modificaVehículoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("RequiereDatosCentroExterno"))
        {
            Object obj = soapObject.getProperty("RequiereDatosCentroExterno");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                requiereDatosCentroExterno = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                requiereDatosCentroExterno = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("RequiereDatosCentroExternoSpecified"))
        {
            Object obj = soapObject.getProperty("RequiereDatosCentroExternoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                requiereDatosCentroExternoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                requiereDatosCentroExternoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ServicioAlcance"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ServicioAlcance");
            servicioAlcance = new VectorServicioAlcance(j);
        }
        if (soapObject.hasProperty("Servicio_HojadeCampo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Servicio_HojadeCampo");
            servicio_HojadeCampo = new VectorServicio_HojadeCampo(j);
        }
        if (soapObject.hasProperty("Servicio_LinksInformativos"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Servicio_LinksInformativos");
            servicio_LinksInformativos = new VectorServicio_LinksInformativos(j);
        }
        if (soapObject.hasProperty("Servicio_TipoValor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Servicio_TipoValor");
            servicio_TipoValor = new VectorServicio_TipoValor(j);
        }
        if (soapObject.hasProperty("TIT"))
        {
            Object obj = soapObject.getProperty("TIT");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tIT = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tIT = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TITSpecified"))
        {
            Object obj = soapObject.getProperty("TITSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tITSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tITSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TipoInspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoInspeccion");
            tipoInspeccion =  new TipoInspeccion (j);
            
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
                return alcanceTotal;
            case 1:
                return alcanceTotalSpecified;
            case 2:
                return autonomia;
            case 3:
                return codigo;
            case 4:
                return descripcion;
            case 5:
                return fK_IdAutonomia;
            case 6:
                return fK_IdAutonomiaSpecified;
            case 7:
                return fK_IdGrupoCentro;
            case 8:
                return fK_IdGrupoCentroSpecified;
            case 9:
                return fK_IdGrupoTarifa;
            case 10:
                return fK_IdGrupoTarifaSpecified;
            case 11:
                return fK_IdTipoInspeccion;
            case 12:
                return fK_IdTipoInspeccionSpecified;
            case 13:
                return fechaFVigencia;
            case 14:
                return fechaFVigenciaSpecified;
            case 15:
                return fechaIVigencia;
            case 16:
                return fechaIVigenciaSpecified;
            case 17:
                return generaExpediente;
            case 18:
                return generaExpedienteSpecified;
            case 19:
                return generaFechaValidez;
            case 20:
                return generaFechaValidezSpecified;
            case 21:
                return generaInspeccion;
            case 22:
                return generaInspeccionSpecified;
            case 23:
                return grupoCentro;
            case 24:
                return grupoServicio_Servicio;
            case 25:
                return grupoTarifa;
            case 26:
                return idServicio;
            case 27:
                return idServicioSpecified;
            case 28:
                return modificaVehículo;
            case 29:
                return modificaVehículoSpecified;
            case 30:
                return publicado;
            case 31:
                return publicadoSpecified;
            case 32:
                return requiereDatosCentroExterno;
            case 33:
                return requiereDatosCentroExternoSpecified;
            case 34:
                return servicioAlcance;
            case 35:
                return servicio_HojadeCampo;
            case 36:
                return servicio_LinksInformativos;
            case 37:
                return servicio_TipoValor;
            case 38:
                return tIT;
            case 39:
                return tITSpecified;
            case 40:
                return tipoInspeccion;
            case 41:
                return fechaModificacion;
            case 42:
                return fechaModificacionSpecified;
            case 43:
                return timestamp.toString();
            case 44:
                return usuarioModificacion;
            case 45:
                return usuarioModificacionSpecified;
            case 46:
                return id;
            case 47:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 48;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "AlcanceTotal";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "AlcanceTotalSpecified";
                break;
            case 2:
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
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
                info.name = "FK_IdGrupoCentro";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoCentroSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_IdGrupoTarifa";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoTarifaSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "FK_IdTipoInspeccion";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoInspeccionSpecified";
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
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GeneraExpediente";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GeneraExpedienteSpecified";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GeneraFechaValidez";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GeneraFechaValidezSpecified";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GeneraInspeccion";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GeneraInspeccionSpecified";
                break;
            case 23:
                info.type = GrupoCentro.class;
                info.name = "GrupoCentro";
                break;
            case 24:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoServicio_Servicio";
                break;
            case 25:
                info.type = GrupoTarifa.class;
                info.name = "GrupoTarifa";
                break;
            case 26:
                info.type = Long.class;
                info.name = "IdServicio";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdServicioSpecified";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ModificaVehículo";
                break;
            case 29:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ModificaVehículoSpecified";
                break;
            case 30:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 31:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 32:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "RequiereDatosCentroExterno";
                break;
            case 33:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "RequiereDatosCentroExternoSpecified";
                break;
            case 34:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ServicioAlcance";
                break;
            case 35:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio_HojadeCampo";
                break;
            case 36:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio_LinksInformativos";
                break;
            case 37:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio_TipoValor";
                break;
            case 38:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TIT";
                break;
            case 39:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TITSpecified";
                break;
            case 40:
                info.type = TipoInspeccion.class;
                info.name = "TipoInspeccion";
                break;
            case 41:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 42:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 43:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 44:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 45:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 46:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 47:
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
