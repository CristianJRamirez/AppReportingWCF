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
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.FacturaPrestacion;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class FacturaPrestacionImporte implements KvmSerializable {
    
    public String descImporte;
    public boolean esAbsoluto;
    public boolean esAbsolutoSpecified;
    public long fK_IdCategoria_Valor;
    public boolean fK_IdCategoria_ValorSpecified;
    public long fK_IdFacturaPrestacion;
    public boolean fK_IdFacturaPrestacionSpecified;
    public FacturaPrestacion facturaPrestacion;
    public long idFacturaPrestacionImporte;
    public boolean idFacturaPrestacionImporteSpecified;
    public double importe;
    public boolean importeSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public String tipo;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public FacturaPrestacionImporte(){}
    
    public FacturaPrestacionImporte(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("DescImporte"))
        {
            Object obj = soapObject.getProperty("DescImporte");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                descImporte = j.toString();
            }else if (obj!= null && obj instanceof String){
                descImporte = (String) obj;
            }
        }
        if (soapObject.hasProperty("EsAbsoluto"))
        {
            Object obj = soapObject.getProperty("EsAbsoluto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esAbsoluto = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                esAbsoluto = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("EsAbsolutoSpecified"))
        {
            Object obj = soapObject.getProperty("EsAbsolutoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                esAbsolutoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                esAbsolutoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCategoria_Valor"))
        {
            Object obj = soapObject.getProperty("FK_IdCategoria_Valor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCategoria_Valor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCategoria_Valor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCategoria_ValorSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCategoria_ValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCategoria_ValorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCategoria_ValorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdFacturaPrestacion"))
        {
            Object obj = soapObject.getProperty("FK_IdFacturaPrestacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdFacturaPrestacion = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdFacturaPrestacion = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdFacturaPrestacionSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdFacturaPrestacionSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdFacturaPrestacionSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdFacturaPrestacionSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FacturaPrestacion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("FacturaPrestacion");
            facturaPrestacion =  new FacturaPrestacion (j);
            
        }
        if (soapObject.hasProperty("IdFacturaPrestacionImporte"))
        {
            Object obj = soapObject.getProperty("IdFacturaPrestacionImporte");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idFacturaPrestacionImporte = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idFacturaPrestacionImporte = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdFacturaPrestacionImporteSpecified"))
        {
            Object obj = soapObject.getProperty("IdFacturaPrestacionImporteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idFacturaPrestacionImporteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idFacturaPrestacionImporteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Importe"))
        {
            Object obj = soapObject.getProperty("Importe");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                importe = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                importe = (Double) obj;
            }
        }
        if (soapObject.hasProperty("ImporteSpecified"))
        {
            Object obj = soapObject.getProperty("ImporteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                importeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                importeSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Tipo"))
        {
            Object obj = soapObject.getProperty("Tipo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tipo = j.toString();
            }else if (obj!= null && obj instanceof String){
                tipo = (String) obj;
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
                return descImporte;
            case 1:
                return esAbsoluto;
            case 2:
                return esAbsolutoSpecified;
            case 3:
                return fK_IdCategoria_Valor;
            case 4:
                return fK_IdCategoria_ValorSpecified;
            case 5:
                return fK_IdFacturaPrestacion;
            case 6:
                return fK_IdFacturaPrestacionSpecified;
            case 7:
                return facturaPrestacion;
            case 8:
                return idFacturaPrestacionImporte;
            case 9:
                return idFacturaPrestacionImporteSpecified;
            case 10:
                return importe;
            case 11:
                return importeSpecified;
            case 12:
                return publicado;
            case 13:
                return publicadoSpecified;
            case 14:
                return tipo;
            case 15:
                return fechaModificacion;
            case 16:
                return fechaModificacionSpecified;
            case 17:
                return timestamp.toString();
            case 18:
                return usuarioModificacion;
            case 19:
                return usuarioModificacionSpecified;
            case 20:
                return id;
            case 21:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 22;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DescImporte";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "EsAbsoluto";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "EsAbsolutoSpecified";
                break;
            case 3:
                info.type = Long.class;
                info.name = "FK_IdCategoria_Valor";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCategoria_ValorSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "FK_IdFacturaPrestacion";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdFacturaPrestacionSpecified";
                break;
            case 7:
                info.type = FacturaPrestacion.class;
                info.name = "FacturaPrestacion";
                break;
            case 8:
                info.type = Long.class;
                info.name = "IdFacturaPrestacionImporte";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdFacturaPrestacionImporteSpecified";
                break;
            case 10:
                info.type = Double.class;
                info.name = "Importe";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ImporteSpecified";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Tipo";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 18:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
