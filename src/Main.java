public class Main {
    public static void main(String[] args) {

        String str = null;

        if (str == null) {
            try {
                throw new MyException("Exception");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        //foo();
    }

    public static void foo() {
        try {
            int[] arr = {};
            System.out.println(arr[0]);

        } catch (Exception ex) {
            ex.printStackTrace();

//            System.out.println(ex.getClass().getName());
//
//            System.out.println("Xeta bas verdi!");

            StackTraceElement[] st = ex.getStackTrace();
            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
            for (int i = 0; i < st.length; i++) {
                StackTraceElement stE = st[i];
                System.err.println("\tat main.Main." + stE.getMethodName() + "(" + stE.getFileName() + ":" + stE.getLineNumber() + ")");

            }
        }
    }
}