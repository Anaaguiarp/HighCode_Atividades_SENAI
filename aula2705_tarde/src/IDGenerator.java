import java.util.UUID;

public class IDGenerator {

    private static int nextID = 1;
    private static int totalGerados = 0;
    private static String prefixo = "";

    public static String generateID() {
        String id = prefixo + nextID;
        nextID++;
        totalGerados++;
        return id;
    }

    public static void resetIDCounter() {
        nextID = 1;
    }

    public static int getTotalGerados() {
        return totalGerados;
    }

    public static String generateUUID() {
        totalGerados++;
        return prefixo + UUID.randomUUID().toString();
    }

    public static void setPrefixo(String novoPrefixo) {
        prefixo = novoPrefixo;
    }

    public static String getPrefixo() {
        return prefixo;
    }
}