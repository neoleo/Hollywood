package com.example.business;

import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.FileVisitResult.CONTINUE;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {

    private final Path source;
    private final Path target;

    public CopyFileTree(Path source, Path target) {
        this.source = source;
        this.target = target;
    }

    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        // Your code goes here
        return CONTINUE;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        // Your code goes here
        return CONTINUE;
    }

    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        return CONTINUE;
    }

    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        if (exc instanceof FileSystemLoopException) {
            System.err.println("cycle detected: " + file);
        } else {
            System.err.format("Unable to copy: %s: %s%n", file, exc);
        }
        return CONTINUE;
    }

}
