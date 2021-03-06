package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorImpuesto_Valor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorTarifaImporte;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoCuentaContable;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorVigenciaCuentaContable;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class CuentaContable implements KvmSerializable {
    
    public Autonomia autonomia;
    public String descripcion;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdTipoCuentaContable;
    public boolean fK_IdTipoCuentaContableSpecified;
    public long idCuentaContable;
    public boolean idCuentaContableSpecified;
    public VectorImpuesto_Valor impuesto_Valor;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorTarifaImporte tarifaImporte;
    public TipoCuentaContable tipoCuentaContable;
    public VectorVigenciaCuentaContable vigenciaCuentaContable;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public CuentaContable(){}
    
    public CuentaContable(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Autonomia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Autonomia");
            autonomia =  new Autonomia (j);
            
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
        if (soapObject.hasProperty("FK_IdTipoCuentaContable"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoCuentaContable");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoCuentaContable = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoCuentaContable = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoCuentaContableSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoCuentaContableSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoCuentaContableSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoCuentaContableSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdCuentaContable"))
        {
            Object obj = soapObject.getProperty("IdCuentaContable");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCuentaContable = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCuentaContable = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdCuentaContableSpecified"))
        {
            Object obj = soapObject.getProperty("IdCuentaContableSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCuentaContableSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idCuentaContableSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("TarifaImporte"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TarifaImporte");
            tarifaImporte = new VectorTarifaImporte(j);
        }
        if (soapObject.hasProperty("TipoCuentaContable"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoCuentaContable");
            tipoCuentaContable =  new TipoCuentaContable (j);
            
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
                return autonomia;
            case 1:
                return descripcion;
            case 2:
                return fK_IdAutonomia;
            case 3:
                return fK_IdAutonomiaSpecified;
            case 4:
                return fK_IdTipoCuentaContable;
            case 5:
                return fK_IdTipoCuentaContableSpecified;
            case 6:
                return idCuentaContable;
            case 7:
                return idCuentaContableSpecified;
            case 8:
                return impuesto_Valor;
            case 9:
                return publicado;
            case 10:
                return publicadoSpecified;
            case 11:
                return tarifaImporte;
            case 12:
                return tipoCuentaContable;
            case 13:
                return vigenciaCuentaContable;
            case 14:
                return fechaModificacion;
            case 15:
                return fechaModificacionSpecified;
            case 16:
                return timestamp.toString();
            case 17:
                return usuarioModificacion;
            case 18:
                return usuarioModificacionSpecified;
            case 19:
                return id;
            case 20:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 21;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdAutonomia";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdAutonomiaSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdTipoCuentaContable";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoCuentaContableSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "IdCuentaContable";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdCuentaContableSpecified";
                break;
            case 8:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Impuesto_Valor";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 11:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "TarifaImporte";
                break;
            case 12:
                info.type = TipoCuentaContable.class;
                info.name = "TipoCuentaContable";
                break;
            case 13:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "VigenciaCuentaContable";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 17:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 20:
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
