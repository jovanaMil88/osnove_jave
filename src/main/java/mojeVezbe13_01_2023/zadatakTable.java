package mojeVezbe13_01_2023;

public class zadatakTable {
    public static void main(String[] args) {

//    U mainu kreirati jednu tabelu sa 3x3 (3 kolone i 3 reda)
//    i odstampajte je obicno i u html-u.
        TableHeader header = new TableHeader();
        header.addHeaderCell("a");
        header.addHeaderCell("b");
        header.addHeaderCell("c");
        TableRow red1 = new TableRow();
        red1.addRowCell("prva");
        red1.addRowCell("druga");
        red1.addRowCell("treca");
        TableRow red2 = new TableRow();
        red2.addRowCell("cetvra");
        red2.addRowCell("peta");
        red2.addRowCell("sesta");
        Table tabela = new Table(header);
        tabela.dodajRed(red1);
        tabela.dodajRed(red2);
        tabela.stampajTabelu();
tabela.printHTMLtabelu();
        }


    }

