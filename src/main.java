import au.com.bytecode.opencsv.*;

import java.io.FileReader;
import java.util.ArrayList;

public class main {

    public static void main(String... A) throws Exception {
        ArrayList<PersonScheme> P = new ArrayList<PersonScheme>();
        CSVReader input = new CSVReader(new FileReader("C:\\Users\\larisa\\IdeaProjects\\laba_4\\Data.csv"), ';', '"', 1);
        String[] nextLine = input.readNext();
        while ((nextLine) != null) {
            PersonScheme I = new PersonScheme(nextLine);
            P.add(I);
            nextLine = input.readNext();
        }

    }
}
