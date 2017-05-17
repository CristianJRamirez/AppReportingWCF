package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.LineaService;

 
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import java.util.Vector;
import android.util.Base64;

public class VectorByte extends Vector<Byte> implements KvmSerializable {
    
    
    public VectorByte(){}
    
    public VectorByte(SoapPrimitive soapPrimitive) {
        if (soapPrimitive != null) {
            String result = soapPrimitive.toString();
            if (result != "") {
                byte[] bytes = Base64.decode(result, Base64.DEFAULT);
                for (final byte b : bytes) {
                    add(b);
                }
            }
        }
    }
    public VectorByte(byte[] bytes){
        for (byte b : bytes) {
            add(b);
        }
    }
 
    public Object getProperty(int arg0) {
        return this.get(arg0);
    }
    
 
    public int getPropertyCount() {
        return this.size();
    }
    
 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "Byte";
        info.type = Byte.class;
    }
    
 
    public String getInnerText() {
        return null;
    }
    
    
 
    public void setInnerText(String s) {
    }
    
    
 
    public void setProperty(int arg0, Object arg1) {
    }
    
 
    public String toString() {
        byte[] byteToString = toBytes();
        return Base64.encodeToString(byteToString, Base64.DEFAULT);
    }
    public byte[] toBytes(){
        byte[] bytes = new byte[this.size()];
        int i = 0;
        for (Byte b : this) {
            bytes[i++] = b;
        }
        return bytes;
    }
}
