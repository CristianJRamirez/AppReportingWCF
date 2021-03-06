package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoServicioCalculo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorGrupoServicio_Servicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoGrupoServicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class GrupoServicio implements KvmSerializable {
    
    public Autonomia autonomia;
    public long calculoDentroGrupo;
    public boolean calculoDentroGrupoSpecified;
    public long calculoEntreGrupos;
    public boolean calculoEntreGruposSpecified;
    public String descripcion;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdTipoGrupoServicio;
    public boolean fK_IdTipoGrupoServicioSpecified;
    public String fechaFVigencia;
    public boolean fechaFVigenciaSpecified;
    public String fechaIVigencia;
    public boolean fechaIVigenciaSpecified;
    public VectorGrupoServicioCalculo grupoServicioCalculo;
    public VectorGrupoServicio_Servicio grupoServicio_Servicio;
    public long idGrupoServicio;
    public boolean idGrupoServicioSpecified;
    public int ordenVisionado;
    public boolean ordenVisionadoSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public TipoGrupoServicio tipoGrupoServicio;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public GrupoServicio(){}
    
    public GrupoServicio(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Autonomia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Autonomia");
            autonomia =  new Autonomia (j);
            
        }
        if (soapObject.hasProperty("CalculoDentroGrupo"))
        {
            Object obj = soapObject.getProperty("CalculoDentroGrupo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                calculoDentroGrupo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                calculoDentroGrupo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CalculoDentroGrupoSpecified"))
        {
            Object obj = soapObject.getProperty("CalculoDentroGrupoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                calculoDentroGrupoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                calculoDentroGrupoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("CalculoEntreGrupos"))
        {
            Object obj = soapObject.getProperty("CalculoEntreGrupos");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                calculoEntreGrupos = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                calculoEntreGrupos = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CalculoEntreGruposSpecified"))
        {
            Object obj = soapObject.getProperty("CalculoEntreGruposSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                calculoEntreGruposSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                calculoEntreGruposSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("FK_IdTipoGrupoServicio"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoGrupoServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoGrupoServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoGrupoServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoGrupoServicioSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoGrupoServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoGrupoServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoGrupoServicioSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("GrupoServicioCalculo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoServicioCalculo");
            grupoServicioCalculo = new VectorGrupoServicioCalculo(j);
        }
        if (soapObject.hasProperty("GrupoServicio_Servicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoServicio_Servicio");
            grupoServicio_Servicio = new VectorGrupoServicio_Servicio(j);
        }
        if (soapObject.hasProperty("IdGrupoServicio"))
        {
            Object obj = soapObject.getProperty("IdGrupoServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idGrupoServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdGrupoServicioSpecified"))
        {
            Object obj = soapObject.getProperty("IdGrupoServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGrupoServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idGrupoServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("OrdenVisionado"))
        {
            Object obj = soapObject.getProperty("OrdenVisionado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ordenVisionado = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                ordenVisionado = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("OrdenVisionadoSpecified"))
        {
            Object obj = soapObject.getProperty("OrdenVisionadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ordenVisionadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                ordenVisionadoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("TipoGrupoServicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoGrupoServicio");
            tipoGrupoServicio =  new TipoGrupoServicio (j);
            
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
                return calculoDentroGrupo;
            case 2:
                return calculoDentroGrupoSpecified;
            case 3:
                return calculoEntreGrupos;
            case 4:
                return calculoEntreGruposSpecified;
            case 5:
                return descripcion;
            case 6:
                return fK_IdAutonomia;
            case 7:
                return fK_IdAutonomiaSpecified;
            case 8:
                return fK_IdTipoGrupoServicio;
            case 9:
                return fK_IdTipoGrupoServicioSpecified;
            case 10:
                return fechaFVigencia;
            case 11:
                return fechaFVigenciaSpecified;
            case 12:
                return fechaIVigencia;
            case 13:
                return fechaIVigenciaSpecified;
            case 14:
                return grupoServicioCalculo;
            case 15:
                return grupoServicio_Servicio;
            case 16:
                return idGrupoServicio;
            case 17:
                return idGrupoServicioSpecified;
            case 18:
                return ordenVisionado;
            case 19:
                return ordenVisionadoSpecified;
            case 20:
                return publicado;
            case 21:
                return publicadoSpecified;
            case 22:
                return tipoGrupoServicio;
            case 23:
                return fechaModificacion;
            case 24:
                return fechaModificacionSpecified;
            case 25:
                return timestamp.toString();
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
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 1:
                info.type = Long.class;
                info.name = "CalculoDentroGrupo";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CalculoDentroGrupoSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "CalculoEntreGrupos";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CalculoEntreGruposSpecified";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdAutonomia";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdAutonomiaSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "FK_IdTipoGrupoServicio";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoGrupoServicioSpecified";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFVigencia";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFVigenciaSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIVigencia";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIVigenciaSpecified";
                break;
            case 14:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoServicioCalculo";
                break;
            case 15:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "GrupoServicio_Servicio";
                break;
            case 16:
                info.type = Long.class;
                info.name = "IdGrupoServicio";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdGrupoServicioSpecified";
                break;
            case 18:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "OrdenVisionado";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "OrdenVisionadoSpecified";
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
                info.type = TipoGrupoServicio.class;
                info.name = "TipoGrupoServicio";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
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
