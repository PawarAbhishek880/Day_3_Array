public class Find_freq {
    public static void main(String[] args) {
        int[] elements = new int[]{1, 1, 2, 2, 3, 3, 3, 4, 5, 5};
        int[] freq = new int[elements.length];
        int counted = -1;

        for (int i = 0; i < elements.length; i++) {
            int count = 1;
            for (int j =i+1; j < elements.length; j++) {
                if (elements[i] == elements[j]) {
                    count++;
                    freq[j] = counted;
                }
            }
            if (freq[i] != counted)
                freq[i] = count;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != counted)
                System.out.println(" " + elements[i] + "  " + freq[i]);
        }
    }
}
