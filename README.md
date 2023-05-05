# SoSe23_SwingCalc

1. Erstelle eine neue Java-Klasse: Beginne mit der Erstellung einer neuen Java-Klasse namens CalculatorGUI, die JFrame erweitert.
2. Instanzvariable definieren: Definiere Instanzvariable für die Anzeige des Taschenrechners (ein JTextField-Objekt) und das Button-Panel (ein JPanel-Objekt).
3. Erstelle einen Konstruktor: Schreibe einen Konstruktor für die CalculatorGUI-Klasse. Konfiguriere im Konstruktor das JFrame, indem Sie den Titel, die Größe, die Location und die Standard-Schließen-Operation festlegen. Initialisiere das Textfeld/Anzeigefeld und das Button-Panel.
4. Die Anzeige konfigurieren: Stelle die Anzeige auf "nicht editierbar" und füge sie dem JFrame mit einer BorderLayout.NORTH-Beschränkung hinzu.
5. Erstelle und konfiguriere das Button-Panel: Initialisiere das Button-Panel mit einem GridLayout (4 Zeilen und 4 Spalten) und erstelle ein Array aus Zeichenketten, um die Beschriftungen der Schaltflächen darzustellen. Iteriere durch das Array, erstelle JButton-Instanzen mit den entsprechenden Beschriftungen und füge den Schaltflächen ActionListener hinzu. Füge die Schaltflächen dem Button-Panel hinzu.
6. Füge das Button-Panel dem JFrame hinzu: Füge das Button-Panel dem JFrame mit einer BorderLayout.CENTER-Beschränkung hinzu. Rufe anschließend pack() und setVisible(true) auf, um das Erscheinungsbild des Taschenrechners zu vervollständigen.
7. Implementiere den ActionListener/die actionPerformed-Methode: Überschreibe die Methode actionPerformed(), um auf Schaltflächenklicks zu reagieren.
8. Schaltflächenklicks behandeln: Bestimme innerhalb der actionPerformed()-Methode die Quelle des Ereignisses (welche Schaltfläche angeklickt wurde) und aktualisiere die Anzeige, die aktuelle Eingabe, den aktuellen Operator oder führen Sie Berechnungen durch, wie benötigt.
9. Berechnungen durchführen: Erstelle eine private Hilfsmethode namens performOperation(), um die arithmetischen Operationen auf der Grundlage des bereitgestellten Operators und der Operanden durchzuführen.
