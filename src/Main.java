import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        foo();
    }


    public static  void foo() throws SQLException, IOException {
        throw  new SQLException(); //checked exception
    }
}