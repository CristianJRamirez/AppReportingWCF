package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorEtiqueta;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Inspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionAlcance;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionAlcanceDefecto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionAlcancePrueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionBloqueEstado;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionDefecto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionDocumento;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionFoto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorInspeccionResultadoPrueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoEstadoInspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoResultadoInspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Inspeccion implements KvmSerializable {
    
    public boolean alcanceTotal;
    public boolean alcanceTotalSpecified;
    public String codigo;
    public String codigoUsuarioActivo;
    public String culturaDocumento;
    public boolean esSegundaInspeccion;
    public boolean esSegundaInspeccionSpecified;
    public String etapa;
    public VectorEtiqueta etiqueta;
    public long fK_IdCentro;
    public boolean fK_IdCentroSpecified;
    public long fK_IdInspeccionAnterior;
    public boolean fK_IdInspeccionAnteriorSpecified;
    public long fK_IdSolicitudServicio;
    public boolean fK_IdSolicitudServicioSpecified;
    public long fK_IdTipoEstadoInspeccion;
    public boolean fK_IdTipoEstadoInspeccionSpecified;
    public long fK_IdTipoInspeccion;
    public boolean fK_IdTipoInspeccionSpecified;
    public long fK_IdTipoResultadoInspeccion;
    public boolean fK_IdTipoResultadoInspeccionSpecified;
    public long fK_IdVehiculo;
    public boolean fK_IdVehiculoSpecified;
    public String fechaFinValidez;
    public boolean fechaFinValidezSpecified;
    public String fechaFinalInspeccion;
    public boolean fechaFinalInspeccionSpecified;
    public String fechaInspeccion;
    public boolean fechaInspeccionSpecified;
    public boolean generaFechaValidez;
    public boolean generaFechaValidezSpecified;
    public long idInspeccion;
    public boolean idInspeccionSpecified;
    public VectorInspeccion inspeccion1;
    public Inspeccion inspeccion2;
    public VectorInspeccionAlcance inspeccionAlcance;
    public VectorInspeccionAlcanceDefecto inspeccionAlcanceDefecto;
    public VectorInspeccionAlcancePrueba inspeccionAlcancePrueba;
    public VectorInspeccionBloqueEstado inspeccionBloqueEstado;
    public VectorInspeccionDefecto inspeccionDefecto;
    public VectorInspeccionDocumento inspeccionDocumento;
    public VectorInspeccionFoto inspeccionFoto;
    public VectorInspeccionResultadoPrueba inspeccionResultadoPrueba;
    public String notasInternas;
    public String numeroInterno;
    public String observaciones;
    public boolean publicado;
    public boolean publicadoSpecified;
    public boolean rectificada;
    public boolean rectificadaSpecified;
    public boolean tieneSegundaInspeccion;
    public boolean tieneSegundaInspeccionSpecified;
    public TipoEstadoInspeccion tipoEstadoInspeccion;
    public TipoResultadoInspeccion tipoResultadoInspeccion;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Inspeccion(){}
    
    public Inspeccion(SoapObject soapObject)
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
        if (soapObject.hasProperty("CodigoUsuarioActivo"))
        {
            Object obj = soapObject.getProperty("CodigoUsuarioActivo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoUsuarioActivo = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoUsuarioActivo = (String) obj;
            }
        }
        if (soapObject.hasProperty("CulturaDocumento"))
        {
            Object obj = soapObject.getProperty("CulturaDocumento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                culturaDocumento = j.toString();
            }else if (obj!= null && obj instanceof String){
                culturaDocumento = (String) obj;
            }
        }
        if (soapObject.hasProperty("EsSegundaInspeccion"))
        {
            Object obj = soapObject.getProperty("EsSegundaInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esSegundaInspeccion = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                esSegundaInspeccion = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("EsSegundaInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("EsSegundaInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esSegundaInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                esSegundaInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Etapa"))
        {
            Object obj = soapObject.getProperty("Etapa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                etapa = j.toString();
            }else if (obj!= null && obj instanceof String){
                etapa = (String) obj;
            }
        }
        if (soapObject.hasProperty("Etiqueta"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Etiqueta");
            etiqueta = new VectorEtiqueta(j);
        }
        if (soapObject.hasProperty("FK_IdCentro"))
        {
            Object obj = soapObject.getProperty("FK_IdCentro");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCentro = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCentro = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCentroSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCentroSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCentroSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCentroSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdInspeccionAnterior"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccionAnterior");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccionAnterior = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdInspeccionAnterior = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdInspeccionAnteriorSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccionAnteriorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccionAnteriorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdInspeccionAnteriorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdSolicitudServicio"))
        {
            Object obj = soapObject.getProperty("FK_IdSolicitudServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdSolicitudServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdSolicitudServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdSolicitudServicioSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdSolicitudServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdSolicitudServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdSolicitudServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoEstadoInspeccion"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoEstadoInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoEstadoInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoEstadoInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoEstadoInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoEstadoInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoEstadoInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoEstadoInspeccionSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("FK_IdVehiculo"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdVehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdVehiculoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinValidez"))
        {
            Object obj = soapObject.getProperty("FechaFinValidez");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinValidez = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaFinValidez = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinValidezSpecified"))
        {
            Object obj = soapObject.getProperty("FechaFinValidezSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinValidezSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFinValidezSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinalInspeccion"))
        {
            Object obj = soapObject.getProperty("FechaFinalInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinalInspeccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaFinalInspeccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinalInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FechaFinalInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinalInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFinalInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaInspeccion"))
        {
            Object obj = soapObject.getProperty("FechaInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInspeccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaInspeccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FechaInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaInspeccionSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("IdInspeccion"))
        {
            Object obj = soapObject.getProperty("IdInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("IdInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Inspeccion1"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Inspeccion1");
            inspeccion1 = new VectorInspeccion(j);
        }
        if (soapObject.hasProperty("Inspeccion2"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Inspeccion2");
            inspeccion2 =  new Inspeccion (j);
            
        }
        if (soapObject.hasProperty("InspeccionAlcance"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionAlcance");
            inspeccionAlcance = new VectorInspeccionAlcance(j);
        }
        if (soapObject.hasProperty("InspeccionAlcanceDefecto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionAlcanceDefecto");
            inspeccionAlcanceDefecto = new VectorInspeccionAlcanceDefecto(j);
        }
        if (soapObject.hasProperty("InspeccionAlcancePrueba"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionAlcancePrueba");
            inspeccionAlcancePrueba = new VectorInspeccionAlcancePrueba(j);
        }
        if (soapObject.hasProperty("InspeccionBloqueEstado"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionBloqueEstado");
            inspeccionBloqueEstado = new VectorInspeccionBloqueEstado(j);
        }
        if (soapObject.hasProperty("InspeccionDefecto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionDefecto");
            inspeccionDefecto = new VectorInspeccionDefecto(j);
        }
        if (soapObject.hasProperty("InspeccionDocumento"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionDocumento");
            inspeccionDocumento = new VectorInspeccionDocumento(j);
        }
        if (soapObject.hasProperty("InspeccionFoto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionFoto");
            inspeccionFoto = new VectorInspeccionFoto(j);
        }
        if (soapObject.hasProperty("InspeccionResultadoPrueba"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("InspeccionResultadoPrueba");
            inspeccionResultadoPrueba = new VectorInspeccionResultadoPrueba(j);
        }
        if (soapObject.hasProperty("NotasInternas"))
        {
            Object obj = soapObject.getProperty("NotasInternas");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                notasInternas = j.toString();
            }else if (obj!= null && obj instanceof String){
                notasInternas = (String) obj;
            }
        }
        if (soapObject.hasProperty("NumeroInterno"))
        {
            Object obj = soapObject.getProperty("NumeroInterno");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numeroInterno = j.toString();
            }else if (obj!= null && obj instanceof String){
                numeroInterno = (String) obj;
            }
        }
        if (soapObject.hasProperty("Observaciones"))
        {
            Object obj = soapObject.getProperty("Observaciones");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                observaciones = j.toString();
            }else if (obj!= null && obj instanceof String){
                observaciones = (String) obj;
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
        if (soapObject.hasProperty("Rectificada"))
        {
            Object obj = soapObject.getProperty("Rectificada");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rectificada = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                rectificada = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("RectificadaSpecified"))
        {
            Object obj = soapObject.getProperty("RectificadaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rectificadaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                rectificadaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TieneSegundaInspeccion"))
        {
            Object obj = soapObject.getProperty("TieneSegundaInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tieneSegundaInspeccion = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tieneSegundaInspeccion = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TieneSegundaInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("TieneSegundaInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tieneSegundaInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tieneSegundaInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TipoEstadoInspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoEstadoInspeccion");
            tipoEstadoInspeccion =  new TipoEstadoInspeccion (j);
            
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
                return codigo;
            case 3:
                return codigoUsuarioActivo;
            case 4:
                return culturaDocumento;
            case 5:
                return esSegundaInspeccion;
            case 6:
                return esSegundaInspeccionSpecified;
            case 7:
                return etapa;
            case 8:
                return etiqueta;
            case 9:
                return fK_IdCentro;
            case 10:
                return fK_IdCentroSpecified;
            case 11:
                return fK_IdInspeccionAnterior;
            case 12:
                return fK_IdInspeccionAnteriorSpecified;
            case 13:
                return fK_IdSolicitudServicio;
            case 14:
                return fK_IdSolicitudServicioSpecified;
            case 15:
                return fK_IdTipoEstadoInspeccion;
            case 16:
                return fK_IdTipoEstadoInspeccionSpecified;
            case 17:
                return fK_IdTipoInspeccion;
            case 18:
                return fK_IdTipoInspeccionSpecified;
            case 19:
                return fK_IdTipoResultadoInspeccion;
            case 20:
                return fK_IdTipoResultadoInspeccionSpecified;
            case 21:
                return fK_IdVehiculo;
            case 22:
                return fK_IdVehiculoSpecified;
            case 23:
                return fechaFinValidez;
            case 24:
                return fechaFinValidezSpecified;
            case 25:
                return fechaFinalInspeccion;
            case 26:
                return fechaFinalInspeccionSpecified;
            case 27:
                return fechaInspeccion;
            case 28:
                return fechaInspeccionSpecified;
            case 29:
                return generaFechaValidez;
            case 30:
                return generaFechaValidezSpecified;
            case 31:
                return idInspeccion;
            case 32:
                return idInspeccionSpecified;
            case 33:
                return inspeccion1;
            case 34:
                return inspeccion2;
            case 35:
                return inspeccionAlcance;
            case 36:
                return inspeccionAlcanceDefecto;
            case 37:
                return inspeccionAlcancePrueba;
            case 38:
                return inspeccionBloqueEstado;
            case 39:
                return inspeccionDefecto;
            case 40:
                return inspeccionDocumento;
            case 41:
                return inspeccionFoto;
            case 42:
                return inspeccionResultadoPrueba;
            case 43:
                return notasInternas;
            case 44:
                return numeroInterno;
            case 45:
                return observaciones;
            case 46:
                return publicado;
            case 47:
                return publicadoSpecified;
            case 48:
                return rectificada;
            case 49:
                return rectificadaSpecified;
            case 50:
                return tieneSegundaInspeccion;
            case 51:
                return tieneSegundaInspeccionSpecified;
            case 52:
                return tipoEstadoInspeccion;
            case 53:
                return tipoResultadoInspeccion;
            case 54:
                return fechaModificacion;
            case 55:
                return fechaModificacionSpecified;
            case 56:
                return timestamp.toString();
            case 57:
                return usuarioModificacion;
            case 58:
                return usuarioModificacionSpecified;
            case 59:
                return id;
            case 60:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 61;
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoUsuarioActivo";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CulturaDocumento";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "EsSegundaInspeccion";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "EsSegundaInspeccionSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Etapa";
                break;
            case 8:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Etiqueta";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_IdCentro";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCentroSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "FK_IdInspeccionAnterior";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdInspeccionAnteriorSpecified";
                break;
            case 13:
                info.type = Long.class;
                info.name = "FK_IdSolicitudServicio";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdSolicitudServicioSpecified";
                break;
            case 15:
                info.type = Long.class;
                info.name = "FK_IdTipoEstadoInspeccion";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoEstadoInspeccionSpecified";
                break;
            case 17:
                info.type = Long.class;
                info.name = "FK_IdTipoInspeccion";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoInspeccionSpecified";
                break;
            case 19:
                info.type = Long.class;
                info.name = "FK_IdTipoResultadoInspeccion";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoResultadoInspeccionSpecified";
                break;
            case 21:
                info.type = Long.class;
                info.name = "FK_IdVehiculo";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdVehiculoSpecified";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFinValidez";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinValidezSpecified";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFinalInspeccion";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinalInspeccionSpecified";
                break;
            case 27:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaInspeccion";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaInspeccionSpecified";
                break;
            case 29:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GeneraFechaValidez";
                break;
            case 30:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "GeneraFechaValidezSpecified";
                break;
            case 31:
                info.type = Long.class;
                info.name = "IdInspeccion";
                break;
            case 32:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionSpecified";
                break;
            case 33:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Inspeccion1";
                break;
            case 34:
                info.type = Inspeccion.class;
                info.name = "Inspeccion2";
                break;
            case 35:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionAlcance";
                break;
            case 36:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionAlcanceDefecto";
                break;
            case 37:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionAlcancePrueba";
                break;
            case 38:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionBloqueEstado";
                break;
            case 39:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionDefecto";
                break;
            case 40:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionDocumento";
                break;
            case 41:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionFoto";
                break;
            case 42:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "InspeccionResultadoPrueba";
                break;
            case 43:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NotasInternas";
                break;
            case 44:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumeroInterno";
                break;
            case 45:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Observaciones";
                break;
            case 46:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 47:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 48:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Rectificada";
                break;
            case 49:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "RectificadaSpecified";
                break;
            case 50:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TieneSegundaInspeccion";
                break;
            case 51:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TieneSegundaInspeccionSpecified";
                break;
            case 52:
                info.type = TipoEstadoInspeccion.class;
                info.name = "TipoEstadoInspeccion";
                break;
            case 53:
                info.type = TipoResultadoInspeccion.class;
                info.name = "TipoResultadoInspeccion";
                break;
            case 54:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 55:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 56:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 57:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 58:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 59:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 60:
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
