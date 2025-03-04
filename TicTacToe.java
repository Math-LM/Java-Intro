import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name player 1: ");
        String player1 = scanner.nextLine();
        System.out.print("Enter your name player 2: ");
        String player2 = scanner.nextLine();

        System.out.println("\n" + player1 + " will be X and " + player2 + " will be O.\n");

        //Create the board
        String pos11 = "1";
        String pos12 = "2";
        String pos13 = "3";
        String pos21 = "4";
        String pos22 = "5";
        String pos23 = "6";
        String pos31 = "7";
        String pos32 = "8";
        String pos33 = "9";

        System.out.println(" " + pos11 + " | " + pos12 + " | " + pos13 + " ");
        System.out.println(" " + pos21 + " | " + pos22 + " | " + pos23 + " ");
        System.out.println(" " + pos31 + " | " + pos32 + " | " + pos33 + " ");

        int counter = 1;
        int turnFlag = -1;
        boolean won = false;

        while (counter <= 9 && !won) {

            String turnToken;

            if (turnFlag == -1) {
                System.out.print("\n" + player1 + " choose your move: ");
                turnToken = "X";
            } else {
                System.out.print("\n" + player2 + " choose your move: ");
                turnToken = "O";
            }
            int move = scanner.nextInt();
            boolean validMoveFlag = false;
            switch(move) {
                case 1:
                    if (pos11.equals("1")) {
                        pos11 = turnToken;
                        validMoveFlag = true;
                    } 
                    break;
                case 2:
                    if (pos12.equals("2")) {
                        pos12 = turnToken;
                        validMoveFlag = true;
                    }
                    break;
                case 3:
                    if (pos13.equals("3")) {
                        pos13 = turnToken;
                        validMoveFlag = true;
                    }
                    break;
                case 4:
                    if (pos21.equals("4")) {
                        pos21 = turnToken;
                        validMoveFlag = true;
                    } 
                    break;
                case 5:
                    if (pos22.equals("5")) {
                        pos22 = turnToken;
                        validMoveFlag = true;
                    }
                    break;
                case 6:
                    if (pos23.equals("6")) {
                        pos23 = turnToken;
                        validMoveFlag = true;
                    }
                    break;
                case 7:
                    if (pos31.equals("7")) {
                        pos31 = turnToken;
                        validMoveFlag = true;
                    } 
                    break;
                case 8:
                    if (pos32.equals("8")) {
                        pos32 = turnToken;
                        validMoveFlag = true;
                    }
                    break;
                case 9:
                    if (pos33.equals("9")) {
                        pos33 = turnToken;
                        validMoveFlag = true;
                    }
                    break;
                default:
                    break;
            }

            System.out.println(" " + pos11 + " | " + pos12 + " | " + pos13 + " ");
            System.out.println(" " + pos21 + " | " + pos22 + " | " + pos23 + " ");
            System.out.println(" " + pos31 + " | " + pos32 + " | " + pos33 + " ");

            if (validMoveFlag) {

                if (counter >= 5) {
                    won =
                    pos11.equals(pos12) && pos12.equals(pos13) ||
                    pos21.equals(pos22) && pos22.equals(pos23) ||
                    pos31.equals(pos32) && pos32.equals(pos33) ||
                    pos11.equals(pos21) && pos21.equals(pos31) ||
                    pos12.equals(pos22) && pos22.equals(pos32) ||
                    pos13.equals(pos23) && pos23.equals(pos33) ||
                    pos11.equals(pos22) && pos22.equals(pos33) ||
                    pos13.equals(pos22) && pos22.equals(pos31);

                    if (won) {
                        if (turnFlag == -1) {
                            System.out.print(player1 + " won!");
                        } else {
                            System.out.print(player2 + " won!");
                        }
                    } else if (counter == 9) {
                        System.out.println("It was a tie.");
                    }
                }

                counter++;
                turnFlag = turnFlag * -1;
            } else {
                System.out.println("Invalid choice.");         
            }
        }
        scanner.close();
    }
}