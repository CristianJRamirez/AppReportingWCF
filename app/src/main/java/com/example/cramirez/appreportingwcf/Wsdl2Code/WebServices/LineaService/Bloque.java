package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorBloqueApartado;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.BloqueImagen;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorBloquePrueba;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Bloque implements KvmSerializable {
    
    public VectorBloqueApartado bloqueApartado;
    public BloqueImagen bloqueImagen;
    public BloqueImagen bloqueImagen1;
    public BloqueImagen bloqueImagen2;
    public VectorBloquePrueba bloquePrueba;
    public String codigo;
    public String descripcion;
    public long fK_ImgDisabled;
    public boolean fK_ImgDisabledSpecified;
    public long fK_ImgFullColor;
    public boolean fK_ImgFullColorSpecified;
    public long fK_ImgHalfColor;
    public boolean fK_ImgHalfColorSpecified;
    public String fechaFinVigencia;
    public boolean fechaFinVigenciaSpecified;
    public String fechaInIVigencia;
    public boolean fechaInIVigenciaSpecified;
    public long idBloque;
    public boolean idBloqueSpecified;
    public int posicionX;
    public boolean posicionXSpecified;
    public int posicionY;
    public boolean posicionYSpecified;
    public boolean publicado;
    public boolean publicadoSpecified;
    public boolean soloPruebas;
    public boolean soloPruebasSpecified;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Bloque(){}
    
    public Bloque(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("BloqueApartado"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("BloqueApartado");
            bloqueApartado = new VectorBloqueApartado(j);
        }
        if (soapObject.hasProperty("BloqueImagen"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("BloqueImagen");
            bloqueImagen =  new BloqueImagen (j);
            
        }
        if (soapObject.hasProperty("BloqueImagen1"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("BloqueImagen1");
            bloqueImagen1 =  new BloqueImagen (j);
            
        }
        if (soapObject.hasProperty("BloqueImagen2"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("BloqueImagen2");
            bloqueImagen2 =  new BloqueImagen (j);
            
        }
        if (soapObject.hasProperty("BloquePrueba"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("BloquePrueba");
            bloquePrueba = new VectorBloquePrueba(j);
        }
        if (soapObject.hasProperty("Codigo"))
        {
            Object obj = soapObject.getProperty("Codigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codigo = j.toString();
            }else if (obj!= null && obj instanceof String){
                codigo = (String) obj;
            }
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
        if (soapObject.hasProperty("FK_ImgDisabled"))
        {
            Object obj = soapObject.getProperty("FK_ImgDisabled");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_ImgDisabled = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_ImgDisabled = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_ImgDisabledSpecified"))
        {
            Object obj = soapObject.getProperty("FK_ImgDisabledSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_ImgDisabledSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_ImgDisabledSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_ImgFullColor"))
        {
            Object obj = soapObject.getProperty("FK_ImgFullColor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_ImgFullColor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_ImgFullColor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_ImgFullColorSpecified"))
        {
            Object obj = soapObject.getProperty("FK_ImgFullColorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_ImgFullColorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_ImgFullColorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_ImgHalfColor"))
        {
            Object obj = soapObject.getProperty("FK_ImgHalfColor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_ImgHalfColor = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_ImgHalfColor = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_ImgHalfColorSpecified"))
        {
            Object obj = soapObject.getProperty("FK_ImgHalfColorSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_ImgHalfColorSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_ImgHalfColorSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinVigencia"))
        {
            Object obj = soapObject.getProperty("FechaFinVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaFinVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaFinVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaFinVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaFinVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaFinVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FechaInIVigencia"))
        {
            Object obj = soapObject.getProperty("FechaInIVigencia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInIVigencia = j.toString();
            }else if (obj!= null && obj instanceof String){
                fechaInIVigencia = (String) obj;
            }
        }
        if (soapObject.hasProperty("FechaInIVigenciaSpecified"))
        {
            Object obj = soapObject.getProperty("FechaInIVigenciaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fechaInIVigenciaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fechaInIVigenciaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IdBloque"))
        {
            Object obj = soapObject.getProperty("IdBloque");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idBloque = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idBloque = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdBloqueSpecified"))
        {
            Object obj = soapObject.getProperty("IdBloqueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idBloqueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idBloqueSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PosicionX"))
        {
            Object obj = soapObject.getProperty("PosicionX");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                posicionX = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                posicionX = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("PosicionXSpecified"))
        {
            Object obj = soapObject.getProperty("PosicionXSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                posicionXSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                posicionXSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PosicionY"))
        {
            Object obj = soapObject.getProperty("PosicionY");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                posicionY = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                posicionY = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("PosicionYSpecified"))
        {
            Object obj = soapObject.getProperty("PosicionYSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                posicionYSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                posicionYSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("SoloPruebas"))
        {
            Object obj = soapObject.getProperty("SoloPruebas");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                soloPruebas = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                soloPruebas = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("SoloPruebasSpecified"))
        {
            Object obj = soapObject.getProperty("SoloPruebasSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                soloPruebasSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                soloPruebasSpecified = (Boolean) obj;
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
                return bloqueApartado;
            case 1:
                return bloqueImagen;
            case 2:
                return bloqueImagen1;
            case 3:
                return bloqueImagen2;
            case 4:
                return bloquePrueba;
            case 5:
                return codigo;
            case 6:
                return descripcion;
            case 7:
                return fK_ImgDisabled;
            case 8:
                return fK_ImgDisabledSpecified;
            case 9:
                return fK_ImgFullColor;
            case 10:
                return fK_ImgFullColorSpecified;
            case 11:
                return fK_ImgHalfColor;
            case 12:
                return fK_ImgHalfColorSpecified;
            case 13:
                return fechaFinVigencia;
            case 14:
                return fechaFinVigenciaSpecified;
            case 15:
                return fechaInIVigencia;
            case 16:
                return fechaInIVigenciaSpecified;
            case 17:
                return idBloque;
            case 18:
                return idBloqueSpecified;
            case 19:
                return posicionX;
            case 20:
                return posicionXSpecified;
            case 21:
                return posicionY;
            case 22:
                return posicionYSpecified;
            case 23:
                return publicado;
            case 24:
                return publicadoSpecified;
            case 25:
                return soloPruebas;
            case 26:
                return soloPruebasSpecified;
            case 27:
                return fechaModificacion;
            case 28:
                return fechaModificacionSpecified;
            case 29:
                return timestamp.toString();
            case 30:
                return usuarioModificacion;
            case 31:
                return usuarioModificacionSpecified;
            case 32:
                return id;
            case 33:
                return ref;
        }
        return null;
    }
    
 
    public int getPropertyCount() {
        return 34;
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "BloqueApartado";
                break;
            case 1:
                info.type = BloqueImagen.class;
                info.name = "BloqueImagen";
                break;
            case 2:
                info.type = BloqueImagen.class;
                info.name = "BloqueImagen1";
                break;
            case 3:
                info.type = BloqueImagen.class;
                info.name = "BloqueImagen2";
                break;
            case 4:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "BloquePrueba";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Codigo";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Descripcion";
                break;
            case 7:
                info.type = Long.class;
                info.name = "FK_ImgDisabled";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_ImgDisabledSpecified";
                break;
            case 9:
                info.type = Long.class;
                info.name = "FK_ImgFullColor";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_ImgFullColorSpecified";
                break;
            case 11:
                info.type = Long.class;
                info.name = "FK_ImgHalfColor";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_ImgHalfColorSpecified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaFinVigencia";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaFinVigenciaSpecified";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FechaInIVigencia";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FechaInIVigenciaSpecified";
                break;
            case 17:
                info.type = Long.class;
                info.name = "IdBloque";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdBloqueSpecified";
                break;
            case 19:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PosicionX";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PosicionXSpecified";
                break;
            case 21:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PosicionY";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PosicionYSpecified";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SoloPruebas";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "SoloPruebasSpecified";
                break;
            case 27:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 29:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 30:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 31:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 32:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 33:
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
