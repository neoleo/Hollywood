package com.example.business;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author utilizador
 */
public class FileMerge {

    private Path form;
    private Path list;
    private String nameToken = "<NAME>";
    private Pattern p = Pattern.compile(nameToken);
    private List<String> formLetter;
    private List<String> customLetter;
    private List<String> nameList;
    private int matchStringIndex;

    public FileMerge(Path form, Path list) {
        this.form = form;
        this.list = list;
    }

    // This method takes the form and merges it with the list
    // It generates new files with the names from the list
    public void writeMergedForms() throws IOException {
        Charset cs = Charset.defaultCharset();
        formLetter = Files.readAllLines(form, cs);
        nameList = Files.readAllLines(list, cs);
        for (int j = 0; j < nameList.size(); j++) {
            customLetter = new ArrayList<>();
            String formName = nameList.get(j).replace(' ',
                    '_').concat(".txt");
            Path formOut = form.getParent().resolve(formName);
            for (int k = 0; k < formLetter.size(); k++) {
                if (hasToken(formLetter.get(k))) {
                    customLetter.add(mergeName(formLetter.get(k),
                            nameList.get(j)));
                } else {
                    customLetter.add(formLetter.get(k));
                }
            }
            Files.write(formOut, customLetter, cs);
            System.out.println("Wrote form letter to: "
                    + nameList.get(j));
        } // closing brace for the outer for loop
    }

// Produce a new string in the letter that replaces the token with the name
    private String mergeName(String form, String name) {
        Matcher m = p.matcher(form);
        return (m.replaceFirst(name));
    }

// Determine if the String has the token
    private boolean hasToken(String s) {
        Matcher m = p.matcher(s);
        return m.find();
    }

}
