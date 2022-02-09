public class CaesarQA1 {
    private static String encrypt(String text, int x)
    {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + x - 65) % 26 + 65);
                result.append(ch);
            }
            else {
                char ch = (char)(((int)text.charAt(i) + x - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }
    private static String decrypt(String text, int x)
    {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) - x - 65) % 26 + 65);
                result.append(ch);
            }
            else {
                char ch = (char)(((int)text.charAt(i) - x - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
        if (args == null || args.length < 4) {
            System.out.println("Not enough arguments.");
            System.exit(1);
        }

        int offset=0;
        String oFlag = args[2];
        if (oFlag.equals("-o")){
            offset = Integer.valueOf(args[args.length - 1]);
        }

        String eFlag = args[0];
        if (eFlag.equals("-e")){
            System.out.print(encrypt(args[1], offset));
        }

        String dFlag = args[0];
        if (dFlag.equals("-d")){
            System.out.print(decrypt(args[1], offset));
        }
    }











}
