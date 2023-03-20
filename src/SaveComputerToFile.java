public class SaveComputerToFile implements SaveInterface {
    @Override
    public void save(String path,Computer comp) {
        System.out.println("Зберегти в файл " + path + ", " + comp);
    }
}
