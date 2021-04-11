import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        String begginingOfPoemToThrowOffAlgorithm = "10101010101010101010";
//        String s = "10101010101010101010";
        String middleOfPoemMeterData = "10010011100100111001001110010011";//100-100-11-100-100-11
        String s = "10010011100100111001001110010011";//100-100-11-100-100-11
        String middleOfPoemMeterData1 = "10010011100100121001001110010012";//100-100-11-100-100-12
        //choose arbitrary number of digits of pattern length, making it compatible with the above strings as just one example
        //loop through string, finding how well that pattern matches(how many instances of that pattern
        //find percentage of a certain pattern throughout string(43% iambic, 12% random patttern of 10010011, etc)
        //point out common rhyming patterns/phrases
        //in app, will display different rhyming patten on top of words. for example, right on top of words in a line will appear a 5 long pattern, and on on top of that appear smaller patterns, etc.
        for (int i =s.length()/2;i > sqrt(s.length());i--){
            if (s.length() % i == 0) {
                String pattern = s.substring(0, i);
                boolean isPattern = true;
                int j = i + 1;
                while (isPattern && j < s.length()) {
                    if (s.substring(i, j).equals(pattern)) {
                        j = j + i;
                    } else {
                        isPattern = false;
                    }
                }
                if (isPattern) System.out.println(pattern+"yes");
            }
        }
    }
}
