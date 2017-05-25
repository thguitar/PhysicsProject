package br.com.physics.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.physics.model.Forca;
import br.com.physics.view.HomeView;

public class Control {
	private HomeView homeView;
	private Forca forca;
	private JTextField F1, F2, T1, T2;
	private JButton btnCalcular;
	
	public Control(){
		homeView = new HomeView();
		controller();
		homeView.setVisible(true);
	}

	private void controller() {
		F1 = homeView.getTextFieldF1();
		F2 = homeView.getTextFieldF2();
		
		T1 = homeView.getTextFieldTeta1();
		T2 = homeView.getTextFieldTeta2();
		
		btnCalcular = homeView.getBtnCalcular();
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(validFields()){
					forca = new Forca(Double.parseDouble(F1.getText()), Double.parseDouble(T1.getText()), Double.parseDouble(F2.getText()), Double.parseDouble(T2.getText()));
					showResult();
				}
			}
		});
	}
	
	private boolean validFields(){
		if(F1.getText().isEmpty()||F2.getText().isEmpty()||T1.getText().isEmpty()||T2.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Preechimento Obrigatório", "Atenção", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		return true;
	}
	
	private void showResult(){
		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(2);
		format.setRoundingMode(RoundingMode.HALF_UP);
		
		JOptionPane.showMessageDialog(null, "Componentes Força 1: F1x: "+format.format(forca.getF1x())+"     F1y: "+format.format(forca.getF1y())+
				"\nComponentes Força 2: F2x: "+format.format(forca.getF2x())+"     F2y: "+format.format(forca.getF2y())+
				"\nComponentes Força 3: F3x: "+format.format(forca.getF3x())+"     F3y: "+format.format(forca.getF3y())+
				"\nModulo da Força 3: "+format.format(forca.getF3())+
				"\nÂngulo da Força 3: "+format.format(forca.getAnguloF3())+" °"
		);
		
	}
}
