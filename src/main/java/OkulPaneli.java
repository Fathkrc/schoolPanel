import java.util.*;

public class OkulPaneli {
    /*                                             TASK
                ---------------------BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.------------------------------
	1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
	Kayıtlarda şu bilgiler olabilmelidir.
		Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
		Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
	2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
	             Aşağıdaki gibi bir menü gösterilsin.
	    ====================================	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ	====================================
	    1- ÖĞRENCİ İŞLEMLERİ
	    2- ÖĞRETMEN İŞLEMLERİ
	    Q- ÇIKIŞ
	3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

	        ============= İŞLEMLER =============
	         1-EKLEME		 2-ARAMA		 3-LİSTELEME
	         4-SİLME		 5-ANA MENÜ		 Q-ÇIKIŞ
	    SEÇİMİNİZ:
	4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
	ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
	Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.*/

    public static void main(String[] args) {
        studentList.add(new Student("fatih", "32", 30, 21, "cc"));
        studentList.add(new Student("gammak", "31", 31, 31, "aa"));
        teacherList.add(new Teacher("Yaşar", "122", 34, "bio", "321"));
        teacherList.add(new Teacher("Süleyman", "124", 35, "lectury", "333"));
        OkulPaneli okulPaneli = new OkulPaneli();
        okulPaneli.islemSec();
    }

    static List<Student> studentList = new ArrayList<Student>();
    static List<Teacher> teacherList = new ArrayList<Teacher>();

    static int stuCounter = 2;
    static int teacherCounter = 2;
    static final String giris = "=".repeat(32) + "ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ" + "=".repeat(32);
    static String secim1 = "1) Ogrenci islemleri " + "\n2) Ogretmen islemleri " + "\nQ Çıkıs";


    Scanner input = new Scanner(System.in);

    public void islemSec() {
        System.out.println(giris);
        System.out.println(secim1);
        System.out.println(giris);
        System.out.print(" Hoşgeldiniz , lütfen bir işlem seçiniz [1,2 ya da Q]: ");
        String secim = input.next();
        switch (secim) {
            case "1":
                ogrenciIslem();

                break;
            case "2":
                ogrtmenIslem();
                break;

            case "q":
            case "Q":
                System.out.println("programdan çıkılıyor ...");
                break;
            default:
                System.out.println("yanlış giriş yaptınız");
                islemSec();
        }

    }

    public void addStd() {
        System.out.print("Ogrenci ismi: ");
        String name = input.next();
        System.out.print("kimlik no: ");
        String id = input.next();
        System.out.print("yas: ");
        int yas = input.nextInt();
        input.nextLine();
        System.out.print("numaranızı giriniz: ");
        int scId = input.nextInt();
        System.out.print("sinif: ");
        String clas = input.next();

        studentList.add(new Student(name, id, yas, scId, clas));
        stuCounter++;

        ogrenciIslem();
    }

    public void searchStd() {
        System.out.print("ogrenci id giriniz : ");
        String ogrenciId = input.next();
        boolean b = true;

        for (Student w : studentList) {
            if (w.getIdNum().equals(ogrenciId)) {
                b = false;
                System.out.println(ogrenciId + " id li öğrenciniz " + w);
                break;
            }
        }
        if (b) {
            System.out.println("Öğrenci Bulunamadı");
        }
        ogrenciIslem();
    }

    public void addTch() {
        System.out.print("Ogretmen ismi: ");
        String name = input.next();
        System.out.print("kimlik no: ");
        String id = input.next();
        System.out.print("yas: ");
        int yas = input.nextInt();
        input.nextLine();
        System.out.print("bölüm: ");
        String bolum = input.next();
        System.out.println("sicil: ");
        String rec = input.next();

        teacherList.add(new Teacher(name, id, yas, bolum, rec));
        teacherCounter++;
        ogrtmenIslem();
    }

    public void ogrenciIslem() {
        System.out.print("=".repeat(32) + "ÖĞRENCİ YÖNETİM PANELİ" + "=".repeat(32) +
                "\n1) Öğrenci ekleme" +
                "\n2) Öğrenci arama" +
                "\n3) Öğrenci listeleme" +
                "\n4) Öğrenci silme" +
                "\n5) Ana Menü" +
                "\n Çıkış için q giriniz : ");
        String s = input.next();
        switch (s) {
            case "Q":
            case "q":
                System.out.println("Programdan Çıkılıyor...");
                break;
            case "1":
                addStd();
                break;
            case "2":
                searchStd();
                break;
            case "3":
                stdListele();
                break;
            case "4":
                stdSil();
                break;
            case "5":
                islemSec();
                break;
            default:
                System.out.println("Yanlış Giriş Yaptınız, Tekrar Deneyiniz...");
                ogrenciIslem();
        }

    }

    private void stdSil() {
        System.out.print("Silmek istediğiniz öğrencinin kimlik numarasını giriniz: ");
        String del = input.next();
        boolean b = true;
        //1,2,3,!!4List[i]
        for (Student w : studentList) {
            if (w.getIdNum().equals(del)) {
                b = false;
                System.out.println(w + " siliniyor");
                studentList.remove(w);
                break;
            }
        }
        if (b) {
            System.out.println("Girdiğiniz id bulunamadı....");
        }
        ogrenciIslem();

    }


    private void stdListele() {
        int a = 1;

        for (Student w : studentList) {
            System.out.println("Öğrenci " + a+" =======> " + " : " + w);
            a++;
        }
        System.out.println("Toplam Öğrenci Sayisi : " + stuCounter);
        ogrenciIslem();
    }

    public void ogrtmenIslem() {
        System.out.print("=".repeat(32) + "ÖĞRETMEN YÖNETİM PANELİ" + "=".repeat(32) +
                "\n1) Öğretmen ekleme" +
                "\n2) Öğretmen arama" +
                "\n3) Öğretmen listeleme" +
                "\n4) Öğretmen silme" +
                "\n5) Ana Menü" +
                "\n Çıkış için q giriniz : ");
        String secim = input.next();
        switch (secim) {
            case "Q":
            case "q":
                break;
            case "1":
                addTch();
                break;
            case "2":
                searchTch();
                break;
            case "3":
                tchListele();
                break;
            case "4":
                tchSil();
                break;
            case "5":
                islemSec();
                break;
            default:
                System.out.println("Yanlış Giriş Yaptınız Tekrar Deneyiniz...");
                ogrtmenIslem();
        }
    }
    private void tchSil() {

        System.out.print("silmek istediğiniz öğretmenin kimlik numarasını giriniz: ");
        String del = input.next();
        boolean b = true;
        //1,2,3,!!4List[i]
        for (Teacher w : teacherList) {
            if (w.getIdNum().equals(del)) {
                b = false;
                System.out.println(w + " siliniyor...");
                teacherList.remove(w);
                break;
            }
        }
        if (b) {
            System.out.println("girdiğiniz id 'ye sahip bir öğretmen bulunamadı....");
        }
        ogrtmenIslem();
    }

    private void tchListele() {

        int a = 1;

        for (Teacher w : teacherList) {
            System.out.println("Öğretmen " + a +"=======>"+ " : " + w);
            a++;
        }
        System.out.println("Toplam Öğretmen Sayisi : " + teacherCounter);
        ogrtmenIslem();

    }

    private void searchTch() {

        System.out.print("Öğretmen id giriniz : ");
        String ogreId = input.next();
        boolean b = true;

        for (Teacher w : teacherList) {
            if (w.getIdNum().equals(ogreId)) {
                b = false;
                System.out.println(ogreId + " id li  " + w);
                break;
            }
        }
        if (b) {
            System.out.println("Öğretmen bulunamadı...");


        }
        ogrtmenIslem();

    }
}
