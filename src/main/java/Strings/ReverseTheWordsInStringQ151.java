package Strings;

public class ReverseTheWordsInStringQ151 {
        public String reverseWords(String s) {

            StringBuilder res = new StringBuilder();

            int i = s.length() - 1;

            while (i >= 0) {

                // Skip spaces
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }

                if (i < 0) {
                    break;
                }

                int end = i;

                // Find beginning of word
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }

                if (res.length() > 0) {
                    res.append(" ");
                }

                res.append(s, i + 1, end + 1);
            }

            return res.toString();

    }
}
