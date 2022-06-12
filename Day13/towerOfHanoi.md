# Tower of Hanoi

The Tower of Hanoi is also known as the Tower of Brahma or the Lucas Tower. It is a mathematical game or puzzle that consists of three rods with ’n’ number of disks of different diameters.

The objective of the game is to shift the entire stack of disks from one rod to another rod following these three rules :

- Only one disk can be moved at a time.
- Only the uppermost disk from one stack can be moved on to the top of another stack or an empty rod.
- Larger disks cannot be placed on the top of smaller disks.

**The minimal number of moves required to solve the Tower of Hanoi puzzle of n disks would be ($2^n$) − 1.**


## For n = 1 disk

![image](https://user-images.githubusercontent.com/70228962/173197517-23cd7a96-dff0-4050-95cf-71cd58ffe7b5.png)

## For n = 2 disk

![image](https://user-images.githubusercontent.com/70228962/173197529-1207f967-90f9-4c55-8246-7e4f671fc5df.png)

## Algorithm

To write an algorithm for Tower of Hanoi, first we need to learn how to solve this problem with lesser amount of disks, say → 1 or 2. We mark three towers/rods/peg source, destination and helper/auxiliary (only to help moving the disks). If we have only one disk, then it can easily be moved from source to destination.

If we have 2 disks −

1. First, we move the smaller (top) disk to auxiliary.
2. Then, we move the larger (bottom) disk to destination.
3. And finally, we move the smaller disk from aux to destination.

![](https://www.tutorialspoint.com/data_structures_algorithms/images/tower_of_hanoi_two_disks.gif)

So now, we are in a position to design an algorithm for Tower of Hanoi with more than two disks. We divide the stack of disks in two parts. The largest disk (nth disk) is in one part and all other (n-1) disks are in the second part. So, the steps are

![image](https://user-images.githubusercontent.com/70228962/173197577-94dd5bb1-f725-43b2-9851-9c44ce6e8968.png)

## For n = 3 disk

![image](https://www.tutorialspoint.com/data_structures_algorithms/images/tower_of_hanoi.gif)


### Let's follow the Algorithm steps

![image](https://user-images.githubusercontent.com/70228962/173197614-c8a9ccf5-20b3-4eeb-8107-aabb133f67aa.png)


### Since I have to move one disk at the time, step 1 and step 3 are need to re-iterate with algorithm whereas step 2 is valid.


### Let's take the step 1:

![image](https://user-images.githubusercontent.com/70228962/173197686-4079c3ea-250e-4b11-a8b7-dc7f8f7d9721.png)


### Now, let's solve like how we do for n = 2 disks.

![image](https://user-images.githubusercontent.com/70228962/173197713-ed1735b6-132c-4d3c-8018-a98847e0575d.png)


### Similary, Let's do for the step 3:

![image](https://user-images.githubusercontent.com/70228962/173197747-c8126b26-85f4-452c-857f-4312d43836b8.png)


### Now, let's solve like how we do for n = 2 disks.

![image](https://user-images.githubusercontent.com/70228962/173197758-f9dd5ca6-0fb6-48a9-a793-c379328a61d9.png)


### Here, if we closely watch, we are doing these below steps in a recursive way until disk need to move is 1

![image](https://user-images.githubusercontent.com/70228962/173197577-94dd5bb1-f725-43b2-9851-9c44ce6e8968.png)

### Let's construct a recursive algorithm for Tower of Hanoi

```
TowerOfHanoi(N, source, destination, helper)
         IF N == 1, THEN
      	    Move N from source to destination            
         ELSE
 	          TowerOfHanoi(N - 1, source, helper, destination)     // Step 1
      	    Move N from source to destination          // Step 2
 	          TowerOfHanoi(N - 1, helper, destination, source)     // Step 3
```

### Let's Code - Click [here](./TowerOfHanoi.java) to see the full code

```java
public static void towerOfHanoi (int n , String source, String destination, String helper ) {
		if (n==1) {
			System.out.println("Move disk " + n  + " form " + source + " to  " + destination);
		}
		else {
			towerOfHanoi(n -1 , source, helper, destination);
			System.out.println("Move disk " + n  + " form " + source + " to  " + destination);
			towerOfHanoi(n -1 , helper, destination, source);
		}
	}
```
### Let's watch execution of this above methods for n = 3 disks


https://user-images.githubusercontent.com/70228962/173246234-514d7d7b-610c-43ae-bb2e-c27d4e030585.mp4

