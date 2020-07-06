package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.model.Resume;

import java.util.Arrays;

public class SortedArrayStorage extends AbstractArrayStorage {

    @Override
    protected void delElement(int index) {
        int num = size - index - 1;
        if (num > 0) {
            System.arraycopy(storage, index + 1, storage, index, num);
        }
    }

    @Override
    protected void insertElement(Resume r, int index) {
        int elementIndex = -index - 1;
        System.arraycopy(storage, elementIndex, storage, elementIndex + 1, size - elementIndex);
        storage[elementIndex] = r;
    }

    @Override
    protected int getIndex(String uuid) {
        Resume searchKey = new Resume();
        searchKey.setUuid(uuid);
        return Arrays.binarySearch(storage, 0, size, searchKey);
    }
}