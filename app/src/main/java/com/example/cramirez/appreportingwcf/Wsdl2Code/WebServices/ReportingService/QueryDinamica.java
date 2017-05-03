package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.ReportingService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 4/25/2017 7:43:53 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QueryDinamica implements KvmSerializable {
    
    public String descripcion;
    public String esquema;
    public long idQueryDinamica;
    public boolean idQueryDinamicaSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String query;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public long idOpcion;
    public boolean idOpcionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public QueryDinamica(){}
    
    public QueryDinamica(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("Esquema"))
        {
            Object obj = soapObject.getProperty("Esquema");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esquema = j.toString();
            }else if (obj!= null && obj instanceof String){
                esquema = (String) obj;
            }
        }
        if (soapObject.hasProperty("IdQueryDinamica"))
        {
            Object obj = soapObject.getProperty("IdQueryDinamica");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idQueryDinamica = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idQueryDinamica = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdQueryDinamicaSpecified"))
        {
            Object obj = soapObject.getProperty("IdQueryDinamicaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idQueryDinamicaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idQueryDinamicaSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Query"))
        {
            Object obj = soapObject.getProperty("Query");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                query = j.toString();
            }else if (obj!= null && obj instanceof String){
                query = (String) obj;
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
        if (soapObject.hasProperty("idOpcion"))
        {
            Object obj = soapObject.getProperty("idOpcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idOpcion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idOpcion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idOpcionSpecified"))
        {
            Object obj = soapObject.getProperty("idOpcionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idOpcionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idOpcionSpecified = (Boolean) obj;
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
                return descripcion;
            case 1:
                return esquema;
            case 2:
                return idQueryDinamica;
            case 3:
                return idQueryDinamicaSpecified;
            case 4:
                return publicado;
            case 5:
                return publicadoSpecified;
            case 6:
                return query;
            case 7:
                return fechaModificacion;
            case 8:
                return fechaModificacionSpecified;
            case 9:
                return idOpcion;
            case 10:
                return idOpcionSpecified;
            case 11:
                return timestamp.toString();
            case 12:
                return usuarioModificacion;
            case 13:
                return usuarioModificacionSpecified;
            case 14:
                return id;
            case 15:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 16;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Esquema";
                break;
            case 2:
                info.type = Long.class;
                info.name = "IdQueryDinamica";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdQueryDinamicaSpecified";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Query";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "idOpcion";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idOpcionSpecified";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 12:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}