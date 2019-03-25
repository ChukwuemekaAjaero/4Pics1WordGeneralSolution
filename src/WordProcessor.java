import java.io.*;
import java.util.ArrayList;

public class WordProcessor {

    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> threeWords = new ArrayList<>();
    ArrayList<String> fourWords = new ArrayList<>();
    ArrayList<String> fiveWords = new ArrayList<>();
    ArrayList<String> sixWords = new ArrayList<>();
    ArrayList<String> sevenWords = new ArrayList<>();
    ArrayList<String> eightWords = new ArrayList<>();
    ArrayList<String> nineWords = new ArrayList<>();



   public void readFile() throws  Exception{

       File file = new File("C:\\Users\\emeka\\Desktop\\Education\\Java Projects\\words.txt");

       BufferedReader br = new BufferedReader(new FileReader(file));

       String st;
       while ((st = br.readLine()) != null){//Scans through each line and adds it to the ArrayList above

           words.add(st);
       }



   }

    public void separateWords(){

       //Minimum letters: 3
        //Max: 9

        for(String word : words){//Goes through each element in the ArrayList words

            if(word.length()==3){

                threeWords.add(word);

            } else if(word.length()==4){

                fourWords.add(word);

            } else if (word.length()==5){

                fiveWords.add(word);

            } else if (word.length()==6){

                sixWords.add(word);

            } else if (word.length()==7){

                sevenWords.add(word);

            } else if (word.length()==8){

                eightWords.add(word);
            }

            else if (word.length()==9) {

                nineWords.add(word);
            }
        }


    }

    public void saveFile(){

        try
        {

           FileOutputStream f3 = new FileOutputStream("threeWords.txt");
           FileOutputStream f4 = new FileOutputStream("fourWords.txt");
           FileOutputStream f5 = new FileOutputStream("fiveWords.txt");
           FileOutputStream f6 = new FileOutputStream("sixWords.txt");
           FileOutputStream f7 = new FileOutputStream("sevenWords.txt");
           FileOutputStream f8 = new FileOutputStream("eightWords.txt");
           FileOutputStream f9 = new FileOutputStream("nineWords.txt");
           PrintStream p3 = new PrintStream(f3);
           PrintStream p4 = new PrintStream(f4);
           PrintStream p5 = new PrintStream(f5);
           PrintStream p6 = new PrintStream(f6);
           PrintStream p7 = new PrintStream(f7);
           PrintStream p8 = new PrintStream(f8);
           PrintStream p9 = new PrintStream(f9);



            for (String word : threeWords) {
                p3.println(word);
            }

            for (String word : fourWords) {
                p4.println(word);
            }

            for (String word : fiveWords) {
                p5.println(word);
            }

            for (String word : sixWords) {
                p6.println(word);
            }

            for (String word : sevenWords) {
                p7.println(word);
            }

            for (String word : eightWords) {
                p8.println(word);
            }

            for (String word : nineWords) {
                p9.println(word);
            }
            //fs.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }


    }
}
