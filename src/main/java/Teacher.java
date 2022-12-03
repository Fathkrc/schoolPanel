public class Teacher {
    //Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
    private String name;
    private String idNum;
    private int age;
    private String section;
    private String recId;

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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public Teacher(String name, String idNum, int age, String section, String recId) {
        this.name = name;
        this.idNum = idNum;
        this.age = age;
        this.section = section;
        this.recId = recId;
    }


    @Override
    public String toString() {
        return "Ogretmen ismi "+ name +"\n bölümü "+section ;
    }
}
