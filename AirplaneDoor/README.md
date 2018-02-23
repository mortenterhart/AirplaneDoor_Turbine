# Klausurtraining Design Patterns (KLT) - K11 // Flugzeugtür

## Aufgabenstellung (AirplaneDoor)
Eine Flugzeugtür wird über einen Schalter bedient. Initial befindet sich der Schalter im Status `S0` (offen) und die
Flugzeugtür ist geöffnet. Wird der Schalter im Status `S0` gedrückt, wechselt der Status von `S0` nach `S1` (geschlossen)
Wird der Schalter im Status `S1` gedrückt, wechselt der Status von `S1` nach `S2` (gesperrt). Wird der Schalter im Status
`S2` gedrückt, wechselt der Status von `S2` nach `S3` (entsperrt). Wird der Schalter im Status `S3` gedrückt, wechselt
der Status von `S3` nach `S0` (offen). Eine Anzeige beobachtet kontinuierlich den Status der Flugzeugtür und wird bei
Änderungen des Status automatisch informiert.

---

**HINWEIS**

Die Klassendiagramme zu dieser Aufgabe liegen im [Verzeichnis `uml/`](uml).

---

## Wichtige Hinweise zur Aufgabenstellung
* Zeitansatz pro Aufgabe:
    * Modellierung: maximal 12 Minuten
    * Implementierung: maximal 25 Minuten
* Die Implementierung dient dem zusätzlichen Training und ist **nicht** klausurrelevant.
* `K` = Aufgabe hat hohe Relevanz für Klausur.
* Empfehlung: Bitte bearbeiten Sie alle Aufgaben für ein optimales Klausurtraining.

## Wichtige Hinweise für die Bearbeitung
* Pro Student werden zwei Aufgaben bearbeitet.
* Die Zuordnung der Aufgaben zu einem Studierenden erfolgt mit einem Zufallsgenerator.
* Bearbeitung der Aufgaben lokal auf den Rechnern und Nutzung der Templates.
* Studium der Struktur und Funktionsweise der beteiligten Design Patterns.
* Modellierung eines Klassendiagramms in Enterprise Architect. Bitte
    * nutzen Sie das Theme „DHBW“ (Visual Style -> Visual Appearance -> Diagram).
    * benennen Sie das Klassendiagramm mit task<id>, z.B. task50.
    * benennen Sie die Datei mit <matrikelnummer>_<task_id>.eap, z.B. 3378535_50.eap.
    * exportieren Sie das Klassendiagramm als PDF-Datei mit einer A4-Seite im Querformat.
* Implementierung einer einwandfrei lauffähigen Applikation in Java 8. Bitte
    * erstellen Sie ein Paket mit der Bezeichnung task<id>, z.B. task50.
    * nutzen Sie die camelCase-Notation, um die Lesbarkeit zu vereinfachen.
* Erstellung einer vollständigen und verschlüsselten 7-Zip-Datei unter Beachtung des
  Prozedere für die Abgabe von Prüfungsleistungen und der Namenskonvention.
* Zeitansatz: 10 Stunden
* Abgabetermin: Sonntag, 25.02.2018
* Bewertung: Testat
