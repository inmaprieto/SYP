import java.io.*;

public class ae1_1_Ficheros {
    public static void main(String[] args) throws IOException {
        String pathname;
        int limiter_lines;
        if (args.length > 0){
            pathname = args[0];
        }else{
            pathname = "fichero.txt";
        }
        limiter_lines = writeFile(pathname);
        String time = readFile(pathname, limiter_lines);
        System.out.println(time);
    }

    private static String readFile(String pathname, int lines_to_read) throws IOException {
        File file = new File(pathname);
        String result = "";
        if (file.isFile()){
            long time_to_sum_start = System.currentTimeMillis();
             FileReader reader = new FileReader(pathname);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            int number = 0;
            for (int i = 0; i < lines_to_read; i++) {
                line = bufferedReader.readLine();
                number += Integer.parseInt(line);
            }
            long time_to_sum_end = System.currentTimeMillis();
            result = "El tiempo en realizar la suma ha sido: " +(time_to_sum_end-time_to_sum_start)+" milisegundos";
            reader.close();
            System.out.println("La suma de todos los números es: "+number);
            return result;
        }
        return result;
    }

    public static int writeFile(String pathname) throws IOException {
        long time_start = System.currentTimeMillis();
        int limiter;
        File file = new File(pathname);
        FileWriter writer = new FileWriter(file);
        PrintWriter printer = new PrintWriter(writer);
        for (limiter = 0; limiter < 100; limiter++) {
            int number = (int) (Math.random()*100+1);
            printer.println(number);
        }
        long time_end = System.currentTimeMillis();
        printer.println("El tiempo de escritura ha sido: " + (time_end - time_start) + " milisegundos");
        printer.close();
        return limiter;
    }
}
