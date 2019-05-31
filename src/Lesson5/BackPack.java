package Lesson5;

public class BackPack {
    public static void main(String[] args) {
        int[] arr = new int[]{600, 5000, 1500, 40000, 500};
        int[] arr2 = new int[]{1, 2, 4, 2, 1};
        String[] arr3 = new String[]{"Книга", "Бинокль", "Аптечка", "Ноутбук", "Котелок"};
        int w=5;
        int[] tab = new int[w+1];
        System.out.println(BackPack(arr,arr2,5,tab,0));
        /*
        for (int i:tab){
            System.out.println(i);
        }
        */
    }

    static int BackPack(int[] values, int[] weights, int max, int[] tab, int i) {
        if(i>=values.length) return 0;
        if(tab[max] != 0) return tab[max];
        int value1 = BackPack(values, weights, max, tab, i+1);
        int value2 = 0;
        if(max >= weights[i])
            value2 = BackPack(values, weights, max-weights[i], tab, i+1) + values[i];
        return tab[max] = (value1>value2) ? value1 : value2;
    }

}
