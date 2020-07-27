package com.uniyaz.chainofresponsibility;

/**
 * SkinDoctor
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class PneumoniaDoctor extends ProblemHandler {
    public PneumoniaDoctor() {
        super(EnumDisease.SKIN);
        setHandlerClass("Zatürre Doktoru");
        setHandlerName("Prof. Dr. Tayfun Aybek");
    }
}
