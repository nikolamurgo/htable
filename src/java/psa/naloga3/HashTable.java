package psa.naloga3;

/*
 * In case of collisions, use CHAINING, specifically implementing the dictionary
 * as a Hash Table, which you must implement (class HashTable2).
 *
 * Be careful, as the key can also be a negative number.
 */

public class HashTable {
	HashTable2[] data;

	HashTable2 ht2 = new HashTable2();

	public HashTable() {
		data = new int[2000];
	}

	// hash function h(x) = x * 701 mod 2000, applied to neg nums also
	public int hashFunction(int key) {
		return ((key * 701) % 2000 + 2000) % 2000;
	}


	public boolean insert(int key) {
		int hashValue = hashFunction(key);

		if (data[hashValue] == null) {
			if(ht2.search(key) == false){
				data[hashValue] = key;
				return true;
			}else{
				return false;
			}
		}else if (data[hashValue] == key){
			return false;
		} else if(data[hashValue] != key){
			// check if it is in ht2, if yes then return false if not insert in ht2 and ret true
			if(ht2.search(key)){
				return false;
			}else{
				ht2.insert(key);
				//return true ????
			}
		}

	}

	public boolean search(int key) {
		int hashValue = hashFunction(key);

		if (data[hashValue] == key){
			return true;
		}else if (data[hashValue] = null || data[hashValue] != key) {
			if(ht2.search(key)){
				return true;
			}else{
				return false;
			}
		}
	}


	public boolean delete(int key) {
		throw new UnsupportedOperationException("tbe");
	}
}
