package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_DefectosBloques_Result implements KvmSerializable {
    
    public String apartadoCodigo;
    public String apartadoDescripcion;
    public String bloqueCodigo;
    public String bloqueDescripcion;
    public String capituloCodigo;
    public String capituloDescripcion;
    public String defectoCodigo;
    public String defectoDescripcion;
    public String defectoDocumento;
    public String gravedadDefectoCodigo;
    public String gravedadDefectoDescripcion;
    public long idDefecto;
    public boolean idDefectoSpecified;
    public long idGravedadDefecto;
    public boolean idGravedadDefectoSpecified;
    public long idApartado;
    public boolean idApartadoSpecified;
    public long idBloque;
    public boolean idBloqueSpecified;
    public long idCapitulo;
    public boolean idCapituloSpecified;
    public String id;
    public String ref;
    
    public QUERY_DefectosBloques_Result(){}
    
    public QUERY_DefectosBloques_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("ApartadoCodigo"))
        {
            Object obj = soapObject.getProperty("ApartadoCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                apartadoCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                apartadoCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("ApartadoDescripcion"))
        {
            Object obj = soapObject.getProperty("ApartadoDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                apartadoDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                apartadoDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("BloqueCodigo"))
        {
            Object obj = soapObject.getProperty("BloqueCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                bloqueCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                bloqueCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("BloqueDescripcion"))
        {
            Object obj = soapObject.getProperty("BloqueDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                bloqueDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                bloqueDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("CapituloCodigo"))
        {
            Object obj = soapObject.getProperty("CapituloCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                capituloCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                capituloCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("CapituloDescripcion"))
        {
            Object obj = soapObject.getProperty("CapituloDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                capituloDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                capituloDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("DefectoCodigo"))
        {
            Object obj = soapObject.getProperty("DefectoCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defectoCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                defectoCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("DefectoDescripcion"))
        {
            Object obj = soapObject.getProperty("DefectoDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defectoDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                defectoDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("DefectoDocumento"))
        {
            Object obj = soapObject.getProperty("DefectoDocumento");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defectoDocumento = j.toString();
            }else if (obj!= null && obj instanceof String){
                defectoDocumento = (String) obj;
            }
        }
        if (soapObject.hasProperty("GravedadDefectoCodigo"))
        {
            Object obj = soapObject.getProperty("GravedadDefectoCodigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                gravedadDefectoCodigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                gravedadDefectoCodigo = (String) obj;
            }
        }
        if (soapObject.hasProperty("GravedadDefectoDescripcion"))
        {
            Object obj = soapObject.getProperty("GravedadDefectoDescripcion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                gravedadDefectoDescripcion = j.toString();
            }else if (obj!= null && obj instanceof String){
                gravedadDefectoDescripcion = (String) obj;
            }
        }
        if (soapObject.hasProperty("IdDefecto"))
        {
            Object obj = soapObject.getProperty("IdDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("IdDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdGravedadDefecto"))
        {
            Object obj = soapObject.getProperty("IdGravedadDefecto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGravedadDefecto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idGravedadDefecto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdGravedadDefectoSpecified"))
        {
            Object obj = soapObject.getProperty("IdGravedadDefectoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idGravedadDefectoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idGravedadDefectoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("idApartado"))
        {
            Object obj = soapObject.getProperty("idApartado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idApartado = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idApartado = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idApartadoSpecified"))
        {
            Object obj = soapObject.getProperty("idApartadoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idApartadoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idApartadoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("idBloque"))
        {
            Object obj = soapObject.getProperty("idBloque");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idBloque = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idBloque = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idBloqueSpecified"))
        {
            Object obj = soapObject.getProperty("idBloqueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idBloqueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idBloqueSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("idCapitulo"))
        {
            Object obj = soapObject.getProperty("idCapitulo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCapitulo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCapitulo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idCapituloSpecified"))
        {
            Object obj = soapObject.getProperty("idCapituloSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCapituloSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCapituloSpecified = (Boolean) obj;
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
                return apartadoCodigo;
            case 1:
                return apartadoDescripcion;
            case 2:
                return bloqueCodigo;
            case 3:
                return bloqueDescripcion;
            case 4:
                return capituloCodigo;
            case 5:
                return capituloDescripcion;
            case 6:
                return defectoCodigo;
            case 7:
                return defectoDescripcion;
            case 8:
                return defectoDocumento;
            case 9:
                return gravedadDefectoCodigo;
            case 10:
                return gravedadDefectoDescripcion;
            case 11:
                return idDefecto;
            case 12:
                return idDefectoSpecified;
            case 13:
                return idGravedadDefecto;
            case 14:
                return idGravedadDefectoSpecified;
            case 15:
                return idApartado;
            case 16:
                return idApartadoSpecified;
            case 17:
                return idBloque;
            case 18:
                return idBloqueSpecified;
            case 19:
                return idCapitulo;
            case 20:
                return idCapituloSpecified;
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ApartadoCodigo";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ApartadoDescripcion";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "BloqueCodigo";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "BloqueDescripcion";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CapituloCodigo";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CapituloDescripcion";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DefectoCodigo";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DefectoDescripcion";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DefectoDocumento";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "GravedadDefectoCodigo";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "GravedadDefectoDescripcion";
                break;
            case 11:
                info.type = Long.class;
                info.name = "IdDefecto";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdDefectoSpecified";
                break;
            case 13:
                info.type = Long.class;
                info.name = "IdGravedadDefecto";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdGravedadDefectoSpecified";
                break;
            case 15:
                info.type = Long.class;
                info.name = "idApartado";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idApartadoSpecified";
                break;
            case 17:
                info.type = Long.class;
                info.name = "idBloque";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idBloqueSpecified";
                break;
            case 19:
                info.type = Long.class;
                info.name = "idCapitulo";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idCapituloSpecified";
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
