package model;

<<<<<<< HEAD

=======
>>>>>>> 5f8b914b6a2a0cc8301109a5b0e05f0ea9665917
public class Instruktur extends Orang {
    private String keahlian;

    public Instruktur(int id, String nama, String noHp, String keahlian) {
        super(id, nama, noHp);
        setKeahlian(keahlian);
    }

    public String getKeahlian() {
        return keahlian;
    }

    public final void setKeahlian(String keahlian) {
        if (keahlian == null || keahlian.trim().isEmpty()) {
            throw new IllegalArgumentException("Keahlian wajib diisi");
        }
        this.keahlian = keahlian.trim();
    }

    @Override
    public String getInfo() {
<<<<<<< HEAD
        return "INSTRUKTUR | " + super.getInfo()
                + " | Keahlian: " + getKeahlian();
=======
        return "INSTRUKTUR | " + super.getInfo() + " | Keahlian: " + getKeahlian();
>>>>>>> 5f8b914b6a2a0cc8301109a5b0e05f0ea9665917
    }
}