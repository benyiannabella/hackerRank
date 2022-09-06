package heckerRank;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;


public class StringSplit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> arr = new ArrayList<>();
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                String[] str = emailID.split("@");
                if(str[1].equals("gmail.com")){
                    arr.add(firstName);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Collections.sort(arr);
        System.out.println(arr);
        bufferedReader.close();
    }
}
