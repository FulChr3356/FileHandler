package io.fulchr3356;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Document {
    private final FileWriter fileWriter;
    private final File file;

    public Document(String fileName) throws IOException {
        this(new File(fileName));
    }

    public File getFile(){
        return file;
    }

    public Document(File file) throws IOException {
        this.file = file;
        this.fileWriter = new FileWriter(file);
    }

    public void write(String contentToBeWritten) throws IOException {
        this.fileWriter.write(contentToBeWritten);
        fileWriter.flush();


    }

    public String read() throws IOException {
        StringBuilder fileReader = new StringBuilder();

        Files.lines(file.toPath()).forEach(s -> fileReader.append(s).append("\n"));
        return fileReader.toString().trim();
    }

    public void overWrite(String content) throws IOException {
        Files.write(file.toPath(), content.getBytes());

    }



}
