package ThreeSolidPrinciples;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;


class BaseWorker {
    public void work() {
        System.out.print("I am working..")
    }
}


class Worker extends BaseWorker implements IEat, ISick{
    public void work() {
        super();
    }

    public void eat() {
        System.out.print("I am eating..")
    }

    public void sick() {
        System.out.print("I am sick.")
    }
}

class SuperWorker extends BaseWorker implements IEat, ISick{
    public void work() {
        System.out.print("I am working much more!")
    }

    public void eat() {
        System.out.print("I am eating..")
    }

    public void sick() {
        System.out.print("I am sick.")
    }
}

class TempWorker extends BaseWorker implements IEat, ISick{
    public void work() {
        System.out.print("I am working part time.")
    }

    public void eat() {
        System.out.print("I am eating..")
    }

    public void sick() {
        System.out.print("I am sick.")
    }
}