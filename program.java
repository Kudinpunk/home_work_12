import java.util.Random;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        int MIN_VALUE = 0;
        int MAX_VALUE = 2000;
        int i = get_random_number(MIN_VALUE, MAX_VALUE);
        System.out.println("Ваше число: " + i);
        int n = count_older(i); // при счете с нулевого разряда добавить -1
        System.out.println("Номер старшего разряда числа " + i + " => " + n);
        int [] m_1 = find_numbers_up(n, i, MAX_VALUE);
        System.out.println(Arrays.toString(m_1));
        int [] m_2 = find_numbers_down(n, MIN_VALUE, i);
        System.out.println(Arrays.toString(m_2));
    }
    
    public static int get_random_number(int min_v, int max_v) {
        Random r = new Random();
        return r.nextInt((max_v - min_v) + 1) + min_v;
    }

    public static int count_older (int r_number){
        String bin_number = Integer.toBinaryString(r_number);
        return bin_number.length();
    }

    public static int [] find_numbers_up (int multi_value, int min_value, int max_value){
        int temp_size = 0;
        for (int j = min_value; j < max_value; j++){
            if (j % multi_value == 0){
                temp_size++;
            }
        }
        int [] m_array = new int [temp_size];
        int count_array = 0;
        for (int k = min_value; k < max_value; k++){
            if (k % multi_value == 0){
            m_array[count_array++] = k;
            }
        }
        return m_array;
    }

    public static int [] find_numbers_down (int multi_value, int min_value, int max_value){
        int temp_size = 0;
        for (int j = min_value; j < max_value; j++){
            if (j % multi_value != 0){
                temp_size++;
            }
        }
        int [] m_array = new int [temp_size];
        int count_array = 0;
        for (int k = min_value; k < max_value; k++){
            if (k % multi_value != 0){
            m_array[count_array++] = k;
            }
        }
        return m_array;
    }
}

    