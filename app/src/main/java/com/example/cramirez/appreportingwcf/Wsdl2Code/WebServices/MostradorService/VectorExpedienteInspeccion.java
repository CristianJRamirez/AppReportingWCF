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
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import java.util.Vector;
import package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService.ExpedienteInspeccion;

public class VectorExpedienteInspeccion extends Vector<ExpedienteInspeccion> implements KvmSerializable {
    
    
    public VectorExpedienteInspeccion(){}
    
    public VectorExpedienteInspeccion(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject != null){
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0<size;i0++){
                Object obj = soapObject.getProperty(i0);
                if (obj!=null && obj.getClass().equals(SoapObject.class)){
                    SoapObject j0 =(SoapObject) soapObject.getProperty(i0);
                    ExpedienteInspeccion j1= new ExpedienteInspeccion(j0);
                    add(j1);
                }
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0);
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "ExpedienteInspeccion";
        info.type = ExpedienteInspeccion.class;
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
