public class Student {
    //Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
    private String name;
    private String idNum;
    private int age;
    private int scId;
    private String cls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScId() {
        return scId;
    }

    public void setScId(int scId) {
        this.scId = scId;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public Student(String name, String idNum, int age, int scId, String cls) {
        this.name = name;
        this.idNum = idNum;
        this.age = age;
        this.scId = scId;
        this.cls = cls;
    }

    @Override
    public String toString() {
        return "Ogrenci ismi : "+name +"\nNumarası : "+idNum+"\nSınıfı : "+cls;
    }
}
