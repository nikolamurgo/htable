package psa.naloga3;

/*
 * hash function: h(x) = x * 53 mod 100
 * when collision use linear probing
 */
public class HashTable2 {

	int[] data;

	public HashTable2() {
		data = new int[100];
	}

	public int hashFunction2(int key) {
		return ((key * 53) % 100 + 100) % 100;
	}


	public boolean insert(int key) {
		int hashValue = hashFunction2(key);
		int i=0; // linear probing
		while(i < 100) {
			if (data[hashValue + i] == null){
				data[hashValue + i] = key;
				return true;
				break;
			}else if(data[hashValue +i] != null){
				i++;
			}
		}
		return false;
	}

	public boolean search(int key) {
		int hashValue = hashFunction2(key);
		int i=0; // linear probing

		while(i < 100) {
			if(data[hashValue + i] == key){
				return true;
				break;
			}else{
				i++;
			}
		}
		return false;
	}


	public boolean delete(int key) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}
}
