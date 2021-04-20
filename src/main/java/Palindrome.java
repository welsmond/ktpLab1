public class Palindrome {
    /*В Java args содержатся предоставленные аргументы комндной строки в виде массива String объектов*/
    public static void main(String[] args){
        for (int i = 0; i<args.length; i++){
            String s = args[i];
            isPalindrome(s); //Вызов метода isPalindrome для проверки каждого аргумента.
        }
    }
    /*reverseString Метод позволяет перевернуть строку*/
    public static String reverseString(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }
    /*isPalindrome Метод проверяет является ли данная строка палиндромом, использует метод reverseString для того, чтобы перевернуть
     * строку и с помощью метода equals их сравнивает и возвращает результат */
    public static boolean isPalindrome(String s){
        System.out.println ("Первоначальная  строка = '" + s + "'");
        System.out.println ("Перевернутая строка = '" + reverseString(s) + "'");
        if (s.equals(reverseString(s)))
            System.out.println ("Эта строка является палиндромом" + '\n');
        else
            System.out.println ("Эта строка не является палиндромом"+ '\n');
        return s.equals(reverseString(s));
    }
}
