package SRP.SRP_bon;

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");
        BookPrinter bookprinter = new BookPrinter();
        bookprinter.printToScreen(book);
        BookSaver bookSaver = new BookSaver();
        bookSaver.saveToDatabase(book);
        bookSaver.saveToFile(book, "Fichier_livres");
        BookBusinessLogic bookBusinessLogic = new BookBusinessLogic();
        bookBusinessLogic.emprunter(book, "Martial");
    }
    
    
}





