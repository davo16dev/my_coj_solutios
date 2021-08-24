import java.util.Scanner;

/**
 *
 * @author Charlie-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);

        String num=Leer.nextLine();
        int x=Integer.parseInt(num);

          String newp = "";
        
      
        for (int j = 0; j < x; j++) {
            
            
            String pal = Leer.nextLine();

            newp="";
            

          

            for (int i = 0; i < pal.length(); i++) {
               if (pal.charAt(i) == 'a') {
                    newp += "A";
                } else if (pal.charAt(i) == 'b') {
                    newp += "B";
                }

                else if (pal.charAt(i) == 'c') {
                    newp += "C";
                } else if (pal.charAt(i) == 'd') {
                    newp += "D";
                }

                else if (pal.charAt(i) == 'e') {
                    newp += "E";
                } else if (pal.charAt(i) == 'f') {
                    newp += "F";
                }

                else if (pal.charAt(i) == 'g') {
                    newp += "G";
                } else if (pal.charAt(i) == 'h') {
                    newp += "H";
                }

                else if (pal.charAt(i) == 'i') {
                    newp += "I";
                } else if (pal.charAt(i) == 'j') {
                    newp += "J";
                }

                else if (pal.charAt(i) == 'k') {
                    newp += "K";
                } else if (pal.charAt(i) == 'l') {
                    newp += "L";
                }

                else if (pal.charAt(i) == 'm') {
                    newp += "M";
                } else if (pal.charAt(i) == 'n') {
                    newp += "N";
                }

                else if (pal.charAt(i) == 'o') {
                    newp += "O";
                } else if (pal.charAt(i) == 'p') {
                    newp += "P";
                }

                else if (pal.charAt(i) == 'q') {
                    newp += "Q";
                } else if (pal.charAt(i) == 'r') {
                    newp += "R";
                }
                
                else if (pal.charAt(i) == 's') {
                    newp += "S";
                } else if (pal.charAt(i) == 't') {
                    newp += "T";
                }

                else if (pal.charAt(i) == 'u') {
                    newp += "U";
                } else if (pal.charAt(i) == 'v') {
                    newp += "V";
                }

                else if (pal.charAt(i) == 'w') {
                    newp += "W";
                } else if (pal.charAt(i) == 'x') {
                    newp += "X";
                }

                else if (pal.charAt(i) == 'y') {
                    newp += "Y";
                } else if (pal.charAt(i) == 'z') {
                    newp += "Z";
                }

                
                
                /////////////////////////////////////////////
                
                
                else   if (pal.charAt(i) == 'A') {
                    newp += "a";
                } else if (pal.charAt(i) == 'B') {
                    newp += "b";
                }

                else if (pal.charAt(i) == 'C') {
                    newp += "c";
                } else if (pal.charAt(i) == 'D') {
                    newp += "d";
                }

                else if (pal.charAt(i) == 'E') {
                    newp += "e";
                } else if (pal.charAt(i) == 'F') {
                    newp += "f";
                }

                else if (pal.charAt(i) == 'G') {
                    newp += "g";
                } else if (pal.charAt(i) == 'H') {
                    newp += "h";
                }

                else if (pal.charAt(i) == 'I') {
                    newp += "i";
                } else if (pal.charAt(i) == 'J') {
                    newp += "j";
                }

                else if (pal.charAt(i) == 'K') {
                    newp += "k";
                } else if (pal.charAt(i) == 'L') {
                    newp += "l";
                }

                else if (pal.charAt(i) == 'M') {
                    newp += "m";
                } else if (pal.charAt(i) == 'N') {
                    newp += "n";
                }

                else if (pal.charAt(i) == 'O') {
                    newp += "o";
                } else if (pal.charAt(i) == 'P') {
                    newp += "p";
                }

                else if (pal.charAt(i) == 'Q') {
                    newp += "q";
                } else if (pal.charAt(i) == 'R') {
                    newp += "r";
                }
                
                else if (pal.charAt(i) == 'S') {
                    newp += "s";
                } else if (pal.charAt(i) == 'T') {
                    newp += "t";
                }

                else if (pal.charAt(i) == 'U') {
                    newp += "u";
                } else if (pal.charAt(i) == 'V') {
                    newp += "v";
                }

                else if (pal.charAt(i) == 'W') {
                    newp += "w";
                } else if (pal.charAt(i) == 'X') {
                    newp += "x";
                }

                else if  (pal.charAt(i) == 'Y') {
                    newp += "y";
                } else if (pal.charAt(i) == 'Z') {
                    newp += "z";
                }
 
               else 
                    newp+=pal.charAt(i);
               
            }

            System.out.println(newp);
        }

    }

}
