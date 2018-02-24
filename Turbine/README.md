# Klausurtraining Design Patterns (KLT) - 15 // Turbine

## Aufgabenstellung (Turbine)
Eine Turbine hat 96 Schaufeln. Es werden zwei Typen von Schaufeln (i) 48x Titan und
(ii) 48x Karbon. Die erste Schaufel ist vom Typ Titan und hat den Index 1. Die Typen
der Schaufeln wechseln sich einander ab. Die zweite Schaufel ist folglich vom Typ Karbon
und hat den Index 2. Für jeden Typ existiert ein eigenes Prüfverfahren. Ein Roboter prüft
sukzessive – beginnend mit der Schaufel Titan und Index 1 – jede Schaufel mit dem
geeigneten Prüfverfahren. Über die Kommandos `start`, `stop`, `naechste` wird der Roboter
von einem Mechaniker über eine Fernbedienung gesteuert.

---

**HINWEIS**

Die Klassendiagramme zu dieser Aufgabe liegen im [Verzeichnis `uml/`](uml).
Darin sind sowohl von IntelliJ produzierte Diagramme als auch mit Enterprise Architect Erstellte. 

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
