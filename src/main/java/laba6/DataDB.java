package laba6;

public class DataDB {
    public void checkDB() {
        ManagerDB manager = new ManagerDB();
        try {
            manager.create("Dima", "Serdiuk", 20, "FIT");
            manager.create("IGOR", "Bubliy", 22, "FIT");
            manager.create("Vova", "Ignatenko", 18, "URA");
            manager.create("Dasha", "Ivanko", 19, "URA");
            manager.create("Diana", "Shiller", 23, "JOP");
            manager.searchByAge(20);
            manager.clearTable();
        } finally {
            manager.exit();
        }
    }
}