package psa.naloga3;

/*
 * In case of collisions, using CHAINING, specifically implementing the dictionary
 * as a Hash Table,  (class HashTable2).
 *
 * key can also be a negative number.
 */

public class HashTable {
	HashTable2[] data = new HashTable2[2000];

//	HashTable2 ht2 = new HashTable2();

	// hash function h(x) = x * 701 mod 2000, applied to neg nums also
	public int hashFunction(int key) {
		return ((key * 701) % 2000 + 2000) % 2000;
	}


	public boolean insert(int key) {
		int hashValue = hashFunction(key);

		if (data[hashValue] == null) {
			data[hashValue] = new HashTable2();
		}else if(data[hashValue].search(key)){
			return false;
		}
		return data[hashValue].insert(key);
	}

	public boolean search(int key) {
		int hashValue = hashFunction(key);

		if(data[hashValue] == null){
			return false;
		}else{
			return data[hashValue].search(key);
		}
	}


	public boolean delete(int key) {
		int hashValue = hashFunction(key);
		if(data[hashValue] == null || data[hashValue].search(key) == false){
			return false;
		}else{
			return data[hashValue].delete(key);
		}
	}
}
