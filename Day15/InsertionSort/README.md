
# Insertion Sort

Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. 

The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

## How Insertion Sort Works?

Suppose we need to sort the following array.

<img width="250" alt="im1" src="https://user-images.githubusercontent.com/82796751/173298377-6e7ce7d5-d82b-460f-ada6-269bdd655bb2.PNG">

The first element in the array is assumed to be sorted. Take the second element and store it separately in key.

Compare key with the first element. If the first element is greater than key, then key is placed in front of the first element.
<img width="358" alt="im2" src="https://user-images.githubusercontent.com/82796751/173298652-deaf82a7-6a0a-4f81-ad49-99c8dc71a018.PNG">

Now, the first two elements are sorted.

Take the third element and compare it with the elements on the left of it. Placed it just behind the element smaller than it. If there is no element smaller than it, then place it at the beginning of the array.

<img width="357" alt="im3" src="https://user-images.githubusercontent.com/82796751/173298685-bf807829-08ad-428a-9741-ecfa0a07eff1.PNG">

Similarly, place every unsorted element at its correct position.

<img width="338" alt="im4" src="https://user-images.githubusercontent.com/82796751/173298695-26ec47c3-e648-4543-bfcc-a49bd80361a0.PNG">

<img width="304" alt="im5" src="https://user-images.githubusercontent.com/82796751/173298716-2bf19970-9299-4bee-9733-051d008bf7f8.PNG">


Click [here](./InsertionSort.java) to see the code.

- **Time Complexity O(N^2)**
- **Space Complexity O(1)**
