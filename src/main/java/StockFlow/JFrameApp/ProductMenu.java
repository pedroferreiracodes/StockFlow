package StockFlow.JFrameApp;
import StockFlow.jdbc.ProductJDBC;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class ProductMenu extends JFrame {

    private ProductJDBC productJDBC;


    private JPanel background;
    private JButton mainMenuButton;
    private JTextField productName;
    private JTextField productID;
    private JButton addbtn;
    private JButton editbtn;
    private JButton deletebtn;
    private JTextField productQty;
    private JTextField productDescription;
    private JPanel productMenuPage;
    private JComboBox productCat;
    private JTable productTable;


    public ProductMenu() {

        setContentPane(productMenuPage);
        setSize(850, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        addbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("clicou add product");
                try {
                    Connection connection = productJDBC.connect();
                    PreparedStatement prepStatement = connection.prepareStatement("INSERT INTO product_table values(?,?,?,?,?)");
                    prepStatement.setInt(1, Integer.valueOf(productID.getText()));
                    prepStatement.setString(2, productName.getText());
                    prepStatement.setInt(3, Integer.valueOf(productQty.getText()));
                    prepStatement.setString(4, productDescription.getText());
                    prepStatement.setString(5, "aaaaaaaa");
                    prepStatement.executeUpdate();
                    
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public void setProductJDBC(ProductJDBC productJDBC) {
        this.productJDBC = productJDBC;
    }
}