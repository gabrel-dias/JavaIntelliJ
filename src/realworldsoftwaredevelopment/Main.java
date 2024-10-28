package realworldsoftwaredevelopment;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String linha;
        String[] coluna;
        ArrayList<Integer> gastosArrayList = new ArrayList<>();
        try (
                InputStream inputStream = new FileInputStream("src/resources/bank-data-simple.csv");
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)

        ) {
            while ((linha = bufferedReader.readLine()) != null) {
                coluna = linha.split(",");
                gastosArrayList.add(Integer.parseInt(coluna[1]));
            }
            int total =0;
            for (int integer : gastosArrayList) {
                total += integer;
                System.out.println(total);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}