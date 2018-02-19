# Klausurtraining Design Patterns (KLT) - K11 // Flugzeugtür

Eine Flugzeugtür wird über einen Schalter bedient. Initial befindet sich der Schalter im Status `S0` (offen) und die
Flugzeugtür ist geöffnet. Wird der Schalter im Status `S0` gedrückt, wechselt der Status von `S0` nach `S1` (geschlossen)
Wird der Schalter im Status `S1` gedrückt, wechselt der Status von `S1` nach `S2` (gesperrt). Wird der Schalter im Status
`S2` gedrückt, wechselt der Status von `S2` nach `S3` (entsperrt). Wird der Schalter im Status `S3` gedrückt, wechselt
der Status von `S3` nach `S0` (offen). Eine Anzeige beobachtet kontinuierlich den Status der Flugzeugtür und wird bei
Änderungen des Status automatisch informiert.
