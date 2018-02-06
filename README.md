# testingTools 
ein kurzer Überblick über das Thema Testen für Azubis

## Warum will man automatisiert testen?
Testen kostet Zeit und Geld. Ein übliches Verfahren ist es, ein Testkonzept mit beschriebenen Testfällen an einer Anwendung auszuprobieren. Wenn sich an der Anwendung ändert, muss ein solches Konzept abgearbeitet werden. Jeder gefundene Fehler führt theoretisch zu einer erneuten Änderung der Anwendung und macht erneutes Testen nötig. Je früher im Entwicklungsprozess ein Fehler vermieden oder gefunden wird, desto günstiger ist es. Automatisierte Tests lassen sich mit geringem Kostenaufwand schnell durchführen und finden Fehler in der Entwicklung. Wenn man diese Tests auch noch kontinuirlich während des Entwicklungsprozesses laufen lässt, werden viele Fehler bereits im Entwicklungsprozess gefunden und man spart eine Menge Geld. 


## Welche Arten von automatisierten Tests gibt es?


### UI-Tests
Man kann Anwendungen direkt über ihr Userinterface verwenden und testen, dass sie wie erwartet funktionieren. Diese Tests sind recht Aufwendig, da sie eine tatsächliche Bedienung der Anwendung erforderlich machen und vorraussetzen, dass alle Komponenten der Anwendung hinreichend funktionieren, um das Userinterface zu verwenden. Will man UI-Tests automatisieren, bekommt man das Problem, dass durch kleine Änderungen am Userinterface die Tests bereits fehlschlagen, obwohl die Anwendung noch in vollem Umfang funktioniert, aber anders aussieht.

### Service-Tests
Servicetests laufen nicht über die Oberfläche der Anwendung, sondern rufen Programmteile (Services) innerhalb der Anwendung mit bestimmten Parametern direkt auf. Oftmals gibt es eine fachliche Beschreibungssprache (DSL), um die Testfälle zu beschreiben und etwas sog. Glue-Code, der dann aus den beschriebenen Testfällen die Parameter extrahiert und damit die Programmteile aufruft. Der Vorteil von Servicetests besteht darin, dass die Services separat voneinander getestet werden können und die Tests auch laufen, wenn einige der Services nicht funktionieren. Auch lässt sich die Funktion der Anwendung unabhängig von der Darstellung auf der Oberfläche testen.

### Unittests
Unittests sind Testfälle, die neben den fachlichen auch die technischen Elemente der Anwendung testen. Am besten wird jede Funktion der Anwendung getestet. Unittests testen genau eine technische Funktion. Abhängigkeiten des Systems unter Test werden gemockt und nicht mitgetestet. Mit Unittests stellt man nach Möglichkeit sicher, dass alle Randbedingungen einer Funktion durchdacht und getestet wurden. Beispielsweise alle Möglichkeiten für Null-Werte in einer Verschachtelten if-Abfrage.

## Links
- https://cucumber.io/
- http://sideex.org/
- https://martinfowler.com/bliki/TestPyramid.html
