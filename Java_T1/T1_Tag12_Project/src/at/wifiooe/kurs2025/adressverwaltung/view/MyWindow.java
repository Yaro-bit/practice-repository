package at.wifiooe.kurs2025.adressverwaltung.view;

import java.awt.event.ActionEvent;

import at.wifiooe.kurs2025.adressverwaltung.controller.Start;

public class MyWindow extends MainWindow {
	private Start control;
	/**
	 * @return the control
	 */
	public Start getControl() {
		return control;
	}
	/**
	 * @param control the control to set
	 */
	public void setControl(Start control) {
		this.control = control;
	}
	@Override
	protected void do_btnExit_actionPerformed(ActionEvent e) {
		control.doExit();
	}

}

