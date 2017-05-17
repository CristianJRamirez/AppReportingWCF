package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class SetRegistroEtiquetasInput implements KvmSerializable {
    
    public String descripcionLote;
    public long fechaFin;
    public boolean fechaFinSpecified;
    public long fechaIni;
    public boolean fechaIniSpecified;
    public long idUsuario;
    public boolean idUsuarioSpecified;
    public boolean libre;
    public boolean libreSpecified;
    public long maxNum;
    public boolean maxNumSpecified;
    public long minNum;
    public boolean minNumSpecified;
    public boolean valido;
    public boolean validoSpecified;
    
    public SetRegistroEtiquetasInput(){}
    
    public SetRegistroEtiquetasInput(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("descripcionLote"))
        {
            Object obj = soapObject.getProperty("descripcionLote");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descripcionLote = j.toString();
            }else if (obj!= null && obj instanceof String){
                descripcionLote = (String) obj;
            }
        }
        if (soapObject.hasProperty("fechaFin"))
        {
            Object obj = soapObject.getProperty("fechaFin");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFin = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fechaFin = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("fechaFinSpecified"))
        {
            Object obj = soapObject.getProperty("fechaFinSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFinSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("fechaIni"))
        {
            Object obj = soapObject.getProperty("fechaIni");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIni = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fechaIni = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("fechaIniSpecified"))
        {
            Object obj = soapObject.getProperty("fechaIniSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIniSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaIniSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("idUsuario"))
        {
            Object obj = soapObject.getProperty("idUsuario");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idUsuario = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idUsuario = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idUsuarioSpecified"))
        {
            Object obj = soapObject.getProperty("idUsuarioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idUsuarioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idUsuarioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("libre"))
        {
            Object obj = soapObject.getProperty("libre");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                libre = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                libre = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("libreSpecified"))
        {
            Object obj = soapObject.getProperty("libreSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                libreSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                libreSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("maxNum"))
        {
            Object obj = soapObject.getProperty("maxNum");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maxNum = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                maxNum = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("maxNumSpecified"))
        {
            Object obj = soapObject.getProperty("maxNumSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maxNumSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                maxNumSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("minNum"))
        {
            Object obj = soapObject.getProperty("minNum");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                minNum = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                minNum = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("minNumSpecified"))
        {
            Object obj = soapObject.getProperty("minNumSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                minNumSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                minNumSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("valido"))
        {
            Object obj = soapObject.getProperty("valido");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                valido = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                valido = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("validoSpecified"))
        {
            Object obj = soapObject.getProperty("validoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                validoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                validoSpecified = (Boolean) obj;
            }
        }
    }
 
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return descripcionLote;
            case 1:
                return fechaFin;
            case 2:
                return fechaFinSpecified;
            case 3:
                return fechaIni;
            case 4:
                return fechaIniSpecified;
            case 5:
                return idUsuario;
            case 6:
                return idUsuarioSpecified;
            case 7:
                return libre;
            case 8:
                return libreSpecified;
            case 9:
                return maxNum;
            case 10:
                return maxNumSpecified;
            case 11:
                return minNum;
            case 12:
                return minNumSpecified;
            case 13:
                return valido;
            case 14:
                return validoSpecified;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 15;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "descripcionLote";
                break;
            case 1:
                info.type = Long.class;
                info.name = "fechaFin";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaFinSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "fechaIni";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaIniSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "idUsuario";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idUsuarioSpecified";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "libre";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "libreSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "maxNum";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "maxNumSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "minNum";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "minNumSpecified";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "valido";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "validoSpecified";
                break;
        }
    }
    
 
    public String getInnerText() {
        return null;
    }
    
    
 
    public void setInnerText(String s) {
    }

    @Override
    public String toString() {
        return "SetRegistroEtiquetasInput{" +
                "descripcionLote='" + descripcionLote + '\'' +
                ", fechaFin=" + fechaFin +
                ", fechaFinSpecified=" + fechaFinSpecified +
                ", fechaIni=" + fechaIni +
                ", fechaIniSpecified=" + fechaIniSpecified +
                ", idUsuario=" + idUsuario +
                ", idUsuarioSpecified=" + idUsuarioSpecified +
                ", libre=" + libre +
                ", libreSpecified=" + libreSpecified +
                ", maxNum=" + maxNum +
                ", maxNumSpecified=" + maxNumSpecified +
                ", minNum=" + minNum +
                ", minNumSpecified=" + minNumSpecified +
                ", valido=" + valido +
                ", validoSpecified=" + validoSpecified +
                '}';
    }

    public void setProperty(int arg0, Object arg1) {
    }
    
}
