package michel.week06.Fotoapparat;

import java.util.Vector;

public class MemoryCard {
    private final String hersteller;

    public String getHersteller() {
        return hersteller;
    }

    private final String typ;

    public String getTyp() {
        return typ;
    }                      // zb. SD, Micro SD usw.

    private final double capacity;

    public double getCapacity() {
        return capacity;
    }                  // Speicherplatz der SD-Karte in MB

    private final Vector<Photo> photos;                   // Vector - größe variabel / Array - feste größe. --- Speicherort für aufgenommene Fotos


    public Vector<Photo> getPhotos() {
        return photos;
    } // Gibt ganzes Vector Arr zurück

    //========================================================================

    public MemoryCard(String hersteller, String typ, double capacity) {  // Für Eingabe der werte vom User
        this.hersteller = hersteller;               // Bsp. hersteller = hersteller2 ohne this! -- this.hersteller=hersteller (this. da selbe Bezeichnung)
        this.typ = typ;
        this.capacity = capacity;
        photos = new Vector<>();                    // erstellen von leerem Vector
    }

    public double getFreeCapacity() {               // Freier Speicherplatz ermitteln
        double summPictureSize = 0;                 // Zu begin mit 0 initialisieren
        for (Photo picture : photos) {              // Jeder Speicherplatz im Vector wird abgefragt
            summPictureSize += picture.getSize();   // die Summe der Foto size wird zusammengerechnet
        }
        return capacity - summPictureSize;          // gesamtspeicherplatz - belegter Speicher = Freier Speicher
    }

    public boolean savePhoto(Photo picture) {         // Speicherfunktion Foto -- (Photo picture) ist Klasse Foto (ID,Size)
        if (picture.getSize() < getFreeCapacity()) {  // Foto Größe < als freier Speicherplatz
            photos.add(picture);                      // Photo picture hinzufügen zu Vector photos
            return true;                              // Wenn gespeichert
        } else {
            return false;                             // Wenn Speicherplatz voll, um Benachrichtigung zu ermöglichen
        }
    }

    public int getPhotoCount() {
        return photos.size();                       // Vector = size() / Array = length()
    }

    public void deletePhoto(Photo picture) {         // Klasse Photo
        photos.remove(picture);                      // löschen von Fotos (Photo "picture") in Vector photos
    }

    public Photo getPhoto(int index) {               // Ausgabe von gespeichertem Foto von Klasse Photo / index = Speicherplatz
        if (index >= photos.size())
            return null;                             // Bsp. Vector photos size = 2 (3Fotos gespeichert) -- index = 3 -> return null
        return photos.get(index);                    // index ist vorhanden -- return Foto das im Vector photos an der stelle index liegt.
    }

    public String toString() {
        return hersteller + " " + typ + " " + capacity + " MB ";
    }
}
