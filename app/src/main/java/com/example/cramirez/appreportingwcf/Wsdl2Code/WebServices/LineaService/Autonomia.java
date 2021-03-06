package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorCategoria_Valor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorCentro;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorCombustible;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorCuentaContable;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorDivisa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoCentro;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoCentro_Centro;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoImpuesto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoRecargo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoRecargo_Tarifa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoServicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoServicio_Servicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoTarifa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoTarifa_Vehiculo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorHojaDeCampo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorImpuesto_Valor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorRecargosAplicacion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorRedondeo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio_HojadeCampo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio_LinksInformativos;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorServicio_TipoValor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTarifa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTipoAplicacion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTipoCliente;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTipoCuentaContable;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTipoGrupoServicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTipoInspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTipoValor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorVehiculoClasificacion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorVehiculoCodigoInterno;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorVehiculoConstruccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorVehiculoTipoFicha;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorVehiculoUtilizacion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorVigenciaCuentaContable;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Autonomia implements KvmSerializable {
    
    public VectorCategoria_Valor categoria_Valor;
    public VectorCentro centro;
    public VectorCombustible combustible;
    public VectorCuentaContable cuentaContable;
    public String descripcion;
    public VectorDivisa divisa;
    public String fechaFVigencia;
    public boolean fechaFVigenciaSpecified;
    public String fechaIVigencia;
    public boolean fechaIVigenciaSpecified;
    public VectorGrupoCentro grupoCentro;
    public VectorGrupoCentro_Centro grupoCentro_Centro;
    public VectorGrupoImpuesto grupoImpuesto;
    public VectorGrupoRecargo grupoRecargo;
    public VectorGrupoRecargo_Tarifa grupoRecargo_Tarifa;
    public VectorGrupoServicio grupoServicio;
    public VectorGrupoServicio_Servicio grupoServicio_Servicio;
    public VectorGrupoTarifa grupoTarifa;
    public VectorGrupoTarifa_Vehiculo grupoTarifa_Vehiculo;
    public VectorHojaDeCampo hojaDeCampo;
    public long idAutonomia;
    public boolean idAutonomiaSpecified;
    public VectorImpuesto_Valor impuesto_Valor;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorRecargosAplicacion recargosAplicacion;
    public VectorRedondeo redondeo;
    public VectorServicio servicio;
    public VectorServicio_HojadeCampo servicio_HojadeCampo;
    public VectorServicio_LinksInformativos servicio_LinksInformativos;
    public VectorServicio_TipoValor servicio_TipoValor;
    public VectorTarifa tarifa;
    public VectorTipoAplicacion tipoAplicacion;
    public VectorTipoCliente tipoCliente;
    public VectorTipoCuentaContable tipoCuentaContable;
    public VectorTipoGrupoServicio tipoGrupoServicio;
    public VectorTipoInspeccion tipoInspeccion;
    public VectorTipoValor tipoValor;
    public VectorVehiculoClasificacion vehiculoClasificacion;
    public VectorVehiculoCodigoInterno vehiculoCodigoInterno;
    public VectorVehiculoConstruccion vehiculoConstruccion;
    public VectorVehiculoTipoFicha vehiculoTipoFicha;
    public VectorVehiculoUtilizacion vehiculoUtilizacion;
    public VectorVigenciaCuentaContable vigenciaCuentaContable;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Autonomia(){}
    
    public Autonomia(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Categoria_Valor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Categoria_Valor");
            categoria_Valor = new VectorCategoria_Valor(j);
        }
        if (soapObject.hasProperty("Centro"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Centro");
            centro = new VectorCentro(j);
        }
        if (soapObject.hasProperty("Combustible"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Combustible");
            combustible = new VectorCombustible(j);
        }
        if (soapObject.hasProperty("CuentaContable"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("CuentaContable");
            cuentaContable = new VectorCuentaContable(j);
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
            divisa = new VectorDivisa(j);
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
        if (soapObject.hasProperty("GrupoCentro"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoCentro");
            grupoCentro = new VectorGrupoCentro(j);
        }
        if (soapObject.hasProperty("GrupoCentro_Centro"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoCentro_Centro");
            grupoCentro_Centro = new VectorGrupoCentro_Centro(j);
        }
        if (soapObject.hasProperty("GrupoImpuesto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoImpuesto");
            grupoImpuesto = new VectorGrupoImpuesto(j);
        }
        if (soapObject.hasProperty("GrupoRecargo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoRecargo");
            grupoRecargo = new VectorGrupoRecargo(j);
        }
        if (soapObject.hasProperty("GrupoRecargo_Tarifa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoRecargo_Tarifa");
            grupoRecargo_Tarifa = new VectorGrupoRecargo_Tarifa(j);
        }
        if (soapObject.hasProperty("GrupoServicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoServicio");
            grupoServicio = new VectorGrupoServicio(j);
        }
        if (soapObject.hasProperty("GrupoServicio_Servicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoServicio_Servicio");
            grupoServicio_Servicio = new VectorGrupoServicio_Servicio(j);
        }
        if (soapObject.hasProperty("GrupoTarifa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoTarifa");
            grupoTarifa = new VectorGrupoTarifa(j);
        }
        if (soapObject.hasProperty("GrupoTarifa_Vehiculo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoTarifa_Vehiculo");
            grupoTarifa_Vehiculo = new VectorGrupoTarifa_Vehiculo(j);
        }
        if (soapObject.hasProperty("HojaDeCampo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("HojaDeCampo");
            hojaDeCampo = new VectorHojaDeCampo(j);
        }
        if (soapObject.hasProperty("IdAutonomia"))
        {
            Object obj = soapObject.getProperty("IdAutonomia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idAutonomia = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idAutonomia = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdAutonomiaSpecified"))
        {
            Object obj = soapObject.getProperty("IdAutonomiaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idAutonomiaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idAutonomiaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Impuesto_Valor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Impuesto_Valor");
            impuesto_Valor = new VectorImpuesto_Valor(j);
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
        if (soapObject.hasProperty("Redondeo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Redondeo");
            redondeo = new VectorRedondeo(j);
        }
        if (soapObject.hasProperty("Servicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Servicio");
            servicio = new VectorServicio(j);
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
        if (soapObject.hasProperty("Tarifa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Tarifa");
            tarifa = new VectorTarifa(j);
        }
        if (soapObject.hasProperty("TipoAplicacion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoAplicacion");
            tipoAplicacion = new VectorTipoAplicacion(j);
        }
        if (soapObject.hasProperty("TipoCliente"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoCliente");
            tipoCliente = new VectorTipoCliente(j);
        }
        if (soapObject.hasProperty("TipoCuentaContable"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoCuentaContable");
            tipoCuentaContable = new VectorTipoCuentaContable(j);
        }
        if (soapObject.hasProperty("TipoGrupoServicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoGrupoServicio");
            tipoGrupoServicio = new VectorTipoGrupoServicio(j);
        }
        if (soapObject.hasProperty("TipoInspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoInspeccion");
            tipoInspeccion = new VectorTipoInspeccion(j);
        }
        if (soapObject.hasProperty("TipoValor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoValor");
            tipoValor = new VectorTipoValor(j);
        }
        if (soapObject.hasProperty("VehiculoClasificacion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoClasificacion");
            vehiculoClasificacion = new VectorVehiculoClasificacion(j);
        }
        if (soapObject.hasProperty("VehiculoCodigoInterno"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoCodigoInterno");
            vehiculoCodigoInterno = new VectorVehiculoCodigoInterno(j);
        }
        if (soapObject.hasProperty("VehiculoConstruccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoConstruccion");
            vehiculoConstruccion = new VectorVehiculoConstruccion(j);
        }
        if (soapObject.hasProperty("VehiculoTipoFicha"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoTipoFicha");
            vehiculoTipoFicha = new VectorVehiculoTipoFicha(j);
        }
        if (soapObject.hasProperty("VehiculoUtilizacion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VehiculoUtilizacion");
            vehiculoUtilizacion = new VectorVehiculoUtilizacion(j);
        }
        if (soapObject.hasProperty("VigenciaCuentaContable"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("VigenciaCuentaContable");
            vigenciaCuentaContable = new VectorVigenciaCuentaContable(j);
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
                return categoria_Valor;
            case 1:
                return centro;
            case 2:
                return combustible;
            case 3:
                return cuentaContable;
            case 4:
                return descripcion;
            case 5:
                return divisa;
            case 6:
                return fechaFVigencia;
            case 7:
                return fechaFVigenciaSpecified;
            case 8:
                return fechaIVigencia;
            case 9:
                return fechaIVigenciaSpecified;
            case 10:
                return grupoCentro;
            case 11:
                return grupoCentro_Centro;
            case 12:
                return grupoImpuesto;
            case 13:
                return grupoRecargo;
            case 14:
                return grupoRecargo_Tarifa;
            case 15:
                return grupoServicio;
            case 16:
                return grupoServicio_Servicio;
            case 17:
                return grupoTarifa;
            case 18:
                return grupoTarifa_Vehiculo;
            case 19:
                return hojaDeCampo;
            case 20:
                return idAutonomia;
            case 21:
                return idAutonomiaSpecified;
            case 22:
                return impuesto_Valor;
            case 23:
                return publicado;
            case 24:
                return publicadoSpecified;
            case 25:
                return recargosAplicacion;
            case 26:
                return redondeo;
            case 27:
                return servicio;
            case 28:
                return servicio_HojadeCampo;
            case 29:
                return servicio_LinksInformativos;
            case 30:
                return servicio_TipoValor;
            case 31:
                return tarifa;
            case 32:
                return tipoAplicacion;
            case 33:
                return tipoCliente;
            case 34:
                return tipoCuentaContable;
            case 35:
                return tipoGrupoServicio;
            case 36:
                return tipoInspeccion;
            case 37:
                return tipoValor;
            case 38:
                return vehiculoClasificacion;
            case 39:
                return vehiculoCodigoInterno;
            case 40:
                return vehiculoConstruccion;
            case 41:
                return vehiculoTipoFicha;
            case 42:
                return vehiculoUtilizacion;
            case 43:
                return vigenciaCuentaContable;
            case 44:
                return fechaModificacion;
            case 45:
                return fechaModificacionSpecified;
            case 46:
                return timestamp.toString();
            case 47:
                return usuarioModificacion;
            case 48:
                return usuarioModificacionSpecified;
            case 49:
                return id;
            case 50:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 51;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Categoria_Valor";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Centro";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Combustible";
                break;
            case 3:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "CuentaContable";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 5:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Divisa";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFVigencia";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFVigenciaSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIVigencia";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIVigenciaSpecified";
                break;
            case 10:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoCentro";
                break;
            case 11:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoCentro_Centro";
                break;
            case 12:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoImpuesto";
                break;
            case 13:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoRecargo";
                break;
            case 14:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoRecargo_Tarifa";
                break;
            case 15:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoServicio";
                break;
            case 16:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoServicio_Servicio";
                break;
            case 17:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoTarifa";
                break;
            case 18:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoTarifa_Vehiculo";
                break;
            case 19:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "HojaDeCampo";
                break;
            case 20:
                info.type = Long.class;
                info.name = "IdAutonomia";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdAutonomiaSpecified";
                break;
            case 22:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Impuesto_Valor";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 25:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "RecargosAplicacion";
                break;
            case 26:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Redondeo";
                break;
            case 27:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio";
                break;
            case 28:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio_HojadeCampo";
                break;
            case 29:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio_LinksInformativos";
                break;
            case 30:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Servicio_TipoValor";
                break;
            case 31:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Tarifa";
                break;
            case 32:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "TipoAplicacion";
                break;
            case 33:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "TipoCliente";
                break;
            case 34:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "TipoCuentaContable";
                break;
            case 35:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "TipoGrupoServicio";
                break;
            case 36:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "TipoInspeccion";
                break;
            case 37:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "TipoValor";
                break;
            case 38:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "VehiculoClasificacion";
                break;
            case 39:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "VehiculoCodigoInterno";
                break;
            case 40:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "VehiculoConstruccion";
                break;
            case 41:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "VehiculoTipoFicha";
                break;
            case 42:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "VehiculoUtilizacion";
                break;
            case 43:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "VigenciaCuentaContable";
                break;
            case 44:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 45:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 46:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 47:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 48:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 49:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 50:
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
