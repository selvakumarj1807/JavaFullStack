class Music extends Thread {

    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println("Playing Music...");

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Download extends Thread {

    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println("Downloading File...");

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThread05 {

    public static void main(String[] args) {

        Music m = new Music();
        Download d = new Download();

        m.start();
        d.start();
    }
}