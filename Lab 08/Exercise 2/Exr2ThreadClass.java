package com.capgemini.lab8;

import java.time.LocalTime;

public class Exr2ThreadClass extends Thread {
	
	public void run() {
        while (true) {
            System.out.println(LocalTime.now());
            try { Thread.sleep(5000); }
            catch(InterruptedException e) { System.out.println(e); }
        }
    }

}
