# Anwendungsfall: Such- und Filterfunktion
* Kurzbeschreibung: User sucht nach Kleidungsstücken, die den Suchkriterien entsprechen. (z.B. Kleidungsstück entspricht dem vom User vergebenen Namen, der vom User ausgewählten Farbe oder Marke)
* Akteur: Benutzer der Rolle Benutzer (Admin seines privaten Kleiderschranks)
* Vorbedingung: User befindet sich im Tab "Garderobe" und sieht ALLE gespeicherten Kleidungsstücke
* Nachbedingung: Es wird ein Grid mit Kleidern mit Kleidern angezeigt, die die Suchbedingungen erfüllen, die vom User ausgewählt wurden
* Normalverlauf:
  1. User gibt gibt ein Schlüsselwort/Marke in ein Suchfeld ein, oder setzt einen Haken in einer Box mit vorgefertigten Farben
  2. System füllt ein Grid mit Kleidungsstücken, die die Suchkriterien erfüllen
  3. User klickt auf ein Kleidungsstück und hat die Möglichkeit, es mit einem Buttonklick zu seinem Outfit hinzuzufügen
* Alternativverlauf:
  1. User wählt eine Kategorie aus, die von keinem Kleidungsstück repräsentiert wird
  2. System zeigt ein leeres Grid an
  3. Tipp 1 wird angezeigt (Füge ein neues Kleidungsstück hinzu!)
  4. Der Filter wird zurückgesetzt und der User kann erneut suchen
* Qualitätsanforderungen:
  1. Suchleiste und/oder Checkboxes
  2. User in der Lage in weniger als 15s alle gewünschten Attribute auszuwählen/einzugeben
  3. Oft genutzte Kategorien/Filter sind schneller zu finden (Höhere Position in Kategorieauswahl)
  4. Oft hinzugefügte Kleidungsstücke erscheinen als erstes nach und vor der Suche (bevor und nach dem Filtern)


