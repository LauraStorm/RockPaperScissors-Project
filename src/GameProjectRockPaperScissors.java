import java.util.Random;
import java.util.Scanner;

public class GameProjectRockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Intro
        String welcomeForPlayer = "Welcome to Rock, Paper & Scissors game! 🙃\n";
        System.out.println(welcomeForPlayer);

        //Choose singleplayer or multiplayer
        String playSingleOrMultiplayer = "Press 1 for singlePlayer - press 2 for multiplayer:";
        System.out.println(playSingleOrMultiplayer);
        int singlePlayerOrMultiplayer = scanner.nextInt();

        if (singlePlayerOrMultiplayer == 1) {
            singlePlayer();
        } else if (singlePlayerOrMultiplayer == 2) {
            multiPlayer();
        } else {
            System.out.println("Your choice is not valid");
        }

    }

        //Methods//

    public static void singlePlayer(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //INTRO
        System.out.println("-------------------------------------------------------");
        String introForSinglePlayer = "Hi 👋🏽 - Welcome to rock 🪨, paper 📃 & scissors ✂️ game!\nYou chose singleplayer!";
        System.out.println(introForSinglePlayer);
        System.out.println("\nPlease write your name:");
        String singlePlayerName = scanner.next();

        String welcomeSinglePlayer = "Hey " + singlePlayerName + "! \nI hope you are ready to play a round! 🙃\n";
        System.out.println(welcomeSinglePlayer);

        //Array with options in game
        String [] optionsInGame = {"1. Rock 🪨", "2. Paper 📃", "3. Scissors ✂️"};
        int [] optionsInGameIndex = new int[optionsInGame.length];

        //Print options for Player
        System.out.println("Please type the number of your choice:");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        int singlePlayerChoice;
        int computerChoice;


        //First input from Player
        singlePlayerChoice = scanner.nextInt();
        computerChoice = random.nextInt(optionsInGameIndex.length);


        //Print what player and computer choose:
        System.out.println(singlePlayerName + " you chose " + singlePlayerChoice);
        System.out.println("The computer chose " + computerChoice);


        //Who wins if?
        if (singlePlayerChoice == computerChoice){
            System.out.println("It's a draw");
        } else if (singlePlayerChoice == rock && computerChoice == scissors || singlePlayerChoice == paper && computerChoice == rock || singlePlayerChoice == scissors && computerChoice == paper ){
            System.out.println(singlePlayerName + "yeaah you won! 🥳");
        } else {
            System.out.println("The computer won!");
        }

    }


    public static void multiPlayer (){
        Scanner scanner = new Scanner(System.in);

        //INTRO
        System.out.println("-------------------------------------------------------");
        String introForMultiplayer = "Hi 👋🏽 - Welcome to rock 🪨, paper 📃 & scissors ✂️ game!\nYou chose multiplayer!\n";
        System.out.println(introForMultiplayer);

        //players
        System.out.println("Please write the name of the first player:");
        String playerOne = scanner.next();
        System.out.println("Please write the name of the second player:");
        String playerTwo = scanner.next();

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        int playerOneChoice;
        int playerTwoChoice;

        //Array with options in game
        String [] optionsInGame = {"1. Rock", "2. Paper", "3. Scissors"};
        int [] optionInGameIndex = new int[optionsInGame.length];

        //PlayerOne choice
        System.out.println( "\n" + playerOne + " you choose first!");
        System.out.println("Please type the number of your choice: ");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        playerOneChoice = scanner.nextInt();


        //PlayerTwo choice
        System.out.println(playerTwo + " now it's your turn!");
        System.out.println("Please type the number of your choice: ");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        playerTwoChoice = scanner.nextInt();


        //Show players choice
        System.out.println(playerOne + " you chose " + playerOneChoice);
        System.out.println(playerTwo + " you chose " + playerTwoChoice);


        //Who wins if?
        if (playerOneChoice == playerTwoChoice){
            System.out.println("It's a draw");
        } else if (playerOneChoice == rock && playerTwoChoice == scissors || playerOneChoice == paper && playerTwoChoice == rock || playerOneChoice == scissors && playerTwoChoice == paper ){
            System.out.println(playerOne + " you won! 🥳");
        } else {
            System.out.println(playerTwo + " you won! 🥳");
        }


    }




}




