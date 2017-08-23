import java.util.Scanner;

public class BooleanStringValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<test; i++){
            String line = sc.nextLine();
            while(line.length()>1){
                switch (line.charAt(1)){
                    case 'A':
                        if (line.charAt(0) ==  '1' && line.charAt(2) == '1')
                        {
                            line = "1" + line.substring(3);
                        }
                        else {
                            line = "0" + line.substring(3);
                        }
                        break;
                    case 'B':
                        if (line.charAt(0) ==  '1' || line.charAt(2) == '1') {
                            line = "1" + line.substring(3);
                        }
                        else {
                            line = "0" + line.substring(3);
                        }
                        break;

                    case 'C':
                        if (line.charAt(0) ==  '1' ^ line.charAt(2) == '1')
                        {
                            line = "1" + line.substring(3);
                        }
                        else {
                            line = "0" + line.substring(3);
                        }
                        break;
                }
            }
            System.out.println(line);

        }
    }
}
