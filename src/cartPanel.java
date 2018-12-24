

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class cartPanel extends JPanel{
  Border border,border1;
  public cartPanel(Cart cart ){
      
setLayout(null);
 border = BorderFactory.createLineBorder(Color.black);
 border1 = BorderFactory.createLineBorder(Color.RED);      
      
 JLabel lblProduct = new JLabel("product:");
lblProduct.setBounds(147, 24, 56, 14);
Container contentPane = null;
add(lblProduct);     

JLabel name = new JLabel(cart.getProduct());
name.setBounds(213, 24, 75, 14);
add(name);
double total =cart.getPrice() * cart.getQuantity();

JLabel lblNewLabel_1 = new JLabel("total price: "+total);
lblNewLabel_1.setBounds(288, 24, 100, 70);
add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("Quantity:");
lblNewLabel_2.setBounds(147, 61, 75, 14);
add(lblNewLabel_2);

JLabel quantity = new JLabel(""+cart.getQuantity());
quantity.setBounds(219, 61, 69, 14);
add(quantity);

JLabel lblNewLabel_5 = new JLabel("Desciption:");
lblNewLabel_5.setBounds(147, 87, 75, 14);
add(lblNewLabel_5);

JLabel des = new JLabel(" "+cart.getDescription());
des.setVerticalAlignment(SwingConstants.TOP);
des.setBounds(213, 86, 192, 56);
add(des);

JButton btnNewButton_1 = new JButton("Remove");

cartPanel me = this;
// Remove The Product

btnNewButton_1.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e){
  int findProduct=0;   
   /*
   for(int i = 0 ; i <ManagerWindow.sizeCustomar ; ++i){
   for(int j = 0 ; j < CustomarWindow.countinerCart ; ++j){
  if(LoginFrame.nameCustomar.equals(ManagerWindow.customar[i].getUserName()) && LoginFrame.nameCustomar.equals(CustomarWindow.cart[j].getUserName())){
    
                    }
   }
    
}
*/
  CustomarWindow.panel1.remove(me);
  
   
 }  
       
 
});






btnNewButton_1.setBounds(27, 119, 89, 23);
add(btnNewButton_1);
    
 JLabel lblNewLabel_8 = new JLabel("");
lblNewLabel_8.setBounds(126, 24, 294, 137);
add(lblNewLabel_8);   
    
JLabel label = new JLabel("");
label.setBounds(10, 11, 423, 168);
add(label);
			
label.setBorder(border);
lblNewLabel_8.setBorder(border);
des.setBorder(border);
setSize(443,193);
setPreferredSize(new Dimension(470, 194));    
    
    
    
    
    

  }
}
