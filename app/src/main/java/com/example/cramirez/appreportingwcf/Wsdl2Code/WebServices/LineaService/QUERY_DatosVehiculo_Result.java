package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_DatosVehiculo_Result implements KvmSerializable {
    
    public String bastidor;
    public boolean cambioManual;
    public boolean cambioManualSpecified;
    public String codigoVehiculoCodigoInterno;
    public String codigoVehiculoConstruccion;
    public String codigoVehiculoUtilizacion;
    public String combustible;
    public boolean conTurbo;
    public boolean conTurboSpecified;
    public boolean cuatroTiempos;
    public boolean cuatroTiemposSpecified;
    public String descripcionVehiculoCodigoInterno;
    public String descripcionVehiculoConstruccion;
    public String descripcionVehiculoUtilizacion;
    public long fK_IdCombustible;
    public boolean fK_IdCombustibleSpecified;
    public long fK_IdMarcaVehiculo;
    public boolean fK_IdMarcaVehiculoSpecified;
    public long fK_IdModeloVehiculo;
    public boolean fK_IdModeloVehiculoSpecified;
    public long fK_IdTipoMatricula;
    public boolean fK_IdTipoMatriculaSpecified;
    public long fK_IdVehiculoClasificacion;
    public boolean fK_IdVehiculoClasificacionSpecified;
    public String fechaPrimeraMatriculacion;
    public boolean fechaPrimeraMatriculacionSpecified;
    public long idVehiculo;
    public boolean idVehiculoSpecified;
    public int kilometros;
    public boolean kilometrosSpecified;
    public String marcaVehiculo;
    public String matricula;
    public String modeloVehiculo;
    public int numEjes;
    public boolean numEjesSpecified;
    public String tipoMatricula;
    public String titular;
    public String ultimaEstacion;
    public String id;
    public String ref;
    
    public QUERY_DatosVehiculo_Result(){}
    
    public QUERY_DatosVehiculo_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Bastidor"))
        {
            Object obj = soapObject.getProperty("Bastidor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                bastidor = j.toString();
            }else if (obj!= null && obj instanceof String){
                bastidor = (String) obj;
            }
        }
        if (soapObject.hasProperty("CambioManual"))
        {
            Object obj = soapObject.getProperty("CambioManual");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cambioManual = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cambioManual = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("CambioManualSpecified"))
        {
            Object obj = soapObject.getProperty("CambioManualSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cambioManualSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cambioManualSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("CodigoVehiculoCodigoInterno"))
        {
            Object obj = soapObject.getProperty("CodigoVehiculoCodigoInterno");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoVehiculoCodigoInterno = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoVehiculoCodigoInterno = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoVehiculoConstruccion"))
        {
            Object obj = soapObject.getProperty("CodigoVehiculoConstruccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoVehiculoConstruccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoVehiculoConstruccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("CodigoVehiculoUtilizacion"))
        {
            Object obj = soapObject.getProperty("CodigoVehiculoUtilizacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigoVehiculoUtilizacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigoVehiculoUtilizacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("Combustible"))
        {
            Object obj = soapObject.getProperty("Combustible");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                combustible = j.toString();
            }else if (obj!= null && obj instanceof String){
                combustible = (String) obj;
            }
        }
        if (soapObject.hasProperty("ConTurbo"))
        {
            Object obj = soapObject.getProperty("ConTurbo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                conTurbo = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                conTurbo = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ConTurboSpecified"))
        {
            Object obj = soapObject.getProperty("ConTurboSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                conTurboSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                conTurboSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("CuatroTiempos"))
        {
            Object obj = soapObject.getProperty("CuatroTiempos");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cuatroTiempos = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cuatroTiempos = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("CuatroTiemposSpecified"))
        {
            Object obj = soapObject.getProperty("CuatroTiemposSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cuatroTiemposSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cuatroTiemposSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("DescripcionVehiculoCodigoInterno"))
        {
            Object obj = soapObject.getProperty("DescripcionVehiculoCodigoInterno");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionVehiculoCodigoInterno = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionVehiculoCodigoInterno = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescripcionVehiculoConstruccion"))
        {
            Object obj = soapObject.getProperty("DescripcionVehiculoConstruccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionVehiculoConstruccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionVehiculoConstruccion = (String) obj;
            }
        }
        if (soapObject.hasProperty("DescripcionVehiculoUtilizacion"))
        {
            Object obj = soapObject.getProperty("DescripcionVehiculoUtilizacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionVehiculoUtilizacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionVehiculoUtilizacion = (String) obj;
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
        if (soapObject.hasProperty("FK_IdMarcaVehiculo"))
        {
            Object obj = soapObject.getProperty("FK_IdMarcaVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMarcaVehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdMarcaVehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdMarcaVehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdMarcaVehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMarcaVehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdMarcaVehiculoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdModeloVehiculo"))
        {
            Object obj = soapObject.getProperty("FK_IdModeloVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdModeloVehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdModeloVehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdModeloVehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdModeloVehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdModeloVehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdModeloVehiculoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoMatricula"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoMatricula");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoMatricula = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoMatricula = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoMatriculaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoMatriculaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoMatriculaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoMatriculaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoClasificacion"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoClasificacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoClasificacion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdVehiculoClasificacion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdVehiculoClasificacionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdVehiculoClasificacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdVehiculoClasificacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdVehiculoClasificacionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaPrimeraMatriculacion"))
        {
            Object obj = soapObject.getProperty("FechaPrimeraMatriculacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaPrimeraMatriculacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaPrimeraMatriculacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaPrimeraMatriculacionSpecified"))
        {
            Object obj = soapObject.getProperty("FechaPrimeraMatriculacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaPrimeraMatriculacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaPrimeraMatriculacionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdVehiculo"))
        {
            Object obj = soapObject.getProperty("IdVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idVehiculo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idVehiculo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdVehiculoSpecified"))
        {
            Object obj = soapObject.getProperty("IdVehiculoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idVehiculoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idVehiculoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Kilometros"))
        {
            Object obj = soapObject.getProperty("Kilometros");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                kilometros = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                kilometros = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("KilometrosSpecified"))
        {
            Object obj = soapObject.getProperty("KilometrosSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                kilometrosSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                kilometrosSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MarcaVehiculo"))
        {
            Object obj = soapObject.getProperty("MarcaVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                marcaVehiculo = j.toString();
            }else if (obj!= null && obj instanceof String){
                marcaVehiculo = (String) obj;
            }
        }
        if (soapObject.hasProperty("Matricula"))
        {
            Object obj = soapObject.getProperty("Matricula");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                matricula = j.toString();
            }else if (obj!= null && obj instanceof String){
                matricula = (String) obj;
            }
        }
        if (soapObject.hasProperty("ModeloVehiculo"))
        {
            Object obj = soapObject.getProperty("ModeloVehiculo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                modeloVehiculo = j.toString();
            }else if (obj!= null && obj instanceof String){
                modeloVehiculo = (String) obj;
            }
        }
        if (soapObject.hasProperty("NumEjes"))
        {
            Object obj = soapObject.getProperty("NumEjes");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numEjes = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                numEjes = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NumEjesSpecified"))
        {
            Object obj = soapObject.getProperty("NumEjesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numEjesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                numEjesSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("TipoMatricula"))
        {
            Object obj = soapObject.getProperty("TipoMatricula");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tipoMatricula = j.toString();
            }else if (obj!= null && obj instanceof String){
                tipoMatricula = (String) obj;
            }
        }
        if (soapObject.hasProperty("Titular"))
        {
            Object obj = soapObject.getProperty("Titular");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                titular = j.toString();
            }else if (obj!= null && obj instanceof String){
                titular = (String) obj;
            }
        }
        if (soapObject.hasProperty("UltimaEstacion"))
        {
            Object obj = soapObject.getProperty("UltimaEstacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ultimaEstacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                ultimaEstacion = (String) obj;
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
                return bastidor;
            case 1:
                return cambioManual;
            case 2:
                return cambioManualSpecified;
            case 3:
                return codigoVehiculoCodigoInterno;
            case 4:
                return codigoVehiculoConstruccion;
            case 5:
                return codigoVehiculoUtilizacion;
            case 6:
                return combustible;
            case 7:
                return conTurbo;
            case 8:
                return conTurboSpecified;
            case 9:
                return cuatroTiempos;
            case 10:
                return cuatroTiemposSpecified;
            case 11:
                return descripcionVehiculoCodigoInterno;
            case 12:
                return descripcionVehiculoConstruccion;
            case 13:
                return descripcionVehiculoUtilizacion;
            case 14:
                return fK_IdCombustible;
            case 15:
                return fK_IdCombustibleSpecified;
            case 16:
                return fK_IdMarcaVehiculo;
            case 17:
                return fK_IdMarcaVehiculoSpecified;
            case 18:
                return fK_IdModeloVehiculo;
            case 19:
                return fK_IdModeloVehiculoSpecified;
            case 20:
                return fK_IdTipoMatricula;
            case 21:
                return fK_IdTipoMatriculaSpecified;
            case 22:
                return fK_IdVehiculoClasificacion;
            case 23:
                return fK_IdVehiculoClasificacionSpecified;
            case 24:
                return fechaPrimeraMatriculacion;
            case 25:
                return fechaPrimeraMatriculacionSpecified;
            case 26:
                return idVehiculo;
            case 27:
                return idVehiculoSpecified;
            case 28:
                return kilometros;
            case 29:
                return kilometrosSpecified;
            case 30:
                return marcaVehiculo;
            case 31:
                return matricula;
            case 32:
                return modeloVehiculo;
            case 33:
                return numEjes;
            case 34:
                return numEjesSpecified;
            case 35:
                return tipoMatricula;
            case 36:
                return titular;
            case 37:
                return ultimaEstacion;
            case 38:
                return id;
            case 39:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 40;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Bastidor";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CambioManual";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CambioManualSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoVehiculoCodigoInterno";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoVehiculoConstruccion";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CodigoVehiculoUtilizacion";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Combustible";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ConTurbo";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ConTurboSpecified";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CuatroTiempos";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CuatroTiemposSpecified";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionVehiculoCodigoInterno";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionVehiculoConstruccion";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescripcionVehiculoUtilizacion";
                break;
            case 14:
                info.type = Long.class;
                info.name = "FK_IdCombustible";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCombustibleSpecified";
                break;
            case 16:
                info.type = Long.class;
                info.name = "FK_IdMarcaVehiculo";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdMarcaVehiculoSpecified";
                break;
            case 18:
                info.type = Long.class;
                info.name = "FK_IdModeloVehiculo";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdModeloVehiculoSpecified";
                break;
            case 20:
                info.type = Long.class;
                info.name = "FK_IdTipoMatricula";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoMatriculaSpecified";
                break;
            case 22:
                info.type = Long.class;
                info.name = "FK_IdVehiculoClasificacion";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdVehiculoClasificacionSpecified";
                break;
            case 24:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaPrimeraMatriculacion";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaPrimeraMatriculacionSpecified";
                break;
            case 26:
                info.type = Long.class;
                info.name = "IdVehiculo";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdVehiculoSpecified";
                break;
            case 28:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Kilometros";
                break;
            case 29:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "KilometrosSpecified";
                break;
            case 30:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MarcaVehiculo";
                break;
            case 31:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Matricula";
                break;
            case 32:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ModeloVehiculo";
                break;
            case 33:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "NumEjes";
                break;
            case 34:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NumEjesSpecified";
                break;
            case 35:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "TipoMatricula";
                break;
            case 36:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Titular";
                break;
            case 37:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "UltimaEstacion";
                break;
            case 38:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 39:
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
