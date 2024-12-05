package psa.naloga3;

/*
 * The class must implement the data structure of a Hash Table.
 * Use the following hash function: h(x) = x * 701 mod 2000
 * In case of collisions, use CHAINING, specifically implementing the dictionary
 * as a Hash Table, which you must implement (class HashTable2).
 * Be careful, as the key can also be a negative number.
 */

public class HashTable {
	HashTable2[] data;

	public int hashFunction(int key) {
		return ((key * 701) % 2000 + 2000) % 2000;
	}


	/*
	 * Metoda sprejme število in ga vstavi v tabelo. Metoda vrne true, ce je
	 * bilo ustavljanje uspešno in false sicer
	 */
	public boolean insert(int key) {
		int hashValue = hashFunction(key);
		if (data[hashValue] == null) {
			data[hashValue] = hashValue;
			return true;
		}else if (data[hashValue] == hashValue){
			return false;
		} else if () {
			
		}
	}

	/*
	 * Metoda sprejme število in ga poišče v tabeli. Metoda vrne true, ce je
	 * bilo ustavljanje uspešno in false sicer
	 */
	public boolean search(int key) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	/*
	 * Metoda sprejme število in ga izbriše iz tabele. Metoda vrne true, ce je
	 * bilo ustavljanje uspešno in false sicer
	 */
	public boolean delete(int key) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}
}
