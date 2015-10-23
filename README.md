# Tika Geo NER Model

  When this jar is added to classpath, it supplies NER model to Tika's GeoParser.


## Test Run
 `mvn exec:java -Dexec.args=data/usc.geot`


## Update NER model:

 Replace file at `src/main/resources/org/apache/tika/parser/geo/topic/en-ner-location.bin`.

## Register Customm Types:
  Update file `src/main/resources/org/apache/tika/mime/custom-mimetypes.xml`


## Additional Setup
   Requires `lucene-geo-gazetteer` in `PATH` as described in http://wiki.apache.org/tika/GeoTopicParser.

   >  In ubuntu, I had to set `PATH` in `/etc/profile` because the java process launched from IDE didn't
    inherit `~/.bashrc` 
