package com.uniyaz.chainofresponsibility;

/**
 * FluDoctor
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class FluDoctor extends ProblemHandler {
    public FluDoctor() {
        super(EnumDisease.FLU);
        setHandlerClass("Grip Doktoru");
        setHandlerName("Prof.Dr. Ömer Özkan");
    }
}
