package com.noqwerty.js;

import javax.microedition.midlet.MIDlet;

import com.sun.lwuit.Button;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;

public class SplashForm extends Form {
	private MIDlet midlet;
	
	public SplashForm(MIDlet midlet) {
		this.midlet = midlet;
		initComponents();
		startProgress();
	}

	private void initComponents() {
		// configure background 
        try {
            this.getStyle().setBgImage(Image.createImage("images/splashbg.JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private void startProgress() {
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
        MainMenuForm form = new MainMenuForm(midlet);
        form.show();
	}
}
