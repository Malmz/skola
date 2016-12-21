## Simple sort (Selection sort)

#### Beskrivning av operation

Selection sort loopar igenom ett fält. För varje värde i fältet loopar den igenom resten av talen och ser om något är mindre, om det är mindre sparar man den och jämför med det talet istället. När man har jämfört med alla tal byter man plats på det minsta och det nuvarande talet i yttre loopen.

![selection sort gif](http://piratelearner.com/static/media/images/admin/2015/10/13/selection.gif)

#### Kod

<<<<<<< HEAD
```java
private static int[] simpleSort(int[] array) {
        int[] newArray = array.clone();
        for (int i = 0; i < newArray.length; i++) {
            int smallest = i;
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[j] < newArray[smallest]) {
                    smallest = j;
                }
            }
            swap(newArray, i, smallest);
        }
        return newArray;
    }
```

## Bubble sort

#### Beskrivning av operation

Bubble sort loopar igenom ett fält. För varje värde i fältet loopar den igenom baklänges. Om talet under är mindre, byt plats på dem. Det första talet är nu sorterat så vi behöver inte röra det mer. Om inga tal bytte plats under en iteration så betyder det att fältet är sorterad och programmet kan avslutas.

![bubble sort gif](http://piratelearner.com/static/media/images/admin/2015/10/13/bubble.gif)

Bilden visar sortering från motsatt håll men iden är samma.

#### Kod

```java
private static BubbleReturn bubbleSort(int[] array) {
       BubbleReturn retVal = new BubbleReturn();
       retVal.intArray = array.clone();
       for (int i = 0; i < retVal.intArray.length; i++) {
           boolean hasSwapped = false;
           for (int j = retVal.intArray.length-1; j-1 >= i; j--) {
               if (retVal.intArray[j-1] > retVal.intArray[j]) {
                   swap(retVal.intArray, j-1, j);
                   hasSwapped = true;
               }
           }
           // If nothing has swapped, exit early
           if (!hasSwapped) {
               retVal.early = (i+1);
               return retVal;
           }
       }
       retVal.early = 0;
       return retVal;
   }
```

## Prestanda

Nedan är några tester gjorda på bubble och simple sort. Testerna gjordes med nummer mellan 0 och 500.

- Array längd: 10000
  - Simple sort tog 59 millisekunder
  - Bubble sort tog 149 millisekunder och blev klar efter 9841 iterationer


- Array längd: 50000
  - Simple sort tog 1403 millisekunder
  - Bubble sort tog 4460 millisekunder och blev klar efter 49639 iterationer


- Array längd: 100000
  - Simple sort tog 5083 millisekunder
  - Bubble sort tog 18760 millisekunder och blev klar efter 99389 iterationer

Med mindre fält är simple sort ungefär dubbelt så snabb men för större fält går det mot fyra gånger så snabb. Detta beror på att bubble och simple sort gör like många jämförelser men bubble sort gör många fler byten vilket gör den långsammare.
<<<<<<< HEAD

## Insertion sort

#### beskrivning av operation

Ta första värdet i fältet och lägg det i ett nytt fält. Börja på värde två och loopa igenom fältet. För varje värdet i fältet, loopa igenom det andra fältet baklänges. Om värdet är mindre än det i det andra fältet, flytta upp värdet i det andra fältet med en index. Om värdet är större än det i det andra fältet, sätt in värdet.

![insertion sort gif](http://piratelearner.com/static/media/images/admin/2015/10/14/insertion.gif)

#### Kod

```java
private static int[] insertionSort(int[] array) {
        int[] sorted = new int[array.length];
        sorted[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (0 < j && array[i] < sorted[j-1]) {
                sorted[j] = sorted[j-1];
                j--;
            }
            sorted[j] = array[i];
        }
        return sorted;
    }
```
