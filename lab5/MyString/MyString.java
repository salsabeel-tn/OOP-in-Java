public class MyString {

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
