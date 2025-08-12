public class SecurityUtil {
    public static String sanitizeInput(String input) {
        return input == null ? "" : input.replaceAll("[<>\"']", "");
    }
}
