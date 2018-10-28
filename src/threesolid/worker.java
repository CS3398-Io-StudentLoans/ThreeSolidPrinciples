package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;


class BaseWorker {
    public String work() {
        return "I am working..";
    }
}

class Worker extends BaseWorker implements IEat, ISick {

    public boolean eat() {
        return true;
    }

    public boolean sick() {
        return true;
    }
}

class SuperWorker extends BaseWorker implements IEat, ISick{
    public String work() {
        return "Super worker working much more!";
    }

    public boolean eat() {
        return true;
    }

    public boolean sick() {
        return false;
    }
}

class TempWorker extends BaseWorker implements IEat, ISick{
    public String work() {
        return "I am working part time.";
    }

    public boolean eat() {
    	return false;
    }

    public boolean sick() {
        return true;
    }
}