import java.util.StringTokenizer;
import java.io.*;

public class file {

    public static void main(String[] args) throws IOException{

        FileReader fr = new FileReader("/Users/khaliqozil/Desktop/Demo/java/test.txt");
        BufferedReader bf = new BufferedReader(fr);
        String st = bf.readLine();

        int sum = 0;

        while((st = bf.readLine())!=null){
            
            StringTokenizer stn = new StringTokenizer(st);
            String rn = stn.nextToken();
            String name = stn.nextToken();
            int phy = Integer.parseInt(stn.nextToken());
            int chem = Integer.parseInt(stn.nextToken());
            int bio = Integer.parseInt(stn.nextToken());
            int math = Integer.parseInt(stn.nextToken());

            sum = phy+chem+bio+math;

            System.out.println(name +" ==> "+sum);
        }
        
    }
    
}
