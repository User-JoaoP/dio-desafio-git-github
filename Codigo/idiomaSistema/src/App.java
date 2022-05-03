import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale lugar = Locale.getDefault();
        System.out.print("A lingua da sua maquina está definida como: ");
    
        if("pt_BR".equals(lugar.toString())){
            System.out.println("Brasileira");
        }else{
            System.out.println(lugar);
        }
    }
}
