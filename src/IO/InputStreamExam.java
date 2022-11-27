package IO;

import java.io.*;

public class InputStreamExam {

    public static void main(String[] args) throws IOException {

        try (
                InputStream in = System.in;
                InputStreamReader ir = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(ir);
                )
        {
            String str = br.readLine();
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
