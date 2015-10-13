import java.util.Scanner;

/*
    COMP1406 - Assignment #2
    Question #4
 */
public class ReverseMorseCodeProgram {

    //decode single letter morse code
    public void decodeLetter(String s){
        switch (s){
            case ".-": System.out.print("A");break;
            case "-...": System.out.print("B");break;
            case "-.-.": System.out.print("C");break;
            case "-..": System.out.print("D");break;
            case ".": System.out.print("E");break;
            case "..-.": System.out.print("F");break;
            case "--.": System.out.print("G");break;
            case "....": System.out.print("H");break;
            case "..": System.out.print("I");break;
            case ".---": System.out.print("J");break;
            case "-.-": System.out.print("K");break;
            case ".-..": System.out.print("L");break;
            case "--": System.out.print("M");break;
            case "-.": System.out.print("N");break;
            case "---": System.out.print("O");break;
            case ".--.": System.out.print("P");break;
            case "--.-": System.out.print("Q");break;
            case ".-.": System.out.print("R");break;
            case "...": System.out.print("S");break;
            case "-": System.out.print("T");break;
            case "..-": System.out.print("U");break;
            case "...-": System.out.print("V");break;
            case ".--": System.out.print("W");break;
            case "-..-": System.out.print("X");break;
            case "-.--": System.out.print("Y");break;
            case "--..": System.out.print("Z");break;
        }
    }

    //decode morse code sequence
    public void decodeMorse(String morseCode){

        //temp string for letter code
        String letterCode = "";

        //add a white space for the last letter to decode
        morseCode += " ";

        for(int i=0; i<morseCode.length(); i++){
            char currChar = morseCode.charAt(i);

            //if the current char is a white space, start to decode
            if(currChar == ' ') {
                decodeLetter(letterCode);
                letterCode = "";
            }else{
                letterCode += morseCode.charAt(i);
            }
        }
    }

    //print message and interact with user
    public void prompt(){
        System.out.println("Please enter morse code to decode:");
        Scanner keyboard = new Scanner(System.in);

        //input a string line
        String morseCode = keyboard.nextLine();
        decodeMorse(morseCode);
    }

    public static void main(String args[]){
        new ReverseMorseCodeProgram().prompt();
    }
}
