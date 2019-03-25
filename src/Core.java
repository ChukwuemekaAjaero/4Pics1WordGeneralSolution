import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Core {

    static ArrayList<String> permutationList = new ArrayList<>();

    public static ArrayList<String> getPermutationList() {
        return permutationList;
    }

    public static void iterate(char[] chars, int len, char[] build, int pos){//The variable "len" should be the same as the variable input by the user.

        if(pos == len){
            String word = new String(build);
            permutationList.add(word);
            return;
        }

        for(int i=0; i< chars.length; i++){
            build[pos] = chars[i];
            iterate(chars, len, build, pos + 1);
        }

    }

    public static void main(String[] args) throws Exception{

        String numOfLetters;
        String lettersGiven;
        WordProcessor processor = new WordProcessor();
        Scanner input = new Scanner(System.in);


        System.out.println("How many letters does the word have: ");
        numOfLetters = input.next();
        int intNumOfLetters = Integer.parseInt(numOfLetters);
        System.out.println("In this format (qwertyuiopas), write the available letters: ");
        lettersGiven = input.next();


        try {
           processor.readFile();
           processor.separateWords();
           processor.saveFile();


            char[] chars = lettersGiven.toCharArray();
            int len = intNumOfLetters;
            iterate(chars, len, new char[len], 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (intNumOfLetters == 3){

            ArrayList<String> scopedWords = new ArrayList<>();
            File threeWordsFile = new File("C:\\Users\\emeka\\IdeaProjects\\4Pics1WordSolution\\threeWords.txt");
            BufferedReader br = new BufferedReader(new FileReader(threeWordsFile));
            String st;

            while ((st = br.readLine()) != null){//Scans through each line and adds it to the ArrayList above

                scopedWords.add(st);
            }

            for(String word : scopedWords){

                for(String word2 : permutationList){

                    if(word.equals(word2)){

                        System.out.println(word);
                    }

                }
            }

        } else if (intNumOfLetters == 4){

            ArrayList<String> scopedWords = new ArrayList<>();
            File threeWordsFile = new File("C:\\Users\\emeka\\IdeaProjects\\4Pics1WordSolution\\fourWords.txt");
            BufferedReader br = new BufferedReader(new FileReader(threeWordsFile));
            String st;

            while ((st = br.readLine()) != null){//Scans through each line and adds it to the ArrayList above

                scopedWords.add(st);
            }

            for(String word : scopedWords){

                for(String word2 : permutationList){

                    if(word.equals(word2)){

                        System.out.println(word);
                    }

                }
            }

        }

        else if (intNumOfLetters == 5){

            ArrayList<String> scopedWords = new ArrayList<>();
            File threeWordsFile = new File("C:\\Users\\emeka\\IdeaProjects\\4Pics1WordSolution\\fiveWords.txt");
            BufferedReader br = new BufferedReader(new FileReader(threeWordsFile));
            String st;

            while ((st = br.readLine()) != null){//Scans through each line and adds it to the ArrayList above

                scopedWords.add(st);
            }

            for(String word : scopedWords){

                for(String word2 : permutationList){

                    if(word.equals(word2)){

                        System.out.println(word);
                    }

                }
            }

        }

        else if (intNumOfLetters == 6){

            ArrayList<String> scopedWords = new ArrayList<>();
            File threeWordsFile = new File("C:\\Users\\emeka\\IdeaProjects\\4Pics1WordSolution\\sixWords.txt");
            BufferedReader br = new BufferedReader(new FileReader(threeWordsFile));
            String st;

            while ((st = br.readLine()) != null){//Scans through each line and adds it to the ArrayList above

                scopedWords.add(st);
            }

            for(String word : scopedWords){

                for(String word2 : permutationList){

                    if(word.equals(word2)){

                        System.out.println(word);
                    }

                }
            }

        }

        else if (intNumOfLetters == 7){

            ArrayList<String> scopedWords = new ArrayList<>();
            File threeWordsFile = new File("C:\\Users\\emeka\\IdeaProjects\\4Pics1WordSolution\\sevenWords.txt");
            BufferedReader br = new BufferedReader(new FileReader(threeWordsFile));
            String st;

            while ((st = br.readLine()) != null){//Scans through each line and adds it to the ArrayList above

                scopedWords.add(st);
            }

            for(String word : scopedWords){

                for(String word2 : permutationList){

                    if(word.equals(word2)){

                        System.out.println(word);
                    }

                }
            }

        }

        else if (intNumOfLetters == 8){

            ArrayList<String> scopedWords = new ArrayList<>();
            File threeWordsFile = new File("C:\\Users\\emeka\\IdeaProjects\\4Pics1WordSolution\\eightWords.txt");
            BufferedReader br = new BufferedReader(new FileReader(threeWordsFile));
            String st;

            long now = System.currentTimeMillis();
            while ((st = br.readLine()) != null){//Scans through each line and adds it to the ArrayList above

                scopedWords.add(st);
            }

            long difference = (System.currentTimeMillis() - now)/1000;
            System.out.println("Adding to list: "+difference);

            now = System.currentTimeMillis();
            for(String word : scopedWords){

                for(String word2 : permutationList){

                    if(word.equals(word2)){

                        System.out.println(word);
                    }

                }
            }
            difference = (System.currentTimeMillis() - now)/1000;
            System.out.println("Gets all 8 letter  permutations: "+difference);
        }

        else if (intNumOfLetters == 9){

            ArrayList<String> scopedWords = new ArrayList<>();
            File threeWordsFile = new File("C:\\Users\\emeka\\IdeaProjects\\4Pics1WordSolution\\nineWords.txt");
            BufferedReader br = new BufferedReader(new FileReader(threeWordsFile));
            String st;

            while ((st = br.readLine()) != null){//Scans through each line and adds it to the ArrayList above

                scopedWords.add(st);
            }

            for(String word : scopedWords){

                for(String word2 : permutationList){

                    if(word.equals(word2)){

                        System.out.println(word);
                    }

                }
            }

        }

    }


}
