import java.util.Scanner;

public class App {

    static void nameCombiner (String name1, String name2, String name3, int combinationNumber) {
        int iteration = 0;
        String names[] = {name1, name2, name3};

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                if (i == j) {
                    continue;
                }
                
                iteration += 1;

                if (combinationNumber == iteration){
                    System.out.println("\nName: " + names[i] + " " + names[j]);
                    System.out.println("Initial: " + names[i].charAt(0) + names[j].charAt(0));
                    System.out.println("Suggested username: " + names[i].toLowerCase() + "_" + names[j].toLowerCase());
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Name: ");
        String name1 = sc.next();
        
        System.out.print("Second Name: ");
        String name2 = sc.next();

        System.out.print("Third Name: ");
        String name3 = sc.next();

        System.out.print("Name Combination(1 - 6): ");
        int combinationNumber = sc.nextInt();

        nameCombiner(name1, name2, name3, combinationNumber);

        sc.close();
    }
}
