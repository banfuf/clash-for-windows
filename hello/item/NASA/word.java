package NASA;
public class word {
	public static void main(String[] args) {
		int arr = 10;
		int[] array = new int[arr];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;
		int size = 0;
		for(int i = 0; i < arr; i++) {
			size += array[i];
		}
		System.out.println(size);
	}
}
