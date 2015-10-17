# Kapitel 4 Übung 1 ("Bruchdarstellung" und "Goldener Schnitt")

## Methode zum Darstellen von Brüchen

* Schreiben Sie eine Methode ```bruchDarstellen```, die zwei Parameter vom Typ ```int``` erwartet (```zaehler``` und ```nenner```) und kein Ergebnis liefert.
* Diese Methode soll drei Zeilen auf der Konsole nach folgendem Muster ausgeben:

```
<wert von zaehler>
-------------------------- = <kommazahl>
<wert von nenner>
```

* Testen Sie die Methode, indem Sie sie mindestens dreimal verwenden.

## Goldener Schnitt

* Schreiben Sie ein Programm, welches näherungsweise den [Goldenen Schnitt](https://de.wikipedia.org/wiki/Goldener_Schnitt) bestimmt. Dieser kann mit folgendem Verfahren bestimmt werden:

1. Begonnen wird mit einem Bruch, bei dem Zähler und Nenner gleich 1 sind.
2. Es wird ein neuer Bruch wie folgt ermittelt:
  * neuer Zaehler = alter Nenner
  * neuer Nenner = alter Nenner + alter Zähler

* Schritt 2 wird beliebig oft wiederholt, mit jeder Wiederholung wird das Ergebnis präziser.
