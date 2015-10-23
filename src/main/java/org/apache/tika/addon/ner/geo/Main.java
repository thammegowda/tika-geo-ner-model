package org.apache.tika.addon.ner.geo;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * Place to experiment Tika's GeoParser with Location NER model.
 * Update src/main/res with location NER model.
 */
public class Main {

    public static void main(String[] args) throws IOException, TikaException, SAXException {

        //args = new String[]{"data/polar.geot"};
        if (args.length != 1) {
            System.err.println("Invalid Args.");
            System.err.println("Usage : <File>");
            return;
        }
        File file = new File(args[0]);
        Tika tika = new Tika();
        Metadata metadata = new Metadata();
        tika.parse(file, metadata);
        System.out.println("Metadata : ");
        //System.out.println(metadata);
        for (String name : metadata.names()) {
            System.out.print(name + "=");
            if (metadata.isMultiValued(name)) {
                System.out.println(Arrays.toString(metadata.getValues(name)));
            } else {
                System.out.println(metadata.get(name));
            }
        }
    }
}
