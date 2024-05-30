package StockFlow.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductJDBC {

    private String url = "jdbc:mysql://localhost:3306/stock_flow";
    private String username = "root";
    private String password = "root";


    private Connection connection;


    public Connection connect (){

        try {
            connection = DriverManager.getConnection(url, username, password);

        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
