package com.uniyaz.chainofresponsibility;

/**
 * AnimalDoctorHandler
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class AnimalDoctorHandler {
    ProblemHandler fluHandler = new FluDoctor();
    ProblemHandler skinHandler = new PneumoniaDoctor();
    ProblemHandler cancerHandler = new CancerDoctor();


    // chain of responsibility
    public AnimalDoctorHandler() {
        fluHandler.setNextHandler(
                skinHandler.setNextHandler(
                        cancerHandler
                ));
    }

    public void solve(EnumDisease problem) {
        fluHandler.solve(problem);
    }
}
