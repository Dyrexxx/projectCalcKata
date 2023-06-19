import java.util.HashMap;
import java.util.Map;

interface Lists {
    Map<String, String> mapRomanDozens = new HashMap<String, String>() {{
        put("1", "X");
        put("2", "XX");
        put("3", "XXX");
        put("4", "XL");
        put("5", "L");
        put("6", "LX");
        put("7", "LXX");
        put("8", "LXXX");
        put("9", "XC");
    }};
    Map<String, String> mapRomanUnits = new HashMap<String, String>() {{
        put("1", "I");
        put("2", "II");
        put("3", "III");
        put("4", "IV");
        put("5", "V");
        put("6", "VI");
        put("7", "VII");
        put("8", "VIII");
        put("9", "IX");
        put("10", "X");
    }};
}
