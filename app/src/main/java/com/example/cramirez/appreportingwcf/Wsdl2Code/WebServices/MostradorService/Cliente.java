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
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorExpediente;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorFactura;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorFacturaAlbaran;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.MecanismoPago;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.MomentoPago;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorSolicitudServicio;
import com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.VectorByte;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class Cliente implements KvmSerializable {
    
    public String apellidos;
    public String cP;
    public String cuentaContable;
    public boolean deBaja;
    public boolean deBajaSpecified;
    public String domicilio;
    public String email;
    public String envioAtencionDe;
    public String envioCalleNum;
    public String envioNombre;
    public String envioPoblacionCP;
    public String escPisoPta;
    public VectorExpediente expediente;
    public long fK_IdMecanismoPago;
    public boolean fK_IdMecanismoPagoSpecified;
    public long fK_IdMomentoPago;
    public boolean fK_IdMomentoPagoSpecified;
    public VectorFactura factura;
    public VectorFacturaAlbaran facturaAlbaran;
    public long idCliente;
    public boolean idClienteSpecified;
    public boolean mailingCorreo;
    public boolean mailingCorreoSpecified;
    public boolean mailingCorreoOrdinario;
    public boolean mailingCorreoOrdinarioSpecified;
    public boolean mailingNoRecibir;
    public boolean mailingNoRecibirSpecified;
    public boolean mailingSMS;
    public boolean mailingSMSSpecified;
    public MecanismoPago mecanismoPago;
    public MomentoPago momentoPago;
    public String movil;
    public String nIF;
    public String noCuentaCorriente;
    public String nombre;
    public String notasOcultas;
    public String numero;
    public String observaciones;
    public String poblacion;
    public String provincia;
    public boolean publicado;
    public boolean publicadoSpecified;
    public VectorSolicitudServicio solicitudServicio;
    public VectorSolicitudServicio solicitudServicio1;
    public String telefono;
    public String tipoVia;
    public String fechaModificacion;
    public boolean fechaModificacionSpecified;
    public VectorByte timestamp;
    public long usuarioModificacion;
    public boolean usuarioModificacionSpecified;
    public String id;
    public String ref;
    
    public Cliente(){}
    
    public Cliente(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Apellidos"))
        {
            Object obj = soapObject.getProperty("Apellidos");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                apellidos = j.toString();
            }else if (obj!= null && obj instanceof String){
                apellidos = (String) obj;
            }
        }
        if (soapObject.hasProperty("CP"))
        {
            Object obj = soapObject.getProperty("CP");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cP = j.toString();
            }else if (obj!= null && obj instanceof String){
                cP = (String) obj;
            }
        }
        if (soapObject.hasProperty("CuentaContable"))
        {
            Object obj = soapObject.getProperty("CuentaContable");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cuentaContable = j.toString();
            }else if (obj!= null && obj instanceof String){
                cuentaContable = (String) obj;
            }
        }
        if (soapObject.hasProperty("DeBaja"))
        {
            Object obj = soapObject.getProperty("DeBaja");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                deBaja = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                deBaja = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("DeBajaSpecified"))
        {
            Object obj = soapObject.getProperty("DeBajaSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                deBajaSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                deBajaSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Domicilio"))
        {
            Object obj = soapObject.getProperty("Domicilio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                domicilio = j.toString();
            }else if (obj!= null && obj instanceof String){
                domicilio = (String) obj;
            }
        }
        if (soapObject.hasProperty("Email"))
        {
            Object obj = soapObject.getProperty("Email");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                email = j.toString();
            }else if (obj!= null && obj instanceof String){
                email = (String) obj;
            }
        }
        if (soapObject.hasProperty("EnvioAtencionDe"))
        {
            Object obj = soapObject.getProperty("EnvioAtencionDe");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                envioAtencionDe = j.toString();
            }else if (obj!= null && obj instanceof String){
                envioAtencionDe = (String) obj;
            }
        }
        if (soapObject.hasProperty("EnvioCalleNum"))
        {
            Object obj = soapObject.getProperty("EnvioCalleNum");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                envioCalleNum = j.toString();
            }else if (obj!= null && obj instanceof String){
                envioCalleNum = (String) obj;
            }
        }
        if (soapObject.hasProperty("EnvioNombre"))
        {
            Object obj = soapObject.getProperty("EnvioNombre");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                envioNombre = j.toString();
            }else if (obj!= null && obj instanceof String){
                envioNombre = (String) obj;
            }
        }
        if (soapObject.hasProperty("EnvioPoblacionCP"))
        {
            Object obj = soapObject.getProperty("EnvioPoblacionCP");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                envioPoblacionCP = j.toString();
            }else if (obj!= null && obj instanceof String){
                envioPoblacionCP = (String) obj;
            }
        }
        if (soapObject.hasProperty("EscPisoPta"))
        {
            Object obj = soapObject.getProperty("EscPisoPta");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                escPisoPta = j.toString();
            }else if (obj!= null && obj instanceof String){
                escPisoPta = (String) obj;
            }
        }
        if (soapObject.hasProperty("Expediente"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Expediente");
            expediente = new VectorExpediente(j);
        }
        if (soapObject.hasProperty("FK_IdMecanismoPago"))
        {
            Object obj = soapObject.getProperty("FK_IdMecanismoPago");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMecanismoPago = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdMecanismoPago = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdMecanismoPagoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdMecanismoPagoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMecanismoPagoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdMecanismoPagoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdMomentoPago"))
        {
            Object obj = soapObject.getProperty("FK_IdMomentoPago");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMomentoPago = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fK_IdMomentoPago = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("FK_IdMomentoPagoSpecified"))
        {
            Object obj = soapObject.getProperty("FK_IdMomentoPagoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fK_IdMomentoPagoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fK_IdMomentoPagoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Factura"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Factura");
            factura = new VectorFactura(j);
        }
        if (soapObject.hasProperty("FacturaAlbaran"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("FacturaAlbaran");
            facturaAlbaran = new VectorFacturaAlbaran(j);
        }
        if (soapObject.hasProperty("IdCliente"))
        {
            Object obj = soapObject.getProperty("IdCliente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCliente = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                idCliente = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IdClienteSpecified"))
        {
            Object obj = soapObject.getProperty("IdClienteSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idClienteSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idClienteSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MailingCorreo"))
        {
            Object obj = soapObject.getProperty("MailingCorreo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mailingCorreo = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mailingCorreo = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MailingCorreoSpecified"))
        {
            Object obj = soapObject.getProperty("MailingCorreoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mailingCorreoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mailingCorreoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MailingCorreoOrdinario"))
        {
            Object obj = soapObject.getProperty("MailingCorreoOrdinario");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mailingCorreoOrdinario = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mailingCorreoOrdinario = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MailingCorreoOrdinarioSpecified"))
        {
            Object obj = soapObject.getProperty("MailingCorreoOrdinarioSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mailingCorreoOrdinarioSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mailingCorreoOrdinarioSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MailingNoRecibir"))
        {
            Object obj = soapObject.getProperty("MailingNoRecibir");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mailingNoRecibir = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mailingNoRecibir = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MailingNoRecibirSpecified"))
        {
            Object obj = soapObject.getProperty("MailingNoRecibirSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mailingNoRecibirSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mailingNoRecibirSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MailingSMS"))
        {
            Object obj = soapObject.getProperty("MailingSMS");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mailingSMS = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mailingSMS = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MailingSMSSpecified"))
        {
            Object obj = soapObject.getProperty("MailingSMSSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mailingSMSSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mailingSMSSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("MecanismoPago"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("MecanismoPago");
            mecanismoPago =  new MecanismoPago (j);
            
        }
        if (soapObject.hasProperty("MomentoPago"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("MomentoPago");
            momentoPago =  new MomentoPago (j);
            
        }
        if (soapObject.hasProperty("Movil"))
        {
            Object obj = soapObject.getProperty("Movil");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                movil = j.toString();
            }else if (obj!= null && obj instanceof String){
                movil = (String) obj;
            }
        }
        if (soapObject.hasProperty("NIF"))
        {
            Object obj = soapObject.getProperty("NIF");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nIF = j.toString();
            }else if (obj!= null && obj instanceof String){
                nIF = (String) obj;
            }
        }
        if (soapObject.hasProperty("NoCuentaCorriente"))
        {
            Object obj = soapObject.getProperty("NoCuentaCorriente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                noCuentaCorriente = j.toString();
            }else if (obj!= null && obj instanceof String){
                noCuentaCorriente = (String) obj;
            }
        }
        if (soapObject.hasProperty("Nombre"))
        {
            Object obj = soapObject.getProperty("Nombre");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nombre = j.toString();
            }else if (obj!= null && obj instanceof String){
                nombre = (String) obj;
            }
        }
        if (soapObject.hasProperty("NotasOcultas"))
        {
            Object obj = soapObject.getProperty("NotasOcultas");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                notasOcultas = j.toString();
            }else if (obj!= null && obj instanceof String){
                notasOcultas = (String) obj;
            }
        }
        if (soapObject.hasProperty("Numero"))
        {
            Object obj = soapObject.getProperty("Numero");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                numero = j.toString();
            }else if (obj!= null && obj instanceof String){
                numero = (String) obj;
            }
        }
        if (soapObject.hasProperty("Observaciones"))
        {
            Object obj = soapObject.getProperty("Observaciones");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                observaciones = j.toString();
            }else if (obj!= null && obj instanceof String){
                observaciones = (String) obj;
            }
        }
        if (soapObject.hasProperty("Poblacion"))
        {
            Object obj = soapObject.getProperty("Poblacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                poblacion = j.toString();
            }else if (obj!= null && obj instanceof String){
                poblacion = (String) obj;
            }
        }
        if (soapObject.hasProperty("Provincia"))
        {
            Object obj = soapObject.getProperty("Provincia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                provincia = j.toString();
            }else if (obj!= null && obj instanceof String){
                provincia = (String) obj;
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
        if (soapObject.hasProperty("SolicitudServicio"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("SolicitudServicio");
            solicitudServicio = new VectorSolicitudServicio(j);
        }
        if (soapObject.hasProperty("SolicitudServicio1"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("SolicitudServicio1");
            solicitudServicio1 = new VectorSolicitudServicio(j);
        }
        if (soapObject.hasProperty("Telefono"))
        {
            Object obj = soapObject.getProperty("Telefono");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                telefono = j.toString();
            }else if (obj!= null && obj instanceof String){
                telefono = (String) obj;
            }
        }
        if (soapObject.hasProperty("TipoVia"))
        {
            Object obj = soapObject.getProperty("TipoVia");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tipoVia = j.toString();
            }else if (obj!= null && obj instanceof String){
                tipoVia = (String) obj;
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
                return apellidos;
            case 1:
                return cP;
            case 2:
                return cuentaContable;
            case 3:
                return deBaja;
            case 4:
                return deBajaSpecified;
            case 5:
                return domicilio;
            case 6:
                return email;
            case 7:
                return envioAtencionDe;
            case 8:
                return envioCalleNum;
            case 9:
                return envioNombre;
            case 10:
                return envioPoblacionCP;
            case 11:
                return escPisoPta;
            case 12:
                return expediente;
            case 13:
                return fK_IdMecanismoPago;
            case 14:
                return fK_IdMecanismoPagoSpecified;
            case 15:
                return fK_IdMomentoPago;
            case 16:
                return fK_IdMomentoPagoSpecified;
            case 17:
                return factura;
            case 18:
                return facturaAlbaran;
            case 19:
                return idCliente;
            case 20:
                return idClienteSpecified;
            case 21:
                return mailingCorreo;
            case 22:
                return mailingCorreoSpecified;
            case 23:
                return mailingCorreoOrdinario;
            case 24:
                return mailingCorreoOrdinarioSpecified;
            case 25:
                return mailingNoRecibir;
            case 26:
                return mailingNoRecibirSpecified;
            case 27:
                return mailingSMS;
            case 28:
                return mailingSMSSpecified;
            case 29:
                return mecanismoPago;
            case 30:
                return momentoPago;
            case 31:
                return movil;
            case 32:
                return nIF;
            case 33:
                return noCuentaCorriente;
            case 34:
                return nombre;
            case 35:
                return notasOcultas;
            case 36:
                return numero;
            case 37:
                return observaciones;
            case 38:
                return poblacion;
            case 39:
                return provincia;
            case 40:
                return publicado;
            case 41:
                return publicadoSpecified;
            case 42:
                return solicitudServicio;
            case 43:
                return solicitudServicio1;
            case 44:
                return telefono;
            case 45:
                return tipoVia;
            case 46:
                return fechaModificacion;
            case 47:
                return fechaModificacionSpecified;
            case 48:
                return timestamp.toString();
            case 49:
                return usuarioModificacion;
            case 50:
                return usuarioModificacionSpecified;
            case 51:
                return id;
            case 52:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 53;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Apellidos";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CP";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CuentaContable";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DeBaja";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DeBajaSpecified";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Domicilio";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Email";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "EnvioAtencionDe";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "EnvioCalleNum";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "EnvioNombre";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "EnvioPoblacionCP";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "EscPisoPta";
                break;
            case 12:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Expediente";
                break;
            case 13:
                info.type = Long.class;
                info.name = "FK_IdMecanismoPago";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdMecanismoPagoSpecified";
                break;
            case 15:
                info.type = Long.class;
                info.name = "FK_IdMomentoPago";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "FK_IdMomentoPagoSpecified";
                break;
            case 17:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Factura";
                break;
            case 18:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "FacturaAlbaran";
                break;
            case 19:
                info.type = Long.class;
                info.name = "IdCliente";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IdClienteSpecified";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MailingCorreo";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MailingCorreoSpecified";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MailingCorreoOrdinario";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MailingCorreoOrdinarioSpecified";
                break;
            case 25:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MailingNoRecibir";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MailingNoRecibirSpecified";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MailingSMS";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "MailingSMSSpecified";
                break;
            case 29:
                info.type = MecanismoPago.class;
                info.name = "MecanismoPago";
                break;
            case 30:
                info.type = MomentoPago.class;
                info.name = "MomentoPago";
                break;
            case 31:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Movil";
                break;
            case 32:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NIF";
                break;
            case 33:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NoCuentaCorriente";
                break;
            case 34:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Nombre";
                break;
            case 35:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NotasOcultas";
                break;
            case 36:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Numero";
                break;
            case 37:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Observaciones";
                break;
            case 38:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Poblacion";
                break;
            case 39:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Provincia";
                break;
            case 40:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "Publicado";
                break;
            case 41:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PublicadoSpecified";
                break;
            case 42:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "SolicitudServicio";
                break;
            case 43:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "SolicitudServicio1";
                break;
            case 44:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Telefono";
                break;
            case 45:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "TipoVia";
                break;
            case 46:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaModificacion";
                break;
            case 47:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fechaModificacionSpecified";
                break;
            case 48:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timestamp";
                break;
            case 49:
                info.type = Long.class;
                info.name = "usuarioModificacion";
                break;
            case 50:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "usuarioModificacionSpecified";
                break;
            case 51:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 52:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
