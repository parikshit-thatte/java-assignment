import java.lang.Math;


class Message {
    private String text = "";
    private boolean isEmpty = true;

    public synchronized String read() {
        return this.text;
    }

    public synchronized void write(String text) {
        this.text = text;
    }
}


class ReadMessageThread extends Thread {
    private Message messageResource;

    ReadMessageThread(Message message) {
        this.messageResource = message;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Read Thread : Message = " + this.messageResource.read());
        }
    }
}


class WriteMessageThread extends Thread {
    private Message messageResource;

    WriteMessageThread(Message message) {
        this.messageResource = message;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            String msgToWrite = String.valueOf(Math.random());
            this.messageResource.write(msgToWrite);
            System.out.println("Write Thread : Message = " + msgToWrite);
        }
    }
}


public class Question_4 {
    public static void main(String[] args) {
        Message message = new Message();

        ReadMessageThread reader = new ReadMessageThread(message);
        WriteMessageThread writer = new WriteMessageThread(message);

        System.out.println("Starting threads...");

        reader.start();
        writer.start();
    }
}