public class SaveComputerToDB implements SaveInterface {
    @Override
    public void save(String path,Computer comp) {
        System.out.println("Зберегти в БД " + path + ", " + comp);
    }
}
