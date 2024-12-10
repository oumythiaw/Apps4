public abstract class Article {
    private int id;
    private String lib;

    public Article() {}

    public Article(int id, String lib) {
        this.id = id;
        this.lib = lib;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", lib='" + lib + '\'' +
                '}';
    }
}
