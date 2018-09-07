package ThreeSolidPrinciples;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

// separating IWorker interface into 2 which implies the Interface Segregation Principle.
// The robot class will not implement the eat method.
// This file also implies Single Responsibility Principle as it is only responsible for interfaces
// this file doesn't apply to Open Class Principle
interface IWorkable {
    public void work();
}

interface IFeedable {
    public void eat();
}
