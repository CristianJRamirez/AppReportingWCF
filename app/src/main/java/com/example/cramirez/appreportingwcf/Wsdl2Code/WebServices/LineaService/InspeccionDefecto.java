package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Etapa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Inspeccion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoInspeccionDefecto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class InspeccionDefecto implements KvmSerializable {
    
    public boolean borrado;
    public boolean borradoSpecified;
    public boolean defectoPrueba;
    public boolean defectoPruebaSpecified;
    public Etapa etapa;
    public long fK_IdBloque;
    public boolean fK_IdBloqueSpecified;
    public long fK_IdDefecto;
    public boolean fK_IdDefectoSpecified;
    public long fK_IdEtapa;
    public boolean fK_IdEtapaSpecified;
    public long fK_IdInspeccion;
    public boolean fK_IdInspeccionSpecified;
    public long fK_IdTipoInspeccionDefecto;
    public boolean fK_IdTipoInspeccionDefectoSpecified;
    public long fK_IdTipoInspeccionDefectoOriginal;
    public boolean fK_IdTipoInspeccionDefectoOriginalSpecified;
    public long idInspeccionDefecto;
    public boolean idInspeccionDefectoSpecified;
    public Inspeccion inspeccion;
    public String localizaciones;
    public String observaciones;
    public boolean pendiente;
    public boolean pendienteSpecified;
    public boolean pendienteTipoInspeccionDefecto;
    public boolean pendienteTipoInspeccionDefectoSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public TipoInspeccionDefecto tipoInspeccionDefecto;
    public TipoInspeccionDefecto tipoInspeccionDefecto1;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public InspeccionDefecto(){}
    
    public InspeccionDefecto(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Borrado"))
        {
            Object obj = soapObject.getProperty("Borrado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                borrado = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                borrado = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("BorradoSpecified"))
        {
            Object obj = soapObject.getProperty("BorradoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                borradoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                borradoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("DefectoPrueba"))
        {
            Object obj = soapObject.getProperty("DefectoPrueba");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defectoPrueba = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                defectoPrueba = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("DefectoPruebaSpecified"))
        {
            Object obj = soapObject.getProperty("DefectoPruebaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defectoPruebaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                defectoPruebaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Etapa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Etapa");
            etapa =  new Etapa (j);
            
        }
        if (soapObject.hasProperty("FK_IdBloque"))
        {
            Object obj = soapObject.getProperty("FK_IdBloque");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdBloque = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdBloque = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdBloqueSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdBloqueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdBloqueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdBloqueSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdDefecto"))
        {
            Object obj = soapObject.getProperty("FK_IdDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdEtapa"))
        {
            Object obj = soapObject.getProperty("FK_IdEtapa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEtapa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdEtapa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdEtapaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdEtapaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdEtapaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdEtapaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdInspeccion"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdInspeccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdInspeccionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdInspeccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdInspeccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdInspeccionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoInspeccionDefecto"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoInspeccionDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoInspeccionDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoInspeccionDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoInspeccionDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoInspeccionDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoInspeccionDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoInspeccionDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoInspeccionDefectoOriginal"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoInspeccionDefectoOriginal");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoInspeccionDefectoOriginal = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoInspeccionDefectoOriginal = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoInspeccionDefectoOriginalSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoInspeccionDefectoOriginalSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoInspeccionDefectoOriginalSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoInspeccionDefectoOriginalSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionDefecto"))
        {
            Object obj = soapObject.getProperty("IdInspeccionDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idInspeccionDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdInspeccionDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("IdInspeccionDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idInspeccionDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idInspeccionDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Inspeccion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Inspeccion");
            inspeccion =  new Inspeccion (j);
            
        }
        if (soapObject.hasProperty("Localizaciones"))
        {
            Object obj = soapObject.getProperty("Localizaciones");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                localizaciones = j.toString();
            }else if (obj!= null && obj instanceof String){
                localizaciones = (String) obj;
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
        if (soapObject.hasProperty("Pendiente"))
        {
            Object obj = soapObject.getProperty("Pendiente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pendiente = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pendiente = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PendienteSpecified"))
        {
            Object obj = soapObject.getProperty("PendienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pendienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pendienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PendienteTipoInspeccionDefecto"))
        {
            Object obj = soapObject.getProperty("PendienteTipoInspeccionDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pendienteTipoInspeccionDefecto = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pendienteTipoInspeccionDefecto = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PendienteTipoInspeccionDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("PendienteTipoInspeccionDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pendienteTipoInspeccionDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pendienteTipoInspeccionDefectoSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("TipoInspeccionDefecto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoInspeccionDefecto");
            tipoInspeccionDefecto =  new TipoInspeccionDefecto (j);
            
        }
        if (soapObject.hasProperty("TipoInspeccionDefecto1"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoInspeccionDefecto1");
            tipoInspeccionDefecto1 =  new TipoInspeccionDefecto (j);
            
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
                return borrado;
            case 1:
                return borradoSpecified;
            case 2:
                return defectoPrueba;
            case 3:
                return defectoPruebaSpecified;
            case 4:
                return etapa;
            case 5:
                return fK_IdBloque;
            case 6:
                return fK_IdBloqueSpecified;
            case 7:
                return fK_IdDefecto;
            case 8:
                return fK_IdDefectoSpecified;
            case 9:
                return fK_IdEtapa;
            case 10:
                return fK_IdEtapaSpecified;
            case 11:
                return fK_IdInspeccion;
            case 12:
                return fK_IdInspeccionSpecified;
            case 13:
                return fK_IdTipoInspeccionDefecto;
            case 14:
                return fK_IdTipoInspeccionDefectoSpecified;
            case 15:
                return fK_IdTipoInspeccionDefectoOriginal;
            case 16:
                return fK_IdTipoInspeccionDefectoOriginalSpecified;
            case 17:
                return idInspeccionDefecto;
            case 18:
                return idInspeccionDefectoSpecified;
            case 19:
                return inspeccion;
            case 20:
                return localizaciones;
            case 21:
                return observaciones;
            case 22:
                return pendiente;
            case 23:
                return pendienteSpecified;
            case 24:
                return pendienteTipoInspeccionDefecto;
            case 25:
                return pendienteTipoInspeccionDefectoSpecified;
            case 26:
                return publicado;
            case 27:
                return publicadoSpecified;
            case 28:
                return tipoInspeccionDefecto;
            case 29:
                return tipoInspeccionDefecto1;
            case 30:
                return fechaModificacion;
            case 31:
                return fechaModificacionSpecified;
            case 32:
                return timestamp.toString();
            case 33:
                return usuarioModificacion;
            case 34:
                return usuarioModificacionSpecified;
            case 35:
                return id;
            case 36:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 37;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Borrado";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "BorradoSpecified";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DefectoPrueba";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DefectoPruebaSpecified";
                break;
            case 4:
                info.type = Etapa.class;
                info.name = "Etapa";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdBloque";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdBloqueSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "FK_IdDefecto";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdDefectoSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_IdEtapa";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdEtapaSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "FK_IdInspeccion";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdInspeccionSpecified";
                break;
            case 13:
                info.type = Long.class;
                info.name = "FK_IdTipoInspeccionDefecto";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoInspeccionDefectoSpecified";
                break;
            case 15:
                info.type = Long.class;
                info.name = "FK_IdTipoInspeccionDefectoOriginal";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoInspeccionDefectoOriginalSpecified";
                break;
            case 17:
                info.type = Long.class;
                info.name = "IdInspeccionDefecto";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdInspeccionDefectoSpecified";
                break;
            case 19:
                info.type = Inspeccion.class;
                info.name = "Inspeccion";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Localizaciones";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Observaciones";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Pendiente";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PendienteSpecified";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PendienteTipoInspeccionDefecto";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PendienteTipoInspeccionDefectoSpecified";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 28:
                info.type = TipoInspeccionDefecto.class;
                info.name = "TipoInspeccionDefecto";
                break;
            case 29:
                info.type = TipoInspeccionDefecto.class;
                info.name = "TipoInspeccionDefecto1";
                break;
            case 30:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 31:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 32:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 33:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 34:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 35:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 36:
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
