package stringmanipulation;

public class StringManipDemo {

    public static void StrConcat(String str1)
    {
        str1 = str1 + "Soorajj";
    }

    public static void StrBufConcat(StringBuffer str2)
    {
        str2.append("Sooraj");
    }

    public static void StrBuildConcat(StringBuilder str3)
    {
        str3.append("Sooraj");
    }

    public static void main(String[] args)
    {
        String str1 = "Hello!";
        StrConcat(str1);
        System.out.println("The final String is - " + str1);

        StringBuffer str2 = new StringBuffer("Hello!");
        StrBufConcat(str2);
        System.out.println("The final String is - " + str2);

        StringBuilder str3 = new StringBuilder("Hello!");
        StrBuildConcat(str3);
        System.out.println("The final String is -" + str3);
    }
}