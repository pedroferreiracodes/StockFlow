package StockFlow;

import StockFlow.JFrameApp.ProductMenu;
import StockFlow.JFrameApp.Splash;
import StockFlow.jdbc.ProductJDBC;


public class App 
{
    public static void main( String[] args ) {

        App app = new App();
        app.bootstrap();



    }

    public void bootstrap() {
        ProductJDBC productJDBC = new ProductJDBC();

        ProductMenu productMenu = new ProductMenu();
        productMenu.setProductJDBC(productJDBC);
    }
}
