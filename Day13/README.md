# Tower of Hanoi

![image](https://user-images.githubusercontent.com/70228962/173197494-895a90b9-e142-4f41-90fe-fb31a8eb96b9.png){ width: 200px; }

### For n = 1 disk

![image](https://user-images.githubusercontent.com/70228962/173197517-23cd7a96-dff0-4050-95cf-71cd58ffe7b5.png){ width: 200px; }

### For n = 2 disk

![image](https://user-images.githubusercontent.com/70228962/173197529-1207f967-90f9-4c55-8246-7e4f671fc5df.png){ width: 200px; }

### Algorithm

![image](https://user-images.githubusercontent.com/70228962/173197550-6f409acf-2f74-4669-b64c-9da83039ba0a.png){ width: 200px; }

![](https://www.tutorialspoint.com/data_structures_algorithms/images/tower_of_hanoi.gif)

So, the steps are

![image](https://user-images.githubusercontent.com/70228962/173197577-94dd5bb1-f725-43b2-9851-9c44ce6e8968.png)

### For n = 3 disk

![image](https://user-images.githubusercontent.com/70228962/173197593-4010d2da-b1e9-4ed1-9d1b-80adf19d81ca.png)

Let's follow the Algorithm steps

![image](https://user-images.githubusercontent.com/70228962/173197614-c8a9ccf5-20b3-4eeb-8107-aabb133f67aa.png)

Since I have to move one disk at the time, step 1 and step 3. need to re-iterate with Algorithm where as step 2 is valid

Let's take the step 1:

![image](https://user-images.githubusercontent.com/70228962/173197686-4079c3ea-250e-4b11-a8b7-dc7f8f7d9721.png)

Now, let's solve like how we do for n = 2 disks.

![image](https://user-images.githubusercontent.com/70228962/173197713-ed1735b6-132c-4d3c-8018-a98847e0575d.png)

Similary, Let's do for the step 3:

![image](https://user-images.githubusercontent.com/70228962/173197747-c8126b26-85f4-452c-857f-4312d43836b8.png)

Now, let's solve like how we do for n = 2 disks.

![image](https://user-images.githubusercontent.com/70228962/173197758-f9dd5ca6-0fb6-48a9-a793-c379328a61d9.png)

Here, if we closely watch, we are doing these below steps:

![image](https://user-images.githubusercontent.com/70228962/173197577-94dd5bb1-f725-43b2-9851-9c44ce6e8968.png)

### Let's use Recursion

A recursive algorithm for Tower of Hanoi can be driven as follows 

```
TowerOfHanoi(N, source, destination, helper)
         IF N == 1, THEN
      	    Move N from source to destination            
         ELSE
 	          TowerOfHanoi(N - 1, source, helper, destination)     // Step 1
      	    Move N from source to destination          // Step 2
 	          TowerOfHanoi(N - 1, helper, destination, source)     // Step 3
```


