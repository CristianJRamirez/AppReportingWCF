package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class QUERY_ResumenEtiquetas_Result implements KvmSerializable {
    
    public String ano;
    public String estado;
    public String tipoEtiqueta;
    public int total;
    public boolean totalSpecified;
    public String id;
    public String ref;
    
    public QUERY_ResumenEtiquetas_Result(){}
    
    public QUERY_ResumenEtiquetas_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Ano"))
        {
            Object obj = soapObject.getProperty("Ano");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ano = j.toString();
            }else if (obj!= null && obj instanceof String){
                ano = (String) obj;
            }
        }
        if (soapObject.hasProperty("Estado"))
        {
            Object obj = soapObject.getProperty("Estado");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                estado = j.toString();
            }else if (obj!= null && obj instanceof String){
                estado = (String) obj;
            }
        }
        if (soapObject.hasProperty("TipoEtiqueta"))
        {
            Object obj = soapObject.getProperty("TipoEtiqueta");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tipoEtiqueta = j.toString();
            }else if (obj!= null && obj instanceof String){
                tipoEtiqueta = (String) obj;
            }
        }
        if (soapObject.hasProperty("Total"))
        {
            Object obj = soapObject.getProperty("Total");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                total = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                total = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("TotalSpecified"))
        {
            Object obj = soapObject.getProperty("TotalSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                totalSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                totalSpecified = (Boolean) obj;
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
                return ano;
            case 1:
                return estado;
            case 2:
                return tipoEtiqueta;
            case 3:
                return total;
            case 4:
                return totalSpecified;
            case 5:
                return id;
            case 6:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 7;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ano";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Estado";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "TipoEtiqueta";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Total";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "TotalSpecified";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 6:
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
