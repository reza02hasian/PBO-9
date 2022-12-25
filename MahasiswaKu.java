package PBO9;
class Mahasiswa <X1,X2,X3> {
    private X1 Nim;
    private X2 Name;
    private X3 Clas;

     public void setNim(X1 Nim) {
        this.Nim = Nim;
    }

    public void setName(X2 Name) {
        this.Name = Name;
    }

    public void setClas(X3 Clas) {
        this.Clas = Clas;
    }

    public X1 getNim() {
        return this.Nim;
    }

    public X2 getName() {
        return this.Name;
    }
    public X3 getClas() {
        return this.Clas;
    }
}    
public class MahasiswaKu {
    
    public static void main(String[] args) {
        
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);
        
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }   
}
