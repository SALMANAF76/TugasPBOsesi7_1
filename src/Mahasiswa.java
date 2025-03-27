public class Mahasiswa<T, U> {
    private T nim;
    private String name;
    private U studentClass;

    public void setNim(T nim) {
        this.nim = nim;
    }

    public T getNim() {
        return nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentClass(U studentClass) {
        this.studentClass = studentClass;
    }

    public U getStudentClass() {
        return studentClass;
    }

    public static void main(String[] args) {
        Mahasiswa<String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setStudentClass(21);

        System.out.println("NIM: " + m.getNim());
        System.out.println("Name: " + m.getName());
        System.out.println("Class: " + m.getStudentClass());
    }
}
