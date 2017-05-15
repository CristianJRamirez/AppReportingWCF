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
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.Factura;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class FacturaTransaccion implements KvmSerializable {
    
    public long fK_IdFactura;
    public boolean fK_IdFacturaSpecified;
    public Factura factura;
    public long idFacturaTransaccion;
    public boolean idFacturaTransaccionSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String text;
    public String transaccion;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public FacturaTransaccion(){}
    
    public FacturaTransaccion(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("FK_IdFactura"))
        {
            Object obj = soapObject.getProperty("FK_IdFactura");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdFactura = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdFactura = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdFacturaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdFacturaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdFacturaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdFacturaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Factura"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Factura");
            factura =  new Factura (j);
            
        }
        if (soapObject.hasProperty("IdFacturaTransaccion"))
        {
            Object obj = soapObject.getProperty("IdFacturaTransaccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idFacturaTransaccion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idFacturaTransaccion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdFacturaTransaccionSpecified"))
        {
            Object obj = soapObject.getProperty("IdFacturaTransaccionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idFacturaTransaccionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idFacturaTransaccionSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Text"))
        {
            Object obj = soapObject.getProperty("Text");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                text = j.toString();
            }else if (obj!= null && obj instanceof String){
                text = (String) obj;
            }
        }
        if (soapObject.hasProperty("Transaccion"))
        {
            Object obj = soapObject.getProperty("Transaccion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                transaccion = j.toString();
            }else if (obj!= null && obj instanceof String){
                transaccion = (String) obj;
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
                return fK_IdFactura;
            case 1:
                return fK_IdFacturaSpecified;
            case 2:
                return factura;
            case 3:
                return idFacturaTransaccion;
            case 4:
                return idFacturaTransaccionSpecified;
            case 5:
                return publicado;
            case 6:
                return publicadoSpecified;
            case 7:
                return text;
            case 8:
                return transaccion;
            case 9:
                return fechaModificacion;
            case 10:
                return fechaModificacionSpecified;
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
                info.type = Long.class;
                info.name = "FK_IdFactura";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdFacturaSpecified";
                break;
            case 2:
                info.type = Factura.class;
                info.name = "Factura";
                break;
            case 3:
                info.type = Long.class;
                info.name = "IdFacturaTransaccion";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdFacturaTransaccionSpecified";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Text";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Transaccion";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
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
    public String getInnerText() {
        return null;
    }
    
    
    @Override
    public void setInnerText(String s) {
    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
