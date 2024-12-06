package psa.naloga3;
import java.util.Arrays;

/*
 * hash function: h(x) = x * 53 mod 100
 * when collision use linear probing
 */
public class HashTable2 {

	int[] data = new int[100];
	final int empty = Integer.MIN_VALUE;

	public HashTable2() {
		Arrays.fill(data, empty);
	}

	public int hashFunction2(int key) {
		return ((key * 53) % 100 + 100) % 100;
	}


	public boolean insert(int key) {
		int hashValue = hashFunction2(key);
		int i=0; // linear probing
		while(i < 100) {
			if (data[hashValue + i] == empty){
				data[hashValue + i] = key;
				return true;
			}else if(data[hashValue +i] != empty){
				i++;
			}
		}
		return false;
	}

	public boolean search(int key) {
		int hashValue = hashFunction2(key);
		int i=0; // linear probing

		while(i<100 && data[hashValue+i % 100] != empty){
			if(data[hashValue +i % 100] == key){
				return true;
			}else{
				i++;
			}
		}
		return false;
	}


	public boolean delete(int key) {
		int hashValue = hashFunction2(key);
		int i=0;
		while(i<100 && data[hashValue + i % 100] != empty){
			if(data[hashValue + i % 100] == key){
				data[hashValue + i % 100] = empty;
				return true;
			}else{
				i++;
			}
		}
		return false;
	}
}
