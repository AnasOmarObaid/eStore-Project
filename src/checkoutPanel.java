
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ِAnas Omar Obaid
 */
public class checkoutPanel extends JPanel {
    
    public checkoutPanel(Cart cart) {
        
      	setLayout(null);

		JLabel lblProduct = new JLabel("product:");
		lblProduct.setBounds(31, 11, 56, 14);
		Container contentPane = null;
		add(lblProduct);
		 Border border = BorderFactory.createLineBorder(Color.black);
	
		JLabel name = new JLabel(cart.getProduct());
		name.setBounds(97, 11, 75, 14);
		add(name);
		double total =cart.getPrice() *cart.getQuantity();
		JLabel lblNewLabel_1 = new JLabel("total price: "+total);
		lblNewLabel_1.setBounds(165, 36, 80, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity:");
		lblNewLabel_2.setBounds(31, 48, 75, 14);
         add(lblNewLabel_2);
		
		JLabel quantity = new JLabel(""+cart.getQuantity());
		quantity.setBounds(103, 48, 69, 14);
		add(quantity);
	//	int total= p.getPrice() *p.getQuantity();
		JLabel totalPro = new JLabel(""+"total");
		totalPro.setBounds(258, 36, 46, 14);
		add(totalPro);
		
		JLabel lblNewLabel_5 = new JLabel("Desciption:");
		lblNewLabel_5.setBounds(31, 74, 75, 14);
		add(lblNewLabel_5);
		
		JLabel des = new JLabel(" "+cart.getDescription());
		des.setVerticalAlignment(SwingConstants.TOP);
		des.setBounds(97, 73, 192, 56);
		add(des);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(10, 11, 294, 137);
		add(lblNewLabel_8);
		lblNewLabel_8.setBorder(border);
		des.setBorder(border);
		setSize(443,193);
    setPreferredSize(new Dimension(308, 149));  
        
        
    }
    
}
