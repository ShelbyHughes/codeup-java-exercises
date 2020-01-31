import java.util.Scanner;

public class consoleAdventure {
    public static void main (String args[]) {
        System.out.println(intro());
    }
    public static String whatDoYouDo () {
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you do?");
        String userInput = scan.nextLine();
        return userInput;
    }
    public static String intro(){
        System.out.println("You wake up in a small cement room with a metal desk in the middle of the room, attached to the table is a pair of handcuffs that are keeping you in place. You look up and are immediately blinded by a bright white light pointed at you.(Look around, Try to move, or Ask whats going on");
        String userInput = whatDoYouDo();
        if(userInput.equals("Look around")){
            System.out.println("You look around the room and realize you are in a police interrogation room.");
        }else if(userInput.equals("Try to move")){
            System.out.println("You try with all your might to get freed from the handcuffs but the handcuffs wont break.");
        }else{
            System.out.println("The bright light is blinding you, in your confusion you ask anybody in the room \"Whats going on??\" ");
            System.out.println("A man slowly comes into your hazed view and he tells you \"My name is Detective Jake Peralta and I know you commited this crime and I'm going to prove it!\"(Deny, Ask for lawyer, or Stay silent)");
            userInput = whatDoYouDo();
            if(userInput.equals("Deny")){
                System.out.println("I have commited no crime, I am innocent");
                System.out.println("Detective: \"Thats what they all say\"");
                userInput = whatDoYouDo();
            }else if(userInput.equals("Ask for lawyer")){
                System.out.println("I want to speak to my lawyer!");
                System.out.println("Detective: \"Ugh, I remember when criminals went straight to jail!\" ");
                System.out.println("You are un-cuffed and silently walked to a jail cell to await your lawyer");
            }else{
                System.out.println("You stay silent.");
                System.out.println("Detective: \"Shy are we? No problem I'm just going to run some details by you, if you dont mind\"(Go ahead, Ask for lawyer, Stay silent)");
                userInput = whatDoYouDo();
                if(userInput.equals("Go ahead")){
                    System.out.println("You nod your head in reply");
                    String name = whatsYourName();
                    System.out.println("Detective: \"So, your name is " + name + ", Do you often frequent truck stops?(Deny, Ask for lawyer, Stay silent)");
                    userInput = whatDoYouDo();
                    if(userInput.equals("Deny")){
                        System.out.println("No, I am more partial to gas stations");
                        System.out.println("Detective: \"Yeah Yeah Yeah, aren't you a funny one, " + name + "\"(Comment on his outfit, Ask for lawyer, Stay silent)");
                        userInput = whatDoYouDo();
                    }
                }else if(userInput.equals("Ask for lawyer")){
                    System.out.println("I want to speak to my lawyer!");
                    System.out.println("Detective: \"Ugh, I remember when criminals went straight to jail!\" ");
                    System.out.println("You are un-cuffed and silently walked to a jail cell to await your lawyer");
                } else{
                    System.out.println("You stay silent");
                    System.out.println("Detective: \"Did i strike a chord with you?\"(Sarcasm, Ask for lawyer, Deny, Stay silent)");
                    userInput = whatDoYouDo();
                    if(userInput.equals("Ask for lawyer")){
                        System.out.println("I want to speak to my lawyer!");
                        System.out.println("Detective: \"Ugh, I remember when criminals went straight to jail!\" ");
                        System.out.println("You are un-cuffed and silently walked to a jail cell to await your lawyer");
                    }else if(userInput.equals("Deny")){
                        System.out.println("You couldn't break me even if you tried");
                        System.out.println("Detective: \"Oh really, you want to bet?\"");
                        userInput = whatDoYouDo();
                    }
                }
            }
        }
        return userInput;
    }
    public static String whatsYourName(){
        System.out.println("Detective: \"So when we found you at the scene of the crime, you had no ID on you, what is your name?\"");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }
}
