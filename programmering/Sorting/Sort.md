## Simple sort (Selection sort)

#### Beskrivning av operation

Selection sort loopar igenom en array. För varje värde i arrayen loopar den igenom resten av talen och ser om något är mindre, om det är mindre sparar man den och jämför med det talet istället. När man har jämfört med alla tal byter man plats på det minsta och det nuvarande talet i yttre loopen.

![selection sort gif](http://piratelearner.com/static/media/images/admin/2015/10/13/selection.gif)

#### Kod-liknande beskrivning

- Gå igenom varje nummer i arrayen. Index för nuvarande nummer är lagrat i variablen `index`.
  - Deklarera variabel `smallest` med värdet `index`.
  - Starta på nummer `index`+1 och gå igenom varje nummer i arrayen. Index för nuvarande nummer är lagrat i variablen `innerIndex`.
    - Om numret vid `innerIndex` är mindre än numret vid `smallest`.
      - `smallest` = `innerIndex`
  - Byt plats på `index` och `smallest`

## Bubble sort

#### Beskrivning av operation

Bubble sort loopar igenom en array. För varje värde i arrayen loopar den igenom baklänges. Om talet under är mindre, byt plats på dem. Det första talet är nu sorterat så vi behöver inte röra det mer. Om inga tal bytte plats under en iteration så betyder det att arrayen är sorterad och programmet kan avslutas.

![bubble sort gif](http://piratelearner.com/static/media/images/admin/2015/10/13/bubble.gif)

Bilden visar sortering från motsatt håll men iden är samma.

## Prestanda
