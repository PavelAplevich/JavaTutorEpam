package archive;

import java.util.ArrayList;

public class Archive {
    private ArrayList<Document> documents = new ArrayList<>();

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        return documents.toString();
    }
}
