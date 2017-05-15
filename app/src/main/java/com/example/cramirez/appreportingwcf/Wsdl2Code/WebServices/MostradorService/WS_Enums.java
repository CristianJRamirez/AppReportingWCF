package com.example.cramirez.appreportingwcf.Wsdl2Code.WebServices.MostradorService;
//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 5/15/2017 9:13:06 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
public class WS_Enums {

    public enum SoapProtocolVersion{
        	Default(0),
        	Soap11(1),
        	Soap12(2);
        
        private int code;
        
        SoapProtocolVersion(int code){
            this.code = code;
        }
        
        public int getCode(){
            return code;
        }
        
        public static SoapProtocolVersion fromString(String str)
        {
            if (str.equals("Default"))
                return Default;
            if (str.equals("Soap11"))
                return Soap11;
            if (str.equals("Soap12"))
                return Soap12;
            return null;
        }
    }
    public enum LogTramaeTipoLog{
        	Funcion(0),
        	Error(1);
        
        private int code;
        
        LogTramaeTipoLog(int code){
            this.code = code;
        }
        
        public int getCode(){
            return code;
        }
        
        public static LogTramaeTipoLog fromString(String str)
        {
            if (str.equals("Funcion"))
                return Funcion;
            if (str.equals("Error"))
                return Error;
            return null;
        }
    }
    public enum eCodigoCertio{
        	IN(0),
        	FO(1),
        	FA(2),
        	FR(3),
        	FD(4),
        	FB(5),
        	FC(6),
        	AO(7),
        	AA(8),
        	AR(9),
        	EX(10),
        	SO(11);
        
        private int code;
        
        eCodigoCertio(int code){
            this.code = code;
        }
        
        public int getCode(){
            return code;
        }
        
        public static eCodigoCertio fromString(String str)
        {
            if (str.equals("IN"))
                return IN;
            if (str.equals("FO"))
                return FO;
            if (str.equals("FA"))
                return FA;
            if (str.equals("FR"))
                return FR;
            if (str.equals("FD"))
                return FD;
            if (str.equals("FB"))
                return FB;
            if (str.equals("FC"))
                return FC;
            if (str.equals("AO"))
                return AO;
            if (str.equals("AA"))
                return AA;
            if (str.equals("AR"))
                return AR;
            if (str.equals("EX"))
                return EX;
            if (str.equals("SO"))
                return SO;
            return null;
        }
    }
}
