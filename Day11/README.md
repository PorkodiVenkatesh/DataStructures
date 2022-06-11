# Hash Tables

- Hash table data structure stores elements in **key-value pairs**.
- Allows **very fast retrieval of data, no matter how much data there is**
- **Hashing**
  - Hashing is a technique or process of mapping keys, values into the hash table by using a **hash function**. 
  - It is done for faster access to elements. 
  - The efficiency of mapping depends on the efficiency of the hash function used. 

- **Division Method - one of the hashing technique**
  - If Key is numeric value - Divide the key by number of available addresses, n, and take the remainder. 
  - `index =key Mod n`
  - If Key is alphanumeric value - Divide the sum of ASCII codes in a key by the number of available addresses, n, and take the remainder.

### Collision

When the hash function generates the same index for multiple keys, there will be a conflict (what value to be stored in that index). This is called a hash collision.

We can resolve the hash collision using one of the following techniques.
- Collision resolution by chaining
- Open Addressing: Linear/Quadratic Probing and Double Hashing
 
### Chaining 

- In chaining, if a hash function produces the same index for multiple elements, these elements are stored in the same index by using a Linked List.

![image](https://user-images.githubusercontent.com/70228962/173190688-eb560861-d436-4ec3-ba3b-3e365de3f369.png)

### HashTable in Collection Framework

- HashTable is a class in the collection framwork that implements Map Interface
- Stores as key value pair
- Hashtable doesn’t allow any null key or value.

> **Note:**
>  - Hashtable is the older class, and its use is generally discouraged. 
>  - Perhaps they saw the need for a null key, and more importantly - null values, and added it in the HashMap implementation.  
>  - HashMap is newer, and has more advanced capabilities, which are basically just an improvement on the Hashtable functionality. 
>  - When HashMap was created, it was specifically designed to handle null values as keys and handles them as a special case.

### Hashmap vs Hashtable 
- HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
- HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
- HashMap is generally preferred over HashTable if thread synchronization is not needed.

### Click [here](/HashTables.pdf) to see the detailed notes

## Imocha Questions

- [2D-Array: Reactor Simulator](/Imocha/Question8.md) 

## Code Chef Problems

- Prb6 : [Studying Alphabet](https://www.codechef.com/submit-v2/ALPHABET) - Click [here](./CCPrb6.java) to see the solution


