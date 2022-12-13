import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        foo();
    }


    public static  void foo() throws SQLException {
        //throw new ArithmeticException(); unchecked exception
        throw  new SQLException(); //checked exception
    }
}