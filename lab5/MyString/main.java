/**
 * main MyString class 
 */
public class main {

    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'a'};
        MyString s = new MyString(chars);
        // testing some methods
        System.out.println("String: " + s);
        System.out.println("Character at index 0: " + s.charAt(0));
        System.out.println("Character at index 1: " + s.charAt(1));
        System.out.println("String length: " + s.length());
        System.out.println("Substring from 0 to 1: " + s.substring(0, 1));
        System.out.println("To lower case: " + s.toLowerCase());
        System.out.println("Compare with 'ABZ': " + s.compare("ABZ"));
        System.out.println("Compare with 'abcde': " + s.compare("abcd"));
        System.out.println("Compare with 'ABa': " + s.compare("ABa"));
        System.out.println("Substring from index 1: " + s.substring(1));
        System.out.println("To upper case: " + s.toUpperCase());
    }


}
class MyString {

    private char[] string;

    public MyString(char[] chars) {
        string = chars;
    }

    public char charAt(int index) {
        return string[index];
    }

    public int length() {
        return string.length;
    }

    public MyString substring(int begin, int end) {
        char[] s = new char[end - begin + 1];
        int k = 0;
        for (int i = begin; i <= end; i++) {
            s[k] = string[i];
            k++;
        }
        return new MyString(s);
    }

    public MyString toLowerCase() {
        char[] s = new char[length()];
        for (int i = 0; i < length(); i++) {
            if (Character.isUpperCase(string[i])) {
                s[i] = (char) ((int) (string[i]) + 32);
            } else {
                s[i] = string[i];
            }
        }
        return new MyString(s);
    }

    public boolean equals(MyString s) {
        if (this.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (s.charAt(i) != string[i]) {
                return false;
            }
        }
        return true;
    }

    public static MyString valueOf(int i) {
        char[] chars = ("" + i).toCharArray();
        return new MyString(chars);
    }

    public int compare(String s) {
        if (this.length() == s.length()) {
            for (int i = 0; i < length(); i++) {
                if (s.charAt(i) != this.charAt(i)) {
                    return this.charAt(i) - s.charAt(i);
                }
            }
            return 0;
        }
        return this.length() - s.length();
    }

    public MyString substring(int begin) {
        return this.substring(begin, length() - 1);
    }

    public MyString toUpperCase() {
        char[] s = new char[length()];
        for (int i = 0; i < length(); i++) {
            if (Character.isLowerCase(string[i])) {
                s[i] = (char) ((int) (string[i]) - 32);
            } else {
                s[i] = string[i];
            }
        }
        return new MyString(s);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < length(); i++) {
            s += charAt(i);
        }
        return s;
    }
}