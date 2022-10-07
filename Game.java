package module7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {

    enum GameType {
        SOCCER(11),
        HOCKEY(6),
        RUGBY(15);
        private int num;

        public int getNum() {
            return num;
        }

        GameType(int num) {
            this.num = num;
        }
    }

    public static void writeNumOfPlayersPerTeam(GameType game) throws IOException {
        String fileName = String.valueOf(game);

        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(fileName);
        Scanner scanner = new Scanner(file);


        try {
            switch (game) {
                case SOCCER:
                    file.createNewFile();
                    System.out.println("File " + game + " is created successfully");
                    fileWriter.write("The number of players on the " + fileName + " team is " + Integer.toString(game.getNum()));
                    fileWriter.close();
                    while (scanner.hasNextLine())
                        System.out.println(scanner.nextLine());
                    break;


                case HOCKEY:
                    file.createNewFile();
                    System.out.println("File " + game + " is created successfully");
                    fileWriter.write("The number of players on the " + fileName + " team is " + Integer.toString(game.getNum()));
                    fileWriter.close();
                    while (scanner.hasNextLine())
                        System.out.println(scanner.nextLine());
                    break;

                case RUGBY:
                    file.createNewFile();
                    System.out.println("File " + game + " is created successfully");
                    fileWriter.write("The number of players on the " + fileName + " team is " + Integer.toString(game.getNum()));
                    fileWriter.close();
                    while (scanner.hasNextLine())
                        System.out.println(scanner.nextLine());
                    break;

            }
        } catch (IOException | NullPointerException err) {
            System.out.println("ERROR");
//            throw new RuntimeException(err);
        }
    }
}