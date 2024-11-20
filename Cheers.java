// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String wordOfCheer = args[0];
                int amountOfCheers = Integer.parseInt(args[1]);
                int lengthWord = wordOfCheer.length();
                int count1 = 0;
                String upperLetters = "AEFHILMNORSX";
                String lowerLetters = "aefhilmnorsx";
                char ch = ' ';
                char upper = ' ';
                String upperWordOfCheer = " ";
        
                for(int i=0;i<lengthWord;i++)
                {
        
                    for (int j=0;j<upperLetters.length();j++)
                    {
                        char up = upperLetters.charAt(j);
                        char low = lowerLetters.charAt(j);
                        ch = wordOfCheer.charAt(i);
                        if(ch == up || ch == low)
                        {
                            if(ch>='a'&&ch<='z')
                            {
                                upper = (char)(ch - 32);
                                System.out.println("Give me an " + upper + ": " + upper + "!");
                              
                            }
                            else  System.out.println("Give me an " + ch + ": " + ch + "!");
        
                            j=upperLetters.length()+1;
                            ch=' ';
                        }
                        
                    }
                    if(ch != ' ')
                    {
                        if(ch>='a'&&ch<='z')
                        {
                            upper = (char)(ch - 32);
                            System.out.println("Give me a  " + upper + ": " + upper + "!");
                        }
                        else System.out.println("Give me a  " + ch + ": " + ch + "!");
        
                    }
                    
                }
        
                System.out.println("What does that spell");
                for (int i=0;i<lengthWord;i++)
                {
                    ch = wordOfCheer.charAt(i);
                    if(ch>='a'&&ch<='z')
                            {
                                upper = (char)(ch - 32);
                                upperWordOfCheer =  upperWordOfCheer + upper;
                            }
                    else 
                    {
                        upperWordOfCheer = upperWordOfCheer + ch;
                    }
                }
                while(count1<amountOfCheers)
                {
        
                    System.out.println(upperWordOfCheer + "!!!");
                    count1++;
                }
        }
}
