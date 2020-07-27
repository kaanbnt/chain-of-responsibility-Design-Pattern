package com.uniyaz.chainofresponsibility;

/**
 * ProblemHandler
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class ProblemHandler {

    private EnumDisease enumProblem;
    private String handlerClass;
    private String handlerName;
    private ProblemHandler nextHandler = null;

    public ProblemHandler(EnumDisease enumProblem) {
        this.enumProblem = enumProblem;
    }

    public ProblemHandler getNextHandler() {
        return nextHandler;
    }

    // bir sonraki handler setleniyor
    public ProblemHandler setNextHandler(ProblemHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public void solve(EnumDisease enumProblem) {
        System.out.println("- " + getHandlerClass() + " -");
        if (getEnumProblem().equals(enumProblem)) {
            System.out.println("Problem " + getHandlerName() + " tarafından çözüldü!\n");
        } else if (getNextHandler() != null) {
            System.out.println("Problem yönlendirildi..");
            getNextHandler().solve(enumProblem);
        } else {
            System.out.println("Bu problem çözümsüz.");
        }
    }

    public EnumDisease getEnumProblem() {
        return enumProblem;
    }

    public void setEnumProblem(EnumDisease enumProblem) {
        this.enumProblem = enumProblem;
    }

    public String getHandlerClass() {
        return handlerClass;
    }

    public void setHandlerClass(String handlerClass) {
        this.handlerClass = handlerClass;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
}
