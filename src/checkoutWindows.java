


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ِAnas Omar Obaid
 */
public class checkoutWindows extends JFrame{
      
	Customer cus=null;

	private JPanel contentPane;

	public checkoutWindows() {
		 Border border = BorderFactory.createLineBorder(Color.black);
		
		setTitle("Cart checkout Windows");
		setBounds(100, 100, 578, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Confirm Order and submit");
		lblNewLabel.setBounds(30, 11, 160, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cancel Checkout");
		btnNewButton.setBounds(345, 13, 154, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 11, 542, 31);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setBorder(border);
		
		JLabel lblNewLabel_2 = new JLabel("Shipping Address");
		lblNewLabel_2.setBounds(30, 65, 95, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(30, 90, 147, 121);
		contentPane.add(textArea);
		
                  for(int i = 0 ; i <ManagerWindow.sizeCustomar ; ++i){
               {
                if(LoginFrame.nameCustomar.equals(ManagerWindow.customar[i].getUserName())){
      
                textArea.setText(ManagerWindow.customar[i].getAddrees());
                    }}}
		JLabel label = new JLabel("");
		label.setBounds(10, 65, 205, 173);
		contentPane.add(label);
		label.setBorder(border);
		
		
		JScrollPane scrollPane_1 = new JScrollPane(textArea);
		scrollPane_1.setBounds(30, 90, 147, 121);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		contentPane.add(scrollPane_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 262, 173);
		//contentPane.add(panel);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBounds(239, 65, 313, 173);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		contentPane.add(scrollPane);
			
		JButton btnNewButton_1 = new JButton("Confirm order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      JOptionPane.showMessageDialog(null, "You Order in submit sucessfully \n Thanks you");
	
			}
		});
		btnNewButton_1.setBounds(10, 268, 135, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Total amount items in cart is "+CustomarWindow.countinerCart);
		lblNewLabel_3.setBounds(249, 259, 221, 14);
		contentPane.add(lblNewLabel_3);
        
		
		JLabel lblNewLabel_4 = new JLabel("Total amount Price of item in cart is " );
		lblNewLabel_4.setBounds(246, 292, 253, 14);
		contentPane.add(lblNewLabel_4);
      
   
                for(int i = 0 ; i <ManagerWindow.sizeCustomar ; ++i){
                for(int j = 0 ; j < CustomarWindow.countinerCart ; ++j){ // To Know Who Click The Button
                    if(LoginFrame.nameCustomar.equals(ManagerWindow.customar[i].getUserName()) && LoginFrame.nameCustomar.equals(CustomarWindow.cart[j].getUserName())){
                        panel.add(  new checkoutPanel(CustomarWindow.cart[j]));} // This Too Add The Info In Box Panel
                }      
                }
                
                
      
  }  
}
