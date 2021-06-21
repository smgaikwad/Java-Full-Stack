package stringmanipulation;

public class StringMethodsTestApp {
    public static void main(String[] args) {
        String string = new String("Sooraj");
            String s = null;
        string.concat(" Gaikwad");

        System.out.println(string);
        System.out.println(string.charAt(0));
        System.out.println(string.concat("-infotech"));
        System.out.println(string.equals("Sooraj"));
        System.out.println(string.substring(0, 6));
        System.out.println(string.length());
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.indexOf(('r')));


        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("abcdefghijklmnop");
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("q");
        System.out.println(stringBuffer.capacity());
    }
}
