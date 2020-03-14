package chessgamedesign;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessGameDesign {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch ch = new ChessMatch();
        
        while(1 == 1){
            try{
                UI.clearScreen();
                UI.printBoard(ch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = ch.performChessMove(source, target);
                System.out.println();
            } catch(ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();                
            } 
        }
    }
    
}
