import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            foo();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static  void foo() throws SQLException {
        //throw new ArithmeticException(); unchecked exception
        throw  new SQLException(); //checked exception
    }
}