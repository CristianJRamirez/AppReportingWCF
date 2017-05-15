package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService;
//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 5/15/2017 9:13:05 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.FichaTecnicaCopiaServicioTexto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class FichaTecnicaCopiaServicio implements KvmSerializable {
    
    public String bandejaImpresora;
    public long fK_IdFichaTecnicaCopiaServicioTexto;
    public boolean fK_IdFichaTecnicaCopiaServicioTextoSpecified;
    public long fK_IdGrupoServicio;
    public boolean fK_IdGrupoServicioSpecified;
    public String fechaFinValidez;
    public boolean fechaFinValidezSpecified;
    public String fechaIniValidez;
    public boolean fechaIniValidezSpecified;
    public FichaTecnicaCopiaServicioTexto fichaTecnicaCopiaServicioTexto;
    public long idFichaTecnicaCopiaServicio;
    public boolean idFichaTecnicaCopiaServicioSpecified;
    public String impresora;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String tipoFicha;
    public boolean esBorrador;
    public boolean esBorradorSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public String nomRPT;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public FichaTecnicaCopiaServicio(){}
    
    public FichaTecnicaCopiaServicio(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("BandejaImpresora"))
        {
            Object obj = soapObject.getProperty("BandejaImpresora");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                bandejaImpresora = j.toString();
            }else if (obj!= null && obj instanceof String){
                bandejaImpresora = (String) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdFichaTecnicaCopiaServicioTexto"))
        {
            Object obj = soapObject.getProperty("FK_IdFichaTecnicaCopiaServicioTexto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdFichaTecnicaCopiaServicioTexto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdFichaTecnicaCopiaServicioTexto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdFichaTecnicaCopiaServicioTextoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdFichaTecnicaCopiaServicioTextoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdFichaTecnicaCopiaServicioTextoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdFichaTecnicaCopiaServicioTextoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoServicio"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoServicioSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoServicioSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("FechaIniValidez"))
        {
            Object obj = soapObject.getProperty("FechaIniValidez");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIniValidez = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaIniValidez = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaIniValidezSpecified"))
        {
            Object obj = soapObject.getProperty("FechaIniValidezSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIniValidezSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaIniValidezSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FichaTecnicaCopiaServicioTexto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("FichaTecnicaCopiaServicioTexto");
            fichaTecnicaCopiaServicioTexto =  new FichaTecnicaCopiaServicioTexto (j);
            
        }
        if (soapObject.hasProperty("IdFichaTecnicaCopiaServicio"))
        {
            Object obj = soapObject.getProperty("IdFichaTecnicaCopiaServicio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idFichaTecnicaCopiaServicio = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idFichaTecnicaCopiaServicio = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdFichaTecnicaCopiaServicioSpecified"))
        {
            Object obj = soapObject.getProperty("IdFichaTecnicaCopiaServicioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idFichaTecnicaCopiaServicioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idFichaTecnicaCopiaServicioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Impresora"))
        {
            Object obj = soapObject.getProperty("Impresora");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                impresora = j.toString();
            }else if (obj!= null && obj instanceof String){
                impresora = (String) obj;
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
        if (soapObject.hasProperty("TipoFicha"))
        {
            Object obj = soapObject.getProperty("TipoFicha");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tipoFicha = j.toString();
            }else if (obj!= null && obj instanceof String){
                tipoFicha = (String) obj;
            }
        }
        if (soapObject.hasProperty("esBorrador"))
        {
            Object obj = soapObject.getProperty("esBorrador");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esBorrador = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                esBorrador = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("esBorradorSpecified"))
        {
            Object obj = soapObject.getProperty("esBorradorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esBorradorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                esBorradorSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("nomRPT"))
        {
            Object obj = soapObject.getProperty("nomRPT");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nomRPT = j.toString();
            }else if (obj!= null && obj instanceof String){
                nomRPT = (String) obj;
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
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return bandejaImpresora;
            case 1:
                return fK_IdFichaTecnicaCopiaServicioTexto;
            case 2:
                return fK_IdFichaTecnicaCopiaServicioTextoSpecified;
            case 3:
                return fK_IdGrupoServicio;
            case 4:
                return fK_IdGrupoServicioSpecified;
            case 5:
                return fechaFinValidez;
            case 6:
                return fechaFinValidezSpecified;
            case 7:
                return fechaIniValidez;
            case 8:
                return fechaIniValidezSpecified;
            case 9:
                return fichaTecnicaCopiaServicioTexto;
            case 10:
                return idFichaTecnicaCopiaServicio;
            case 11:
                return idFichaTecnicaCopiaServicioSpecified;
            case 12:
                return impresora;
            case 13:
                return publicado;
            case 14:
                return publicadoSpecified;
            case 15:
                return tipoFicha;
            case 16:
                return esBorrador;
            case 17:
                return esBorradorSpecified;
            case 18:
                return fechaModificacion;
            case 19:
                return fechaModificacionSpecified;
            case 20:
                return nomRPT;
            case 21:
                return timestamp.toString();
            case 22:
                return usuarioModificacion;
            case 23:
                return usuarioModificacionSpecified;
            case 24:
                return id;
            case 25:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 26;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "BandejaImpresora";
                break;
            case 1:
                info.type = Long.class;
                info.name = "FK_IdFichaTecnicaCopiaServicioTexto";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdFichaTecnicaCopiaServicioTextoSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdGrupoServicio";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoServicioSpecified";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFinValidez";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinValidezSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIniValidez";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIniValidezSpecified";
                break;
            case 9:
                info.type = FichaTecnicaCopiaServicioTexto.class;
                info.name = "FichaTecnicaCopiaServicioTexto";
                break;
            case 10:
                info.type = Long.class;
                info.name = "IdFichaTecnicaCopiaServicio";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdFichaTecnicaCopiaServicioSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Impresora";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "TipoFicha";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "esBorrador";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "esBorradorSpecified";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "nomRPT";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 22:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 24:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
