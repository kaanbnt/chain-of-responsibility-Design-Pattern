package com.uniyaz.chainofresponsibility;

/**
 * CancerDoctor
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class CancerDoctor extends ProblemHandler {
    public CancerDoctor() {
        super(EnumDisease.CANSER);
        setHandlerClass("Kanser Doktoru");
        setHandlerName("Prof. Dr. Gazi Yaşargil ");
    }
}
