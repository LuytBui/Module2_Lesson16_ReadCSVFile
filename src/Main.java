import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	    final String DATA_FILE = "data.csv";

        try{
            FileReader fileReader = new FileReader(DATA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] entry = line.split(",");
                int id = Integer.parseInt(entry[0]);
                String code = entry[1];
                String name = entry[2];
                Country country = new Country(id, code, name);
                System.out.println(country);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }


    }
}
