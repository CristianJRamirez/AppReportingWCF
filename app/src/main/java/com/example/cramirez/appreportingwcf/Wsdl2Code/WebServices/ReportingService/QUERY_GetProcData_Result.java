package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.ReportingService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 4/25/2017 7:43:53 AM
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

public class QUERY_GetProcData_Result implements KvmSerializable {
    
    public int cHARACTER_MAXIMUM_LENGTH;
    public boolean cHARACTER_MAXIMUM_LENGTHSpecified;
    public int cHARACTER_OCTET_LENGTH;
    public boolean cHARACTER_OCTET_LENGTHSpecified;
    public int dATA_TYPE;
    public boolean dATA_TYPESpecified;
    public String dESCRIPTION;
    public boolean iS_NULLABLE;
    public boolean iS_NULLABLESpecified;
    public String lOCAL_TYPE_NAME;
    public int nUMERIC_PRECISION;
    public boolean nUMERIC_PRECISIONSpecified;
    public int nUMERIC_SCALE;
    public boolean nUMERIC_SCALESpecified;
    public int oRDINAL_POSITION;
    public boolean oRDINAL_POSITIONSpecified;
    public String pARAMETER_DEFAULT;
    public Byte pARAMETER_HASDEFAULT;
    public boolean pARAMETER_HASDEFAULTSpecified;
    public String pARAMETER_NAME;
    public int pARAMETER_TYPE;
    public boolean pARAMETER_TYPESpecified;
    public String pROCEDURE_CATALOG;
    public String pROCEDURE_NAME;
    public String pROCEDURE_SCHEMA;
    public String tYPE_NAME;
    public String id;
    public String ref;
    
    public QUERY_GetProcData_Result(){}
    
    public QUERY_GetProcData_Result(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("CHARACTER_MAXIMUM_LENGTH"))
        {
            Object obj = soapObject.getProperty("CHARACTER_MAXIMUM_LENGTH");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cHARACTER_MAXIMUM_LENGTH = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                cHARACTER_MAXIMUM_LENGTH = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CHARACTER_MAXIMUM_LENGTHSpecified"))
        {
            Object obj = soapObject.getProperty("CHARACTER_MAXIMUM_LENGTHSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cHARACTER_MAXIMUM_LENGTHSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cHARACTER_MAXIMUM_LENGTHSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("CHARACTER_OCTET_LENGTH"))
        {
            Object obj = soapObject.getProperty("CHARACTER_OCTET_LENGTH");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cHARACTER_OCTET_LENGTH = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                cHARACTER_OCTET_LENGTH = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CHARACTER_OCTET_LENGTHSpecified"))
        {
            Object obj = soapObject.getProperty("CHARACTER_OCTET_LENGTHSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cHARACTER_OCTET_LENGTHSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cHARACTER_OCTET_LENGTHSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("DATA_TYPE"))
        {
            Object obj = soapObject.getProperty("DATA_TYPE");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dATA_TYPE = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                dATA_TYPE = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("DATA_TYPESpecified"))
        {
            Object obj = soapObject.getProperty("DATA_TYPESpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dATA_TYPESpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dATA_TYPESpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("DESCRIPTION"))
        {
            Object obj = soapObject.getProperty("DESCRIPTION");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dESCRIPTION = j.toString();
            }else if (obj!= null && obj instanceof String){
                dESCRIPTION = (String) obj;
            }
        }
        if (soapObject.hasProperty("IS_NULLABLE"))
        {
            Object obj = soapObject.getProperty("IS_NULLABLE");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                iS_NULLABLE = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                iS_NULLABLE = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IS_NULLABLESpecified"))
        {
            Object obj = soapObject.getProperty("IS_NULLABLESpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                iS_NULLABLESpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                iS_NULLABLESpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("LOCAL_TYPE_NAME"))
        {
            Object obj = soapObject.getProperty("LOCAL_TYPE_NAME");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lOCAL_TYPE_NAME = j.toString();
            }else if (obj!= null && obj instanceof String){
                lOCAL_TYPE_NAME = (String) obj;
            }
        }
        if (soapObject.hasProperty("NUMERIC_PRECISION"))
        {
            Object obj = soapObject.getProperty("NUMERIC_PRECISION");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nUMERIC_PRECISION = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                nUMERIC_PRECISION = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NUMERIC_PRECISIONSpecified"))
        {
            Object obj = soapObject.getProperty("NUMERIC_PRECISIONSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nUMERIC_PRECISIONSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                nUMERIC_PRECISIONSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("NUMERIC_SCALE"))
        {
            Object obj = soapObject.getProperty("NUMERIC_SCALE");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nUMERIC_SCALE = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                nUMERIC_SCALE = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("NUMERIC_SCALESpecified"))
        {
            Object obj = soapObject.getProperty("NUMERIC_SCALESpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nUMERIC_SCALESpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                nUMERIC_SCALESpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ORDINAL_POSITION"))
        {
            Object obj = soapObject.getProperty("ORDINAL_POSITION");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                oRDINAL_POSITION = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                oRDINAL_POSITION = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ORDINAL_POSITIONSpecified"))
        {
            Object obj = soapObject.getProperty("ORDINAL_POSITIONSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                oRDINAL_POSITIONSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                oRDINAL_POSITIONSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PARAMETER_DEFAULT"))
        {
            Object obj = soapObject.getProperty("PARAMETER_DEFAULT");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pARAMETER_DEFAULT = j.toString();
            }else if (obj!= null && obj instanceof String){
                pARAMETER_DEFAULT = (String) obj;
            }
        }
        if (soapObject.hasProperty("PARAMETER_HASDEFAULT"))
        {
            Object obj = soapObject.getProperty("PARAMETER_HASDEFAULT");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pARAMETER_HASDEFAULT = Byte.parseByte(j.toString());
            }else if (obj!= null && obj instanceof Byte){
                pARAMETER_HASDEFAULT = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("PARAMETER_HASDEFAULTSpecified"))
        {
            Object obj = soapObject.getProperty("PARAMETER_HASDEFAULTSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pARAMETER_HASDEFAULTSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pARAMETER_HASDEFAULTSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PARAMETER_NAME"))
        {
            Object obj = soapObject.getProperty("PARAMETER_NAME");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pARAMETER_NAME = j.toString();
            }else if (obj!= null && obj instanceof String){
                pARAMETER_NAME = (String) obj;
            }
        }
        if (soapObject.hasProperty("PARAMETER_TYPE"))
        {
            Object obj = soapObject.getProperty("PARAMETER_TYPE");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pARAMETER_TYPE = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                pARAMETER_TYPE = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("PARAMETER_TYPESpecified"))
        {
            Object obj = soapObject.getProperty("PARAMETER_TYPESpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pARAMETER_TYPESpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pARAMETER_TYPESpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("PROCEDURE_CATALOG"))
        {
            Object obj = soapObject.getProperty("PROCEDURE_CATALOG");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pROCEDURE_CATALOG = j.toString();
            }else if (obj!= null && obj instanceof String){
                pROCEDURE_CATALOG = (String) obj;
            }
        }
        if (soapObject.hasProperty("PROCEDURE_NAME"))
        {
            Object obj = soapObject.getProperty("PROCEDURE_NAME");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pROCEDURE_NAME = j.toString();
            }else if (obj!= null && obj instanceof String){
                pROCEDURE_NAME = (String) obj;
            }
        }
        if (soapObject.hasProperty("PROCEDURE_SCHEMA"))
        {
            Object obj = soapObject.getProperty("PROCEDURE_SCHEMA");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pROCEDURE_SCHEMA = j.toString();
            }else if (obj!= null && obj instanceof String){
                pROCEDURE_SCHEMA = (String) obj;
            }
        }
        if (soapObject.hasProperty("TYPE_NAME"))
        {
            Object obj = soapObject.getProperty("TYPE_NAME");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tYPE_NAME = j.toString();
            }else if (obj!= null && obj instanceof String){
                tYPE_NAME = (String) obj;
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
                return cHARACTER_MAXIMUM_LENGTH;
            case 1:
                return cHARACTER_MAXIMUM_LENGTHSpecified;
            case 2:
                return cHARACTER_OCTET_LENGTH;
            case 3:
                return cHARACTER_OCTET_LENGTHSpecified;
            case 4:
                return dATA_TYPE;
            case 5:
                return dATA_TYPESpecified;
            case 6:
                return dESCRIPTION;
            case 7:
                return iS_NULLABLE;
            case 8:
                return iS_NULLABLESpecified;
            case 9:
                return lOCAL_TYPE_NAME;
            case 10:
                return nUMERIC_PRECISION;
            case 11:
                return nUMERIC_PRECISIONSpecified;
            case 12:
                return nUMERIC_SCALE;
            case 13:
                return nUMERIC_SCALESpecified;
            case 14:
                return oRDINAL_POSITION;
            case 15:
                return oRDINAL_POSITIONSpecified;
            case 16:
                return pARAMETER_DEFAULT;
            case 17:
                return pARAMETER_HASDEFAULT.toString();
            case 18:
                return pARAMETER_HASDEFAULTSpecified;
            case 19:
                return pARAMETER_NAME;
            case 20:
                return pARAMETER_TYPE;
            case 21:
                return pARAMETER_TYPESpecified;
            case 22:
                return pROCEDURE_CATALOG;
            case 23:
                return pROCEDURE_NAME;
            case 24:
                return pROCEDURE_SCHEMA;
            case 25:
                return tYPE_NAME;
            case 26:
                return id;
            case 27:
                return ref;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 28;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CHARACTER_MAXIMUM_LENGTH";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CHARACTER_MAXIMUM_LENGTHSpecified";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CHARACTER_OCTET_LENGTH";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "CHARACTER_OCTET_LENGTHSpecified";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "DATA_TYPE";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "DATA_TYPESpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DESCRIPTION";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IS_NULLABLE";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IS_NULLABLESpecified";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LOCAL_TYPE_NAME";
                break;
            case 10:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "NUMERIC_PRECISION";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NUMERIC_PRECISIONSpecified";
                break;
            case 12:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "NUMERIC_SCALE";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "NUMERIC_SCALESpecified";
                break;
            case 14:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ORDINAL_POSITION";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ORDINAL_POSITIONSpecified";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PARAMETER_DEFAULT";
                break;
            case 17:
                info.type = Byte.class;
                info.name = "PARAMETER_HASDEFAULT";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PARAMETER_HASDEFAULTSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PARAMETER_NAME";
                break;
            case 20:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PARAMETER_TYPE";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "PARAMETER_TYPESpecified";
                break;
            case 22:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PROCEDURE_CATALOG";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PROCEDURE_NAME";
                break;
            case 24:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PROCEDURE_SCHEMA";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "TYPE_NAME";
                break;
            case 26:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 27:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Ref";
                break;
        }
    }
    

    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
