package day_58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superMan
        Worker worker=new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();

        SuperMan superMan=(SuperMan) worker;      //DOWNCASTING FROM WORKER TO

    }
}
