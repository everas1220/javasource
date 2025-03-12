package api.object;

public class Persen {
    private String id;
    private String name;

    public Persen(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof Persen) {
            Persen p = (Persen) obj;

            if (this.id.equals(p.id) && this.name.equals(p.name))
                return true;
        }
        return false;
    }

}
