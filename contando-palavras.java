import java.util.*;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> freq = new TreeMap<>();
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            line = line.replaceAll("[,;.:\"!?]", "").toLowerCase();
            
            String[] words = line.trim().split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                }
            }
        }
        
        
        TreeMap<Integer, List<String>> byFreq = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            byFreq.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                  .add(entry.getKey());
        }
        
        
        for (Map.Entry<Integer, List<String>> entry : byFreq.entrySet()) {
            List<String> words = entry.getValue();
            Collections.sort(words); 
            System.out.println(entry.getKey() + ": " + String.join(" ", words));
        }
    }
}
