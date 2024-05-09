/*

TCS - NQT - YOP 2024
 
        Proccess data of candidates with name and score;
        sort by score
        and display k th number of candidates on top of list


        input: 
        Enter K value:
        3
        Enter number of Candidates: 
        5
        Enter name of candidate 1 :
        Sofiyan
        Enter score of candidate 1 :
        92
        Enter name of candidate 2 :
        Pawan
        Enter score of candidate 2 :
        90
        Enter name of candidate 3 :
        Shibban
        Enter score of candidate 3 :
        91
        Enter name of candidate 4 :
        John
        Enter score of candidate 4 :
        85



*/

import java.util.*;
public class ProccessData {

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Enter K value:");
            int k = scanner.nextInt();
    
            System.out.println("Enter number of Candidates:");
            int numCandidates = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
    
            Map<String, Integer> candidates = new HashMap<>();
    
            for (int i = 0; i < numCandidates; i++) {
                System.out.println("Enter name of candidate " + (i + 1) + ":");
                String name = scanner.nextLine();
    
                System.out.println("Enter score of candidate " + (i + 1) + ":");
                int score = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
    
                candidates.put(name, score);
            }
    
            // Sorting candidates by score (descending order)
            List<Map.Entry<String, Integer>> sortedCandidates = new ArrayList<>(candidates.entrySet());
            Collections.sort(sortedCandidates, (a, b) -> b.getValue() - a.getValue());
    
            // Displaying the top k candidates
            System.out.println("\nTop " + k + " candidates:");
            for (int i = 0; i < Math.min(k, sortedCandidates.size()); i++) {
                Map.Entry<String, Integer> entry = sortedCandidates.get(i);
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    
    
    
}
