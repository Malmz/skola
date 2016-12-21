## Simple sort (Selection sort)

#### Beskrivning av operation

Selection sort loopar igenom ett fält. För varje värde i fältet loopar den igenom resten av talen och ser om något är mindre, om det är mindre sparar man den och jämför med det talet istället. När man har jämfört med alla tal byter man plats på det minsta och det nuvarande talet i yttre loopen.

![selection sort gif](http://piratelearner.com/static/media/images/admin/2015/10/13/selection.gif)

#### Kod-liknande beskrivning

- Gå igenom varje nummer i fältet. Index för nuvarande nummer är lagrat i variabeln `index`.
  - Deklarera variabel `smallest` med värdet `index`.
  - Starta på nummer `index`+1 och gå igenom varje nummer i fältet. Index för nuvarande nummer är lagrat i variabeln `innerIndex`.
    - Om numret vid `innerIndex` är mindre än numret vid `smallest`.
      - `smallest` = `innerIndex`
  - Byt plats på `index` och `smallest`

## Bubble sort

#### Beskrivning av operation

Bubble sort loopar igenom ett fält. För varje värde i fältet loopar den igenom baklänges. Om talet under är mindre, byt plats på dem. Det första talet är nu sorterat så vi behöver inte röra det mer. Om inga tal bytte plats under en iteration så betyder det att fältet är sorterad och programmet kan avslutas.

![bubble sort gif](http://piratelearner.com/static/media/images/admin/2015/10/13/bubble.gif)

Bilden visar sortering från motsatt håll men iden är samma.

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
