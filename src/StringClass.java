import java.lang.reflect.Array;
import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        String table = "cars";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT * FROM ");
        stringBuilder.append(table);
        stringBuilder.append(" WHERE ");
        stringBuilder.append(getStr("model", "V-60"));
        stringBuilder.append(getStr("country", "Germany"));
        stringBuilder.append(getStr("city", "Berlin"));
        stringBuilder.append(getStr("year", null));
        stringBuilder.append(getStr("active", true));
        stringBuilder.append(";");
        System.out.println(stringBuilder);
    }

    public static String getStr(String arg, String val) {
        String str = "";
        if (val != null) {
            str = arg + " = " + "'"+val+"'"+" AND ";
        }
        return str;
    }

    public static String getStr(String arg, boolean val) {
        String str = "";
        str = arg + " = " + "'" + val + "'";
        return str;
    }
}
