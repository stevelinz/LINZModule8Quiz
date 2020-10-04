package bookreader;

import java.io.FileNotFoundException;

public abstract class BookReader {

    abstract void initialize() throws FileNotFoundException;

    public final void readBook() throws FileNotFoundException {
        initialize();
        startReading();
        stopReading();
    }

    abstract void startReading();

    abstract void stopReading();
}
