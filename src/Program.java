import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

   public static void main(String[] args){
       String program1 = getInput("program1.txt");
       String program2 = getInput("program2.txt");
       Normalizer normalizer = new Normalizer();
       String normalizedCode1 = normalizer.getNormalizedCode(program1);

       String normalizedCode2 = normalizer.getNormalizedCode(program2);
       Plagiator plag = new Plagiator();
       System.out.println(plag.AveragePlagiatTest(normalizedCode1 , normalizedCode2));
       System.out.println(plag.longestCommonSubstringTest(normalizedCode1 , normalizedCode2));
       System.out.println(plag.WShinglingTest(normalizedCode1 , normalizedCode2));

   }
    public static String getInput(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            scanner.close();
            return sb.toString().trim();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

}
