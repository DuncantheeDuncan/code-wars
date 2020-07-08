import java.util.Arrays;

public class Tes {


    // Entry point
    public static void main(String[] args) {
        String message = new Tes().solution("21613@23151811");
//                String message = new Tes().solution("URRRUULD");
        System.out.println(message);
    }

    // Application
    public String solution(String directions) {

        this.navigate(directions);
        String secretMessage = this.getSecretMessage();
        String decryptedMessage = this.decryptSecretMessage(secretMessage);
        return decryptedMessage;
    }

    // Implementation

    private int x;
    private int y;

    public void navigate(String directions) {
        x = 0;
        y = 0;
        String[] j = directions.toLowerCase().split("");

for (int s=0;s<j.length;s++){

            if ("U".toLowerCase().equals(j[s])) {
                y++;
//                System.out.print("Y "+y);
            } else if ("D".toLowerCase().equals(j[s])) {
                y--;
//                System.out.print("D "+y);
            } else if ("L".toLowerCase().equals(j[s])) {

                x--;
//                System.out.println("L " + x);
            } else if ("R".toLowerCase().equals(j[s])) {
                x++;
//                System.out.println("R "+x);
            }

    System.out.println("X: "+x +" Y: "+y);
        }


		/* TODO: Implement this method.
		 		 - Each character in "directions" determines a change in the X or Y value.
		 		 - The characters U (up), D (down), L (left) and R (right). Any other character may be ignored.
		*/
    }

    /*private*/
    public String decryptSecretMessage(String secretMessage) {
        String message = "";


        char[] breakChar = secretMessage.toCharArray();

        for (char c : breakChar) {
            int asciiVal = (int) c;
            char charMessage = (char) asciiVal;
            if (asciiVal % 2 == 0) {
                asciiVal = -1;
                charMessage += (char) asciiVal;
            } else {
                asciiVal = +1;
                charMessage += (char) asciiVal;
            }

            message += String.valueOf(charMessage);

        }

        return message;
    }

    public String getSecretMessage() {
        String[][] messages = new String[][]{
                {"Mps\u001Fsgjt\u001Fpmf\"", "Mps\u001Fsgjt\u001Fpmf\u001Ffjsgfq\"", "Xqpmh\u001Fpmf\"\u001FPpot\"", "Lffo\u001Fkppljmh\""},
                {"Sgjt\u001Fjt\u001Fmps\u001Fjs\"", "Lffo\u001Fhpjmh\"", "Mpof+\u001Fmp\u001Ftfdqfst\u001Fgfqf\"", "Dpnf\u001Fpm+\u001Fkppl\u001Fgbqcfq\""},
                {"Pg\u001Fmp+\u001Fmps\u001Fgfqf\"", "Sgjt\u001Fjt\u001Fb\u001Ftfdqfs-\u001FMps\"", "Cbqjfk\u001Fqpdlt---\u001FIpjm\u001Fvt\"", "Sgjt\u001Fjt\u001Fb\u001Fsqjdl\""},
                {"J\u001Fbn\u001Fmps\u001Fb\u001Ftfdqfs\u001Fnfttbhf\"", "Gfkkp+\u001Favs\u001Fmp\"", "Xqpmh\u001Fpmf+\u001Ftpqqz\"", "Afssfq\u001Fkvdl\u001Fmfws\u001Fsjnf\""}
        };
        return messages[this.x][this.y];
    }
}
