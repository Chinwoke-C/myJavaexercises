package Chapter19.searchTechniques;

public class BinarySearch {
    public static int binarySearch(int[] data, int key) {
        int low = 0;
        int high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;

        do {
            System.out.print(remainingElements(data, low, high));
            for (int i = 0; i < middle ; i++) {
                System.out.print("  ");
            }
            System.out.println(" * ");
            if ((key == data[middle])) {
                location = middle;
            } else if (key < data[middle]) {
                high = middle - 1;
            } else{
                low = middle + 1;
            }
            middle = (low + high + 1) / 2;
        } while ((low <= high) && (location == -1));
        return location;
    }

    private static String remainingElements(int[] data, int low, int high) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < low ; i++) {
            sb.append("  ");
        }
        for (int i = low; i <= high; i++) {
            sb.append(data[i]).append("  ");

        }
        return String.format("%s%n",sb);
    }
}
