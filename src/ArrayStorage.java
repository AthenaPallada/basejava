import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        Arrays.fill(storage, null);
//        for(int i = 0; i > storage.length; i++) {
//            storage[i] = null;
//      }
    }

    void save(Resume r) {
//        storage[0] = r;
    }

    Resume get(String uuid) {
        if(storage[0].uuid == uuid) {
            return storage[0];
        }
        return  null;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] tempStorage = new Resume[storage.length];
//        System.arraycopy(storage, 0, tempStorage, 0, storage.length);
        for(int i = 0; i < storage.length; i++) {
            tempStorage[i] = storage[i];
        }
        return tempStorage;
        //return Arrays.copyOf(storage, storage.length);
    }

    int size() {
        return 0;
    }
}