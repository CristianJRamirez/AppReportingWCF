package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Autonomia;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.Categoria_Valor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.GrupoRecargo;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.TipoValor;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class RecargosAplicacion implements KvmSerializable {
    
    public Autonomia autonomia;
    public Categoria_Valor categoria_Valor;
    public long fK_IdAutonomia;
    public boolean fK_IdAutonomiaSpecified;
    public long fK_IdCategoriaValor;
    public boolean fK_IdCategoriaValorSpecified;
    public long fK_IdGrupoRecargo;
    public boolean fK_IdGrupoRecargoSpecified;
    public long fK_TipoValor;
    public boolean fK_TipoValorSpecified;
    public boolean facturarEnValor;
    public boolean facturarEnValorSpecified;
    public String fechaFVigencia;
    public boolean fechaFVigenciaSpecified;
    public String fechaIVigencia;
    public boolean fechaIVigenciaSpecified;
    public GrupoRecargo grupoRecargo;
    public long idRecargos;
    public boolean idRecargosSpecified;
    public int orden;
    public boolean ordenSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public TipoValor tipoValor;
    public double valor;
    public boolean valorSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public RecargosAplicacion(){}
    
    public RecargosAplicacion(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Autonomia"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Autonomia");
            autonomia =  new Autonomia (j);
            
        }
        if (soapObject.hasProperty("Categoria_Valor"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Categoria_Valor");
            categoria_Valor =  new Categoria_Valor (j);
            
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
        if (soapObject.hasProperty("FK_IdCategoriaValor"))
        {
            Object obj = soapObject.getProperty("FK_IdCategoriaValor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCategoriaValor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdCategoriaValor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdCategoriaValorSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdCategoriaValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdCategoriaValorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdCategoriaValorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoRecargo"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoRecargo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoRecargo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdGrupoRecargo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdGrupoRecargoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdGrupoRecargoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdGrupoRecargoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdGrupoRecargoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_TipoValor"))
        {
            Object obj = soapObject.getProperty("FK_TipoValor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_TipoValor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_TipoValor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_TipoValorSpecified"))
        {
            Object obj = soapObject.getProperty("FK_TipoValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_TipoValorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_TipoValorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FacturarEnValor"))
        {
            Object obj = soapObject.getProperty("FacturarEnValor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                facturarEnValor = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                facturarEnValor = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FacturarEnValorSpecified"))
        {
            Object obj = soapObject.getProperty("FacturarEnValorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                facturarEnValorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                facturarEnValorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaFVigencia"))
        {
            Object obj = soapObject.getProperty("FechaFVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaFVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaFVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaIVigencia"))
        {
            Object obj = soapObject.getProperty("FechaIVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaIVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaIVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaIVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaIVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaIVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("GrupoRecargo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("GrupoRecargo");
            grupoRecargo =  new GrupoRecargo (j);
            
        }
        if (soapObject.hasProperty("IdRecargos"))
        {
            Object obj = soapObject.getProperty("IdRecargos");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idRecargos = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idRecargos = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdRecargosSpecified"))
        {
            Object obj = soapObject.getProperty("IdRecargosSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idRecargosSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idRecargosSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Orden"))
        {
            Object obj = soapObject.getProperty("Orden");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                orden = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                orden = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("OrdenSpecified"))
        {
            Object obj = soapObject.getProperty("OrdenSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ordenSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                ordenSpecified = (Boolean) obj;
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
                return categoria_Valor;
            case 2:
                return fK_IdAutonomia;
            case 3:
                return fK_IdAutonomiaSpecified;
            case 4:
                return fK_IdCategoriaValor;
            case 5:
                return fK_IdCategoriaValorSpecified;
            case 6:
                return fK_IdGrupoRecargo;
            case 7:
                return fK_IdGrupoRecargoSpecified;
            case 8:
                return fK_TipoValor;
            case 9:
                return fK_TipoValorSpecified;
            case 10:
                return facturarEnValor;
            case 11:
                return facturarEnValorSpecified;
            case 12:
                return fechaFVigencia;
            case 13:
                return fechaFVigenciaSpecified;
            case 14:
                return fechaIVigencia;
            case 15:
                return fechaIVigenciaSpecified;
            case 16:
                return grupoRecargo;
            case 17:
                return idRecargos;
            case 18:
                return idRecargosSpecified;
            case 19:
                return orden;
            case 20:
                return ordenSpecified;
            case 21:
                return publicado;
            case 22:
                return publicadoSpecified;
            case 23:
                return tipoValor;
            case 24:
                return valor;
            case 25:
                return valorSpecified;
            case 26:
                return fechaModificacion;
            case 27:
                return fechaModificacionSpecified;
            case 28:
                return timestamp.toString();
            case 29:
                return usuarioModificacion;
            case 30:
                return usuarioModificacionSpecified;
            case 31:
                return id;
            case 32:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 33;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Autonomia.class;
                info.name = "Autonomia";
                break;
            case 1:
                info.type = Categoria_Valor.class;
                info.name = "Categoria_Valor";
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
                info.name = "FK_IdCategoriaValor";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdCategoriaValorSpecified";
                break;
            case 6:
                info.type = Long.class;
                info.name = "FK_IdGrupoRecargo";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdGrupoRecargoSpecified";
                break;
            case 8:
                info.type = Long.class;
                info.name = "FK_TipoValor";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_TipoValorSpecified";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FacturarEnValor";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FacturarEnValorSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFVigencia";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFVigenciaSpecified";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaIVigencia";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaIVigenciaSpecified";
                break;
            case 16:
                info.type = GrupoRecargo.class;
                info.name = "GrupoRecargo";
                break;
            case 17:
                info.type = Long.class;
                info.name = "IdRecargos";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdRecargosSpecified";
                break;
            case 19:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Orden";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "OrdenSpecified";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 23:
                info.type = TipoValor.class;
                info.name = "TipoValor";
                break;
            case 24:
                info.type = Double.class;
                info.name = "Valor";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ValorSpecified";
                break;
            case 26:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 28:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 29:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 30:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 31:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 32:
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
