/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashTableOpen;

import java.util.Arrays;

/**
 *
 * @author felipex
 */
public class HashTable { 
    
    private int capacity;
    private Node[] table;
    private int size = 0;
    Node deleted = new Node(-1, -1);

    HashTable(int capacity) {
        if (capacity < 100)
            this.capacity = 100;
        else
            this.capacity = capacity;
        table = new Node[this.capacity];
        Arrays.fill(table, null);
    }

    HashTable() {
        capacity = 10;
        table = new Node[capacity];
        Arrays.fill(table, null);
    }

    private int hashCode(int key) {
        int hash = 0;
        while (key != 0) {
            int digit = key % 10;
            hash += (digit) * (digit);
            key /= 10;
        }
        return hash;
    }

    public void add(int key, int value) {
        Node newNode = new Node(key, value);
        int hash = hashCode(key) % capacity;
        if (size == 0.7 * capacity) resize();
        if (table[hash] == null) {
            size++;
            table[hash] = newNode;
        } else {
            int i = 1;
            while (table[hash] != null && table[hash].key != key
                    && table[hash].key != -1) {
                hash += i * i;
                hash %= capacity;
                i++;
            }
            size++;
            table[hash] = newNode;
        }
    }

    public Integer search(int key) {
        int hash = hashCode(key) % capacity;
        int counter = 0;

        if (table[hash].key == key) {
            return table[hash].value;
        } else {
            Integer searchResult = null;
            try {
                int i = 1;

                while (table[hash].key != key) {
                    if (counter++ > capacity) {
                        return searchResult;
                    }
                    hash += i * i;
                    hash %= capacity;
                    i++;
                }
                searchResult = table[hash].value;
            } catch (NullPointerException ignore) {
            }
            return searchResult;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        if (capacity < 100) capacity += 100;
        capacity *= 2;
        Node[] oldTable = table;
        table = new Node[capacity];
        size = 0;
        for (int i = 0; i < oldTable.length; i++) {
            if (oldTable[i] != null)
                add(oldTable[i].key, oldTable[i].value);
        }
    }

    public void makeEmpty() {
        size = 0;
        capacity = 1000;
        table = new Node[capacity];
        Arrays.fill(table, null);
    }

    public Node remove(int key) {
        int hash = hashCode(key);
        int i = 1;
        while (table[hash] != null) {
            if (table[hash].key == key) {
                Node tmp = table[hash];
                table[hash] = deleted;
                size--;
                return tmp;
            }
            hash += i * i;
            hash %= capacity;
        }
        throw new NullPointerException("");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && table[i].key != -1)
                str.append(i).append(") ").append(table[i].toString()).append('\n');
        }
        return str.toString();
    }
    
}
