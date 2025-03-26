

public class TiposPrimitivos{

    public static void main (String [] args, String string){

        char c;
        @SuppressWarnings("unused")
        byte b;
        @SuppressWarnings("unused")
        int i;
        @SuppressWarnings("unused")
        float f;
        @SuppressWarnings("unused")
        double d;

        c = 65;
        
        
        System.out.println("============================");
        System.out.println("char");
        System.out.println("valor de c como char" + c);
        System.out.printf(string, (int) c);
        System.out.println("============================================");
    }
}