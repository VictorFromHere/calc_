import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.util.Scanner;

public class Main {


public static String calc(String input) {
    String userInput = input;
    String stringResult = "";


    //////// начало метода обработки INPUT

    int exAlert;

    // *** Блок обработки римских цифр ***
    String[] ones = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] tens = {"X","XX", "XXX", "IL", "L", "LX", "LXX", "LXXX", "XC", "C"};

    if ((userInput.contains("I")) || (userInput.contains("V")) || (userInput.contains("X"))) {
        int[] arabNum = new int[2];
        String[] numbs = new String[2];

        if (userInput.contains("+")) {
            numbs = userInput.split("\\+");


            for (int i = 0; i < numbs.length; i++) {

                if (numbs[i].equals("I")) {
                    arabNum[i] = 1;
                }

                else if (numbs[i].equals("II")) {
                    arabNum[i] = 2;
                }

                else if (numbs[i].equals("III")) {
                    arabNum[i] = 3;
                }

                else if (numbs[i].equals("IV")) {
                    arabNum[i] = 4;
                }
                else if (numbs[i].equals("V")) {
                    arabNum[i] = 5;
                }

                else if (numbs[i].equals("VI")) {
                    arabNum[i] = 6;
                }

                else if (numbs[i].equals("VII")) {
                    arabNum[i] = 7;
                }

                else if (numbs[i].equals("VIII")) {
                    arabNum[i] = 8;
                }

                else if (numbs[i].equals("IX")) {
                    arabNum[i] = 9;
                }

                else if (numbs[i].equals("X")) {
                    arabNum[i] = 10;
                } else {
                    exAlert = 5/0; //выводится в случае, если одно из слагаемых не римская цифра
                }
            }

            if ((arabNum[0] + arabNum[1])%10 != 0) {
                if ((arabNum[0] + arabNum[1]) < 10) {
                    stringResult = ones[(arabNum[0] + arabNum[1]) - 1];
                    return stringResult;
                } else {
                    stringResult = tens[(arabNum[0] + arabNum[1]) / 10 - 1] + ones[(arabNum[0] + arabNum[1]) % 10 - 1];
                    return stringResult;
                }
            } else {
                stringResult = tens[(arabNum[0] + arabNum[1]) / 10 - 1];
                return stringResult;
            }

        }

        else if (userInput.contains("-")) {
            numbs = userInput.split("-");


            for (int i = 0; i < numbs.length; i++) {

                if (numbs[i].equals("I")) {
                    arabNum[i] = 1;
                }

                else if (numbs[i].equals("II")) {
                    arabNum[i] = 2;
                }

                else if (numbs[i].equals("III")) {
                    arabNum[i] = 3;
                }

                else if (numbs[i].equals("IV")) {
                    arabNum[i] = 4;
                }
                else if (numbs[i].equals("V")) {
                    arabNum[i] = 5;
                }

                else if (numbs[i].equals("VI")) {
                    arabNum[i] = 6;
                }

                else if (numbs[i].equals("VII")) {
                    arabNum[i] = 7;
                }

                else if (numbs[i].equals("VIII")) {
                    arabNum[i] = 8;
                }

                else if (numbs[i].equals("IX")) {
                    arabNum[i] = 9;
                }

                else if (numbs[i].equals("X")) {
                    arabNum[i] = 10;
                } else {
                    exAlert = 5/0; //выводится в случае, если одна из цифр не римская
                }
            }
//                  **** Результат вычитания ***

            stringResult = ones[(arabNum[0] - arabNum[1])%10-1];
            return stringResult;

        }

        else if (userInput.contains("*")) {
            numbs = userInput.split("\\*");


            for (int i = 0; i < numbs.length; i++) {

                if (numbs[i].equals("I")) {
                    arabNum[i] = 1;
                }

                else if (numbs[i].equals("II")) {
                    arabNum[i] = 2;
                }

                else if (numbs[i].equals("III")) {
                    arabNum[i] = 3;
                }

                else if (numbs[i].equals("IV")) {
                    arabNum[i] = 4;
                }
                else if (numbs[i].equals("V")) {
                    arabNum[i] = 5;
                }

                else if (numbs[i].equals("VI")) {
                    arabNum[i] = 6;
                }

                else if (numbs[i].equals("VII")) {
                    arabNum[i] = 7;
                }

                else if (numbs[i].equals("VIII")) {
                    arabNum[i] = 8;
                }

                else if (numbs[i].equals("IX")) {
                    arabNum[i] = 9;
                }

                else if (numbs[i].equals("X")) {
                    arabNum[i] = 10;
                } else {
                    exAlert = 5/0; //выводится в случае, если одна из цифр не римская
                }
            }

//                  **** Результат умножения -
            if ((arabNum[0] * arabNum[1])%10 == 0) {
                if (arabNum[0] * arabNum[1] == 100) {
                    stringResult = tens[(arabNum[0] * arabNum[1]) / 10-1];
                    return stringResult;
                } else {
                    stringResult =  tens[(arabNum[0] * arabNum[1]) / 10 - 1];
                    return stringResult;
                }
            } else {
                if ((arabNum[0] * arabNum[1]) < 10) {
                    stringResult =  ones[(arabNum[0] * arabNum[1]) - 1];
                    return stringResult;
                } else {
                    stringResult =  tens[(arabNum[0] * arabNum[1]) / 10 - 1] + ones[(arabNum[0] * arabNum[1]) % 10 - 1];
                    return stringResult;
                }
            }
        }


        else if (userInput.contains("/")) {
            numbs = userInput.split("/");


            for (int i = 0; i < numbs.length; i++) {

                if (numbs[i].equals("I")) {
                    arabNum[i] = 1;
                }

                else if (numbs[i].equals("II")) {
                    arabNum[i] = 2;
                }

                else if (numbs[i].equals("III")) {
                    arabNum[i] = 3;
                }

                else if (numbs[i].equals("IV")) {
                    arabNum[i] = 4;
                }
                else if (numbs[i].equals("V")) {
                    arabNum[i] = 5;
                }

                else if (numbs[i].equals("VI")) {
                    arabNum[i] = 6;
                }

                else if (numbs[i].equals("VII")) {
                    arabNum[i] = 7;
                }

                else if (numbs[i].equals("VIII")) {
                    arabNum[i] = 8;
                }

                else if (numbs[i].equals("IX")) {
                    arabNum[i] = 9;
                }

                else if (numbs[i].equals("X")) {
                    arabNum[i] = 10;
                } else {
                    exAlert = 5/0; //выводится в случае, если одна из цифр не римская
                }
            }

//                  **** Результат деления -
            stringResult = ones[(arabNum[0] / arabNum[1])%10 - 1];
            return stringResult;


        } else {
            exAlert = 5 / 0; // генерация ошибки в случае отсутствия арифм. знаков
        }

    }

    //          ********************* блок вычисления арабских цифр  *************************

    else {


        if (userInput.contains("+")) {
            //               ****** блок обработки ошибок ввода *****
            String exPr[] = userInput.split("\\+");
            if (exPr.length > 2) {
                exAlert = 5 / 0;
            }

            if ((Integer.parseInt(exPr[0]) > 10) || (Integer.parseInt(exPr[1]) > 10)) {
                exAlert = 5 / 0;
            }  // ************************

            String[] arguments = userInput.split("\\+");
            int a = Integer.parseInt(arguments[0]);
            int b = Integer.parseInt(arguments[1]);
            stringResult = Integer.toString(a+b);
            return stringResult;


        } else if (userInput.contains("-")) {

            //  ****** блок обработки ошибок ввода *****
            String exPr[] = userInput.split("-");
            if (exPr.length > 2) {
                exAlert = 5 / 0;
            }

            if ((Integer.parseInt(exPr[0]) > 10) || (Integer.parseInt(exPr[1]) > 10)) {
                exAlert = 5 / 0;
            } //  *******************


            String[] arguments = userInput.split("-");
            int a = Integer.parseInt(arguments[0]);
            int b = Integer.parseInt(arguments[1]);
            stringResult = Integer.toString(a-b);
            return stringResult;


        } else if (userInput.contains("*")) {

            //    ****** блок обработки ошибок ввода *****
            String exPr[] = userInput.split("\\*");
            if (exPr.length > 2) {
                exAlert = 5 / 0;
            }

            if ((Integer.parseInt(exPr[0]) > 10) || (Integer.parseInt(exPr[1]) > 10)) {
                exAlert = 5 / 0;
            }   // ***************

            String[] arguments = userInput.split("\\*");
            int a = Integer.parseInt(arguments[0]);
            int b = Integer.parseInt(arguments[1]);
            stringResult = Integer.toString(a*b);
            return stringResult;


        } else if (userInput.contains("/")) {

            //  ****** блок обработки ошибок ввода *****
            String exPr[] = userInput.split("/");
            if (exPr.length > 2) {
                exAlert = 5 / 0;
            }

            if ((Integer.parseInt(exPr[0]) > 10) || (Integer.parseInt(exPr[1]) > 10)) {
                exAlert = 5 / 0;
            } // *******************

            String[] arguments = userInput.split("/");
            int a = Integer.parseInt(arguments[0]);
            int b = Integer.parseInt(arguments[1]);
            stringResult = Integer.toString(a/b);
            return stringResult;

        } else {
            exAlert = 5 / 0; // генерация ошибки в случае отсутствия арифм. знаков
        }
    }
        return stringResult;
}



    public static void main(String[] args) {

        Scanner readFromCons = new Scanner(System.in);
        System.out.println("Please input your 2 numbers calculation request:");
        String userInput = readFromCons.nextLine().replaceAll(" ", "");
        //String calcResult = calc(userInput);
        //System.out.println(calcResult);
        System.out.println(" Result is " + calc(userInput));

    }

}



