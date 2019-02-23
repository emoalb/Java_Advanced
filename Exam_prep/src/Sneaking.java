import java.util.Scanner;

public class Sneaking {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        char[][] room = new char[n][];
        int[] samPositiob = new int[2];
        int[] nikoladzePosition = new int[2];
        for (int i = 0; i < room.length; i++) {
            String line = console.nextLine();
            room[i] = line.toCharArray();
            if (line.contains("N")) {
                nikoladzePosition[0] = i;
                nikoladzePosition[1] = line.indexOf("N");
            } else if (line.contains("S")) {
                samPositiob[0] = i;
                samPositiob[1] = line.indexOf("S");
            }
        }
        String moveCmd = console.nextLine();
        for (int i = 0; i < moveCmd.length(); i++) {
            enemiesPosition(room);
            boolean samIsDead = checkIsDead(room, samPositiob);
            if (samIsDead) {
                room[samPositiob[0]][samPositiob[1]] = 'X';
                System.out.println("Sam died at " +samPositiob[0]+", "+ samPositiob[1]);
                break;
            } else {
                moveSam(room, samPositiob, moveCmd.charAt(i));
            }
            if(nikoladzePosition[0]==samPositiob[0]){
                System.out.println("Nikoladze killed!");
                room[nikoladzePosition[0]][nikoladzePosition[1]] = 'X';
                break;
            }
        }
        for (char[] row : room) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void moveSam(char[][] room, int[] samPos, char dir) {
       switch(dir) {
           case 'U':
               room[samPos[0]--][samPos[1]] = '.';
               room[samPos[0]][samPos[1]] = 'S';
               break;
           case 'D':
               room[samPos[0]++][samPos[1]] = '.';
               room[samPos[0]][samPos[1]] = 'S';
               break;
           case 'L':
               room[samPos[0]][samPos[1]--] = '.';
               room[samPos[0]][samPos[1]] = 'S';
               break;
           case 'R':
               room[samPos[0]][samPos[1]++] = '.';
               room[samPos[0]][samPos[1]] = 'S';
               break;
       }
    }

    private static boolean checkIsDead(char[][] room, int[] samPos) {
        for (int i = 0; i < samPos[1]; i++) {
            if (room[samPos[0]][i] == 'b') {
                return true;
            }
        }
        for (int i = samPos[1] + 1; i < room[samPos[0]].length; i++) {
            if (room[samPos[0]][i] == 'd') {
                return true;
            }
        }
        return false;
    }

    private static void enemiesPosition(char[][] room) {
        for (int row = 0; row < room.length; row++) {
            for (int col = 0; col < room[row].length; col++) {
                if (room[row][col] == 'b') {
                    if (col == room[row].length - 1) {
                        room[row][col] = 'd';

                    } else {
                        room[row][col] = '.';
                        room[row][col + 1] = 'b';
                        break;
                    }
                } else if (room[row][col] == 'd') {
                    if (col == 0) {
                        room[row][col] = 'b';

                    } else {
                        room[row][col] = '.';
                        room[row][col - 1] = 'd';
                        break;
                    }
                }
            }
        }
    }
}
