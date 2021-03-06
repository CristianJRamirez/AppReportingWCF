package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Categoria_Valor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.CuentaContable;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoImpuesto;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Tarifa;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoValor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class TarifaImporte implements KvmSerializable {
    
    public Categoria_Valor categoria_Valor;
    public CuentaContable cuentaContable;
    public long fK_IdCategoria_Valor;
    public boolean fK_IdCategoria_ValorSpecified;
    public long fK_IdCuentaContable;
    public boolean fK_IdCuentaContableSpecified;
    public long fK_IdGrupoImpuesto;
    public boolean fK_IdGrupoImpuestoSpecified;
    public long fK_IdTarifa;
    public boolean fK_IdTarifaSpecified;
    public long fK_IdTipoValor;
    public boolean fK_IdTipoValorSpecified;
    public GrupoImpuesto grupoImpuesto;
    public boolean publicado;
    public boolean publicadoSpecified;
    public Tarifa tarifa;
    public TipoValor tipoValor;
    public double valor;
    public boolean valorSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public long idTarifaImporte;
    public boolean idTarifaImporteSpecified;
    public int orden;
    public boolean ordenSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public TarifaImporte(){}
    
    public TarifaImporte(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Categoria_Valor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Categoria_Valor");
            categoria_Valor =  new Categoria_Valor (j);
            
        }
        if (soapObject.hasProperty("CuentaContable"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("CuentaContable");
            cuentaContable =  new CuentaContable (j);
            
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
        if (soapObject.hasProperty("FK_IdCuentaContable"))
        {
            Object obj = soapObject.getProperty("FK_IdCuentaContable");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCuentaContable = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCuentaContable = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCuentaContableSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCuentaContableSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCuentaContableSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCuentaContableSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoImpuesto"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoImpuesto");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoImpuesto = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoImpuesto = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoImpuestoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoImpuestoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoImpuestoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoImpuestoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTarifa"))
        {
            Object obj = soapObject.getProperty("FK_IdTarifa");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTarifa = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTarifa = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTarifaSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTarifaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTarifaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTarifaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoValor"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoValor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoValor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdTipoValor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdTipoValorSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdTipoValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdTipoValorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdTipoValorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoImpuesto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoImpuesto");
            grupoImpuesto =  new GrupoImpuesto (j);
            
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
        if (soapObject.hasProperty("Tarifa"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Tarifa");
            tarifa =  new Tarifa (j);
            
        }
        if (soapObject.hasProperty("TipoValor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("TipoValor");
            tipoValor =  new TipoValor (j);
            
        }
        if (soapObject.hasProperty("Valor"))
        {
            Object obj = soapObject.getProperty("Valor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                valor = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                valor = (Double) obj;
            }
        }
        if (soapObject.hasProperty("ValorSpecified"))
        {
            Object obj = soapObject.getProperty("ValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                valorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                valorSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("idTarifaImporte"))
        {
            Object obj = soapObject.getProperty("idTarifaImporte");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idTarifaImporte = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idTarifaImporte = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idTarifaImporteSpecified"))
        {
            Object obj = soapObject.getProperty("idTarifaImporteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idTarifaImporteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idTarifaImporteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("orden"))
        {
            Object obj = soapObject.getProperty("orden");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                orden = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                orden = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ordenSpecified"))
        {
            Object obj = soapObject.getProperty("ordenSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ordenSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                ordenSpecified = (Boolean) obj;
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
                return categoria_Valor;
            case 1:
                return cuentaContable;
            case 2:
                return fK_IdCategoria_Valor;
            case 3:
                return fK_IdCategoria_ValorSpecified;
            case 4:
                return fK_IdCuentaContable;
            case 5:
                return fK_IdCuentaContableSpecified;
            case 6:
                return fK_IdGrupoImpuesto;
            case 7:
                return fK_IdGrupoImpuestoSpecified;
            case 8:
                return fK_IdTarifa;
            case 9:
                return fK_IdTarifaSpecified;
            case 10:
                return fK_IdTipoValor;
            case 11:
                return fK_IdTipoValorSpecified;
            case 12:
                return grupoImpuesto;
            case 13:
                return publicado;
            case 14:
                return publicadoSpecified;
            case 15:
                return tarifa;
            case 16:
                return tipoValor;
            case 17:
                return valor;
            case 18:
                return valorSpecified;
            case 19:
                return fechaModificacion;
            case 20:
                return fechaModificacionSpecified;
            case 21:
                return idTarifaImporte;
            case 22:
                return idTarifaImporteSpecified;
            case 23:
                return orden;
            case 24:
                return ordenSpecified;
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
                info.type = Categoria_Valor.class;
                info.name = "Categoria_Valor";
                break;
            case 1:
                info.type = CuentaContable.class;
                info.name = "CuentaContable";
                break;
            case 2:
                info.type = Long.class;
                info.name = "FK_IdCategoria_Valor";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCategoria_ValorSpecified";
                break;
            case 4:
                info.type = Long.class;
                info.name = "FK_IdCuentaContable";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCuentaContableSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdGrupoImpuesto";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoImpuestoSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "FK_IdTarifa";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTarifaSpecified";
                break;
            case 10:
                info.type = Long.class;
                info.name = "FK_IdTipoValor";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdTipoValorSpecified";
                break;
            case 12:
                info.type = GrupoImpuesto.class;
                info.name = "GrupoImpuesto";
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
                info.type = Tarifa.class;
                info.name = "Tarifa";
                break;
            case 16:
                info.type = TipoValor.class;
                info.name = "TipoValor";
                break;
            case 17:
                info.type = Double.class;
                info.name = "Valor";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ValorSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 21:
                info.type = Long.class;
                info.name = "idTarifaImporte";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idTarifaImporteSpecified";
                break;
            case 23:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "orden";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ordenSpecified";
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
