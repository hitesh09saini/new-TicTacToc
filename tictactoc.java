import java.util.ArrayList;
import java.util.Scanner;

public class tictactoc {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        String player1;
        String player2;

        System.out.println("\n\n\n\n\n\n\n\n                                        WELCOME IN TICTACTOC !");
        System.out.println("WELCOME IN HITESH GAMES :  \n");
        System.out.println(
                "\nRULES OF MY GAME  ....\n1. DON'T ENTER AGAIN BY AGAIN A NUMBER \n2. DON'T ENTER INVALIDE NUMBERS \n");
        System.out.println("\n\nARE YOU AGREE THEN PRESS 1.\nAND NOT THEN PRESS 2.");
        int yes = s.nextInt();

        if (yes == 1) {
            s.nextLine();
            System.out.print("ENTER 1ST PLAYER NAME : ");
            player1 = s.nextLine();

            System.out.print("\n\nENTER 2ST PLAYER NAME : ");
            player2 = s.nextLine();

            System.out.println("\n\nLET'S START PLAY .....\n\n");

            System.out.println(player1 + " PLAYER 1 : O \n\n" + player2 + " PLAYER 2 :  X \n");

            // board

            String[][] board = { { " 1 ", "|", " 2 ", "|", " 3 " }, { "---", "+", "---", "+", "---" },
                    { " 4 ", "|", " 5 ", "|", " 6 " },
                    { "---", "+", "---", "+", "---" },
                    { " 7 ", "|", " 8 ", "|", " 9 " } };

            System.out.println("BOARD !");
            boardprint(board); // print board

            ArrayList<Integer> q = new ArrayList<>();

            int i = 1;
            while (i <= 9) {

                System.out.print("\nenter the position from 1 to 9 :   ");
                int p = s.nextInt();
                int d = 0;

                // check again enter number
                q.add(p);
                for (int j = 0; j < q.size(); j++) {
                    if (q.get(j) == p) {
                        if (d > 0) {
                            System.out.println("END \n");
                            System.out.println("You are not following the rule.\nYou are enter that number again" + p);
                            System.out.println("TRY NEXT TIME AND REMEBER RULES");
                            return;
                        }
                        d++;
                    }
                }

                // alternte
                if (i % 2 != 0) {
                    switcho(p, board);

                    System.out.println("\n\n" + check(board, player1, player2, i)); // CHECK WIN / LOSSERS

                } else {

                    switchx(p, board);

                    System.out.println("\n\n" + check(board, player1, player2, i));

                }

                i++;

            }
        } else {
            System.out.println(" THANKS, YOU CAN GO");
        }
    }

    // print the board
    public static void boardprint(String board[][]) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    // switch the x in the board
    public static void switchx(int p, String board[][]) {
        switch (p) {
            case 1:
                board[0][0] = " x ";
                break;
            case 2:
                board[0][2] = " x ";
                break;
            case 3:
                board[0][4] = " x ";
                break;
            case 4:
                board[2][0] = " x ";
                break;
            case 5:
                board[2][2] = " x ";
                break;
            case 6:
                board[2][4] = " x ";
                break;
            case 7:
                board[4][0] = " x ";
                break;
            case 8:
                board[4][2] = " x ";
                break;
            case 9:
                board[4][4] = " x ";
                break;
            default:
                System.out.println(" that position not exsist");
        }
        boardprint(board);
    }

    // switch the o in the board

    public static void switcho(int p, String board[][]) {
        switch (p) {
            case 1:
                board[0][0] = " O ";
                break;
            case 2:
                board[0][2] = " O ";
                break;
            case 3:
                board[0][4] = " O ";
                break;
            case 4:
                board[2][0] = " O ";
                break;
            case 5:
                board[2][2] = " O ";
                break;
            case 6:
                board[2][4] = " O ";
                break;
            case 7:
                board[4][0] = " O ";
                break;
            case 8:
                board[4][2] = " O ";
                break;
            case 9:
                board[4][4] = " O ";
                break;
            default:
                System.out.println(" that position not exsist");
        }
        boardprint(board);
    }

    // check the win and losser

    public static String check(String board[][], String player1, String player2, int i) {
        String deside = " ";
        String person = " ";

        // for

        if (board[0][0] == board[2][2] && board[2][2] == board[4][4]) {
            deside = "win";

            person = board[0][0];
        }
        if (board[0][4] == board[2][2] && board[2][2] == board[4][0]) {
            deside = "win";

            person = board[0][4];
        }
        // for row
        if (board[0][0] == board[0][2] && board[0][2] == board[0][4]) {
            deside = "win";

            person = board[0][0];
        }
        if (board[2][0] == board[2][2] && board[2][2] == board[2][4]) {
            deside = "win";

            person = board[2][0];
        }
        if (board[4][0] == board[4][2] && board[4][2] == board[4][4]) {
            deside = "win";

            person = board[4][0];
        }

        // for column

        if (board[0][0] == board[2][0] && board[2][0] == board[4][0]) {
            deside = "win";

            person = board[0][0];
        }
        if (board[0][2] == board[2][2] && board[2][2] == board[4][2]) {
            deside = "win";

            person = board[0][2];
        }
        if (board[0][4] == board[2][4] && board[2][4] == board[4][4]) {
            deside = "win";

            person = board[0][4];

        }
        pattern patt = new pattern();
        mainpattern mp = new mainpattern();
        if (i == 9 && deside == " ") {
            patt.pattern1();
            System.out.println("\n\nnext try......End\n\n");

            mp.pattern(person);
        }

        if (person == " O ") {
            person = player1;
            System.out.println("\n\n");
            mp.pattern(person);

        } else if (person == " X ") {
            person = player2;
            System.out.println("\n\n");
            mp.pattern(person);
        }

        return deside + " " + person;

    }

    // end the game

}
