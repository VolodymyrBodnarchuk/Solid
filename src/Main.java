public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("IBM XT", 80000);
        SaveInterface saver = new SaveComputerToDB();
        saver.save("out.dat", comp);
    }
}