import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter your input: ");
            int input = sc.nextInt();
            System.out.println("Please provide the position you want to check: ");
            int position = sc.nextInt();
            int bitmask = 1<<position;
            if((input&bitmask)==0){
                System.out.println("Your required position is equivalent to Zero 0.");
            }else{
                System.out.println("Your desiring positin is One 1.");
            }

        }
    }

