import java.util.Scanner;

public class MadLibs{
    public static void main(String[] args){
        //Initializing new Scanner as sc
        Scanner sc = new Scanner(System.in);

        //Stories set as strings
        String madLib1 = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        String madLib2 = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        String madLib3 = "Along the coast of <place>, a large <noun> ate <number> cheeseburgers.";
        
        //Identifying the first type of word thats needed
        int madLib2Froma = madLib2.indexOf("<");
        int madLib2Toa = madLib2.indexOf(">");
        String sub1 = madLib2.substring(madLib2Froma+1, madLib2Toa);

        //Creates a new string without the first <word>, because with the new string finding the first instance of < will actually be the second (first ones removed)
        String parsed1 = madLib2.substring(0, madLib2Froma) + madLib2.substring(madLib2Toa+1); 

        //Repeats lines 14-16 to identify the second type of word thats needed
        int madLib2Fromb = parsed1.indexOf("<");
        int madLib2Tob = parsed1.indexOf(">");
        String sub2 = parsed1.substring(madLib2Fromb+1, madLib2Tob);

        //Creates a new string without the first two <word>
        String parsed2 = parsed1.substring(0, madLib2Fromb) + parsed1.substring(madLib2Tob+1);

        //Repeat to get the 3rd type of word
        int madLib2Fromc = parsed2.indexOf("<");
        int madLib2Toc = parsed2.indexOf(">");
        String sub3 = parsed2.substring(madLib2Fromc+1, madLib2Toc);

        //Creates a new string without any <word>
        String parsed3 = parsed2.substring(0, madLib2Fromc) + parsed2.substring(madLib2Toc+1);

        
        
        
        //Getting inputs
        System.out.println("Enter a " + sub1);
        String response1 = sc.nextLine();

        System.out.println("Now enter a " + sub2);
        String response2 = sc.nextLine();
        
        System.out.println("Finally, enter a " + sub3);
        String response3 = sc.nextLine();
        
        
        
        //Putting everything together
        String finalString = madLib2.substring(0, madLib2Froma) + response1 + parsed1.substring(madLib2Froma, madLib2Fromb) + response2 + parsed2.substring(madLib2Fromb, madLib2Fromc) + response3 + parsed3.substring(madLib2Fromc);
        System.out.println(finalString);
    }
}
