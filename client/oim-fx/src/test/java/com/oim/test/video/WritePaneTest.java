/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oim.test.video;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Only
 */
public class WritePaneTest extends Application {
	
	WritePaneFrame f = new WritePaneFrame();

	@Override
	public void start(Stage primaryStage) {
		f.show();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
