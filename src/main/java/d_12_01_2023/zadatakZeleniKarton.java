package d_12_01_2023;

import java.util.ArrayList;

public class zadatakZeleniKarton {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<ZeleniKarton>();

        zeleniKartoni.add(new ZeleniKarton("Matematika I",
                "Marko Markovic", 8));
        zeleniKartoni.add(new ZeleniKarton("Fizika I",
                "Dejan Pantelic", 7));
        zeleniKartoni.add(new ZeleniKarton("Statika I",
                "Iva Markovic", 5));
        zeleniKartoni.add(new ZeleniKarton("Engleski jezik I - izborni",
                "Jelena Stankovic", 10));
        zeleniKartoni.add(new ZeleniKarton("Matematika II",
                "Marko Markovic", 7));
        zeleniKartoni.add(new ZeleniKarton("Ustav i Pravo građana I",
                "Stanko Milovanovic", 10));
        zeleniKartoni.add(new ZeleniKarton("Mehanika I",
                "Ivana Pavlovic", 5));
        zeleniKartoni.add(new ZeleniKarton("Engleski jezik II - izborni I",
                "Jelena Stankovic", 9));
        zeleniKartoni.add(new ZeleniKarton("Mediji i Komunikacije I",
                "Katarina Milic", 5));
        zeleniKartoni.add(new ZeleniKarton("Nacionalna knjizevnost I",
                "Tanja Radovic", 5));

        for (int i = 0; i < zeleniKartoni.size(); i++) {
            zeleniKartoni.get(i).stampaj();
            System.out.println();
        }

        double suma = 0;
        for (int i = 0; i < zeleniKartoni.size(); i++) {
            suma = suma + zeleniKartoni.get(i).getOcena();
        }
        System.out.println("Prosecna ocena: " + suma / zeleniKartoni.size());

        int counterPolozen = 0;
        suma = 0;
        for (int i = 0; i < zeleniKartoni.size(); i++) {
            if (zeleniKartoni.get(i).jePolozen()) {
                suma = suma + zeleniKartoni.get(i).getOcena();
                counterPolozen++;
            }
        }
        System.out.println("Prosecna ocena polozenih ispita: " + suma / counterPolozen);

    }

}











