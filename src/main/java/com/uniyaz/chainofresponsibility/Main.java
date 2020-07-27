package com.uniyaz.chainofresponsibility;

/**
 * Main
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class Main {
    public static void main(String[] args) {
        AnimalDoctorHandler handlerChain = new AnimalDoctorHandler();

        System.out.println("(1. SEVİYE PROBLEM ZİNCİRİ)");
        handlerChain.solve(EnumDisease.FLU);

        System.out.println("(3. SEVİYE PROBLEM ZİNCİRİ)");
        handlerChain.solve(EnumDisease.CANSER);

    }
}
